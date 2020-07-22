package com.karkabulary.web.definition;

public enum DefinitionType {
    Phrase("Phrase"),
    Thing("Thing"),
    Action("Action");

    private final String name;

    DefinitionType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
