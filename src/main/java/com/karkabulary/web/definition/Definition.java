package com.karkabulary.web.definition;

public class Definition {
    public final String term;
    public final DefinitionType type;
    public final String description;

    public Definition(String term, DefinitionType type, String description) {
        this.term = term;
        this.type = type;
        this.description = description;
    }

    public String getTerm() {
        return term;
    }

    public DefinitionType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
