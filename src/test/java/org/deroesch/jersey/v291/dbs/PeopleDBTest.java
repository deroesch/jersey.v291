package org.deroesch.jersey.v291.dbs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.deroesch.jersey.v291.models.Person;
import org.junit.Test;

import jersey.repackaged.com.google.common.collect.Sets;

public class PeopleDBTest {

    @Test
    public void testGetOne() {
        // Test presence
        assertEquals(ezekiel, PeopleDB.getOne("ezekiel@chui.com"));

        // Test absence
        assertTrue(PeopleDB.getOne("no such person").isError());
    }

    @Test
    public void testGetSome() {

        // Test a subset
        Set<Person> expected = new HashSet<Person>();
        expected.add(lenna);
        expected.add(rasheeda);
        expected.add(ezekiel);
        expected.add(Person.error);

        String[] ids = { lenna.getEmail(), rasheeda.getEmail(), ezekiel.getEmail(), "no such email" };

        List<Person> some = PeopleDB.getSome(ids);
        Set<Person> actual = Sets.newHashSet(some);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetAll() {

        // Fetch them all
        assertTrue(PeopleDB.getAll().size() == 500);
    }

    /**
     * Known, expected records used in this test
     */
    private Person ezekiel = new Person("Ezekiel", "Chui", "Sider, Donald C Esq", "2 Cedar Ave #84", "Easton", "Talbot",
            "MD", 21601, "410-669-1642", "410-235-8738", "ezekiel@chui.com", "http://www.siderdonaldcesq.com");;

    private Person lenna = new Person("Lenna", "Newville", "Brooks, Morris J Jr", "987 Main St", "Raleigh", "Wake",
            "NC", 27601, "919-623-2524", "919-254-5987", "lnewville@newville.com", "http://www.brooksmorrisjjr.com");

    private Person rasheeda = new Person("Rasheeda", "Sayaphon", "Kummerer, J Michael Esq", "251 Park Ave #979",
            "Saratoga", "Santa Clara", "CA", 95070, "408-805-4309", "408-997-7490", "rasheeda@aol.com",
            "http://www.kummererjmichaelesq.com");
}
