package org.example;

public class Employee {

    private String name;

    public Employee(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String firstCharacter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1);
        this.name = firstCharacter + rest;
    }

    public String getSound(){
        return "Are we done yet?";
    }
}
