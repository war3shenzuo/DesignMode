package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

	private List<Book> books;

	public BookShelf(int maxsize) {
		this.books = new ArrayList<>(maxsize);
	}

	public int getLength() {
		return books.size();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
