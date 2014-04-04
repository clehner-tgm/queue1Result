package testPackage;

import org.junit.Test;
import queue1.Queue1;

public class TestsB {
	
	/**
	 * Erstellen der Schlange
	 */
	Queue1 q = new Queue1(0);
	
	/**
	 * Testen ob die Schlange Elemente hinzufügen kann
	 */
	public void testAdd() {
		//q.add();
	}
	
	/**
	 * Testen ob die Schlange Elemente ausgeben kann
	 */
	public void testGet() {
		Object hilf = q.get();
		if(hilf==null) {
			throw new RuntimeException("Die Schlange ist leer");
		}
	}
	
	/**
	 * Testen ob die Schlange voll ist
	 */
	@Test
	public void testVoll() {
		boolean qF = q.isFull();
		if(qF!=true){
			throw new RuntimeException("Die Schlange ist nicht voll");
		}
	}
	
	/**
	 * Testen ob die Schlange leer ist
	 */
	@Test
	public void testLeer() {
		boolean qE = q.isEmpty();
		if(qE!=true){
			throw new RuntimeException("Die Schlange ist nicht leer");
		}
	}
}