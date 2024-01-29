package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateUser {
    private static final String url = "https://reqres.in/api";

    @Step ("I set API endpoint valid for update user by ID")
    public String setAPIEndpointValidUpdateUserByID() {
        return url + "/users/2";
    }

    @Step ("I update email")
    public void updateEmail() {

    }

    @Step ("I update password")
    public void updatePassword() {

    }

    @Step ("I send request to update user by ID")
    public void sendRequestUpdateUsetByID() {
        JSONObject requestBody = new JSONObject();
        String email = "itqa.mia@gmail.com";
        String password = "Test123";
        requestBody.put("email", email);
        requestBody.put("password", password);

        SerenityRest.given()
            .header("Content-Type", "application/json")
            .body(requestBody.toString())
            .put(setAPIEndpointValidUpdateUserByID());
    }

    @Step("I received status code 200 OK in request update user")
    public void receivedStatusCode200OKRequestUpdateUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received credentials data response update user")
    public void receivedCredentialsDataResponseUpdateUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_User_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for can't update user by ID without the path")
    public String setAPIEndpointInvalidCantUpdateUserByIDWithoutPath() { return url + "/users";
    }

    @Step("I send request to update user by ID no path")
    public void sendRequestUpdateUserByIDNoPath() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setAPIEndpointInvalidCantUpdateUserByIDWithoutPath());
    }

    @Step("I received status code 404 Not Found Error in request to update user by ID")
    public void receivedStatusCode404NotFoundRequestUpdateUserByID()  {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"general error\" response in request update user by ID")
    public void receivedErrorMessageGeneralErrorResponseUpdateUserByID()  {
    }
}
