import java.io.IOException;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
//import org.omg.CORBA.Request;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@RunWith(JUnit4ClassRunner.class)
public class TestRunner {
	
	@Test
	public void Test() throws IOException{
	OkHttpClient client = new OkHttpClient();

	Request request = new Request.Builder()
	  .url("https://api.github.com/users/narasimhavuppala")
	  .get()
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "4d100521-6168-e824-79ad-828a5194fe87")
	  .build();

	Response response = client.newCall(request).execute();
	
	System.out.println(response.code());
	}
}
