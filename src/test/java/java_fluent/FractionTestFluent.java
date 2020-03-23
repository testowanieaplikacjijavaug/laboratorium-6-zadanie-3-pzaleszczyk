package java_fluent;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class FractionTestFluent {

	@Test
	public void testadd() {
		assertThat(Fraction.of(1,2).add(Fraction.of(1,2))).isEqualTo(Fraction.FULL);
	}
	@Test
	public void testmultiply() {
		assertThat(Fraction.of(1,1).multiply(Fraction.of(1,2))).isEqualTo(Fraction.HALF);
	}
	@Test
	public void testmultiplyindetermin() {
		assertThat(Fraction.of(0,0).multiply(Fraction.of(1,2))).isEqualTo(Fraction.INDETERMINATE);
	}
	
	@Test
	public void testone() {
		assertThat(Fraction.of(1,1)).isEqualTo(Fraction.FULL);
	}
	@Test
	public void testtwo() {
		assertThat(Fraction.of(1,2)).isEqualTo(Fraction.HALF);
	}
	@Test
	public void testthree() {
		assertThat(Fraction.of(1,3)).isEqualTo(Fraction.ONE_THIRD);
	}
	@Test
	public void testgetdom() {
		assertThat(Fraction.of(1,3).getDenominator()).isEqualTo(3);
	}
	@Test
	public void testgetnom() {
		assertThat(Fraction.of(1,3).getNominator()).isEqualTo(1);
	}
	
	@Test
	public void testdoubleval() {
		assertThat(Fraction.of(1,3).doubleValue()).isGreaterThan(0.3).isLessThan(0.4);
	}
	
	
	Fraction testingexception(){
		return Fraction.of(1,  0);
	}
	@Test
	public void testexception() {
		
		try {
			Fraction.of(1, 0);
  		  failBecauseExceptionWasNotThrown(IndexOutOfBoundsException.class);
  		} catch (Exception e) {
  		  assertThat(e).isInstanceOf(IllegalArgumentException.class);
  		}
	}
	
	
	@Test
	public void testtostring() {
		assertThat(Fraction.of(0,0).toString()).contains("0/0");
	}
	
	@Test
	public void testhashcode() {
		assertThat(Fraction.of(0,0).hashCode()).isEqualTo(0);
	}
	
	@Test
	public void testequals() {
		assertThat(Fraction.of(1, 2).equals(Fraction.of(1, 2))).isTrue();
	}
	
	
	
	
}
