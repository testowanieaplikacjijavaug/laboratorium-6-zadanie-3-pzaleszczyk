package java_fluent;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class FractionHamcrestTest {

	@Test
	public void testadd() {
		assertThat(Fraction.of(1,2).add(Fraction.of(1,2)),equalTo(Fraction.FULL));
	}
	@Test
	public void testmultiply() {
		assertThat(Fraction.of(1,1).multiply(Fraction.of(1,2)),equalTo(Fraction.HALF));
	}
	@Test
	public void testmultiplyindetermin() {
		assertThat(Fraction.of(0,0).multiply(Fraction.of(1,2)),equalTo(Fraction.INDETERMINATE));
	}
	
	@Test
	public void testone() {
		assertThat(Fraction.of(1,1),equalTo(Fraction.FULL));
	}
	@Test
	public void testtwo() {
		assertThat(Fraction.of(1,2),equalTo(Fraction.HALF));
	}
	@Test
	public void testthree() {
		assertThat(Fraction.of(1,3),equalTo(Fraction.ONE_THIRD));
	}
	@Test
	public void testgetdom() {
		assertThat(Fraction.of(1,3).getDenominator(),equalTo(3));
	}
	@Test
	public void testgetnom() {
		assertThat(Fraction.of(1,3).getNominator(),equalTo(1));
	}
	
	@Test
	public void testdoubleval() {
		assertThat(Fraction.of(1,3).doubleValue(), allOf(greaterThan(0.2),lessThan(0.4)));
	}
	
	
	@Test
	public void testexception() {
		
		try {
			Fraction.of(1, 0);
    	}catch(Exception e){
    		assertThat(e,instanceOf(IllegalArgumentException.class));
    		return;
    	}
    	//Else fail
    	assertThat(true,is(false));

	}
	
	
	@Test
	public void testtostring() {
		assertThat(Fraction.of(0,0).toString(),is("0/0"));
	}
	
	@Test
	public void testhashcode() {
		assertThat(Fraction.of(0,0).hashCode(),equalTo(0));
	}
	
	@Test
	public void testequals() {
		assertThat(Fraction.of(1, 2).equals(Fraction.of(1, 2)),is(true));
	}
	
	
	
	
}
