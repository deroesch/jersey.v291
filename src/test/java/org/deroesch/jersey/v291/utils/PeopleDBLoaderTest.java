package org.deroesch.jersey.v291.utils;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.deroesch.jersey.v291.dbs.PeopleDBLoader;
import org.deroesch.jersey.v291.models.Person;
import org.junit.Test;

public class PeopleDBLoaderTest {

    @Test
    public void testLoad() throws FileNotFoundException {
        Map<String, Person> db = new HashMap<>();
        PeopleDBLoader.load(db, "src/main/resources/us-500.txt");

        assertTrue(db.size() > 0);
    }

}
