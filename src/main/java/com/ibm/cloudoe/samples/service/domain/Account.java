package com.ibm.cloudoe.samples.service.domain;

import java.util.List;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Account {

    private String subject;
    private List<Column> columns;
    private List<Options> options;

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(final List<Column> columns) {
        this.columns = columns;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(final List<Options> options) {
        this.options = options;
    }
}
