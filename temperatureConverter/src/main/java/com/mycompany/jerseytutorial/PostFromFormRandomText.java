/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import java.util.Random;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author conorprunty
 */
@Path("/converter")
public class PostFromFormRandomText {

    @POST
    @Path("/postFromFormRandomText")
    public Response addUser(
            @FormParam("randomNumber") int randomNumber) {

        Random ran = new Random();
        int top = randomNumber;
        char data;
        String dat = "";

        for (int i = 0; i <= top - 1; i++) {
            data = (char) (ran.nextInt(25) + 97);
            dat = data + dat;
        }
        if (randomNumber > 100 || randomNumber < 0) {
            return Response.status(200)
                    .entity("You entered an invalid number").build();
        } else {
            return Response.status(200)
                    .entity("A random string generated with the length of characters you entered: " + dat)
                    .build();
        }

    }

}
