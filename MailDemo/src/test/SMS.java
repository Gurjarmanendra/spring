package test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class SMS {

	public static void main(String[] args) {
		
		try {
		String requestUrl  = "http://login.redsms.in/API/SendMessage.ashx?user=test&password=123&phone=8602626477&text=hello_monu&type=t&senderid=INFORM";
				URL url = new URL(requestUrl);
				HttpURLConnection uc = (HttpURLConnection)url.openConnection();
				System.out.println(uc.getResponseMessage());
				uc.disconnect();
				} catch(Exception ex) {
				System.out.println(ex.getMessage());
				}
	}

}
