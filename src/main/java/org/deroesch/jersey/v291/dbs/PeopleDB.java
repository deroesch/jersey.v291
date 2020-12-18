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
     * @param id
     * @return
     */
    public static Person getOne(String id) {
        assert null != id;

        Person p = PeopleDB.people.get(id.toLowerCase());
        return p == null ? Person.error : p;
    }

    /**
     * Get some people
     * 
     * @param ids
     * @return
     */
    public static Set<Person> getSome(String[] ids) {
        Set<Person> people = new HashSet<>();

        // Collect people by their IDs
        for (String id : ids)
            people.add(PeopleDB.getOne(id.toLowerCase()));

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
