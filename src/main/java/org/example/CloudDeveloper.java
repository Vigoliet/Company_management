package org.example;

public class CloudDeveloper extends Developer{

    public CloudDeveloper(String name, String programmingLanguage) {
        super(name, programmingLanguage);
    }

    public void FixWebsite(Website website) {
        website.Fix(website);
    }
}
