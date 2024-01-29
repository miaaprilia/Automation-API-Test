package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateUser;

public class CreateUserSteps {
    @Steps
    CreateUser createUser;

    @Given("I set API endpoint valid for create user")
    public void setAPIEndpointValidCreateUser() {
        createUser.setAPIEndpointValidCreateUser();
    }

    @When("I enter email")
    public void enterEmail() { createUser.enterEmail();
    }

    @And("I enter password")
    public void enterPassword() {
        createUser.enterPassword();
    }

    @And("I send request to create user")
    public void sendRequestCreateUser() {
        createUser.sendRequestCreateUser();
    }

    @Then("I received status code 201 Created in request create user")
    public void receivedStatusCode201CreatedUser() { createUser.receivedStatusCode201CreatedUser();}

    @And("I received credentials data response create user")
    public void receivedCredentialsDataResponseCreateUser() { createUser.receivedCredentialsDataResponseCreateUser();}

    @Given("I set API endpoint invalid for create user without the path")
    public void setAPIEndpointInvalidCreateUserWithoutPath() { createUser.setAPIEndpointInvalidCreateUserWithoutPath();}

    @When("I send request to create user no path")
    public void sendRequestCreateUserNoPath() { createUser.sendRequestCreateUserNoPath();}

    @Then("I received status code 404 Not Found in request to create user")
    public void receivedStatusCode404NotFoundCreateUser() { createUser.receivedStatusCode404NotFoundCreateUser();}

    @And("I received error message \"general error\" response in request create user")
    public void receivedErrorMessageGeneralErrorResponseCreateUser() { createUser.receivedErrorMessageGeneralErrorResponseCreateUser();}
}

