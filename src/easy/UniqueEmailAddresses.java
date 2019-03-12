package easy;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/unique-email-addresses/
 * 
 * POST SUBMISSION NOTES:
 * 	Original solution was accepted at 95% efficiency compared to others
 * 	Correct things I did: Use a String Builder instead of String
 * 	Use HashSet to hold unique e-mails
 * 
 * Incorrect things I did:
 * 	No need to parse through the local name at all to pull '.' and '+',
 * 	although it was a good exercise for me and was originally part of 
 *  problem
 * 	
 * Other thoughts:
 * 	Less optimal solutions involved using String.replace()
 * 	Admittedly, this does look cleaner, but I don't think I would replace what I 
 * 	have done below because it is still readable and more efficient.  When 
 *  thinking about large sums of data processing, I would prefer my solution.
 */
public class UniqueEmailAddresses {
	
	public int numUniqueEmails(String[] emails) {
		HashSet<String> validEmails = new HashSet<String>();
		if(emails == null || (emails.length < 1 || emails.length > 100)) return 0;
		for(String email : emails) {
			if(email.length() < 1 || email.length() > 100) continue;
			String local = cleanLocalName(email.substring(0, email.indexOf('@')));
			String domain = email.substring(email.indexOf('@'));
			validEmails.add(local+domain);
		}
        return validEmails.size();
    }
	
	private String cleanLocalName(String local) {
		StringBuilder builder = new StringBuilder(local);
		if(builder.indexOf("+") != -1) {
			builder.delete(builder.indexOf("+"), builder.length());
		}
		boolean cleaned = false;
		while(!cleaned) {
			if(builder.indexOf(".") != -1) {
				builder.deleteCharAt(builder.indexOf("."));
			} else {
				cleaned = true;
			}
		}		
		return builder.toString();
	}
}
