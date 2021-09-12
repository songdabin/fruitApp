package example.com.FruitApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		fl.add(new Fruit(101, "Apple", 1000));
		fl.add(new Fruit(102, "Mango", 1500));
		fl.add(new Fruit(103, "Orange", 2000));
		fl.add(new Fruit(104, "Banana", 2500));
		fl.add(new Fruit(105, "Cherry", 1300));
		fl.add(new Fruit(106, "Apple Mango", 2200));
		fl.add(new Fruit(107, "Tangerine", 2100));
		fl.add(new Fruit(108, "Pear", 1700));
		fl.add(new Fruit(109, "Strawberry", 1800));
		fl.add(new Fruit(110, "Blueberry", 2300));
		fl.add(new Fruit(111, "PineApple", 2500));
		
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("\nFruit List (reversed ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for (int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}
