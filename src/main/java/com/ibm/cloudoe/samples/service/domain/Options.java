package com.ibm.cloudoe.samples.service.domain;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Options {

    private String key;
    private String name;
    private Values values;
    private String description_html;

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Values getValues() {
        return values;
    }

    public void setValues(final Values values) {
        this.values = values;
    }

    public String getDescription_html() {
        return description_html;
    }

    public void setDescription_html(final String description_html) {
        this.description_html = description_html;
    }
}
