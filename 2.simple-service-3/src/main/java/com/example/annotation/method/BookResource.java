package com.example.annotation.method;

import com.example.domain.Book;
import com.example.domain.Books;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("book")
public interface BookResource {
	@GET
	String getWeight();

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	String newBook(Book book);

	@DELETE	
	void delete(@QueryParam("bookId") final long bookId);

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	Book createBook(Book book);

	@MOVE
	boolean moveBooks(Books books);
}
