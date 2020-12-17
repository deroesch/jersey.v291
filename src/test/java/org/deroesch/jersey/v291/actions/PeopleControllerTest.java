package org.deroesch.jersey.v291.actions;

import static org.junit.Assert.*;

import org.deroesch.jersey.v291.domain.Person;
import org.junit.Test;

public class PeopleControllerTest {

    @Test
    public void testGetIt() {
        PeopleController pc = new PeopleController();

        Person p = pc.getIt();

        assertEquals(Person.prototype(), p);
    }

}
