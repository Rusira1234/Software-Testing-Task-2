package com.sdetadda.allure;

import static j2html.TagCreator.attrs;
import static j2html.TagCreator.body;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.link;
import static j2html.TagCreator.p;
import static j2html.TagCreator.table;
import static j2html.TagCreator.td;
import static j2html.TagCreator.title;
import static j2html.TagCreator.tr;
import static j2html.TagCreator.a;
import j2html.tags.specialized.UlTag;
import org.testng.annotations.Test;
import org.testng.Assert;

import j2html.TagCreator;
import j2html.tags.specialized.OlTag;
import static j2html.TagCreator.*;
public class TestNGTestCases {
	
	@Test
	// Checks when anchor has an empty url and empty text string
	void functionAnchorCheck1() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("").withText("")));
		Assert.assertEquals("<html><a href=\"\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has an url but empty text string
	void functionAnchorCheck2() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("https://j2html.com/examples.html").withText("")));
		Assert.assertEquals("<html><a href=\"https://j2html.com/examples.html\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has an url and text
	void functionAnchorCheck3() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("https://j2html.com/examples.html").withText("J2HTML")));
		Assert.assertEquals("<html><a href=\"https://j2html.com/examples.html\">J2HTML</a></html>", test);
	}
	
	@Test
	// Checks when anchor has an empty string for an id
	void functionAnchorCheck4() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withId("")));
		Assert.assertEquals("<html><a id=\"\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has an id
	void functionAnchorCheck5() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withId("Anchor")));
		Assert.assertEquals("<html><a id=\"Anchor\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has an empty string for a class
	void functionAnchorCheck6() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withClass("")));
		Assert.assertEquals("<html><a class=\"\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has a class
	void functionAnchorCheck7() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withClass("Test")));
		Assert.assertEquals("<html><a class=\"Test\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has both an empty string for id and class
	void functionAnchorCheck8() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withId("").withClass("")));
		Assert.assertEquals("<html><a id=\"\" class=\"\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has an empty string for id but class has a string value
	void functionAnchorCheck9() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withId("").withClass("Test")));
		Assert.assertEquals("<html><a id=\"\" class=\"Test\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor has string value for id but an empty string for class
	void functionAnchorCheck10() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withId("Test").withClass("")));
		Assert.assertEquals("<html><a id=\"Test\" class=\"\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor an empty url but string value for both id and class
	void functionAnchorCheck11() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("").withId("Test1").withClass("Test2")));
		Assert.assertEquals("<html><a href=\"\" id=\"Test1\" class=\"Test2\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor string value for both href, id, and class
	void functionAnchorCheck12() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("#").withId("Test1").withClass("Test2")));
		Assert.assertEquals("<html><a href=\"#\" id=\"Test1\" class=\"Test2\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor an URL for href and string value for both id and class
	void functionAnchorCheck13() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("https://j2html.com/examples.html").withId("Test1").withClass("Test2")));
		Assert.assertEquals("<html><a href=\"https://j2html.com/examples.html\" id=\"Test1\" class=\"Test2\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor an URL for href and string value for both id and class but text is null
	void functionAnchorCheck14() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("https://j2html.com/examples.html").withId("Test1").withClass("Test2").withText(null)));
		Assert.assertEquals("<html><a href=\"https://j2html.com/examples.html\" id=\"Test1\" class=\"Test2\">null</a></html>", test);
	}
	
	@Test
	// Checks when anchor an URL for href and string value for both id and class but text is an empty string
	void functionAnchorCheck15() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("https://j2html.com/examples.html").withId("Test1").withClass("Test2").withText("")));
		Assert.assertEquals("<html><a href=\"https://j2html.com/examples.html\" id=\"Test1\" class=\"Test2\"></a></html>", test);
	}
	
	@Test
	// Checks when anchor an URL for href and string value for id, class, and text
	void functionAnchorCheck16() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				a().withHref("https://j2html.com/examples.html").withId("Test1").withClass("Test2").withText("Test3")));
		Assert.assertEquals("<html><a href=\"https://j2html.com/examples.html\" id=\"Test1\" class=\"Test2\">Test3</a></html>", test);
	}
	
	@Test
	void functionHeadCheck() {
		J2HTMLBase head = new J2HTMLBase();
		String test = head.htmlConvert(html(
				head(attrs("#head.header-content"),
						title("Test"),
						link().withRel("stylesheet").withHref("/css/main.css"))));
		
		Assert.assertEquals("<html><head id=\"head\" class=\"header-content\"><title>Test</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head></html>", test);
	}
	
	
	// Checks when head is just a small string
	@Test
	void functionHeadingCheck1() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				head("Heading 1")));
		Assert.assertEquals("<html><head>Heading 1</head></html>", test);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	// Checks when head is just a small string
	void functionHeadCheckFail() {
		J2HTMLBase head = new J2HTMLBase();
		String test = head.htmlConvert(html(
				head("Heading 1")));
		Assert.assertEquals("<html><head></head></html>", test);
	}
	
	@Test
	// Checks if head is just an empty string
	void functionHeadingCheck2() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				head("")));
		Assert.assertEquals("<html><head></head></html>", test);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	// Checks if head is just an empty string
	void functionHeadingCheckFail2() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				head("")));
		Assert.assertEquals("<html><head>Invalid</head></html>", test);
	}
	
	@Test
	// Checks when head is just a long string
	void functionHeadingCheck3() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				head("Heading 1, Heading 2, Heading 3, Heading 4")));
		Assert.assertEquals("<html><head>Heading 1, Heading 2, Heading 3, Heading 4</head></html>", test);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	// Checks when head is just a long string
	void functionHeadingCheckFail3() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				head("Heading 1, Heading 2, Heading 3, Heading 4")));
		Assert.assertEquals("<html><head>Heading 1, Heading 2, Heading 3, Invalid</head></html>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionHeadingCheck4() {
		J2HTMLBase heading = new J2HTMLBase();
		String temp = "Hi";
		String test = heading.htmlConvert(html(
				head(temp)));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionH1Check4() {
		String temp = "Hi";
		String test = TagCreator.h1(temp).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionH2Check4() {
		String temp = "Hi";
		String test = TagCreator.h2(temp).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionH3Check4() {
		String temp = "Hi";
		String test = TagCreator.h3(temp).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionH4Check4() {
		String temp = "Hi";
		String test = TagCreator.h4(temp).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionH5Check4() {
		String temp = "Hi";
		String test = TagCreator.h5(temp).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in a string variable
	void functionH6Check4() {
		String temp = "Hi";
		String test = TagCreator.h6(temp).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionHeadingCheck5() {
		J2HTMLBase heading = new J2HTMLBase();
		int number = 100;
		String temp = String.valueOf(number);
		String test = heading.htmlConvert(html(
				head(temp)));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionH1Check5() {
		int number = 100;
		String temp = String.valueOf(number);
		String test = TagCreator.h1(temp).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionH2Check5() {
		int number = 100;
		String temp = String.valueOf(number);
		String test = TagCreator.h2(temp).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionH3Check5() {
		int number = 100;
		String temp = String.valueOf(number);
		String test = TagCreator.h3(temp).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionH4Check5() {
		int number = 100;
		String temp = String.valueOf(number);
		String test = TagCreator.h4(temp).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionH5Check5() {
		int number = 100;
		String temp = String.valueOf(number);
		String test = TagCreator.h5(temp).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in an int variable that is turned into a string
	void functionH6Check5() {
		int number = 100;
		String temp = String.valueOf(number);
		String test = TagCreator.h6(temp).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionHeadingCheck6() {
		J2HTMLBase heading = new J2HTMLBase();
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = heading.htmlConvert(html(
				head(temp)));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionH1Check6() {
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = TagCreator.h1(temp).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}

	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionH2Check6() {
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = TagCreator.h2(temp).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionH3Check6() {
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = TagCreator.h3(temp).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionH4Check6() {
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = TagCreator.h4(temp).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionH5Check6() {
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = TagCreator.h5(temp).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in an double variable that is turned into a string
	void functionH6Check6() {
		double number = 100.05;
		String temp = String.valueOf(number);
		String test = TagCreator.h6(temp).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionHeadingCheck7() {
		J2HTMLBase heading = new J2HTMLBase();
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = heading.htmlConvert(html(
				head(temp)));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionH1Check7() {
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = TagCreator.h1(temp).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionH2Check7() {
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = TagCreator.h2(temp).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionH3Check7() {
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = TagCreator.h3(temp).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionH4Check7() {
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = TagCreator.h4(temp).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionH5Check7() {
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = TagCreator.h5(temp).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in an long variable that is turned into a string
	void functionH6Check7() {
		long number = 10000000;
		String temp = String.valueOf(number);
		String test = TagCreator.h6(temp).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionHeadingCheck8() {
		J2HTMLBase heading = new J2HTMLBase();
		char temp = 'H';
		String test = heading.htmlConvert(html(
				head(String.valueOf(temp))));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionH1Check8() {
		char temp = 'H';
		String test = TagCreator.h1(String.valueOf(temp)).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionH2Check8() {
		char temp = 'H';
		String test = TagCreator.h2(String.valueOf(temp)).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionH3Check8() {
		char temp = 'H';
		String test = TagCreator.h3(String.valueOf(temp)).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionH4Check8() {
		char temp = 'H';
		String test = TagCreator.h4(String.valueOf(temp)).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionH5Check8() {
		char temp = 'H';
		String test = TagCreator.h5(String.valueOf(temp)).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in a character variable that is turned into a string
	void functionH6Check8() {
		char temp = 'H';
		String test = TagCreator.h6(String.valueOf(temp)).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionHeadingCheck9() {
		J2HTMLBase heading = new J2HTMLBase();
		boolean temp = true;
		String test = heading.htmlConvert(html(
				head(String.valueOf(temp))));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionH1Check9() {
		boolean temp = true;
		String test = TagCreator.h1(String.valueOf(temp)).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionH2Check9() {
		boolean temp = true;
		String test = TagCreator.h2(String.valueOf(temp)).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionH3Check9() {
		boolean temp = true;
		String test = TagCreator.h3(String.valueOf(temp)).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionH4Check9() {
		boolean temp = true;
		String test = TagCreator.h4(String.valueOf(temp)).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionH5Check9() {
		boolean temp = true;
		String test = TagCreator.h5(String.valueOf(temp)).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in a boolean variable that is turned into a string
	void functionH6Check9() {
		boolean temp = true;
		String test = TagCreator.h6(String.valueOf(temp)).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionHeadingCheck10() {
		J2HTMLBase heading = new J2HTMLBase();
		float temp = 1231231234;
		String test = heading.htmlConvert(html(
				head(String.valueOf(temp))));
		Assert.assertEquals("<html><head>" + temp + "</head></html>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionH1Check10() {
		float temp = 1231231234;
		String test = TagCreator.h1(String.valueOf(temp)).render();
		Assert.assertEquals("<h1>" + temp + "</h1>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionH2Check10() {
		float temp = 1231231234;
		String test = TagCreator.h2(String.valueOf(temp)).render();
		Assert.assertEquals("<h2>" + temp + "</h2>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionH3Check10() {
		float temp = 1231231234;
		String test = TagCreator.h3(String.valueOf(temp)).render();
		Assert.assertEquals("<h3>" + temp + "</h3>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionH4Check10() {
		float temp = 1231231234;
		String test = TagCreator.h4(String.valueOf(temp)).render();
		Assert.assertEquals("<h4>" + temp + "</h4>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionH5Check10() {
		float temp = 1231231234;
		String test = TagCreator.h5(String.valueOf(temp)).render();
		Assert.assertEquals("<h5>" + temp + "</h5>", test);
	}
	
	@Test
	// Checks when head takes in a float variable that is turned into a string
	void functionH6Check10() {
		float temp = 1231231234;
		String test = TagCreator.h6(String.valueOf(temp)).render();
		Assert.assertEquals("<h6>" + temp + "</h6>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionHeadingCheck11() {
		J2HTMLBase heading = new J2HTMLBase();
		String id = "";
		String test = heading.htmlConvert(html(
				head().withId(id)));
		Assert.assertEquals("<html><head id=\"\"></head></html>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionH1Check11() {
		String id = "";
		String test = TagCreator.h1("").withId(id).render();
		Assert.assertEquals("<h1 id=\"\"></h1>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionH2Check11() {
		String id = "";
		String test = TagCreator.h2("").withId(id).render();
		Assert.assertEquals("<h2 id=\"\"></h2>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionH3Check11() {
		String id = "";
		String test = TagCreator.h3("").withId(id).render();
		Assert.assertEquals("<h3 id=\"\"></h3>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionH4Check11() {
		String id = "";
		String test = TagCreator.h4("").withId(id).render();
		Assert.assertEquals("<h4 id=\"\"></h4>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionH5Check11() {
		String id = "";
		String test = TagCreator.h5("").withId(id).render();
		Assert.assertEquals("<h5 id=\"\"></h5>", test);
	}
	
	@Test
	// Checks when head has an id but is has an empty string
	void functionH6Check11() {
		String id = "";
		String test = TagCreator.h6("").withId(id).render();
		Assert.assertEquals("<h6 id=\"\"></h6>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionHeadingCheck12() {
		J2HTMLBase heading = new J2HTMLBase();
		String id = null;
		String test = heading.htmlConvert(html(
				head().withId(id)));
		Assert.assertEquals("<html><head id></head></html>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionH1Check12() {
		String id = null;
		String test = TagCreator.h1("").withId(id).render();
		Assert.assertEquals("<h1 id></h1>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionH2Check12() {
		String id = null;
		String test = TagCreator.h2("").withId(id).render();
		Assert.assertEquals("<h2 id></h2>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionH3Check12() {
		String id = null;
		String test = TagCreator.h3("").withId(id).render();
		Assert.assertEquals("<h3 id></h3>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionH4Check12() {
		String id = null;
		String test = TagCreator.h4("").withId(id).render();
		Assert.assertEquals("<h4 id></h4>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionH5Check12() {
		String id = null;
		String test = TagCreator.h5("").withId(id).render();
		Assert.assertEquals("<h5 id></h5>", test);
	}
	
	@Test
	// Checks when head has an id but it is null
	void functionH6Check12() {
		String id = null;
		String test = TagCreator.h6("").withId(id).render();
		Assert.assertEquals("<h6 id></h6>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionHeadingCheck13() {
		J2HTMLBase heading = new J2HTMLBase();
		String id = "Test";
		String test = heading.htmlConvert(html(
				head().withId(id)));
		Assert.assertEquals("<html><head id=\"Test\"></head></html>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionH1Check13() {
		String id = "Test";
		String test = TagCreator.h1("").withId(id).render();
		Assert.assertEquals("<h1 id=\"Test\"></h1>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionH2Check13() {
		String id = "Test";
		String test = TagCreator.h2("").withId(id).render();
		Assert.assertEquals("<h2 id=\"Test\"></h2>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionH3Check13() {
		String id = "Test";
		String test = TagCreator.h3("").withId(id).render();
		Assert.assertEquals("<h3 id=\"Test\"></h3>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionH4Check13() {
		String id = "Test";
		String test = TagCreator.h4("").withId(id).render();
		Assert.assertEquals("<h4 id=\"Test\"></h4>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionH5Check13() {
		String id = "Test";
		String test = TagCreator.h5("").withId(id).render();
		Assert.assertEquals("<h5 id=\"Test\"></h5>", test);
	}
	
	@Test
	// Checks when head has a string value for an id
	void functionH6Check13() {
		String id = "Test";
		String test = TagCreator.h6("").withId(id).render();
		Assert.assertEquals("<h6 id=\"Test\"></h6>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionHeadingCheck14() {
		J2HTMLBase heading = new J2HTMLBase();
		String id = null;
		String className = "";
		String test = heading.htmlConvert(html(
				head().withId(id).withClass(className)));
		Assert.assertEquals("<html><head id class=\"\"></head></html>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionH1Check14() {
		String id = null;
		String className = "";
		String test = TagCreator.h1("").withId(id).withClass(className).render();
		Assert.assertEquals("<h1 id class=\"\"></h1>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionH2Check14() {
		String id = null;
		String className = "";
		String test = TagCreator.h2("").withId(id).withClass(className).render();
		Assert.assertEquals("<h2 id class=\"\"></h2>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionH3Check14() {
		String id = null;
		String className = "";
		String test = TagCreator.h3("").withId(id).withClass(className).render();
		Assert.assertEquals("<h3 id class=\"\"></h3>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionH4Check14() {
		String id = null;
		String className = "";
		String test = TagCreator.h4("").withId(id).withClass(className).render();
		Assert.assertEquals("<h4 id class=\"\"></h4>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionH5Check14() {
		String id = null;
		String className = "";
		String test = TagCreator.h5("").withId(id).withClass(className).render();
		Assert.assertEquals("<h5 id class=\"\"></h5>", test);
	}
	
	@Test
	// Checks when head has a null for an id and an empty string for class
	void functionH6Check14() {
		String id = null;
		String className = "";
		String test = TagCreator.h6("").withId(id).withClass(className).render();
		Assert.assertEquals("<h6 id class=\"\"></h6>", test);
	}
	
	@Test
	// Checks when head has a null for both an id and class
	void functionHeadingCheck15() {
		J2HTMLBase heading = new J2HTMLBase();
		String id = null;
		String className = null;
		String test = heading.htmlConvert(html(
				head().withId(id).withClass(className)));
		Assert.assertEquals("<html><head id class></head></html>", test);
	}
	
	@Test
	// Checks when head has a string value for both id and class
	void functionHeadingCheck16() {
		J2HTMLBase heading = new J2HTMLBase();
		String id = "Test1";
		String className = "Test2";
		String test = heading.htmlConvert(html(
				head().withId(id).withClass(className)));
		Assert.assertEquals("<html><head id=\"Test1\" class=\"Test2\"></head></html>", test);
	}
	
	@Test
	void functionHeadingCheck17() {
		String expected = "<h1>This is a valid h1 heading</h1>";
		String actual = TagCreator.h1("This is a valid h1 heading").render();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	void functionHeadingCheck18() {
		String expected = "<h2>This is a valid h1 heading</h2>";
		String actual = TagCreator.h2("This is a valid h2 heading").render();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	void functionHeadingCheck19() {
		String expected = "<h3>This is a valid h1 heading</h3>";
		String actual = TagCreator.h3("This is a valid h3 heading").render();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	void functionHeadingCheck20() {
		String expected = "<h4>This is a valid h1 heading</h4>";
		String actual = TagCreator.h4("This is a valid h4 heading").render();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	void functionHeadingCheck21() {
		String expected = "<h5>This is a valid h1 heading</h5>";
		String actual = TagCreator.h5("This is a valid h5 heading").render();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	void functionHeadingCheck22() {
		String expected = "<h6>This is a valid h1 heading</h6>";
		String actual = TagCreator.h6("This is a valid h6 heading").render();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	// Checks if link is just an empty string
	void functionLinkCheck1() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
					link().withRel("").withHref("")));
		Assert.assertEquals("<html><link rel=\"\" href=\"\"></html>", test);
	}
	
	@Test
	// Checks when link is withRel but no withHref
	void functionLinkCheck2() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				link().withRel("stylesheet").withHref("")));
		Assert.assertEquals("<html><link rel=\"stylesheet\" href=\"\"></html>", test);
	}
	
	@Test
	// Checks when link is with both withRel and withHref
	void functionLinkCheck3() {
		J2HTMLBase heading = new J2HTMLBase();
		String test = heading.htmlConvert(html(
				link().withRel("stylesheet").withHref("/css/main.css")));
		Assert.assertEquals("<html><link rel=\"stylesheet\" href=\"/css/main.css\"></html>", test);
	}
	
	
	
	//------------------------------------------Functions----------------------------------------------
	public static String createLink(String text, String url) {
		return a(text).withHref(url).render();
	}
    
    //------------------------------------------Test Cases----------------------------------------------
	
    @Test
    public void testCreateBasicLink() {
        String expectedLink = "<a href=\"https://example.com\">Click Here</a>";
        String actualLink = createLink("Click Here", "https://example.com");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test(expectedExceptions = AssertionError.class)
    public void testCreateBasicLink1() {
    	String expectedLink = "<a href=\"https://example.com\">Click Here</a>";
    	String actualLink = createLink("","https://example.com");
    	Assert.assertEquals(actualLink, expectedLink);
    }
	
    @Test(expectedExceptions = AssertionError.class)
    public void testCreateBasicLink2() {
    	String expectedLink = "<a href=\"\">Click Here</a>";
    	String actualLink = createLink("","https://example.com");
    	Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test
    public void testCreateBasicLink3() {
    	String expectedLink = "<a href=\"https://example.com\"></a>";
    	String actualLink = createLink("","https://example.com");
    	Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test(expectedExceptions = AssertionError.class)
    public void testCreateBasicLink4() {
    	String expectedLink = "<a href=\"https://example.com\"></a>";
    	String actualLink = createLink("Click Here","https://example.com");
    	Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test(expectedExceptions = AssertionError.class)
    public void testCreateBasicLink5() {
    	String expectedLink = "<a href=\"https://example.com\">Click Here</a>";
    	String actualLink = createLink("Click Here","");
    	Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test
    public void testCreateBasicLink6() {
    	String expectedLink = "<a href=\"\">Click Here</a>";
    	String actualLink = createLink("Click Here","");
    	Assert.assertEquals(actualLink, expectedLink);
    }
    
    
	//------------------------------------------Functions----------------------------------------------
	
	public static String createLinkWithTarget(String text, String url, String target) {
        return a(text).withHref(url).withTarget(target).render();
    }
	
    //------------------------------------------Test Cases----------------------------------------------
    
    @Test
    public void testCreateLinkWithTarget_blank() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_blank\">Open in New Tab</a>";
        String actualLink = createLinkWithTarget("Open in New Tab", "https://example.com", "_blank");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_self() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_self\">Open in Same Tab</a>";
        String actualLink = createLinkWithTarget("Open in Same Tab", "https://example.com", "_self");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_parent() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_parent\">Open in Parent Frame</a>";
        String actualLink = createLinkWithTarget("Open in Parent Frame", "https://example.com", "_parent");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_top() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_top\">Open in Top Frame</a>";
        String actualLink = createLinkWithTarget("Open in Top Frame", "https://example.com", "_top");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_custom() {
        String expectedLink = "<a href=\"https://example.com\" target=\"custom\">Open in Custom Target</a>";
        String actualLink = createLinkWithTarget("Open in Custom Target", "https://example.com", "custom");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test
    public void testCreateLinkWithTarget_none_Same_Window() {
        String expectedLink = "<a href=\"https://example.com\" target=\"\">Open in Same Window</a>";
        String actualLink = createLinkWithTarget("Open in Same Window", "https://example.com", "");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_invalid() {
        String expectedLink = "<a href=\"https://example.com\" target=\"invalid\">Invalid Target Value</a>";
        String actualLink = createLinkWithTarget("Invalid Target Value", "https://example.com", "invalid");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test
    public void testCreateLinkWithTarget_frame() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_blank\">Open in New Tab</a>";
        String actualLink = createLinkWithTarget("Open in New Tab", "https://example.com", "_blank");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_default() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_default\">No Target Specified</a>";
        String actualLink = createLinkWithTarget("No Target Specified", "https://example.com", "_default");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_topframe() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_top\">Open in Top Frame</a>";
        String actualLink = createLinkWithTarget("Open in Top Frame", "https://example.com", "_top");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_bottomframe() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_bottom\">Open in Bottom Frame</a>";
        String actualLink = createLinkWithTarget("Open in Bottom Frame", "https://example.com", "_bottom");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_parentframe() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_parent\">Open in Parent Frame</a>";
        String actualLink = createLinkWithTarget("Open in Parent Frame", "https://example.com", "_parent");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_childframe() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_child\">Open in Child Frame</a>";
        String actualLink = createLinkWithTarget("Open in Child Frame", "https://example.com", "_child");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_iframe() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_iframe\">Open in Iframe</a>";
        String actualLink = createLinkWithTarget("Open in Iframe", "https://example.com", "_iframe");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_new() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_new\">Open in New Window</a>";
        String actualLink = createLinkWithTarget("Open in New Window", "https://example.com", "_new");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_other() {
        String expectedLink = "<a href=\"https://example.com\" target=\"_other\">Open in Other Window</a>";
        String actualLink = createLinkWithTarget("Open in Other Window", "https://example.com", "_other");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithTarget_none() {
        String expectedLink = "<a href=\"https://example.com\" target=\"\">No Target Specified</a>";
        String actualLink = createLinkWithTarget("No Target Specified", "https://example.com", "");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithTarget_fail_blank() {
        // This test case is expected to fail because the expectedLink is incorrect
        String expectedLink = "<a href=\"https://example.com\" target=\"_self\">Open in New Tab</a>";
        String actualLink = createLinkWithTarget("Open in New Tab", "https://example.com", "_blank");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithTarget_fail_invalidTarget() {
        // This test case is expected to fail because the expectedLink is incorrect
        String expectedLink = "<a href=\"https://example.com\" target=\"_invalid\">Invalid Target Value</a>";
        String actualLink = createLinkWithTarget("Invalid Target Value", "https://example.com", "invalid");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithTarget_fail_missingTarget() {
        // This test case is expected to fail because the expectedLink is incorrect
        String expectedLink = "<a href=\"https://example.com\">Open in New Tab</a>";
        String actualLink = createLinkWithTarget("Open in New Tab", "https://example.com", "");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
	//------------------------------------------Functions----------------------------------------------

    public static String createLinkWithClass(String text, String url, String cssClass) {
        return a(text).withHref(url).withClass(cssClass).render();
    }
    
    //------------------------------------------Test Cases----------------------------------------------
    
    @Test
    public void testCreateLinkWithClass_emptyText() {
        String expectedLink = "<a href=\"https://example.com\" class=\"link\"></a>";
        String actualLink = createLinkWithClass("", "https://example.com", "link");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_emptyURL() {
        String expectedLink = "<a href=\"\" class=\"link\">Link Text</a>";
        String actualLink = createLinkWithClass("Link Text", "", "link");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_emptyClass() {
        String expectedLink = "<a href=\"https://example.com\" class=\"\">Link Text</a>";
        String actualLink = createLinkWithClass("Link Text", "https://example.com", "");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_nullText() {
        String expectedLink = "<a href=\"https://example.com\" class=\"link\">null</a>";
        String actualLink = createLinkWithClass(null, "https://example.com", "link");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_nullURL() {
        String expectedLink = "<a href class=\"link\">Link Text</a>";
        String actualLink = createLinkWithClass("Link Text", null, "link");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_nullClass() {
        String expectedLink = "<a href=\"https://example.com\" class>Link Text</a>";
        String actualLink = createLinkWithClass("Link Text", "https://example.com", null);
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_longText() {
        String text = "This is a long text that exceeds the typical character limit for a link";
        String expectedLink = "<a href=\"https://example.com\" class=\"link\">" + text + "</a>";
        String actualLink = createLinkWithClass(text, "https://example.com", "link");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test
    public void testCreateLinkWithClass_longURL() {
        String url = "https://example.com/this/is/a/very/long/url/that/exceeds/the/limit/for/a/link";
        String expectedLink = "<a href=\"" + url + "\" class=\"link\">Link Text</a>";
        String actualLink = createLinkWithClass("Link Text", url, "link");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithClass_fail_emptyText() {
        String expectedLink = "<a href=\"https://example.com\" class=\"link-style\">Click Here</a>";
        String actualLink = createLinkWithClass("", "https://example.com", "link-style");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithClass_fail_emptyUrl() {
        String expectedLink = "<a href=\"\" class=\"link-style\">Click Here</a>";
        String actualLink = createLinkWithClass("Click Here", "https://example.com", "link-style");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithClass_fail_emptyClass() {
        String expectedLink = "<a href=\"https://example.com\" class=\"\">Click Here</a>";
        String actualLink = createLinkWithClass("Click Here", "https://example.com", "link-style");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithClass_fail_invalidClass() {
        String expectedLink = "<a href=\"https://example.com\" class=\"invalid-class\">Click Here</a>";
        String actualLink = createLinkWithClass("Click Here", "https://example.com", "link-style");
        Assert.assertEquals(actualLink, expectedLink);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void testCreateLinkWithClass_fail_missingHref() {
        String expectedLink = "<a class=\"link-style\">Click Here</a>";
        String actualLink = createLinkWithClass("Click Here", null, "link-style");
        Assert.assertEquals(actualLink, expectedLink);
    }
    
  //------------------------------------------Functions----------------------------------------------
	
  	public String createBasicOrderedList() {
  	    return ol(
  	            li("Item 1"),
  	            li("Item 2"),
  	            li("Item 3")
  	    ).render();
  	}
  	
  	public String createBasicOrderedList(String[] strings) {
  		
  		OlTag ol = ol(); // Create an ordered list element
  		if (strings == null || strings.length == 0) {
  	        return ol.render(); // Return an empty string if items are null or empty
  	    }
  	    
  	    
  		for(String item : strings) {
  			ol.with(li(item));  // Add each item in the array as a list item
  	    }

  	    return ol.render(); // Render the ordered list as HTML
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------

  	@Test
      public void testCreateBasicOrderedList() {
          String expectedList = "<ol><li>Item 1</li><li>Item 2</li><li>Item 3</li></ol>";
          String actualList = createBasicOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicOrderedList_emptyItems() {
          String expectedList = "<ol></ol>";
          String actualList =  createBasicOrderedList(new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicOrderedList_nullItems() {
          String expectedList = "<ol></ol>";
          String actualList = createBasicOrderedList(null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicOrderedList_singleItem() {
          String expectedList = "<ol><li>Single Item</li></ol>";
          String actualList = createBasicOrderedList(new String[]{"Single Item"});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicOrderedList_longItems() {
          String[] items = {"This is a long item text", "Another long item text", "Third long item text"};
          String expectedList = "<ol><li>This is a long item text</li><li>Another long item text</li><li>Third long item text</li></ol>";
          String actualList = createBasicOrderedList(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicOrderedList_specialCharacters() {
          String[] items = {"&", "<", ">", "'", "\""};
          String expectedList = "<ol><li>&amp;</li><li>&lt;</li><li>&gt;</li><li>&#x27;</li><li>&quot;</li></ol>";
          String actualList = createBasicOrderedList(items);
          Assert.assertEquals(actualList, expectedList);
      }	
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicOrderedList_fail_emptyList() {
          // This test case is expected to fail because the expectedList is incorrect
          String expectedList = "<ol></ol>";
          String actualList = createBasicOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicOrderedList_fail_customItems() {
          // This test case is expected to fail because the expectedList is incorrect
          String expectedList = "<ol><li>Apple</li><li>Orange</li><li>Banana</li></ol>";
          String actualList = createBasicOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicOrderedList_fail_nullItems() {
          // This test case is expected to fail because the expectedList is incorrect
          String expectedList = "<ol></ol>";
          String actualList = createBasicOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicOrderedList_fail_specialCharacters() {
          // This test case is expected to fail because the expectedList is incorrect
          String expectedList = "<ol><li>&amp;</li><li>&lt;</li><li>&gt;</li></ol>";
          String actualList = createBasicOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicOrderedList_fail_emptyItem() {
          // This test case is expected to fail because the expectedList is incorrect
          String expectedList = "<ol><li></li><li>Item 2</li></ol>";
          String actualList = createBasicOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

  	//------------------------------------------Functions----------------------------------------------
  	
      public String createOrderedListWithCustomStyle() {
  	    return ol(
  	            li("Item 1").withStyle("color: red;"),
  	            li("Item 2").withStyle("color: blue;"),
  	            li("Item 3").withStyle("color: green;")
  	    ).render();
  	}
      
  	public String createOrderedListWithCustomStyle(String[] strings) {
  		OlTag ol = ol(); // Create an ordered list element
  		if (strings == null || strings.length == 0) {
  	        return ol.render(); // Return an empty string if items are null or empty
  	    }
  	    
  	    
  		for (int i = 0; i < strings.length; i++) {
  	        String colorStyle;
  	        if (i % 3 == 0) {
  	            colorStyle = "color: red;";
  	        } else if (i % 3 == 1) {
  	            colorStyle = "color: blue;";
  	        } else {
  	            colorStyle = "color: green;";
  	        }
  	        ol.with(li(strings[i]).withStyle(colorStyle)); // Add each item with custom style
  	    }

  	    return ol.render(); // Render the ordered list as HTML
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------
  	
  	@Test
      public void testCreateOrderedListWithCustomStyle() {
          String expectedList = "<ol><li style=\"color: red;\">Item 1</li><li style=\"color: blue;\">Item 2</li><li style=\"color: green;\">Item 3</li></ol>";
          String actualList = createOrderedListWithCustomStyle();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomStyle_emptyItems() {
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithCustomStyle(new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomStyle_nullItems() {
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithCustomStyle(null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomStyle_singleItem() {
          String expectedList = "<ol><li style=\"color: red;\">Single Item</li></ol>";
          String actualList = createOrderedListWithCustomStyle(new String[]{"Single Item"});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomStyle_longItems() {
          String[] items = {"This is a long item text", "Another long item text", "Third long item text"};
          String expectedList = "<ol><li style=\"color: red;\">This is a long item text</li><li style=\"color: blue;\">Another long item text</li><li style=\"color: green;\">Third long item text</li></ol>";
          String actualList = createOrderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }

      // ERROR
      @Test
      public void testCreateOrderedListWithCustomStyle_specialCharacters() {
          String[] items = {"&", "<", ">", "'", "\""};
          String expectedList = "<ol><li style=\"color: red;\">&amp;</li><li style=\"color: blue;\">&lt;</li><li style=\"color: green;\">&gt;</li><li style=\"color: red;\">&#x27;</li><li style=\"color: blue;\">&quot;</li></ol>";
          String actualList = createOrderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomStyle_fail_emptyArray() {
          String[] items = {};
          String expectedList = "";
          String actualList = createOrderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomStyle_fail_nullArray() {
          String[] items = null;
          String expectedList = "";
          String actualList = createOrderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomStyle_fail_invalidItems() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = ""; // Invalid because custom styling is based on item index
          String actualList = createOrderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }
  	
  	//------------------------------------------Functions----------------------------------------------
  	
  	public String createOrderedListWithCustomNumbering() {
  	    return ol(
  	            li("One").attr("value", "1"),
  	            li("Two").attr("value", "2"),
  	            li("Three").attr("value", "3")
  	    ).render();
  	}
  	
  	public String createOrderedListWithCustomNumbering(String[] items, String[] values) {
  		OlTag ol = ol(); // Create an ordered list element
  		if (items == null || items.length == 0 || values == null || values.length == 0 || items.length != values.length) {
  	        return ol.render(); // Return an empty string if items are null or empty
  	    }
  		
  		for (int i = 0; i < items.length; i++) {
  	        ol.with(li(items[i]).attr("value", values[i])); // Add each item with custom value
  	    }

  	    return ol.render(); // Render the ordered list as HTML
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------
  	
  	@Test
      public void testCreateOrderedListWithCustomNumbering() {
          String expectedList = "<ol><li value=\"1\">One</li><li value=\"2\">Two</li><li value=\"3\">Three</li></ol>";
          String actualList = createOrderedListWithCustomNumbering();
          Assert.assertEquals(actualList, expectedList);
      }

  	@Test
      public void testCreateOrderedListWithCustomNumbering2() {
          String[] items = {"One", "Two", "Three"};
          String[] values = {"1", "2", "3"};
          String expectedList = "<ol><li value=\"1\">One</li><li value=\"2\">Two</li><li value=\"3\">Three</li></ol>";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomNumbering_emptyArrays() {
          String[] items = {};
          String[] values = {};
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomNumbering_nullArrays() {
          String[] items = null;
          String[] values = null;
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomNumbering_differentLengths() {
          String[] items = {"One", "Two", "Three"};
          String[] values = {"1", "2"};
          String expectedList = "<ol></ol>"; // Since arrays have different lengths, expect an empty string
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomNumbering_singleItem() {
          String[] items = {"Single Item"};
          String[] values = {"1"};
          String expectedList = "<ol><li value=\"1\">Single Item</li></ol>";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomNumbering_fail_emptyArrays() {
          String[] items = {};
          String[] values = {};
          String expectedList = "";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomNumbering_fail_nullArrays() {
          String[] items = null;
          String[] values = null;
          String expectedList = "";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomNumbering_fail_differentLengths() {
          String[] items = {"One", "Two", "Three"};
          String[] values = {"1", "2"};
          String expectedList = ""; // Since arrays have different lengths, expect an empty string
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomNumbering_fail_invalidValue() {
          String[] items = {"One", "Two", "Three"};
          String[] values = {"1", "invalid", "3"};
          String expectedList = "<ol><li value=\"1\">One</li><li value=\"2\">Two</li><li value=\"3\">Three</li></ol>";
          String actualList = createOrderedListWithCustomNumbering(items, values);
          Assert.assertEquals(actualList, expectedList);
      }
      
  	//------------------------------------------Functions----------------------------------------------
  	
  	public String createOrderedListWithLinks() {
  	    return ol(
  	            li(a("Google").withHref("https://www.google.com")),
  	            li(a("Yahoo").withHref("https://www.yahoo.com")),
  	            li(a("Bing").withHref("https://www.bing.com"))
  	    ).render();
  	}
  	
  	public String createOrderedListWithLinks(String[] items, String[] links) {
  		OlTag ol = ol(); // Create an ordered list element
  		if (items == null || items.length == 0 || links == null || links.length == 0 || items.length != links.length) {
  	        return ol.render(); // Return an empty string if items are null or empty
  	    }
  		
  		for (int i = 0; i < items.length; i++) {
  	        ol.with(li(a(items[i]).withHref(links[i]))); // Add each item with custom value
  	    }

  	    return ol.render(); // Render the ordered list as HTML
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------

  	@Test
      public void testCreateOrderedListWithLinks() {
          String expectedList = "<ol><li><a href=\"https://www.google.com\">Google</a></li><li><a href=\"https://www.yahoo.com\">Yahoo</a></li><li><a href=\"https://www.bing.com\">Bing</a></li></ol>";
          String actualList = createOrderedListWithLinks();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithLinks_emptyItems() {
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithLinks(new String[]{}, new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithLinks_nullItems() {
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithLinks(null, null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithLinks_differentLengths() {
          String[] items = {"Google", "Yahoo", "Bing"};
          String[] links = {"https://www.google.com", "https://www.yahoo.com"};
          String expectedList = "<ol></ol>"; // Since arrays have different lengths, expect an empty string
          String actualList = createOrderedListWithLinks(items, links);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithLinks_singleItem() {
          String[] items = {"Google"};
          String[] links = {"https://www.google.com"};
          String expectedList = "<ol><li><a href=\"https://www.google.com\">Google</a></li></ol>";
          String actualList = createOrderedListWithLinks(items, links);
          Assert.assertEquals(actualList, expectedList);
      }
  	
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithLinks_fail_emptyItems() {
          String[] items = {};
          String[] links = {};
          String expectedList = "";
          String actualList = createOrderedListWithLinks(items, links);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithLinks_fail_nullItems() {
          String[] items = null;
          String[] links = null;
          String expectedList = "";
          String actualList = createOrderedListWithLinks(items, links);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithLinks_fail_differentLengths() {
          String[] items = {"Google", "Yahoo", "Bing"};
          String[] links = {"https://www.google.com", "https://www.yahoo.com"};
          String expectedList = ""; // Since arrays have different lengths, expect an empty string
          String actualList = createOrderedListWithLinks(items, links);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithLinks_fail_invalidValue() {
          String[] items = {"Google", "Yahoo", "Bing"};
          String[] links = {"https://www.google.com", "invalid", "https://www.bing.com"};
          String expectedList = "<ol><li><a href=\"https://www.google.com\">Google</a></li><li><a href=\"https://www.yahoo.com\">Yahoo</a></li><li><a href=\"https://www.bing.com\">Bing</a></li></ol>";
          String actualList = createOrderedListWithLinks(items, links);
          Assert.assertEquals(actualList, expectedList);
      }
      
  	//------------------------------------------Functions----------------------------------------------
  	
  	public String createOrderedListWithCustomItems() {
  	    return ol(
  	            li(rawHtml("<b>Item 1</b>")),
  	            li(rawHtml("<i>Item 2</i>")),
  	            li(rawHtml("<u>Item 3</u>"))
  	    ).render();
  	}
  	
  	public String createOrderedListWithCustomItems(String[] items) {
  		OlTag ol = ol();
  		if(items == null || items.length == 0) {
  			return ol.render();
  		}
  		
  		for(String item : items) {
  			ol.with(li(rawHtml(item)));
  		}
  		
  		
  		return ol.render();
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------
  	@Test
      public void testCreateOrderedListWithCustomItems() {
          String expectedList = "<ol><li><b>Item 1</b></li><li><i>Item 2</i></li><li><u>Item 3</u></li></ol>";
          String actualList = createOrderedListWithCustomItems();
          Assert.assertEquals(actualList, expectedList);
      }
  	
  	@Test
      public void testCreateOrderedListWithCustomItems1() {
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ol><li><b>Item 1</b></li><li><i>Item 2</i></li><li><u>Item 3</u></li></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomItems_emptyArray() {
          String[] items = {};
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomItems_nullArray() {
          String[] items = null;
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomItems_singleItem() {
          String[] items = {"<b>Single Item</b>"};
          String expectedList = "<ol><li><b>Single Item</b></li></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithCustomItems_longItems() {
          String[] items = {
              "<b>This is a long item text</b>",
              "<i>Another long item text</i>",
              "<u>Third long item text</u>"
          };
          String expectedList = "<ol><li><b>This is a long item text</b></li><li><i>Another long item text</i></li><li><u>Third long item text</u></li></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomItems_fail_emptyArray() {
          String[] items = {};
          String expectedList = "";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomItems_fail_nullArray() {
          String[] items = null;
          String expectedList = "";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomItems_fail_invalidHtml() {
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ol><li><b>Item X</b></li><li><i>Item 2</i></li><li><u>Item 3</u></li></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithCustomItems_fail_unexpectedItem() {
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ol><li><b>Item 1</b></li><li><i>Item X</i></li><li><u>Item 3</u></li></ol>";
          String actualList = createOrderedListWithCustomItems(items);
          Assert.assertEquals(actualList, expectedList);
      }
      
  	//------------------------------------------Functions----------------------------------------------
  	
  	public String createOrderedListWithIdAndClass() {
  	    return ol(
  	            li("Item 1"),
  	            li("Item 2"),
  	            li("Item 3")
  	    ).withId("myList").withClass("list-style").render();
  	}
  	
  	public String createOrderedListWithIdAndClass(String[] items) {
  		OlTag ol = ol();
  		if(items == null || items.length == 0) {
  			return ol.render();
  		}
  		
  		for(String item: items) {
  			ol.with(li(item));
  		}
  		
  		return ol.withId("myList").withClass("list-style").render();
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------
  	@Test
      public void testCreateOrderedListWithIdAndClass() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ol id=\"myList\" class=\"list-style\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }
  	
  	@Test
      public void testCreateOrderedListWithIdAndClass1() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ol id=\"myList\" class=\"list-style\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithIdAndClass_emptyArray() {
          String[] items = {};
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithIdAndClass_nullArray() {
          String[] items = null;
          String expectedList = "<ol></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithIdAndClass_singleItem() {
          String[] items = {"Single Item"};
          String expectedList = "<ol id=\"myList\" class=\"list-style\"><li>Single Item</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateOrderedListWithIdAndClass_longItems() {
          String[] items = {
              "This is a long item text",
              "Another long item text",
              "Third long item text"
          };
          String expectedList = "<ol id=\"myList\" class=\"list-style\"><li>This is a long item text</li><li>Another long item text</li><li>Third long item text</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithIdAndClass_fail_emptyArray() {
          String[] items = {};
          String expectedList = "<ol id=\"myList\" class=\"list-style\"></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithIdAndClass_fail_nullArray() {
          String[] items = null;
          String expectedList = "<ol id=\"myList\" class=\"list-style\"></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithIdAndClass_fail_invalidId() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ol id=\"invalidId\" class=\"list-style\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithIdAndClass_fail_invalidClass() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ol id=\"myList\" class=\"invalid-class\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateOrderedListWithIdAndClass_fail_unexpectedItem() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ol id=\"myList\" class=\"list-style\"><li>Item 1</li><li>Item X</li><li>Item 3</li></ol>";
          String actualList = createOrderedListWithIdAndClass(items);
          Assert.assertEquals(actualList, expectedList);
      }
  	//------------------------------------------Functions----------------------------------------------

  	public String createEmptyOrderedList() {
  	    return ol().render();
  	}
  	
      //------------------------------------------Test Cases----------------------------------------------
  	
  	@Test
      public void testCreateEmptyOrderedList() {
          String expectedList = "<ol></ol>";
          String actualList = createEmptyOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateEmptyOrderedList_fail_notEmpty() {
          String expectedList = "<ol><li>Item 1</li></ol>"; // Should fail because the list is not empty
          String actualList = createEmptyOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateEmptyOrderedList_fail_notOrdered() {
          String expectedList = "<ul></ul>"; // Should fail because the list is unordered
          String actualList = createEmptyOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateEmptyOrderedList_fail_withId() {
          String expectedList = "<ol id=\"myList\"></ol>"; // Should fail because the list has an ID
          String actualList = createEmptyOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateEmptyOrderedList_fail_withClass() {
          String expectedList = "<ol class=\"list-style\"></ol>"; // Should fail because the list has a class
          String actualList = createEmptyOrderedList();
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test
  	// Checks if paragraph is just am empty string
  	void functionParagraphCheck1() {
  		J2HTMLBase heading = new J2HTMLBase();
  		String test = heading.htmlConvert(html(
  				p("")));
  		Assert.assertEquals("<html><p></p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph is just small string
  	void functionParagraphCheck2() {
  		J2HTMLBase heading = new J2HTMLBase();
  		String test = heading.htmlConvert(html(
  				p("This is a paragraph")));
  		Assert.assertEquals("<html><p>This is a paragraph</p></html>", test);
  	}
  	
  	@Test
  	// Checks when Paragraph is just a long string
  	void functionParagraphCheck3() {
  		J2HTMLBase heading = new J2HTMLBase();
  		String test = heading.htmlConvert(html(
  				p("Paragraph 1, Paragraph 2, Paragraph 3, Paragraph 4")));
  		Assert.assertEquals("<html><p>Paragraph 1, Paragraph 2, Paragraph 3, Paragraph 4</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes a string variable
  	void functionParagraphCheck4() {
  		J2HTMLBase heading = new J2HTMLBase();
  		String temp = ".";
  		String test = heading.htmlConvert(html(
  				p(temp)));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes in an int variable that is turned into a string
  	void functionParagraphCheck5() {
  		J2HTMLBase heading = new J2HTMLBase();
  		int number = 100;
  		String temp = String.valueOf(number);
  		String test = heading.htmlConvert(html(
  				p(temp)));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes in an double variable that is turned into a string
  	void functionParagraphCheck6() {
  		J2HTMLBase heading = new J2HTMLBase();
  		double number = 100.05;
  		String temp = String.valueOf(number);
  		String test = heading.htmlConvert(html(
  				p(temp)));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes in an long variable that is turned into a string
  	void functionParagraphCheck7() {
  		J2HTMLBase heading = new J2HTMLBase();
  		long number = 10000000;
  		String temp = String.valueOf(number);
  		String test = heading.htmlConvert(html(
  				p(temp)));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes in a character variable that is turned into a string
  	void functionParagraphCheck8() {
  		J2HTMLBase heading = new J2HTMLBase();
  		char temp = 'H';
  		String test = heading.htmlConvert(html(
  				p(String.valueOf(temp))));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes in a boolean variable that is turned into a string
  	void functionParagraphCheck9() {
  		J2HTMLBase heading = new J2HTMLBase();
  		boolean temp = true;
  		String test = heading.htmlConvert(html(
  				p(String.valueOf(temp))));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
  	// Checks when paragraph takes in a float variable that is turned into a string
  	void functionParagraphCheck10() {
  		J2HTMLBase heading = new J2HTMLBase();
  		float temp = 1231231234;
  		String test = heading.htmlConvert(html(
  				p(String.valueOf(temp))));
  		Assert.assertEquals("<html><p>" + temp + "</p></html>", test);
  	}
  	
  	@Test
	void functionHTMLCheck() {
		J2HTMLBase e1 = new J2HTMLBase();
		String theOutput = e1.htmlConvert(html(
				head(attrs("#head.header-content"),
						title("Title"),
						link().withRel("stylesheet").withHref("/css/main.css")),
				body(
						p(attrs("#p.content"),
								"Heading!"),
						table(
								tr((td("This would be the data")), (td("This would be the other data")))))));
		Assert.assertEquals("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><p id=\"p\" class=\"content\">Heading!</p><table><tr><td>This would be the data</td><td>This would be the other data</td></tr></table></body></html>", theOutput); 
	}
  	
  //------------------------------------------Functions----------------------------------------------
	
  	public String createBasicUnorderedList() {
          return ul(
                  li("Item 1"),
                  li("Item 2"),
                  li("Item 3")
          ).render();
      }
  	
  	public String createBasicUnorderedList(String[] items) {
          UlTag ul = ul();
          
          if(items == null || items.length == 0) {
          	return ul.render();
          }
          
          for(String item : items) {
          	ul.with(li(item));
          }
  		
  		return ul.render();
      }
  	
  	//------------------------------------------Test Cases----------------------------------------------
  	
  	@Test
      public void testCreateBasicUnorderedList() {
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createBasicUnorderedList();
          Assert.assertEquals(actualList, expectedList);
      }
  	
  	@Test
      public void testCreateBasicUnorderedListWithEmptyArray() {
          String expectedList = "<ul></ul>";
          String actualList = createBasicUnorderedList(new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicUnorderedListWithSingleItem() {
          String expectedList = "<ul><li>Single Item</li></ul>";
          String actualList = createBasicUnorderedList(new String[]{"Single Item"});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicUnorderedListWithLongItems() {
          String[] items = {"This is a long item text", "Another long item text", "Third long item text"};
          String expectedList = "<ul><li>This is a long item text</li><li>Another long item text</li><li>Third long item text</li></ul>";
          String actualList = createBasicUnorderedList(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicUnorderedListWithHtmlInItems() {
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ul><li>&lt;b&gt;Item 1&lt;/b&gt;</li><li>&lt;i&gt;Item 2&lt;/i&gt;</li><li>&lt;u&gt;Item 3&lt;/u&gt;</li></ul>";
          String actualList = createBasicUnorderedList(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateBasicUnorderedListWithNullItems() {
          String expectedList = "<ul></ul>";
          String actualList = createBasicUnorderedList(null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicUnorderedList_fail_missingItem() {
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li></ul>"; // Missing Item 3, should fail
          String actualList = createBasicUnorderedList();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicUnorderedList_fail_invalidHtml() {
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>"; // Invalid HTML, should fail
          String actualList = createBasicUnorderedList().replace("<ul>", "<ol>");
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateBasicUnorderedList_fail_emptyList() {
          String expectedList = "<ul></ul>"; // Empty list, should fail
          String actualList = createBasicUnorderedList().replace("<li>Item 1</li>", "");
          Assert.assertEquals(actualList, expectedList);
      }
  	
  	//------------------------------------------Functions----------------------------------------------
      public String createUnorderedListWithCustomStyle() {
          return ul(
                  li("Item 1").withStyle("color: red;"),
                  li("Item 2").withStyle("color: blue;"),
                  li("Item 3").withStyle("color: green;")
          ).render();
      }
      
      public String createUnorderedListWithCustomStyle(String[] items) {
      	UlTag ul = ul();
      	if(items == null || items.length == 0) {
      		return ul.render();
      	}
      	
      	for(int i = 0; i < items.length; i++) {
      		String colorStyle;
      		if (i % 3 == 0) {
      			colorStyle = "color: red;";
      		} else if (i % 3 == 1) {
      			colorStyle = "color: blue;";
      		} else {
      			colorStyle = "color: green;";
      		}
      		ul.with(li(items[i]).withStyle(colorStyle));
      	}
      	
      	return ul.render();
      }
      
      //------------------------------------------Test Cases----------------------------------------------
      @Test
      public void testCreateUnorderedListWithCustomStyle() {
          String expectedList = "<ul><li style=\"color: red;\">Item 1</li><li style=\"color: blue;\">Item 2</li><li style=\"color: green;\">Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomStyle();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomStyle_emptyItems() {
          String expectedList = "<ul></ul>";
          String actualList = createUnorderedListWithCustomStyle(new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomStyle_singleItem() {
          String expectedList = "<ul><li style=\"color: red;\">Single Item</li></ul>";
          String actualList = createUnorderedListWithCustomStyle(new String[]{"Single Item"});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomStyle_longItems() {
          String[] items = {"This is a long item text", "Another long item text", "Third long item text"};
          String expectedList = "<ul><li style=\"color: red;\">This is a long item text</li><li style=\"color: blue;\">Another long item text</li><li style=\"color: green;\">Third long item text</li></ul>";
          String actualList = createUnorderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomStyle_nullItems() {
          String expectedList = "<ul></ul>";
          String actualList = createUnorderedListWithCustomStyle(null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomStyle_htmlItems() {
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ul><li style=\"color: red;\">&lt;b&gt;Item 1&lt;/b&gt;</li><li style=\"color: blue;\">&lt;i&gt;Item 2&lt;/i&gt;</li><li style=\"color: green;\">&lt;u&gt;Item 3&lt;/u&gt;</li></ul>";
          String actualList = createUnorderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }
      
      
      //------------------------------------------Functions----------------------------------------------
      public String createUnorderedListWithCustomItems(String[] items) {
          UlTag ul = ul();
          if (items == null || items.length == 0) {
              return ul.render();
          }

          for (String item : items) {
              ul.with(li(item));
          }

          return ul.render();
      }
      
      //------------------------------------------Test Cases----------------------------------------------
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomStyle_fail_invalidHtml() {
          String expectedList = "<ol><li style=\"color: red;\">Item 1</li><li style=\"color: blue;\">Item 2</li><li style=\"color: green;\">Item 3</li></ol>";
          String actualList = createUnorderedListWithCustomStyle();
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomStyle_fail_missingItem() {
          String expectedList = "<ul><li style=\"color: red;\">Item 1</li><li style=\"color: blue;\">Item 2</li><li style=\"color: green;\">Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomStyle(new String[]{"Item 1", "Item 2"});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomStyle_fail_emptyStyle() {
          String expectedList = "<ul><li style=\"\">Item 1</li><li style=\"color: blue;\">Item 2</li><li style=\"color: green;\">Item 3</li></ul>"; 
          String actualList = createUnorderedListWithCustomStyle(new String[]{"Item 1", "Item 2", "Item 3"});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomStyle_fail_nullItems() {
          String expectedList = "";
          String actualList = createUnorderedListWithCustomStyle(null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomStyle_fail_htmlInItems() {
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ul><li style=\"color: red;\">Item 1</li><li style=\"color: blue;\">Item 2</li><li style=\"color: green;\">Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomStyle(items);
          Assert.assertEquals(actualList, expectedList);
      }

      //------------------------------------------Functions----------------------------------------------
      public String createUnorderedListWithCustomId(String id, String[] items) {
          UlTag ul = ul();
          if (id != null && !id.isEmpty()) {
              ul.attr("id", id);
          }
          if (items == null || items.length == 0) {
              return ul.render();
          }

          for (String item : items) {
              ul.with(li(item));
          }

          return ul.render();
      }
      
      //------------------------------------------Test Cases----------------------------------------------
      
      @Test
      public void testCreateUnorderedListWithCustomId() {
          String id = "myList";
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ul id=\"myList\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomId(id, items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomId_emptyItems() {
          String id = "emptyList";
          String expectedList = "<ul id=\"emptyList\"></ul>";
          String actualList = createUnorderedListWithCustomId(id, new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomId_nullId() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomId(null, items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomId_nullItems() {
          String id = "nullItemsList";
          String expectedList = "<ul id=\"nullItemsList\"></ul>";
          String actualList = createUnorderedListWithCustomId(id, null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomId_emptyId() {
          String id = "";
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomId(id, items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomId_htmlInItems() {
          String id = "htmlList";
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ul id=\"htmlList\"><li>&lt;b&gt;Item 1&lt;/b&gt;</li><li>&lt;i&gt;Item 2&lt;/i&gt;</li><li>&lt;u&gt;Item 3&lt;/u&gt;</li></ul>";
          String actualList = createUnorderedListWithCustomId(id, items);
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomId_fail_invalidId() {
          String id = "<script>alert('Hello')</script>"; // Invalid ID containing script tags, should fail
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String actualList = createUnorderedListWithCustomId(id, items);
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomId_fail_nullIdAndItems() {
          String[] items = null;
          String actualList = createUnorderedListWithCustomId(null, items);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomId_fail_emptyIdAndItems() {
          String[] items = {};
          String actualList = createUnorderedListWithCustomId("", items);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomId_fail_htmlInId() {
          String id = "myList"; // ID containing HTML tags, should fail
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String actualList = createUnorderedListWithCustomId("<b>" + id + "</b>", items);
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }
      
      //------------------------------------------Functions----------------------------------------------
      public String createUnorderedListWithCustomClass(String cssClass, String[] items) {
          UlTag ul = ul();
          if (cssClass != null && !cssClass.isEmpty()) {
              ul.withClass(cssClass);
          }
          if (items == null || items.length == 0) {
              return ul.render();
          }

          for (String item : items) {
              ul.with(li(item));
          }

          return ul.render();
      }
      //------------------------------------------Test Cases----------------------------------------------
      
      @Test
      public void testCreateUnorderedListWithCustomClass_validClassAndItems() {
          String cssClass = "myListClass";
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ul class=\"myListClass\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomClass(cssClass, items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomClass_emptyItems() {
          String cssClass = "emptyListClass";
          String expectedList = "<ul class=\"emptyListClass\"></ul>";
          String actualList = createUnorderedListWithCustomClass(cssClass, new String[]{});
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomClass_nullClassAndItems() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomClass(null, items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomClass_nullItems() {
          String cssClass = "nullItemsClass";
          String expectedList = "<ul class=\"nullItemsClass\"></ul>";
          String actualList = createUnorderedListWithCustomClass(cssClass, null);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomClass_emptyClassAndItems() {
          String cssClass = "";
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actualList = createUnorderedListWithCustomClass(cssClass, items);
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomClass_htmlInItems() {
          String cssClass = "htmlListClass";
          String[] items = {"<b>Item 1</b>", "<i>Item 2</i>", "<u>Item 3</u>"};
          String expectedList = "<ul class=\"htmlListClass\"><li>&lt;b&gt;Item 1&lt;/b&gt;</li><li>&lt;i&gt;Item 2&lt;/i&gt;</li><li>&lt;u&gt;Item 3&lt;/u&gt;</li></ul>";
          String actualList = createUnorderedListWithCustomClass(cssClass, items);
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomClass_fail_invalidClass() {
          String cssClass = "invalidClass";
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String actualList = createUnorderedListWithCustomClass(cssClass, items);
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomClass_fail_nullClassAndItems() {
          String[] items = null;
          String actualList = createUnorderedListWithCustomClass(null, items);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomClass_fail_emptyClassAndItems() {
          String[] items = {};
          String actualList = createUnorderedListWithCustomClass("", items);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomClass_fail_htmlInClass() {
          String cssClass = "htmlClass"; // Class containing HTML tags, should fail
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String actualList = createUnorderedListWithCustomClass(cssClass, items);
          String expectedList = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }
      
      //------------------------------------------Functions----------------------------------------------
      public String createUnorderedListWithCustomAttributes(String id, String cssClass, String[] items) {
          UlTag ul = ul();
          if (id != null && !id.isEmpty()) {
              ul.attr("id", id);
          }
          if (cssClass != null && !cssClass.isEmpty()) {
              ul.withClass(cssClass);
          }
          if (items == null || items.length == 0) {
              return ul.render();
          }

          for (String item : items) {
              ul.with(li(item));
          }

          return ul.render();
      }
      //------------------------------------------Test Cases----------------------------------------------
      
      @Test
      public void testCreateUnorderedListWithId() {
          String id = "list1";
          String[] items = {"Item 1", "Item 2", "Item 3"};
          String expected = "<ul id=\"list1\"><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, null, items);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithClass() {
          String cssClass = "custom-list";
          String[] items = {"Item 1", "Item 2"};
          String expected = "<ul class=\"custom-list\"><li>Item 1</li><li>Item 2</li></ul>";
          String actual = createUnorderedListWithCustomAttributes(null, cssClass, items);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithIdAndClass() {
          String id = "list2";
          String cssClass = "custom-list";
          String[] items = {"Item 1"};
          String expected = "<ul id=\"list2\" class=\"custom-list\"><li>Item 1</li></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, items);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithNoItems() {
          String id = "emptyList";
          String cssClass = "empty-list";
          String[] items = {};
          String expected = "<ul id=\"emptyList\" class=\"empty-list\"></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, items);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithNullIdAndClass() {
          String[] items = {"Single Item"};
          String expected = "<ul><li>Single Item</li></ul>";
          String actual = createUnorderedListWithCustomAttributes(null, null, items);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithNullItems() {
          String id = "list3";
          String cssClass = "custom-list";
          String expected = "<ul id=\"list3\" class=\"custom-list\"></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, null);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNullItems_fail_NullIdAndClassEmptyItems() {
          String id = null;
          String cssClass = null;
          String[] items = {};
          String expected = "";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, items);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNullItems_fail_EmptyIdEmptyClassNullItems() {
          String id = "";
          String cssClass = "";
          String[] items = null;
          String expected = "<ul id=\"\" class=\"\"></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, items);
          Assert.assertEquals(actual, expected);
      }
      
      @Test
      public void testCreateUnorderedListWithNullItems_fail_DuplicateItems() {
          String id = "list4";
          String cssClass = "duplicate-list";
          String[] items = {"Item 1", "Item 1", "Item 2"};
          String expected = "<ul id=\"list4\" class=\"duplicate-list\"><li>Item 1</li><li>Item 1</li><li>Item 2</li></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, items);
          Assert.assertEquals(actual, expected);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNullItems_fail_SpecialCharactersInItems() {
          String id = "list5";
          String cssClass = "special-list";
          String[] items = {"Item & Special", "<script>alert('Hello');</script>"};
          String expected = "<ul id=\"list5\" class=\"special-list\"><li>Item & Special</li><li>&lt;script&gt;alert('Hello');&lt;/script&gt;</li></ul>";
          String actual = createUnorderedListWithCustomAttributes(id, cssClass, items);
          Assert.assertEquals(actual, expected);
      }
      
      //------------------------------------------Functions----------------------------------------------	
      public static String createUnorderedListWithLinks(String[] linkTexts, String[] urls) {
          UlTag ul = ul();
          if (linkTexts == null || urls == null || linkTexts.length != urls.length) {
              return ul.render();
          }

          for (int i = 0; i < linkTexts.length; i++) {
              ul.with(li(a(linkTexts[i]).withHref(urls[i])));
          }

          return ul.render();
      }
      //------------------------------------------Test Cases----------------------------------------------
      
      @Test
      public void testCreateUnorderedListWithLinks() {
          String[] linkTexts = {"Google", "Yahoo", "Bing"};
          String[] urls = {"https://www.google.com/", "https://www.yahoo.com/", "https://www.bing.com/"};
          String expected = "<ul><li><a href=\"https://www.google.com/\">Google</a></li><li><a href=\"https://www.yahoo.com/\">Yahoo</a></li><li><a href=\"https://www.bing.com/\">Bing</a></li></ul>";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithNullInput() {
          String[] linkTexts = null;
          String[] urls = null;
          String expected = "<ul></ul>";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithDifferentLengths() {
          String[] linkTexts = {"Link 1", "Link 2", "Link 3"};
          String[] urls = {"https://www.example.com/", "https://www.example.com/"};
          String expected = "<ul></ul>";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithEmptyInputs() {
          String[] linkTexts = {};
          String[] urls = {};
          String expected = "<ul></ul>";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithEmptyLinkTexts() {
          String[] linkTexts = {};
          String[] urls = {"https://www.example.com/"};
          String expected = "<ul></ul>";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }

      @Test
      public void testCreateUnorderedListWithEmptyUrls() {
          String[] linkTexts = {"Link 1", "Link 2"};
          String[] urls = {};
          String expected = "<ul></ul>";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedList_fail_NullLinksArray() {
          String[] linkTexts = null;
          String[] urls = {"https://www.example.com/"};
          String expected = "";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedList_fail_NullUrlsArray() {
          String[] linkTexts = {"Link 1", "Link 2"};
          String[] urls = null;
          String expected = "";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void  testCreateUnorderedList_fail_DifferentLengthArrays() {
          String[] linkTexts = {"Link 1", "Link 2"};
          String[] urls = {"https://www.example.com/"};
          String expected = "";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedList_fail_EmptyLinkTextsNonEmptyUrls() {
          String[] linkTexts = {};
          String[] urls = {"https://www.example.com/"};
          String expected = "";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedList_fail_EmptyUrlsNonEmptyLinkTexts() {
          String[] linkTexts = {"Link 1", "Link 2"};
          String[] urls = {};
          String expected = "";
          String actual = createUnorderedListWithLinks(linkTexts, urls);
          Assert.assertEquals(actual, expected);
      }
      
      
      //------------------------------------------Functions----------------------------------------------
      public static String createUnorderedListWithCustomNumbering(String[] items, int startNumber) {
          UlTag ul = ul();
          if (items == null || items.length == 0) {
              return ul.render();
          }

          for (int i = 0; i < items.length; i++) {
              ul.with(li().attr("value", String.valueOf(startNumber + i)).withText(items[i]));
          }

          return ul.render();
      }
      //------------------------------------------Test Cases----------------------------------------------
      
      //------------------------------------------Functions----------------------------------------------
      public static String createUnorderedListWithCustomItemsAndStyle(String[] items, String style) {
          UlTag ul = ul();
          if (items == null || items.length == 0 || style == null || style.isEmpty()) {
              return ul.render();
          }

          for (String item : items) {
              ul.with(li(item).withStyle(style));
          }

          return ul.render();
      }
      //------------------------------------------Test Cases----------------------------------------------
      
      @Test
      public void testCreateUnorderedListWithCustomNumbering_startNumberZero() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          int startNumber = 0;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "<ul><li value=\"0\">Item 1</li><li value=\"1\">Item 2</li><li value=\"2\">Item 3</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomNumbering_startNumberTen() {
          String[] items = {"Item A", "Item B", "Item C"};
          int startNumber = 10;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "<ul><li value=\"10\">Item A</li><li value=\"11\">Item B</li><li value=\"12\">Item C</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomNumbering_emptyItems() {
          String[] items = {};
          int startNumber = 5;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "<ul></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithCustomNumbering_nullItems() {
          String[] items = null;
          int startNumber = 1;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "<ul></ul>";
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomNumbering_fail_invalidStartNumber() {
          String[] items = {"Item 1", "Item 2", "Item 3"};
          int startNumber = -1;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "<ul><li value=\"0\">Item 1</li><li value=\"1\">Item 2</li><li value=\"2\">Item 3</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomNumbering_fail_startNumberZero() {
          String[] items = {"Item A", "Item B", "Item C"};
          int startNumber = 0;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "<ul><li value=\"1\">Item A</li><li value=\"2\">Item B</li><li value=\"3\">Item C</li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomNumbering_fail_nullItemsAndStartNumber() {
          String[] items = null;
          int startNumber = 5;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithCustomNumbering_fail_emptyItemsAndStartNumber() {
          String[] items = {};
          int startNumber = 10;
          String actualList = createUnorderedListWithCustomNumbering(items, startNumber);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }
      
      //------------------------------------------Functions----------------------------------------------
      public static String createUnorderedListWithNestedLists(String[] parentItems, String[][] childItems) {
          UlTag ul = ul();
          if (parentItems == null || parentItems.length == 0 || childItems == null || childItems.length != parentItems.length) {
              return ul.render();
          }

          for (int i = 0; i < parentItems.length; i++) {
              UlTag nestedUl = ul();
              for (String item : childItems[i]) {
                  nestedUl.with(li(item));
              }
              ul.with(li(parentItems[i]).with(nestedUl));
          }

          return ul.render();
      }
      //------------------------------------------Test Cases----------------------------------------------

      @Test
      public void testCreateUnorderedListWithNestedLists_validData() {
          String[] parentItems = {"Parent 1", "Parent 2", "Parent 3"};
          String[][] childItems = {{"Child A1", "Child A2"}, {"Child B1", "Child B2"}, {"Child C1", "Child C2"}};
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "<ul><li>Parent 1<ul><li>Child A1</li><li>Child A2</li></ul></li><li>Parent 2<ul><li>Child B1</li><li>Child B2</li></ul></li><li>Parent 3<ul><li>Child C1</li><li>Child C2</li></ul></li></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithNestedLists_nullParentItems() {
          String[] parentItems = null;
          String[][] childItems = {{"Child A1", "Child A2"}, {"Child B1", "Child B2"}, {"Child C1", "Child C2"}};
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "<ul></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithNestedLists_emptyChildItems() {
          String[] parentItems = {"Parent 1", "Parent 2", "Parent 3"};
          String[][] childItems = {};
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "<ul></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test
      public void testCreateUnorderedListWithNestedLists_nullChildItems() {
          String[] parentItems = {"Parent 1", "Parent 2", "Parent 3"};
          String[][] childItems = null;
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "<ul></ul>";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNestedLists_mismatchedChildItems() {
          String[] parentItems = {"Parent 1", "Parent 2"};
          String[][] childItems = {{"Child A1", "Child A2"}, {"Child B1", "Child B2"}, {"Child C1", "Child C2"}};
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }
      
      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNestedLists_fail_nullParentItems() {
          String[] parentItems = null;
          String[][] childItems = {{"Child A1", "Child A2"}, {"Child B1", "Child B2"}, {"Child C1", "Child C2"}};
          String actualList =createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNestedLists_fail_emptyChildItems() {
          String[] parentItems = {"Parent 1", "Parent 2", "Parent 3"};
          String[][] childItems = {}; 
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNestedLists_fail_nullChildItems() {
          String[] parentItems = {"Parent 1", "Parent 2", "Parent 3"};
          String[][] childItems = null;
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }

      @Test(expectedExceptions = AssertionError.class)
      public void testCreateUnorderedListWithNestedLists_fail_mismatchedChildItems() {
          String[] parentItems = {"Parent 1", "Parent 2"};
          String[][] childItems = {{"Child A1", "Child A2"}, {"Child B1", "Child B2"}, {"Child C1", "Child C2"}};
          String actualList = createUnorderedListWithNestedLists(parentItems, childItems);
          String expectedList = "";
          Assert.assertEquals(actualList, expectedList);
      }
}
