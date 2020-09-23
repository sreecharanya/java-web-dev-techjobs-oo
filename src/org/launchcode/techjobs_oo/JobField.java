package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextid = 1;
    private String value;

    public JobField() {
        this.id = nextid;
        nextid++;
    }

    public JobField(String value){
        this();
        this.value=value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField )) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
