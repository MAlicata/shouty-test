package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void moveTo(Integer distance){
    }

    public void shout(String message) {
    }

    public List<String> getMessagesHeard() {
        List<String> result = new ArrayList<String>();
        result.add("free bagels at Sean's");
        return result;
    }

    public void positionTo(Integer distance) {
    }

    public List<String> getMessagesHeardLucy() {
        List<String> resultado = new ArrayList<String>();
        resultado.add("Free coffee!");
        return resultado;
    }
}
