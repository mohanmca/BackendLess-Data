package com.baml.h4h.sample;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.logging.LoggingFeature;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.baml.h4h.sample.model.User;
import com.baml.h4h.sample.model.need;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getClass().getName());

	public static void main(String[] args) {
		App.init();
		createNeed(); 
		// registerUser();
		// registerUserUsingRest();
	}

	private static void registerUser() {
		BackendlessUser user = new BackendlessUser();
		user.setEmail("test@test.com");
		user.setPassword("test");
		user.setProperty("role", Integer.valueOf(2));
		Backendless.UserService.register(user, new BamlHandler<BackendlessUser>());
	}
	
	private static void createNeed() {


		need oNeed = new com.baml.h4h.sample.model.need();
		oNeed.setId(2);
		oNeed.setDescription("Roof");
		oNeed.setPrice(13.2);
	

		Feature feature = new LoggingFeature(logger, java.util.logging.Level.INFO, null, null);

		Client client = ClientBuilder.newClient();
		client.register(feature);
		WebTarget resource = client.target(App.BASEURL + "data/need");

		javax.ws.rs.client.Invocation.Builder request = resource.request(MediaType.APPLICATION_JSON);
		request = request.header(App.YOUR_APP_ID_HEADER, App.YOUR_APP_ID).header(App.YOUR_SECRET_KEY_HEADER,
				App.YOUR_SECRET_KEY);
		// Response response = request.post(Entity.entity(form,
		// MediaType.APPLICATION_FORM_URLENCODED));
		Response response = request.post(Entity.json(oNeed));

		if (response.getStatus() == Response.Status.ACCEPTED.getStatusCode()) {
			System.out.println("Success! " + response.getStatus());
			System.out.println(response.getEntity());
		} else {
			System.out.println("ERROR! " + response.getStatus());
			System.out.println(response.getEntity());
		}
	}	

	private static void registerUserUsingRest() {


		User user = new User();
		user.setEmail("rest@rest.com");
		user.setPassword("rest_password");
		user.setRole(1);

		Feature feature = new LoggingFeature(logger, java.util.logging.Level.INFO, null, null);

		Client client = ClientBuilder.newClient();
		client.register(feature);
		WebTarget resource = client.target(App.BASEURL + "users/register");

		javax.ws.rs.client.Invocation.Builder request = resource.request(MediaType.APPLICATION_JSON);
		request = request.header(App.YOUR_APP_ID_HEADER, App.YOUR_APP_ID).header(App.YOUR_SECRET_KEY_HEADER,
				App.YOUR_SECRET_KEY);
		// Response response = request.post(Entity.entity(form,
		// MediaType.APPLICATION_FORM_URLENCODED));
		Response response = request.post(Entity.json(user));

		if (response.getStatus() == Response.Status.ACCEPTED.getStatusCode()) {
			System.out.println("Success! " + response.getStatus());
			System.out.println(response.getEntity());
		} else {
			System.out.println("ERROR! " + response.getStatus());
			System.out.println(response.getEntity());
		}
	}

}

