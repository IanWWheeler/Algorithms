package test.easy;

import org.junit.Assert;
import org.junit.Test;

import easy.JewelsAndStone;

public class JewelsAndStoneTest {

	JewelsAndStone js = new JewelsAndStone();
	
	@Test
	public void positiveTest() {
		String J = "aA";
		String S = "aAAbbbb";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(3, numJewels);
	}
	
	@Test
	public void positive2Test() {
		String J = "aAbBcC";
		String S = "aAbBcC";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(6, numJewels);
	}
	
	@Test
	public void nullJTest() {
		String J = null;
		String S = "aAAbbb";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(0, numJewels);
	}
	
	@Test
	public void nullSTest() {
		String J = "aA";
		String S = null;
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(0, numJewels);
	}
	
	@Test
	public void emptyJTest() {
		String J = "";
		String S = "aAAbbb";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(0, numJewels);
	}
	
	@Test
	public void emptySTest() {
		String J = "aA";
		String S = "";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(0, numJewels);
	}
	
	@Test
	public void greaterThan50JTest() {
		String J = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		String S = "aAAbbb";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(0, numJewels);
	}
	
	@Test
	public void greaterThan50STest() {
		String J = "aA";
		String S = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		int numJewels = js.NumJewelsInStones(J, S);
		Assert.assertEquals(0, numJewels);
	}
	
}
