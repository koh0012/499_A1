package cosc499a1;

import static org.junit.Assert.*;

import java.util.Iterator;
import org.junit.Before;

public class Test {
	
	Requests r;
	Iterator<Customer> i;
	
	@Before
	public void initialize() {
		System.out.println("Initializing");
		r = new Requests();
		
	}

	@org.junit.Test
	public void test1() {
		System.out.print("Test 1: ");
		r.add("Jim", 0);
		r.add("Jenny",1);
		r.add("Julie",2);
		r.add("Jason",2);
		r.add("Jessica",0);
		r.add("Jackie", 1);
		r.add("CowboyNeal", 2);
		r.add("Val", 3);
		Iterator<Customer> i = r.iterator();
		assertEquals(i.next().getName(),"Jim");
		assertEquals(i.next().getName(),"Jessica");
		assertEquals(i.next().getName(),"Jenny");
		assertEquals(i.next().getName(),"Jackie");
		assertEquals(i.next().getName(),"Julie");
		assertEquals(i.next().getName(),"Jason");
		assertEquals(i.next().getName(),"CowboyNeal");
		assertEquals(i.next().getName(),"Val");
		System.out.println("Check");
	}

	@org.junit.Test
	public void test2() {
		System.out.print("Test 2: ");
		r.add("Jenny",1);
		r.add("Julie",2);
		r.add("Val",3);
		Iterator<Customer> i = r.iterator();
		assertEquals(i.next().getName(), "Jenny");
		assertEquals(i.next().getName(), "Julie");
		assertEquals(i.next().getName(), "Val");
		System.out.println("Check");
	}

	@org.junit.Test
	public void test3() {
		System.out.print("Test 3: ");
		r.add("Jenny",1);
		r.add("Adam", 1);
		r.add("Julie",2);
		r.add("Pat", 2);
		Iterator<Customer> i = r.iterator();
		assertEquals(i.next().getName(), "Jenny");
		assertEquals(i.next().getName(), "Adam");
		assertEquals(i.next().getName(), "Julie");
		assertEquals(i.next().getName(), "Pat");
		System.out.println("Check");
	}

	@org.junit.Test
	public void test4() {
		System.out.print("Test 4: ");
		r.add("Jim", 0);
		r.add("Jessica",0);
		Iterator<Customer> i = r.iterator();
		assertEquals(i.next().getName(),"Jim");
		assertEquals(i.next().getName(),"Jessica");
		System.out.println("Check");
	}

	@org.junit.Test
	public void test5() {
		System.out.print("Test 5: ");
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
		assertEquals(i.next().getName(),"Jim");
		assertEquals(i.next().getName(),"Jessica");
		assertEquals(i.next().getName(),"Jenny");
		assertEquals(i.next().getName(),"Jackie");
		assertEquals(i.next().getName(),"Julie");
		assertEquals(i.next().getName(),"Jason");
		assertEquals(i.next().getName(),"CowboyNeal");
		assertEquals(i.next().getName(),"Val");
		System.out.println("Check");
	}

	@org.junit.Test
	public void test6() {
		System.out.print("Test 6: ");
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
			if (c.getName().equals("Jim")) {
				i.remove();
			}
			else if (c.getName().equals("Jessica"))
				i.remove();
			else if (c.getName().equals("Jenny"))
				i.remove();
			else if (c.getName().equals("Jackie"))
				i.remove();
			else if (c.getName().equals("CowboyNeal"))
				i.remove();
		}
		i = r.iterator();
		assertEquals(i.next().getName(),"Julie");
		assertEquals(i.next().getName(),"Jason");
		assertEquals(i.next().getName(),"Val");
		System.out.print("Check");
	}
	
	//Test successful!
	
}
