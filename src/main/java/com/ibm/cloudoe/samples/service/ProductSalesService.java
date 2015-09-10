package com.ibm.cloudoe.samples.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ibm.cloudoe.samples.service.domain.Options;
import com.ibm.cloudoe.samples.service.domain.YesNoFlag;
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
        final Account account = new Gson().fromJson(accounts, Account.class);

        final Account responseAccount = new Account();
        responseAccount.setSubject(account.getSubject());
        responseAccount.setColumns(account.getColumns());
        responseAccount.setOptions(filterOptions(request, account));
        return responseAccount;
    }

    private List<Options> filterOptions(final FormRequest request, final Account account) {
        final List<Options> listOfOptions = new ArrayList<Options>();

        if(request.isDebitCard()) {
            for (final Options option : account.getOptions()) {
                if (option.getValues().getDebit_card().equals(YesNoFlag.Yes)) {
                    listOfOptions.add(option);
                }
            }
        }

        if(request.isCreditCard()) {
            for (final Options option : account.getOptions()) {
                if (option.getValues().getCredit_card().equals(YesNoFlag.Yes)) {
                    listOfOptions.add(option);
                }
            }
        }

        if(request.isForeignCurrency()) {
            for (final Options option : account.getOptions()) {
                if (option.getValues().getForeign_currency().equals(YesNoFlag.Yes)) {
                    listOfOptions.add(option);
                }
            }
        }

        final List<Options> uniqueOptions = new ArrayList<Options>();
        uniqueOptions.addAll(new HashSet<Options>(listOfOptions));

        return uniqueOptions;
    }
}
