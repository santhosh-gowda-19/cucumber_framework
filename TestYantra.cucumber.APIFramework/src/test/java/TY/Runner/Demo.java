package TY.Runner;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import TY.generic.Spec_Builder_API;
import io.restassured.RestAssured;

public class Demo {

	public static void main(String[] args) throws IOException 
	{
		given().spec(Spec_Builder_API.request_spec_builder()).when().
		get("").then().spec(Spec_Builder_API.response_spec_builder(200)).extract().response();
	}

}
