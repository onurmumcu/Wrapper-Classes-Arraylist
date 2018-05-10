package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CompareLists {

	public static void main(String[] args) {
		List<String> booksInShelf1 = new ArrayList<>();
		List<String> booksInShelf2 = new ArrayList<>();
		
		booksInShelf1.add("OCA preparations");
		booksInShelf1.add("OCA/OCP Practice");
		booksInShelf1.add("Pearl of Wisdom");
		booksInShelf1.add("10x rule");
		
		booksInShelf2.add("OCA preparations");
		booksInShelf2.add("OCA/OCP Practice");
		booksInShelf2.add("Pearl of Wisdom");
		booksInShelf2.add("10x rule");
		
		if (booksInShelf1.equals(booksInShelf2)) {
			System.out.println("Same books and same order in both shelves");
		}else {
			System.out.println("Either some books are missing or order is different in both shelves");
		}
		
		booksInShelf1.add("Sell or Sold");
		
		if (booksInShelf1.equals(booksInShelf2)) {
			System.out.println("Same books and same order in both shelves");
		}else {
			System.out.println("Either some books are missing or order is different in both shelves");
		}
		
		
		System.out.println("==========================================");
		
		booksInShelf2.add(0, "Sell or Be Sold");
		System.out.println(booksInShelf1);
		System.out.println(booksInShelf2);
		
		
		if(booksInShelf1.equals(booksInShelf2)) {
			System.out.println("Same books and same order in both shelves");
		}else{
			System.out.println("Either some books are missing or order is different in both shelves");
		}
		
		if(booksInShelf1.containsAll(booksInShelf2)) {
			System.out.println("Shelf 1 contains all books from shelf 2");
		}else{
			System.out.println("Some books are missing in Shelf 1");
		}

	}

}
