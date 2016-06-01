package hyq1913;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		SortedSet<Item> parts = new TreeSet<Item>();
		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4562));
		parts.add(new Item("Modem", 9912));
		System.out.println(parts);
		
		SortedSet<Item> sortByDescription = new TreeSet<Item>(new Comparator<Item>() {
			public int compare(Item a, Item b) {
				String descrA = a.getDescription();
				String descrB = b.getDescription();
				return descrA.compareTo(descrB);
			}
		});
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}

class Item implements Comparable<Item> {
	
	private String description;
	private int partNumber;

	public Item(String description, int partNumber) {
		this.description = description;
		this.partNumber = partNumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return "[description=" + description + ",partNumber=" + partNumber + "]";
	}

	public boolean equals(Object otherObj) {
		if (this == otherObj)	return true;
		if (otherObj == null)	return false;
		if (getClass() != otherObj.getClass())	return false;
		Item other = (Item)otherObj;
		return description.equals(other.description) && partNumber == other.partNumber;
	}

	public int compareTo(Item o) {
		return partNumber - o.partNumber;
	}

	public int hashCode() {
		return 13 * description.hashCode() + 17 * partNumber;
	}
	
	
	
}
