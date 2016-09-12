package com.baml.h4h.sample;

import com.backendless.Backendless;

public class App {

	public static String YOUR_APP_ID_HEADER = "application-id";
	public static String YOUR_SECRET_KEY_HEADER = "secret-key";

	protected static String YOUR_APP_ID = "4ED00D7B-240E-B654-FF92-8E5E8C6F0100";
	protected static String YOUR_SECRET_KEY = "B99DC1B0-228F-7CB2-FFAB-295D023A9200";
	private static String appVersion = "v1";
	public static String BASEURL = "https://api.backendless.com/v1/";
	static {
		Backendless.initApp(YOUR_APP_ID, YOUR_SECRET_KEY, appVersion);
	}

	public static void init() {

	}
}
