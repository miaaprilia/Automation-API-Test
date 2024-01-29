package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUser {
    private static final String url = "https://reqres.in/api";

    @Step ("I set API endpoint valid for get all user")
    public String setAPIEndpointValidGetAllUser() {
        return url + "/users";
    }

    @Step ("I send request to get all user")
    public void sendRequestGetAllUser() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setAPIEndpointValidGetAllUser());
    }

    @Step("I received status code 200 OK in request get all user")
    public void receivedStatusCode200OKRequestGetAllUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I successfully get all user data")
    public void successfullyGetAllUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_User_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
