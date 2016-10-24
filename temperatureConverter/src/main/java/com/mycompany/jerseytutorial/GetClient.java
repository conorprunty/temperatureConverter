package com.mycompany.jerseytutorial;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author conorprunty
 */
public class GetClient {

    public static void main(String[] args) {
        int port = 8080;
        String getUrl = "http://localhost:" + port + "/api/converter/f2cservice";
        Client client = Client.create();
        WebResource target = client.resource(getUrl);
        ClientResponse response = target.queryParam("fahrenheit", "25").get(ClientResponse.class);
        System.out.println(response.getEntity(String.class));
    }
}
