package com.example.annotation.method;

import com.example.domain.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("book")
public interface BookResource {
	@GET
	public String getWeight();

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	public String newBook(Book book);
}
