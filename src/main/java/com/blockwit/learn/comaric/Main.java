package com.blockwit.learn.comaric;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import java.com.blockwit.learn.comaric;

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

        String b[] = new String[0];
        ArrayList a = new ArrayList(b);
        a.add("pf");
        a.add("13");
        a.add("asd");
        System.out.println(a.getElement(2));

    }

}
