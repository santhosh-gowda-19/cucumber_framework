package TY.Step_Defn;

import static io.restassured.RestAssured.given;

import TY.generic.Spec_Builder_API;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetApi 
{
	private RequestSpecification a1;
	private Response a2;

	@Given("^user enters the base url$")
    public void user_enters_the_base_url() throws Throwable {
		a1=given().spec(Spec_Builder_API.request_spec_builder());
    }
    @When("^user enters the list of users endpoint with the GET http request$")
    public void user_enters_the_list_of_users_endpoint_with_the_get_http_request() throws Throwable {
    	a2=a1.when().get("/api/users?page=2");
    }

    @Then("^user should get status code as 200$")
    public void user_should_get_status_code_as_200() throws Throwable {
    	a2.then().extract().response();
    	System.out.println(a2.asString());
    }
}
