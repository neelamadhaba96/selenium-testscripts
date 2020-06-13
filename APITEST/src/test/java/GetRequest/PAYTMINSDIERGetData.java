package GetRequest;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PAYTMINSDIERGetData {
	@Test(priority = 1)
	public static void testResponceCode() {

		Response Resp = get("https://apiproxy.paytm.com/v2/movies/upcoming");

		int code = Resp.getStatusCode();
		System.out.println("Status code is" + code);
		Assert.assertEquals(code, 200);
		get("\"releaseDate\"");
		
	}

	private static Object expect() {
		// TODO Auto-generated method stub
		return null;
	}

}
