/**
 * 
 */
package org.ibkdev.xqel;

import java.util.TreeMap;

/**
 * @author SeungyoonLee <samsee@ibksystem.co.kr>
 *
 */
public class XQELRunner {
	final String RUNCLASS = "run";
	private TreeMap<String, String> params;
	private final String run;

	public XQELRunner(String[] args) {
		params = new TreeMap<String, String>();
		
		for (String arg : args) {
			params.put(parseKey(arg), parseValue(arg));
		}
		
		run = params.get(RUNCLASS);
		params.remove(RUNCLASS);
	}
	
	private static String parseKey(String arg) {
		return arg.substring(0, arg.indexOf("="));
	}
	
	private static String parseValue(String arg) {
		return arg.substring(arg.indexOf("=") + 1, arg.length());
	}

	public String getRunClass() {
		return run;
	}

	public String getParam(String key) {
		return params.get(key);
	}
}
