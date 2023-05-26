package users_testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import test_objects.users_test_object;

class assert_types {
	users_test_object user_object;  //reference variable
	
	@BeforeEach     //before every @test annotation
	void initilize_object()
	{
		user_object=new users_test_object();
	}

	@Test
	void testcase1() {
		assertEquals("valid_user", user_object.username("admin"));
		
	}
	
	@Test
	void testcase2() {
		assertNotEquals("invalid_user", user_object.username("admin"), "testcase failed");
		
	}
	
	@Test
	void testcase3() {
		assertTrue(user_object.username("admin").equals("valid_user"));
		
	}
	
	@Test
	void testcase4() {
		assertFalse(user_object.username("admin").equals("valid_user"), "testcase passed");
		
	}
	
	@Test
	void testcase5() {
		assertNull(user_object);  //failed because user_object has initial value(not null)
		
	}
	
	@Test
	void testcase6() {
		assertNotNull(user_object);
	}

}
