package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllUser;

public class GetAllUserSteps {
    @Steps
    GetAllUser getAllUser;

    @Given ("I set API endpoint valid for get all user")
    public void setAPIEndpointValidGetAllUser() {
        getAllUser.setAPIEndpointValidGetAllUser();
    }

    @When ("I send request to get all user")
    public void sendRequestGetAllUser() { getAllUser.sendRequestGetAllUser();
    }

    @Then ("I received status code 200 OK in request get all user")
    public void receivedStatusCode200OKRequestGetAllUser() { getAllUser.receivedStatusCode200OKRequestGetAllUser();
    }

    @And ("I successfully get all user data")
    public void successfullyGetAllUserData() { getAllUser.successfullyGetAllUserData();
    }
}
