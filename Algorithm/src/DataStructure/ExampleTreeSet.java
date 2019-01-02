package DataStructure;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
	public static void main(String[] args) {
		Set<String> normalSet = new HashSet<String>();
		normalSet.add("banana");
		normalSet.add("cat");
		normalSet.add("apple");
		normalSet.add("banana");
		normalSet.add("cat");
		normalSet.add("apple");
		normalSet.add("star");
		normalSet.add("host");
		print("HashSet ",normalSet);
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("banana");
		treeSet.add("cat");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("cat");
		treeSet.add("apple");
		treeSet.add("star");
		treeSet.add("host");
		
		print("TreeSet ",treeSet);
		
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("banana");
		linkedSet.add("cat");
		linkedSet.add("apple");
		linkedSet.add("banana");
		linkedSet.add("cat");
		linkedSet.add("apple");
		linkedSet.add("star");
		linkedSet.add("host");
		print("LinkedHashSet ",linkedSet);
		
	}
	public static void print(String dataStructure,Set<String> treeSet) {
		System.out.print(dataStructure);
		System.out.print("value: ");
		treeSet.forEach(value->{
			System.out.print(value+" ");
		});
		System.out.println(" ");
	}
}
