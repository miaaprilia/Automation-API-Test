package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteUser;

public class DeleteUserSteps {
    @Steps
    DeleteUser deleteUser;

    @Given ("I set API endpoint valid for delete user by ID")
    public void setAPIEndpointValidDeleteUser() {
        deleteUser.setAPIEndpointValidDeleteUser();
    }

    @When ("I send request to delete user by ID")
    public void sendRequestDeleteUser() {
        deleteUser.sendRequestDeleteUser();
    }

    @Then ("I received status code 204 No Content in request to delete user by ID")
    public void receivedStatusCode204NoContentRequestDeleteUser() { deleteUser.receivedStatusCode204NoContentRequestDeleteUser();
    }
}
