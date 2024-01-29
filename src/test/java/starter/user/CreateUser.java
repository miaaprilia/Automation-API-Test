package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateUser {
    private static final String url = "https://reqres.in/api";

    @Step("I set API endpoint valid for create user")
    public String setAPIEndpointValidCreateUser() {
        return url + "/users";
    }

    @Step("I enter email")
    public void enterEmail() {
    }

    @Step("I enter password")
    public void enterPassword() {
    }

    @Step ("I send request to create user")
    public void sendRequestCreateUser() {
        JSONObject requestBody = new JSONObject();
        String email = "miaaprili2803@gmail.com";
        String password = "Test123";
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidCreateUser());
    }

    @Step("I received status code 201 Created in request create user")
    public void receivedStatusCode201CreatedUser() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received credentials data response create user")
    public void receivedCredentialsDataResponseCreateUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_User_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for create user without the path")
    public String setAPIEndpointInvalidCreateUserWithoutPath() { return url + "/";
    }

    @Step("I send request to create user no path")
    public void sendRequestCreateUserNoPath() {
        JSONObject requestBody = new JSONObject();
        String email = "miaaprili2803@gmail.com";
        String password = "Test123";
        requestBody.put("email", email);
        requestBody.put("password", password);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointInvalidCreateUserWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to create user")
    public void receivedStatusCode404NotFoundCreateUser()  {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"general error\" response in request create user")
    public void receivedErrorMessageGeneralErrorResponseCreateUser()  {
    }
}
