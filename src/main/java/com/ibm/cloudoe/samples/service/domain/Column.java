package com.ibm.cloudoe.samples.service.domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Column {

    private String key;
    private String type;
    private String goal;
    private String full_name;
    private boolean is_objective;
    private String format;
    private ArrayList<String> range;
    private ArrayList<String> preference;

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(final String goal) {
        this.goal = goal;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(final String full_name) {
        this.full_name = full_name;
    }

    public boolean isIs_objective() {
        return is_objective;
    }

    public void setIs_objective(final boolean is_objective) {
        this.is_objective = is_objective;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public ArrayList<String> getRange() {
        return range;
    }

    public void setRange(final ArrayList<String> range) {
        this.range = range;
    }

    public ArrayList<String> getPreference() {
        return preference;
    }

    public void setPreference(final ArrayList<String> preference) {
        this.preference = preference;
    }
}
