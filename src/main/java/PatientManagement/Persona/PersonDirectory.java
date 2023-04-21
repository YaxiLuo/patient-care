package PatientManagement.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import PatientManagement.Clinic.Location;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    ArrayList<Person> personDirectory;

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public Person newPerson(String name, int age, Location location) {
        Person p = new Person(name, age, location);
        personDirectory.add(p);
        return p;
    }

    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
    }

    public Person findPerson(String id) {
        for (Person p : personDirectory) {
            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; // not found after going through the whole list
    }

    // Main function to generate instance 生成所有实例的函数，看这里看这里！！！
    public PersonDirectory generatePersonInstance() {
        PersonDirectory pD0 = new PersonDirectory();
        Faker faker = new Faker(Locale.US, new Random());
        PersonDirectory pD1 = generateOriginator(pD0, faker, 20);
        PersonDirectory pD2 = configurePersonFriends(pD1,faker);
        PersonDirectory pD3 = configurePersonFamily(pD2, faker);

        return pD3;

    }

    public static int getRandom(int lower, int upper) {
        Random r = new Random();
        // nextInt(n) will return a number from zero to 'n'. Therefore e.g. if I want
        // numbers from 10 to 15
        // I will have result = 10 + nextInt(5)
        int randomInt = lower + r.nextInt(upper - lower);
        return randomInt;
    }

    public PersonDirectory generateOriginator(PersonDirectory pD, Faker faker, int personAmount) {
        String name = faker.name().firstName();
        Location location = new Location(faker.address().fullAddress());
        int ageRange = getRandom(0, 40);
        for (int index = 1; index <= personAmount; index++) {
            pD.newPerson(name, ageRange, location);
        }
        return pD;
    }

    public PersonDirectory configurePersonFamily(PersonDirectory pD, Faker faker) {
        int ageRange = getRandom(60, 100);
        for (Person p : pD.getPersonDirectory()) { // why I couldn't use pD here?
            String name1 = faker.name().firstName();
            Location location1 = new Location(faker.address().fullAddress());
            Person father = pD.newPerson(name1, ageRange, location1);
            p.setFather(father);

            String name2 = faker.name().firstName();
            Location location2 = new Location(faker.address().fullAddress());
            Person mother = pD.newPerson(name2, ageRange, location2);
            p.setMother(mother);
        }
        return pD;
    }

    public PersonDirectory configurePersonFriends(PersonDirectory pD, Faker faker) {
        int ageRange = getRandom(20, 60);
        for (Person p : pD.getPersonDirectory()) {
            String name = faker.name().firstName();
            Location location = new Location(faker.address().fullAddress());
            Person friend = pD.newPerson(name, ageRange, location);
            p.addFriends(friend);
        } // 加一个朋友就可以了，累了。
        return pD;
    }

    public void printPerson() {
        for (Person person : personDirectory) {
            System.out.println(person);
        }
    }
}
