package projet3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import projet3.Calculatrice;


class CalculatriceTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("before each");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("after each");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("after all");
	}
	
	@Test
	@DisplayName("test addition correcte")
	public void testAdd() {
		Calculatrice calc = new Calculatrice();
		int result = calc.add(1,2);
		assertEquals(3,result, "addition correcte");
	}
	
	
}
