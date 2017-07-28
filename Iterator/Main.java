package Iterator;

public class Main{

	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("葵花宝典"));
		bookshelf.appendBook(new Book("癖习剑谱"));
		bookshelf.appendBook(new Book("降龙十八掌"));
		bookshelf.appendBook(new Book("九阴真经"));
		bookshelf.appendBook(new Book("狮吼功"));
		bookshelf.appendBook(new Book("七伤拳"));

		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
		
	}

}
