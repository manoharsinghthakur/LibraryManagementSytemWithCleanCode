package controller;

import java.util.Scanner;

import Service.SearchActionBook;
import Service.SearchAdventureBook;
import Service.SearchBiographyBook;
import Service.SearchBook;
import Service.SearchHorrorBook;

public class SearchBookController {
	
	static SearchBook searchBook; 
	
	public static void searchBook() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("search movies...");
		System.out.println("PRESS 1 for Action, 2 for Adventure, 3 for horror, 4 for biography");
		
		int number = scanner.nextInt();
		
		switch (number) {
		case 1:
			searchBook = new SearchActionBook();
			searchBook.searchBook();
			break;
		case 2:
			searchBook = new SearchAdventureBook();
			searchBook.searchBook();
			break;
		case 3:
			searchBook = new SearchHorrorBook();
			searchBook.searchBook();
			break;
		case 4:
			searchBook = new SearchBiographyBook();
			searchBook.searchBook();
			break;
		default:
			System.out.println("not available");
		}
	}
}
