package org.deroesch.jersey.v291.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.deroesch.jersey.v291.dbs.PlanetsDatabase;
import org.junit.Test;

public class PlanetsTest {

    @Test
    public void testGetOne() {
        
        // Try a good planet
        assertEquals(PlanetsDatabase.earth, PlanetsDatabase.getOne(PlanetsDatabase.earth.getName()));

        // Try a bad planet
        assertEquals(Planet.error, PlanetsDatabase.getOne("bad name"));
    }

    @Test
    public void testGetSome() {

        // Set up expected solution
        Collection<Planet> solutionSet = new HashSet<>();
        solutionSet.add(PlanetsDatabase.earth);
        solutionSet.add(PlanetsDatabase.mars);
        solutionSet.add(PlanetsDatabase.neptune);

        // Gather solution names, for fetch-by-name
        List<String> list = new ArrayList<>();
        for (Planet p : solutionSet)
            list.add(p.getName());

        // Do the fetch (expects an array of names).
        String[] solutionNames = list.toArray(new String[list.size()]);
        assertEquals(solutionSet, PlanetsDatabase.getSome(solutionNames));
    }

    @Test
    public void testGetAll() {
        Collection<Planet> solutionSet = PlanetsDatabase.planets.values();
        assertEquals(solutionSet, PlanetsDatabase.getAll());
    }

}
