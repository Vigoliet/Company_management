package org.example.employees;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }



    @Override
    public String getSound() {
        return "Yay Java!";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
