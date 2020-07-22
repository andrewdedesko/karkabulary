package com.karkabulary.web.definition;

public class Definition {
    public final String term;
    public final String description;

    public Definition(String term, String description) {
        this.term = term;
        this.description = description;
    }

    public String getTerm() {
        return term;
    }

    public String getDescription() {
        return description;
    }
}
