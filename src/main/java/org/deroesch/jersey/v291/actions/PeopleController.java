package org.deroesch.jersey.v291.actions;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.deroesch.jersey.v291.domain.Person;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("people")
public class PeopleController {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to the
     * client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<Person> getIt() {
        List<Person> people = new ArrayList<>();
        people.add(Person.prototype());
        people.add(Person.prototype());
        people.add(Person.prototype());
        return people;
    }
}
