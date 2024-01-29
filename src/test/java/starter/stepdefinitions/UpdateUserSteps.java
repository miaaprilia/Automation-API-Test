package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateUser;

public class UpdateUserSteps {
    @Steps
    UpdateUser updateUser;

    @Given ("I set API endpoint valid for update user by ID")
    public void setAPIEndpointValidUpdateUserByID() {
        updateUser.setAPIEndpointValidUpdateUserByID();
    }

    @When ("I update email")
    public void updateEmail() { updateUser.updateEmail();
    }

    @And ("I update password")
    public void updatePassword() { updateUser.updatePassword();
    }

    @And ("I send request to update user by ID")
    public void sendRequestUpdateUsetByID() { updateUser.sendRequestUpdateUsetByID();
    }

    @Then ("I received status code 200 OK in request update user")
    public void receivedStatusCode200OKRequestUpdateUser() { updateUser.receivedStatusCode200OKRequestUpdateUser();
    }

    @And ("I received credentials data response update user")
    public void receivedCredentialsDataResponseUpdateUser() { updateUser.receivedCredentialsDataResponseUpdateUser();
    }

    @Given ("I set API endpoint invalid for can't update user by ID without the path")
    public void setAPIEndpointInvalidCantUpdateUserByIDWithoutPath() { updateUser.setAPIEndpointInvalidCantUpdateUserByIDWithoutPath();
    }

    @When ("I send request to update user by ID no path")
    public void sendRequestUpdateUserByIDNoPath() { updateUser.sendRequestUpdateUserByIDNoPath();
    }

    @Then ("I received status code 404 Not Found Error in request to update user by ID")
    public void receivedStatusCode404NotFoundRequestUpdateUserByID() { updateUser.receivedStatusCode404NotFoundRequestUpdateUserByID();
    }

    @And ("I received error message \"general error\" response in request update user by ID")
    public void receivedErrorMessageGeneralErrorResponseUpdateUserByID() { updateUser.receivedErrorMessageGeneralErrorResponseUpdateUserByID();
    }
}
