package plivo.helper;

import java.util.LinkedHashMap;
import com.plivo.helper.api.client.RestAPI;
import com.plivo.helper.exception.PlivoException;
import com.plivo.helper.api.response.call.Call;

public class CallNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RestAPI restAPI = new RestAPI("<AUTH ID>", "<TOKEN>", "v1");
		
		LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
		params.put("from", "1111");
		params.put("to", "573135555198");
		params.put("answer_url", "http://dl.dropbox.com/u/54579287/Docs/speak.xml");

		Call response;
		try {

			response = restAPI.makeCall(params);
			System.out.println(response.apiId);
		} 
		catch (PlivoException e) {
			System.out.println(e.getMessage());
		}

	}
}
