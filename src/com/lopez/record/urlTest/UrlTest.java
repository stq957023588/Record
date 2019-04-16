package com.lopez.record.urlTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;
/**
 * 通过网址获取html
 * @author Lopez
 *
 */
public class UrlTest {
	public static void main(String[] args) throws IOException {
		URL url=new URL("https://www.cnblogs.com/yangyi9343/p/7234225.html");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		InputStream inputStream=connection.getInputStream();
		String result=IOUtils.toString(inputStream);
		System.out.println(result);
	}
}
