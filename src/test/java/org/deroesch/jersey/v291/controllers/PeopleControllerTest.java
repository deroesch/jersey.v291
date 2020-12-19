package org.deroesch.jersey.v291.controllers;

import static org.junit.Assert.*;

import java.util.List;

import org.deroesch.jersey.v291.models.Person;
import org.junit.Test;

public class PeopleControllerTest {

    @Test
    public void testGetAll() {
        List<Person> people = new PeopleController().getAll();
        assertEquals(500, people.size());
    }

}
