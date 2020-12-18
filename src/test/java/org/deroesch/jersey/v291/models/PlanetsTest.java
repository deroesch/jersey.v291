package org.deroesch.jersey.v291.models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.deroesch.jersey.v291.models.Planet;
import org.deroesch.jersey.v291.models.Planets;
import org.junit.Test;

public class PlanetsTest {

    @Test
    public void testGetOne() {
        
        // Try a good planet
        assertEquals(Planets.earth, Planets.getOne(Planets.earth.getName()));

        // Try a bad planet
        assertEquals(Planet.error, Planets.getOne("bad name"));
    }

    @Test
    public void testGetSome() {

        // Set up expected solution
        Collection<Planet> solutionSet = new HashSet<>();
        solutionSet.add(Planets.earth);
        solutionSet.add(Planets.mars);
        solutionSet.add(Planets.neptune);

        // Gather solution names, for fetch-by-name
        List<String> list = new ArrayList<>();
        for (Planet p : solutionSet)
            list.add(p.getName());

        // Do the fetch (expects an array of names).
        String[] solutionNames = list.toArray(new String[list.size()]);
        assertEquals(solutionSet, Planets.getSome(solutionNames));
    }

    @Test
    public void testGetAll() {
        Collection<Planet> solutionSet = Planets.planets.values();
        assertEquals(solutionSet, Planets.getAll());
    }

}
