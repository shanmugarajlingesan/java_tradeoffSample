package com.ibm.cloudoe.samples.service;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.ibm.cloudoe.samples.service.domain.Account;
import com.ibm.cloudoe.samples.service.domain.FormRequest;

@Path("/products")
public class ProductSalesService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Account getProducts(final FormRequest request) throws URISyntaxException, IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        String accounts = IOUtils.toString(classloader.getResourceAsStream("account.json"));
        return new Gson().fromJson(accounts, Account.class);
    }
}
