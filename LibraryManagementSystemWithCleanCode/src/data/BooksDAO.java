package data;
import java.util.ArrayList;
import java.util.List;

public class BooksDAO {

	List<BookDTO> list = new ArrayList<BookDTO>();

	public void addInList() {

		list.add(new BookDTO(101, "bookName1","Action", "autor1", 1000.0));
		list.add(new BookDTO(102, "bookName2","Adventure", "autor2", 2000.0));
		list.add(new BookDTO(103, "bookName3","Biography", "autor3", 3000.0));
		list.add(new BookDTO(104, "bookName4","Horror", "autor4", 4000.0));
		list.add(new BookDTO(105, "bookName5","Biography", "autor5", 3000.0));

	}
	
	public List<BookDTO> getList(){
		return list;
	}

}
