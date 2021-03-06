package edu.princeton.cs.shared;

import java.util.StringTokenizer;
import java.util.Vector;

import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> package because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is not translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {

	/**
	 * Verifies that the specified name is valid for our service.
	 * 
	 * In this example, we only require that the name is at least four
	 * characters. In your application, you can use more complex checks to ensure
	 * that usernames, passwords, email addresses, URLs, and other fields have the
	 * proper syntax.
	 * 
	 * @param name the name to validate
	 * @return true if valid, false if invalid
	 */
	public static String[] getEmailAddrs(String emailAddre) {		
		/*RegExp regExp = RegExp.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b", "g");
		MatchResult matcher = null;
		Vector<String> addrVec = new Vector<String>();
		while ((matcher = regExp.exec(emailAddre)) != null) {
		    for(int i=0; i<matcher.getGroupCount(); i++) {
		    	addrVec.add(matcher.getGroup(i));
		    	regExp.setLastIndex(regExp.getLastIndex());
		    }
		}
				return addrVec.toArray(new String[0]);*/
		String[] str = new String[1];
		str[0] = emailAddre;
		return str;
	}
}
