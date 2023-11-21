package org.example;

public class Website {

    private boolean isWorking;

    public Website(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public void Fix(Website website) {
        website.isWorking = true;
    }

    public boolean isWorking() {
        return isWorking;
    }
}
