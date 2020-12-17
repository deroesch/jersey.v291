package org.deroesch.jersey.v291.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;

public class Planets {

    static final Planet mercury = new Planet("Mercury", "57,900,000 km (36,000,000 miles)", "4,878 km (3,031 miles)",
            "59 days", "88 days", "0.38", "-183 °C to 427 °C", "Sodium, helium", 0);

    static final Planet venus = new Planet("Venus", "108,160,000 km (67,000,000 miles)", "12,104 km (7,521 miles)",
            "243 days", "224 days", "0.9", "480 °C", "Carbon Dioxide (96%), Nitrogen (3.5%)", 0);

    static final Planet earth = new Planet("Earth", "149,600,000 km (92,960,000 miles)", "12,756 km (7,926 miles)",
            "23 hours, 56 mins", "365.25 days", "1", "14 °C", "Nitrogen (77%), Oxygen (21%)", 1);

    static final Planet mars = new Planet("Mars", "227,936,640 km (141,700,000 miles)", "6,794 km (4,222 miles)",
            "24 hours, 37 mins", "687 days", "0.38", "-63 °C", "Carbon Dioxide(95.3%), Argon", 2);

    static final Planet jupiter = new Planet("Jupiter", "778,369,000 km (483,500,000 miles)",
            "142,984 km (88,846 miles)", "9 hours, 55 mins", "11.86 years", "2.64", "-130 °C", "Hydrogen, Helium", 79);

    static final Planet saturn = new Planet("Saturn", "1,427,034,000 km (888,750,000 miles)",
            "120,536 km (74,900 miles)", "10 hours, 39 mins", "29 years", "1.16", "-130 °C", "Hydrogen, Helium", 82);

    static final Planet uranus = new Planet("Uranus", "2,870,658,186 km (1,783,744,300 miles)",
            "51,118 km (31,763 miles)", "17 hours, 14 mins", "84 years", "1.11", "-200 °C", "Hydrogen, Helium, Methane",
            27);

    static final Planet neptune = new Planet("Neptune", "4,496,976,000 km (2,797,770,000 miles)",
            "49,532 km (30,779 miles)", "16 hours, 7 mins", "164.8 years", "1.21", "-200 °C",
            "Hydrogen, Helium, Methane", 14);

    static final Planet pluto = new Planet("Pluto",
            "4,436,820,000 to 7,375,930,000 km (2,756,902,000 to 4,583,190,000 miles)", "2,370 km (1473 miles)",
            "6 days, 9 hours", "248 years", "Unknown", "-228 °C", "Unknown", 5);

    static final Map<String, Planet> planets = new HashMap<>();

    /**
     * Get one planet
     * 
     * @param name
     * @return
     */
    public static Planet getOne(String name) {
        assert null != name;

        Planet p = Planets.planets.get(name);
        return p == null ? Planet.error : p;
    }

    /**
     * Get some planets
     * 
     * @param names
     * @return
     */
    public static Set<Planet> getSome(String[] names) {
        Set<Planet> planets = new HashSet<>();

        for (String name : names)
            planets.add(Planets.getOne(name));

        return planets;
    }

    /**
     * Get all planets
     * 
     * @return
     */
    public static Collection<Planet> getAll() {
        return Planets.planets.values();
    }

    // Initialize
    static {
        Planets.planets.put(mercury.getName(), mercury);
        Planets.planets.put(venus.getName(), venus);
        Planets.planets.put(earth.getName(), earth);
        Planets.planets.put(mars.getName(), mars);
        Planets.planets.put(jupiter.getName(), jupiter);
        Planets.planets.put(saturn.getName(), saturn);
        Planets.planets.put(uranus.getName(), uranus);
        Planets.planets.put(Planets.neptune.getName(), neptune);
        Planets.planets.put(Planets.pluto.getName(), pluto);
    }

}
