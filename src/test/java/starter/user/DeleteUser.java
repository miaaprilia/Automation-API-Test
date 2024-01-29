package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    private static final String url = "https://reqres.in/api";

    @Step ("I set API endpoint valid for delete user by ID")
    public String setAPIEndpointValidDeleteUser() {
        return url + "/users/2";
    }

    @Step ("I send request to delete user by ID")
    public void sendRequestDeleteUser() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setAPIEndpointValidDeleteUser());
    }

    @Step("I received status code 204 No Content in request to delete user by ID")
    public void receivedStatusCode204NoContentRequestDeleteUser() {
        restAssuredThat(response -> response.statusCode(204));
    }
}
