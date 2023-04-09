package com.blockwit.learn.comaric.api;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Authorization {


    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
//                .authenticator(new Authenticator() {
//                    @Override
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication("admin", "CyE7LXO23^LrNdAXG9!1BjYI".toCharArray());
//                    }
//                })
//                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI("https://visa-arkhangelsk.ru/wp-login.php?redirect_to=https%3A%2F%2Fvisa-arkhangelsk.ru%2Fwp-admin%2F&reauth=1"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
    }



}
