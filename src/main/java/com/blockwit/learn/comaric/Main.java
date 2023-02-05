package com.blockwit.learn.comaric;

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
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://w3dna.net/api/sales/domains/price"))
                .version(HttpClient.Version.HTTP_2)
                .GET()
                .header("123","123")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.statusCode());
        //System.out.println(response.body());
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://w3dna.net/api/sales/domains/price"))
                .version(HttpClient.Version.HTTP_2)
                .POST(HttpRequest.BodyPublishers.ofString("\"123\""))
                .build();
        HttpResponse<String> response1 =client.send(request1,HttpResponse.BodyHandlers.ofString());
        System.out.println(response1.body());


    }

}
