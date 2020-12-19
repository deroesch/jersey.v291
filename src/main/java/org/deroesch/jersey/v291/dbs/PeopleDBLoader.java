package org.deroesch.jersey.v291.dbs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.deroesch.jersey.v291.models.Person;

import com.opencsv.CSVReader;

public class PeopleDBLoader {

    /**
     * Read People data from a CSV file
     * 
     * @param db        the database (hash map) to fill
     * @param path path to the file holding People data
     * @throws FileNotFoundException if you lied about the file location
     */
    static public void load(Map<String, Person> db, String path) throws FileNotFoundException {
        assert null != path;

        FileReader fr = new FileReader(path);
        String[] fields;

        // Load records from a CSV file and convert them into People beans.
        try (CSVReader csvReader = new CSVReader(fr)) {
            while ((fields = csvReader.readNext()) != null) {

                // Skip the labeled header row
                if ("first_name".equals(fields[0]))
                    continue;

                // For debugging
                boolean printFields = false;
                if (printFields) {
                    for (String field : fields) {
                        System.out.print(field + "|");
                    }
                    System.out.println();
                }

                // Convert to Person bean, store in database
                // indexed by email address
                Person p = new Person(fields);
                db.put(p.getId(), p);
            }
        } catch (IOException e) {
            // Line read failed, exit.
        }
    }
}