package io.cucumber.skeleton.support;

import io.cucumber.java.ParameterType;
import io.cucumber.skeleton.Person;

public class ParameterTypes {
    @ParameterType("Lucy|Sean")
    public Person person(String name){
        return new Person(name);
    }
}
