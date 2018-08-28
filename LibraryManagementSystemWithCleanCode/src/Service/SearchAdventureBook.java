package Service;

import java.util.List;
import java.util.stream.Collectors;

import data.BookDTO;
import data.BooksDAO;

public class SearchAdventureBook implements SearchBook {

	final static String MOVIE_CATAGORY="Adventure";

	@Override
	public void searchBook() {
		BooksDAO book=new BooksDAO();
		book.addInList();
		
		List<BookDTO> bookList=book.getList().stream().filter(x->x.getCatagory()==MOVIE_CATAGORY).collect(Collectors.toList());
		for(BookDTO list:bookList){
			System.out.println("id: "+list.getBookId()+", name: "+list.getBookName()+", Author: "+", catagory: "+list.getCatagory()+", price:"+list.getPrice());
		}		
	}

}
