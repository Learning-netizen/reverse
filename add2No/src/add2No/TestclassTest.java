package add2No;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestclassTest {
	@BeforeEach
    void obj() {
	//objAdd = new AddClass();
	System.out.println("Run before each method");
}
	@BeforeAll
     static void obj1() {
	//objAdd = new AddClass();
	System.out.println("Run before all method");
}
	
@Test
@DisplayName("Addition Method")
void TestAdd() {
	Testclass objAdd = new Testclass();
	int expected =5;
	int actual = objAdd.sum(3,2);
	assertEquals(expected,actual);
	
 }
@Test
@DisplayName("division")
void Testdiv() {
	Testclass objdiv = new Testclass();
	double expected =5;
	double actual = objdiv.div(10,2);
	assertEquals(expected,actual);

}
@Test
void Testmulti() {
	Testclass objmulti = new Testclass();
	int expected =4;
	int actual = objmulti.sum(2,2);
	assertEquals(expected,actual);
}
}