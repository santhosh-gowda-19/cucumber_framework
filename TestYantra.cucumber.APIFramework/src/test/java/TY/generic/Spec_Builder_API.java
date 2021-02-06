package TY.generic;

import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_Builder_API 
{
	public static RequestSpecification request_spec_builder() throws IOException
	{
		RequestSpecBuilder req_bui = new RequestSpecBuilder();
		RequestSpecification req = req_bui.setContentType(ContentType.JSON).setBaseUri(Fetch_Properties.getProperties_value()).build();
		return req;
	}
	
	public static ResponseSpecification response_spec_builder(int status_code)
	{
		ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
		ResponseSpecification res = res_bui.expectContentType(ContentType.JSON).expectStatusCode(status_code).build();
		return res;
	}
}
