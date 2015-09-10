package com.ibm.cloudoe.samples.service;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Path("/products")
public class ProductSalesService {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject getProducts() throws URISyntaxException, IOException, ParseException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        String accounts = IOUtils.toString(classloader.getResourceAsStream("account.json"));
        return (JSONObject)new JSONParser().parse(accounts);
    }
}
