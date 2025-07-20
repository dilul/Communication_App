package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public void moveTo(Integer distance) {


    }

    public void shout(String message) {

    }

    public List<String> getMessageHeard() {
        List<String> message = new ArrayList<String>();
        message.add("Free bagels at Sean's");
        return message;
    }
}
