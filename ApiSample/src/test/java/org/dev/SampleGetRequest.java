package org.dev;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {
	public static void main(String[] args) {
		Response res = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		int statusCode = res.statusCode();
		String statusLine = res.statusLine();
		System.out.println(statusCode);
		System.out.println(statusLine);
	}

}
