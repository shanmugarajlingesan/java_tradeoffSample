package com.ibm.cloudoe.samples.service.domain;

import java.util.Comparator;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Options implements Comparable<Options> {

    private int key;
    private String name;
    private Values values;
    private String description_html;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
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

    @Override
    public int compareTo(Options o) {
        return (this.key - o.key);
    }
}
