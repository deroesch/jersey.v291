package org.deroesch.jersey.v291.dbs;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.deroesch.jersey.v291.models.Person;

public class PeopleDB {

    // The people database
    private static Map<String, Person> people = new HashMap<>();

    // Load the database
    static {
        try {
            PeopleDBLoader.load(people, "src/main/resources/us-500.txt");
        } catch (FileNotFoundException e) {
            
            // DB wouldn't load.  Sorry, we must say goodbye...
            e.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * Get one planet
     * 
     * @param name
     * @return
     */
    public static Person getOne(String name) {
        assert null != name;

        Person p = PeopleDB.people.get(name.toLowerCase());
        return p == null ? Person.error : p;
    }

    /**
     * Get some people
     * 
     * @param names
     * @return
     */
    public static Set<Person> getSome(String[] names) {
        Set<Person> people = new HashSet<>();

        // Collect named people
        for (String name : names)
            people.add(PeopleDB.getOne(name.toLowerCase()));

        return people;
    }

    /**
     * Get all people
     * 
     * @return
     */
    public static Collection<Person> getAll() {
        return PeopleDB.people.values();
    }

}
