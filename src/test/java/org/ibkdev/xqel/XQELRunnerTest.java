/**
 * 
 */
package org.ibkdev.xqel;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SeungyoonLee <samsee@ibksystem.co.kr>
 *
 */
public class XQELRunnerTest {

	@Test
	public void testParseParams() {
		String classToRun = "org.ibkdev.xqel.samples.SimpleWrite";
		String[] args = {"run=" + classToRun, "ymd=20160811", "department=hr"};
		XQELRunner runner = new XQELRunner(args);
		
		assertEquals("class to run", runner.getRunClass(), classToRun);
		assertEquals("param[ymd]", runner.getParam("ymd"), "20160811");
		assertEquals("param[department]", runner.getParam("department"), "hr");
	}

}