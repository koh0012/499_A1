package cosc499a1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Requests implements Iterable<Customer> {

	private int size;
	private ArrayList<LinkedList<Customer>> reqs;
	
	private LinkedList<Customer> platinum = new LinkedList<Customer>();
	private LinkedList<Customer> gold = new LinkedList<Customer>();
	private LinkedList<Customer> silver = new LinkedList<Customer>();
	private LinkedList<Customer> bronze = new LinkedList<Customer>();
	
	//
	
	@Override
	public Iterator<Customer> iterator() {

		
		Iterator<Customer> itr = new Iterator<Customer>() {
			private int index = 0;
			Customer c; 
			
			@Override
			public boolean hasNext() {

				return index < size;
			}
			@Override
			public Customer next() {

				if (platinum.size() != 0 && index < platinum.size()) {
					c = platinum.get(index++);
					return c;
				}
				else if (gold.size() != 0 && index < (platinum.size() + gold.size())) {
					c = gold.get((index++) - platinum.size());
					return c;
				}
				else if (silver.size() != 0 && index < (platinum.size() + gold.size() + silver.size())) {
					c = silver.get((index++)  - (platinum.size() + gold.size()));
					return c;
				}
				else  {
					c = bronze.get((index++) - (platinum.size() + gold.size() + silver.size()));
					return c;
				}
			}
			//
		};
		return itr;
	}
	
	
	
	
}
