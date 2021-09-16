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
	
	public Requests() {
		size = 0;

		reqs = new ArrayList<LinkedList<Customer>>();
		
		reqs.add(platinum); 
		reqs.add(gold);
		reqs.add(silver);
		reqs.add(bronze); 
	}

	public void add(String name, int loy) {
		
		add(new Customer(name,loy));
	}
	
	public void add(Customer c) {

		if (c.getLoyalty() == -1) return;

		else if (c.getLoyalty() == 0) {
			platinum.add(c); 
			reqs.add(0, platinum);
			size++;
		}
		else if (c.getLoyalty() == 1) {
			gold.add(c);
			reqs.add(1, gold);
			size++;
		}
		else if (c.getLoyalty() == 2) {
			silver.add(c); 
			reqs.add(2, silver);
			size++;
		}
		else if (c.getLoyalty() == 3) {
			bronze.add(c);
			reqs.add(3, bronze);
			size++;
		}
	}
	
	
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
			@Override
			public void remove() {

				index--;
				
				if (index < platinum.size()) platinum.remove(c); 
				
				else if (index < (platinum.size() + gold.size())) gold.remove(c);
					
				else if (index < (platinum.size() + gold.size() + silver.size())) silver.remove(c);

				else  bronze.remove(c);
				
				size--;				
			}
		};
		return itr;
	}
	
	
	
	
}
