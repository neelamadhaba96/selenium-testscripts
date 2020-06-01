package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData {
	@Test
	public void testResponceCode() {

		Response Resp =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");

		int code = Resp.getStatusCode();
		System.out.println("Status code is"+code);
		Assert.assertEquals(code, 200);

	}

}
