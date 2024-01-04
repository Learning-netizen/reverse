package add2No;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestclassTest {

	
@Test
void TestAdd() {
	Testclass objAdd = new Testclass();
	int expected =5;
	int actual = objAdd.sum(3,2);
	assertEquals(expected,actual);
	
 }
void Testdiv() {
	Testclass objdiv = new Testclass();
	int expected =50;
	int actual = objdiv.div(5,10);
	assertEquals(expected,actual);

}
void Testmulti() {
	Testclass objmulti = new Testclass();
	int expected =50;
	int actual = objmulti.sum(5,10);
	assertEquals(expected,actual);
}
}