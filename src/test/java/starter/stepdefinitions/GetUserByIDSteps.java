package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserByID;

public class GetUserByIDSteps {
    @Steps
    GetUserByID getUserByID;

    @Given ("I set API endpoint valid for get user by ID")
    public void setAPIEndpointValidGetUserByID() {
        getUserByID.setAPIEndpointValidGetUserByID();
    }

    @When ("I send request to get user by ID")
    public void sendRequestGetUserByID() { getUserByID.sendRequestGetUserByID();
    }

    @Then ("I received status code 200 OK in request get user by ID")
    public void receivedStatusCode200OKRequestGetUserByID() { getUserByID.receivedStatusCode200OKRequestGetUserByID();
    }

    @And ("I received user data by id response in request get user by ID")
    public void receivedUserDataByIDResponseGetUserByID() { getUserByID.receivedUserDataByIDResponseGetUserByID();
    }

    @Given ("I set API endpoint invalid for get user data invalid ID")
    public void setAPIEndpointInvalidGetUserDataInvalidID() { getUserByID.setAPIEndpointInvalidGetUserDataInvalidID();
    }

    @When ("I send request to get user data invalid ID")
    public void sendRequestGetUserDataInvalidID() { getUserByID.sendRequestGetUserDataInvalidID();
    }

    @Then ("I received status code 404 Not Found in request to get user by ID")
    public void receivedStatusCode404NotFoundRequestGetUserByID() { getUserByID.receivedStatusCode404NotFoundRequestGetUserByID();
    }

    @And ("I received error message \"failed find user\" response in request get user by ID")
    public void receivedErrorMessageFailedFindUserResponseGetUserByID() { getUserByID.receivedErrorMessageFailedFindUserResponseGetUserByID();
    }

    @Given ("I set API endpoint invalid for get user data ID not exist in database")
    public void setAPIEndpointInvalidGetUserDataIDNotExistInDatabase() { getUserByID.setAPIEndpointInvalidGetUserDataIDNotExistInDatabase();
    }

    @When ("I send request to get user data ID not exist in database")
    public void sendRequestGetUserDataIDNotExistInDatabase() { getUserByID.sendRequestGetUserDataIDNotExistInDatabase();
    }
}
