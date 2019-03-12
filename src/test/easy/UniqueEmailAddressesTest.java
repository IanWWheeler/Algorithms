package test.easy;

import org.junit.Assert;
import org.junit.Test;

import easy.UniqueEmailAddresses;

public class UniqueEmailAddressesTest {
	
	UniqueEmailAddresses uea = new UniqueEmailAddresses();
	
	@Test
	public void cleanUniqueEmailsTest() {
		String[] emails = {"John.Smith@gmail.com", "SamanthaJenkins@hotmail.com", "JeremyCosworth@aol.com"};
		int numOfValidEmails = uea.numUniqueEmails(emails);
		Assert.assertEquals(3, numOfValidEmails);
	}
	
	@Test 
	public void cleanNonUniqueEmailTest() {
		String[] emails = {"JohnSmith@gmail.com", "John.Smith@gmail.com", "J.ohn.Smith@gmail.com"};
		int numOfValidEmails = uea.numUniqueEmails(emails);
		Assert.assertEquals(1, numOfValidEmails);
	}
	
	@Test
	public void uniqueEmailWithFiltersTest() {
		String[] emails = {"JohnSmith+Work@gmail.com", "SamanthaJenkins@hotmail.com", "JeremyCosworth+Auto@aol.com"};
		int numOfValidEmails = uea.numUniqueEmails(emails);
		Assert.assertEquals(3, numOfValidEmails);
	}
	
	@Test
	public void nullEmailsTest() {
		String[] emails = null;
		int numOfValidEmails = uea.numUniqueEmails(emails);
		Assert.assertEquals(0, numOfValidEmails);
	}
	
	@Test
	public void twoUniqueEmailsDomainTest() {
		String[] emails = {"John.Smith+Work@gmail.com", "JohnSmith@gmail.com", "JohnSmith@g.mail.com"};
		int numOfEvalidEmails = uea.numUniqueEmails(emails);
		Assert.assertEquals(2, numOfEvalidEmails);
	}
}
