package org.deroesch.jersey.v291.dbs;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.deroesch.jersey.v291.models.Person;

public class PeopleDB { 

    /**
     * Get one planet
     * 
     * @param id
     * @return
     */
    public static Person getOne(String id) {
        assert null != id;

        Person p = PeopleDB.people.get(id);
        return p == null ? Person.error : p;
    }

    /**
     * Get some people
     * 
     * @param ids
     * @return
     */
    public static List<Person> getSome(String[] ids) {
        assert null != ids;
        List<Person> people = new ArrayList<>();

        // Collect people by their IDs
        for (String id : ids)
            people.add(PeopleDB.getOne(id));

        return people;
    }

    /**
     * Get all people
     * 
     * @return
     */
    public static List<Person> getAll() {
        return new ArrayList<>(PeopleDB.people.values());
    }

    // The people database
    private static Map<String, Person> people = new HashMap<>();

    /**
     * 
     * @param path
     */
    public static void init(String path) {
        System.out.println("Init now");

        if (people.size() == 0)
            try {
                PeopleDBLoader.load(people, path);
            } catch (FileNotFoundException e) {

                // DB wouldn't load. Sorry, we must say goodbye...
                e.printStackTrace();
                System.exit(-1);
            }

    }

}
