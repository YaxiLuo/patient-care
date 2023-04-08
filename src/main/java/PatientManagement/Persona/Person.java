package PatientManagement.Persona;

import PatientManagement.Patient.Patient;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;
    Person mother;
    Person father;
    ArrayList<Person> siblings;
    Patient patient;

    public Person(String id) {
        this.id = id;
        siblings = new ArrayList<Person>();
    }

    public String getPersonId() {
        return id;
    }

    public void setFather(Person f) {
        father = f;
    }

    public void setMother(Person m) {
        mother = m;
    }

    public void addSibling(Person s) {
        if (siblings.contains(s))
            return; // sibling already in the arraylist
        siblings.add(s);
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id))
            return true;
        return false;
    }
}