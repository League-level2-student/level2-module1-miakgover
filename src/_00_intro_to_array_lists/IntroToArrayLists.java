package _00_intro_to_array_lists;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> numbers = new ArrayList<String>();
		//2. Add five Strings to your list
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");
		numbers.add("five");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<numbers.size();i++) {
			String s = numbers.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s: numbers) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i=0;i<numbers.size();i+=2) {
			String s = numbers.get(i);
			System.out.println(s);
		}
		//6. Print all the Strings in reverse order.
		for(int i=numbers.size()-1;i>=0;i--) {
			String s = numbers.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0;i<numbers.size();i++) {
			String s = numbers.get(i);
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
