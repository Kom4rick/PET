package com.blockwit.learn.comaric;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request1 = HttpRequest.newBuilder()
			.uri(URI.create("https://w3dna.net/api/sales/domains/price"))
			.version(HttpClient.Version.HTTP_1_1)
			.POST(HttpRequest.BodyPublishers.ofString("{\"domainNames\":[\"123\"]}"))
			.header("Content-Type", "application/json")
			.build();
		HttpResponse<String> response1 = client.send(request1, HttpResponse.BodyHandlers.ofString());

		System.out.println(response1.body());
		long startTime = System.currentTimeMillis();
		ArrayList a = new ArrayList();
		for (int i = 0; i < 1_000_000; i++) {
			a.add("");
		}
		long finishTime = System.currentTimeMillis();
		System.out.println(finishTime - startTime);

		Map abc = new Map();
		abc.add("petya");
		abc.add("vasiya");
		abc.add("yulya");
		abc.add("lox");
		System.out.println(abc.getElement(10));


	}
}
