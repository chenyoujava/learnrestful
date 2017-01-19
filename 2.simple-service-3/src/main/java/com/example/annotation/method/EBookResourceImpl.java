package com.example.annotation.method;

import com.example.domain.Book;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EBookResourceImpl implements BookResource {

	private final static Logger LOGGER = Logger.getLogger(EBookResourceImpl.class);

	@Override
	public String getWeight() {
		return "150M";
	}

	@Override
	public String newBook(Book book) {
		SimpleDateFormat f = new SimpleDateFormat("d MMM yyyy HH:mm:ss");
		Date lastUpdate = Calendar.getInstance().getTime();
		//...
		LOGGER.debug(book.getBookId());
		return f.format(lastUpdate);
	}

	@Override
	public void delete(long bookId) {
		LOGGER.debug(bookId);
	}

}
