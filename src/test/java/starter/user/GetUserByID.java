package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserByID {
    private static final String url = "https://reqres.in/api";

    @Step ("I set API endpoint valid for get user by ID")
    public String setAPIEndpointValidGetUserByID() {
        return url + "/users/2";
    }

    @Step ("I send request to get user by ID")
    public void sendRequestGetUserByID() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setAPIEndpointValidGetUserByID());
    }

    @Step("I received status code 200 OK in request get user by ID")
    public void receivedStatusCode200OKRequestGetUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received user data by id response in request get user by ID")
    public void receivedUserDataByIDResponseGetUserByID() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get user data invalid ID")
    public String setAPIEndpointInvalidGetUserDataInvalidID() { return url + "/users/80IIkk@&5";
    }

    @Step("I send request to get user data invalid ID")
    public void sendRequestGetUserDataInvalidID() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setAPIEndpointInvalidGetUserDataInvalidID());
    }

    @Step("I received status code 404 Not Found in request to get user by ID")
    public void receivedStatusCode404NotFoundRequestGetUserByID()  {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"failed find user\" response in request get user by ID")
    public void receivedErrorMessageFailedFindUserResponseGetUserByID()  {
    }

    @Step("I set API endpoint invalid for get user data ID not exist in database")
    public String setAPIEndpointInvalidGetUserDataIDNotExistInDatabase() { return url + "/users/800000000";
    }

    @Step("I send request to get user data ID not exist in database")
    public void sendRequestGetUserDataIDNotExistInDatabase() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setAPIEndpointInvalidGetUserDataIDNotExistInDatabase());
    }
}
