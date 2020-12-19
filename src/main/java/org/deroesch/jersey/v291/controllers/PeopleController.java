package org.deroesch.jersey.v291.controllers;

import java.io.FileNotFoundException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.deroesch.jersey.v291.dbs.PeopleDB;
import org.deroesch.jersey.v291.models.Person;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("people")
public class PeopleController {

    @Context
    private ServletContext context;

    /**
     * Method handling HTTP GET requests. The returned object will be sent to the
     * client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws FileNotFoundException 
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<Person> getAll() throws FileNotFoundException {

        String path = "src/main/resources/us-500.txt";

        try {
            path = context.getRealPath("/WEB-INF/classes/us-500.txt");
        } catch (NoClassDefFoundError e) {
            // Expected in Maven context
        } catch (NullPointerException e) {
            // Expected in JUnit context
        }

        PeopleDB.init(path);

        return PeopleDB.getAll();
    }
}
