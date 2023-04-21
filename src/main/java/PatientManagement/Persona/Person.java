package PatientManagement.Persona;

import PatientManagement.Clinic.Location;
import PatientManagement.Patient.Patient;
import java.util.ArrayList;

import com.github.javafaker.Address;
import com.github.javafaker.Name;

import PatientManagement.Clinic.Location;

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
    String name;
    Person mother;
    Person father;
    ArrayList<Person> friends;
    Patient patient;
    int age;
    int temporature;
    Location location;

    // public Person(String id, int age, Location location) {
    // this.id = id;
    // this.age = age;
    // this.location = location;
    // friends = new ArrayList<Person>();
    // }

    public Person(String id, int age, Location location) {
        name = id;
        this.age = age;
        this.location = location;
        friends = new ArrayList<Person>();
        // 这个地方岂不是没重置一次都有一个新的Person ArrayList？
    }

    public String getPersonId() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 传染病防治时，输出要用
    public Location getPersonLocation() {
        return location;
    }

    public void setFather(Person f) {
        father = f;
    }

    public void setMother(Person m) {
        mother = m;
    }

    public void addFriends(Person f) {
        if (friends.contains(f))
            return; // friends already in the arraylist
        friends.add(f);
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id))
            return true;
        return false;
    }


}
