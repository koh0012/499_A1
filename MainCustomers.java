package cosc499a1;

import java.util.Iterator;

public class MainCustomers {

	public static void main(String[] args) {

		Requests r = new Requests();
		r.add("Jim", 0);
		r.add("Jenny",1);
		r.add("Julie",2);
		r.add("Jason",2);
		r.add("Jessica",0);
		r.add("Joseph",5);
		r.add("Jackie", 1);
		r.add("CowboyNeal", 2);
		r.add("Val", 3);
		
		Iterator<Customer> i = r.iterator();

		while(i.hasNext()) {
			Customer c = i.next();
			if (c.getName().equals("CowboyNeal")) 
				i.remove();
			System.out.println(c);
		}

		System.out.println();
		
		
		i = r.iterator();
		while(i.hasNext()) {
			Customer c = i.next();
			System.out.println(c);
		}
	
		
	}

}
