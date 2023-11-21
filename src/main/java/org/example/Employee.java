package org.example;

public class Employee extends Person{


    public Employee(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = capitalizeFirstLetter(name);
    }

    protected String capitalizeFirstLetter(String input){
        String firstCharacter = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1);
        return firstCharacter + rest;
    }

    public String getSound(){
        return "Are we done yet?";
    }

    @Override
    public String eatFood() {
        return "Nom nom nom!";
    }
}
