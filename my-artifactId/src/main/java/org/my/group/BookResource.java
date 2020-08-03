package org.my.group;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/book")
public class BookResource {

    public static List<String> books = new ArrayList<>();

    static {
        books.add("first book ");
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getBooks(){
        return books.toString();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String addBook(String book){
        books.add(book);
        return books.toString();
    }
}
