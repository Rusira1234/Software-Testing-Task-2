package com.sdetadda.allure;
import com.sdetadda.allure.Employee;
import org.instancio.Instancio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import j2html.tags.ContainerTag;
import j2html.tags.Text;
import net.datafaker.Faker;

import static j2html.TagCreator.*;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ApiControllers {
	
	@GetMapping(value = "/")
	public HTMLContent getPage() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String theConversion = p(attrs("#p.content"),"Paragraph with attributes").render().toString();
		theContent.setContent(theConversion);
		return theContent;
	}
	
	// ------------------------- Rest Assured Test Cases starts from here -------------------------------------
	@GetMapping(value = "/testCase-01")
	public HTMLContent TestCase_01(@RequestParam String name, String airCraft) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                        p(attrs("#p.content"),
                                "Heading!"),
                        table(
                                tr((td("The Name: " + name)), (td("The Aircraft: " + airCraft)))))));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-02")
	public HTMLContent TestCase_02(@RequestParam String animal, String scentificName) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		ul(
                                li(animal),
                                li(scentificName)
                            )
                		)
                )
				);
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-03")
	public HTMLContent TestCase_03(@RequestParam String data1, String data2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		table(tr(td(""), td(data1), td(data2)))
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-04")
	public HTMLContent TestCase_04(@RequestParam String animalName) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title(animalName),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		dl(dt(), dd(), dt(), dd())
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-05")
	public HTMLContent TestCase_05() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		pre()
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-06")
	public HTMLContent TestCase_06() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		ol(li(), li(), li())
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-07")
	public HTMLContent TestCase_07() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		bdo()
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-08")
	public HTMLContent TestCase_08() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		blockquote().isHidden()
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-09")
	public HTMLContent TestCase_09(@RequestParam String buttonText) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		button(buttonText).withType("submit").withStyle("background-color:pink;color:white;")
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-10")
	public HTMLContent TestCase_10() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(attrs("#head.header-content"),
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")),
                body(
                		input()
                		        .withType("email")
                		        .withId("email")
                		        .withName("email")
                		        .withPlaceholder("Enter your email")
                		        .withValue("")
                		        .isRequired(),
                		input()
                		        .withType("password")
                		        .withId("password")
                		        .withName("password")
                		        .withPlaceholder("Enter your password")
                		        .withValue("password123")
                		        .isRequired(),
                		button("Login")
                )
				));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-11")
	public HTMLContent TestCase_11() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("image.jpg").withAlt(""));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-12")
	public HTMLContent TestCase_12(@RequestParam String userScript) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(userScript));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-13")
	public HTMLContent TestCase_13(@RequestParam String name) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p("Hello, " + name + "!"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-14")
	public HTMLContent TestCase_14() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withClass("invalid"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-15")
	public HTMLContent TestCase_15(@RequestParam String title,String para1,String para2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
                h1(title),
                p(para1),
                p(para2)
            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-16")
	public HTMLContent TestCase_16(@RequestParam String dynamicClass, String sampleText) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withClass(dynamicClass).withText(sampleText));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-17")
	public HTMLContent TestCase_17() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div("Condition true with "));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-18")
	public HTMLContent TestCase_18(@RequestParam String sampleText1, String sampleText2, String sampleText3, String sampleText4, String sampleText5, String sampleText6, String sampleText7) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withClass("header").with(
	            img().withSrc("proDep.png").withAlt("ProDep"),
	            div().withClass("header-right").with(
	                a(sampleText1).withHref("The Home Page.html"),
	                a(sampleText2).withHref("Components.html"),
	                a(sampleText3).withClass("active").withHref("#"),
	                a(sampleText4).withHref("Documents.html"),
	                a(sampleText5).withHref("Presentations.html"),
	                a(sampleText6).withHref("About.html"),
	                a(sampleText7).withHref("Contact Us.html")
	            )
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-19")
	public HTMLContent TestCase_19() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withClass("row").with(
	            div().withClass("column"),
	            div().withClass("column").with(
	                a(img().withSrc("Documents/log books.png").withAlt("log books").withStyle("width:70%"))
	                    .withHref("sampleHref1")
	                    .withTarget("_blank")
	            ),
	            div().withClass("column").with(
	                a(img().withSrc("Documents/final reports.png").withAlt("final reports").withStyle("width:70%"))
	                    .withHref("sampleHref2")
	                    .withTarget("_blank")
	            ),
	            div().withClass("column")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-20")
	public HTMLContent TestCase_20(@RequestParam String sampleText1, String sampleText2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(sampleText1 + " " + sampleText2));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-21")
	public HTMLContent TestCase_21() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withClass("sampleClass"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-22")
	public HTMLContent TestCase_22() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withId("sampleId"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-23")
	public HTMLContent TestCase_23(@RequestParam String sampleAText) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(a(sampleAText).withHref("https://example.com"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-24")
	public HTMLContent TestCase_24() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("sampleImage"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-25")
	public HTMLContent TestCase_25(@RequestParam String sampleParagraph) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(sampleParagraph).withStyle("color:red;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-26")
	public HTMLContent TestCase_26(@RequestParam String item1, String item2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ol(li(item1), li(item2)));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-27")
	public HTMLContent TestCase_27(@RequestParam String item1, String item2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ul(li(item1), li(item2)));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-28")
	public HTMLContent TestCase_28(@RequestParam String sampleHeading, String paragrpah, String sampleItem1, String sampleItem2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
                h1(sampleHeading),
                p(paragrpah),
                ul(li(sampleItem1), li(sampleItem2))
            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-29")
	public HTMLContent TestCase_29() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withStyle("color:red; font-size:16px;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-30")
	public HTMLContent TestCase_30(@RequestParam String sampleString) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(a(sampleString).withHref("#").withTarget("_blank"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-31")
	public HTMLContent TestCase_31() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("image.jpg").withAlt("sampleDescription"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-32")
	public HTMLContent TestCase_32(@RequestParam String sampleCar) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(h2(sampleCar));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-33")
	public HTMLContent TestCase_33() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form().withAction("formAction"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-34")
	public HTMLContent TestCase_34(@RequestParam String formStuff) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(input().withType(formStuff).isAutofocus());
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-35")
	public HTMLContent TestCase_35(@RequestParam String buttonText) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(button("buttonText").withType(buttonText));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-36")
	public HTMLContent TestCase_36(@RequestParam String sampleValue,String sampleValue2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(select().with(
                option("Option 1").withValue(sampleValue),
                option("Option 2").withValue(sampleValue2)
            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-37")
	public HTMLContent TestCase_37(@RequestParam String data1,String data2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(table(
                tr(th("Header 1"), th("Header 2")),
                tr(td(data1), td(data2))
            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-38")
	public HTMLContent TestCase_38(@RequestParam String sampleText) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(textarea(sampleText));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-39")
	public HTMLContent TestCase_39(@RequestParam String sampleBtn) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(button("Click me").withClass("btn btn-primary").withType("button").withId(sampleBtn));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-40")
	public HTMLContent TestCase_40(@RequestParam String samplePlaceholder) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(input().withType("text").withPlaceholder(samplePlaceholder));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-41")
	public HTMLContent TestCase_41(@RequestParam String sampleAnchorText) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(a(sampleAnchorText).withHref("https://example.com").withTarget("_blank"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-42")
	public HTMLContent TestCase_42(@RequestParam String sampleWidth, String sampleHeight) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("image.jpg").withAlt("Description").withWidth(sampleWidth).withHeight(sampleHeight));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-43")
	public HTMLContent TestCase_43(@RequestParam String sampleValue) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(sampleValue).withId("para1"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-44")
	public HTMLContent TestCase_44(@RequestParam String sampleItem) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(li(sampleItem).withClass("list-item").withStyle("color: blue;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-45")
	public HTMLContent TestCase_45(@RequestParam String sampleId, String sampleHeading) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(h2(sampleHeading).withId(sampleId).withTitle("This is a subheading"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-46")
	public HTMLContent TestCase_46(@RequestParam String sampleItem, String sampleItem2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(tr(td(sampleItem), td(sampleItem2)).withStyle("background-color: yellow;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-47")
	public HTMLContent TestCase_47(@RequestParam String option1, String option2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(select().withCondMultiple(true)
                .with(
                        option().withValue(option1),
                        option().withValue(option2)
                    ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-48")
	public HTMLContent TestCase_48(@RequestParam String key1, String value1, String key2, String value2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withData(key1, value1).withData(key2, value2));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-49")
	public HTMLContent TestCase_49() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("image.jpg").withCondContenteditable(true));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-50")
	public HTMLContent TestCase_50() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("image.jpg").withCondTranslate(false));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-51")
	public HTMLContent TestCase_51() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(track().withSrc("subtitles_en.vtt").withKind("subtitles").withLabel("English"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-52")
	public HTMLContent TestCase_52(String width, String height) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div().withStyle("width: " + width + ";height: " + height));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-53")
	public HTMLContent TestCase_53(String article, String description) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(article(
	            h1(article),
	            p(description)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-54")
	public HTMLContent TestCase_54(String message) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(header(
	            h1("Page Header"),
	            p(message)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-55")
	public HTMLContent TestCase_55(String email) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(footer(
	            p("Copyright © 2024. All rights reserved."),
	            p("Contact: " + email)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-56")
	public HTMLContent TestCase_56(String date) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(time().attr("datetime", date));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-57")
	public HTMLContent TestCase_57(String date) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(em("Emphasized text"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-58")
	public HTMLContent TestCase_58(String number1, String number2, String number3) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(select(
	            option("Option 1").withValue(number1),
	            option("Option 2").withValue(number2).attr("selected"),
	            option("Option 3").withValue(number3)
	        ).withName("options"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-59")
	public HTMLContent TestCase_59(String color1, String color2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div("Inner div 1").withClass("inner-div").withStyle("color:" + color1 + ";"),
	            div("Inner div 2").withClass("inner-div").withStyle("color:" + color2 + ";")
	        ).withClass("outer-div"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-60")
	public HTMLContent TestCase_60(String name, String email) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            fieldset(
	                    legend("Contact Information"),
	                    label("Name:").with(
	                        input().withType("text").withName(name)
	                    ),
	                    label("Email:").with(
	                        input().withType("email").withName(email)
	                    )
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-61")
	public HTMLContent TestCase_61() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div("Column 1").withClass("column"),
	            div("Column 2").withClass("column"),
	            div("Column 3").withClass("column")
	        ).withClass("grid-container"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-62")
	public HTMLContent TestCase_62(String option1, String option2, String option3, String option4) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(select(
	            optgroup(
	                    label("Group 1"),
	                    option(option1),
	                    option(option2)
	                ),
	                optgroup(
	                    label("Group 2"),
	                    option(option3),
	                    option(option4)
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-63")
	public HTMLContent TestCase_63(String option1, String option2, String option3, String option4) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(nav(
	            ul(
	                    li(a("Home").withHref("/home")),
	                    li(a("About").withHref("/about")),
	                    li(a("Contact").withHref("/contact"))
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-64")
	public HTMLContent TestCase_64(String imgName, String imgCaption) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(figure(
	            img().withSrc("image.jpg").withAlt(imgName),
	            figcaption(imgCaption)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-65")
	public HTMLContent TestCase_65(String value, String imgCaption) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(progress().withValue(value).withMax("100"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-66")
	public HTMLContent TestCase_66(String article, String articleContent, String webSite, String author) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(article(
	            h2(article),
	            p(articleContent),
	            address(
	                p("Written by " + author),
	                p(webSite)
	            )
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-67")
	public HTMLContent TestCase_67() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(dialog(
	            p("This is a dialog box."),
	            button("Close").attr("onclick", "this.parentElement.close()")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-68")
	public HTMLContent TestCase_68(String message) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(details(
	            summary("Click to expand"),
	            p(message)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-69")
	public HTMLContent TestCase_69(String item1, String item2, String item3, String item4, String item5) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div(item1).withClass("grid-item"),
	            div(item2).withClass("grid-item"),
	            div(item3).withClass("grid-item"),
	            div(item4).withClass("grid-item"),
	            div(item5).withClass("grid-item")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-70")
	public HTMLContent TestCase_70(String movieName) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(video().withSrc(movieName + ".mp4").withDir("Sample Directory"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-71")
	public HTMLContent TestCase_71(String user1, String user2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ul(
	            li("User 1: Hi " + user1),
	            li("User 2: Hello! " + user2)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-72")
	public HTMLContent TestCase_72(String width, String height) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(canvas().withWidth(width).withHeight(height));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-73")
	public HTMLContent TestCase_73(String author) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(blockquote(
	            p("This is a quote."),
	            footer("Author: " + author)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-74")
	public HTMLContent TestCase_74(String author) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            input().withType("file").withName("files").attr("multiple"),
	            button("Upload").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-75")
	public HTMLContent TestCase_75(String question, String answer) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(details(
	            summary(question),
	            p(answer)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-76")
	public HTMLContent TestCase_76(String date1, String date2, String date3) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ul(
	            li("Event 1: " + date1),
	            li("Event 2: " + date2),
	            li("Event 3: " + date3)
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-77")
	public HTMLContent TestCase_77(String width, String height, String webSite) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(iframe().withSrc(webSite).withWidth(width).withHeight(height));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-78")
	public HTMLContent TestCase_78(String imgSrc, String img) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(figure(
	            img().withSrc(imgSrc),
	            figcaption(img)));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-79")
	public HTMLContent TestCase_79(String value, String minValue,String maxValue) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(meter().withValue(value).withMin(minValue).withMax(maxValue));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-80")
	public HTMLContent TestCase_80(String name, String email,String message) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label(name).with(input().withType("text")),
	            label(email).with(input().withType("email")),
	            label(message).with(textarea()),
	            button("Submit").withType("submit")
	        ).withOnsubmit("submitMessage()"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-81")
	public HTMLContent TestCase_81() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            ul(
	                    li(img().withSrc("image1.jpg")),
	                    li(img().withSrc("image2.jpg")),
	                    li(img().withSrc("image3.jpg"))
	                )
	            ).withClass("carousel"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-82")
	public HTMLContent TestCase_82() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(meter().withValue("60").withMin("0").withMax("100").attr("label", "Progress").withStyle("width: 200px; height: 20px; background-color: #f0f0f0;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-83")
	public HTMLContent TestCase_83() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ul(
	            li(
	                    a("Home").withHref("#"),
	                    ul(
	                        li(a("Submenu 1").withHref("subMenu1")),
	                        li(a("Submenu 2").withHref("subMenu2"))
	                    )
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-84")
	public HTMLContent TestCase_84(String width, String height) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(canvas().withId("myCanvas").attr("width", width).attr("height", height));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-85")
	public HTMLContent TestCase_85(String movie1, String movie2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(video(
	            source().withSrc(movie1 + ".mp4").withType("video/mp4"),
	            source().withSrc(movie2 + ".ogg").withType("video/ogg")
	        ).isControls());
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-86")
	public HTMLContent TestCase_86(String movie1, String movie2) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(video(
	            source().withSrc(movie1 + ".mp4").withType("video/mp4"),
	            source().withSrc(movie2 + ".ogg").withType("video/ogg")
	        ).isControls());
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-87")
	public HTMLContent TestCase_87() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(abbr("HTML").withTitle("HyperText Markup Language"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-88")
	public HTMLContent TestCase_88() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(iframe().withSrc("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3873.914669507377!2d-122.40860548578645!3d37.783697574566674!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8085808f05665937%3A0x5ef3f7f7a03f9b93!2sGolden%20Gate%20Bridge!5e0!3m2!1sen!2sus!4v1646477310675!5m2!1sen!2sus").attr("width", "600").attr("height", "450").attr("style", "border:0;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-89")
	public HTMLContent TestCase_89() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(picture(
	            source().withSrcset("image-large.jpg").withMedia("(min-width: 1200px)"),
	            source().withSrcset("image-medium.jpg").withMedia("(min-width: 800px)"),
	            img().withSrc("image-small.jpg").withAlt("Responsive Image")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-90")
	public HTMLContent TestCase_90(String color) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(progress().withValue("50").withMax("100").withStyle("width: 200px; height: 20px; background-color: " + color + ";"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-91")
	public HTMLContent TestCase_91(String temp) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(
	            "The temperature is: " + temp
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-92")
	public HTMLContent TestCase_92(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(details(
	            summary("Click to toggle"),
	            p("Additional content goes here.")
	        ).withStyle("background-color: #f4f4f4; padding: " + number + "px;"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-93")
	public HTMLContent TestCase_93(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(table(
	            tr(
	                    th("Mon"), th("Tue"), th("Wed"), th("Thu"), th("Fri"), th("Sat"), th("Sun")
	                ),
	                tr(
	                    td("1"), td("2"), td("3"), td("4"), td("5"), td("6"), td("7")
	                ),
	                tr(
	                    td("8"), td("9"), td("10"), td("11"), td("12"), td("13"), td("14")
	                ),
	                tr(
	                    td("15"), td("16"), td("17"), td("18"), td("19"), td("20"), td("21")
	                ),
	                tr(
	                    td("22"), td("23"), td("24"), td("25"), td("26"), td("27"), td("28")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-94")
	public HTMLContent TestCase_94() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(nav(
	            ul(
	                    li(a("Home").withHref("/")),
	                    li(a("Products").withHref("/products")),
	                    li(a("Category").withHref("/category")),
	                    li("Current Page")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-95")
	public HTMLContent TestCase_95() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(
	            text("The chemical formula is H"),
	            sup("2"),
	            text("O, and the equation is 2H"),
	            sub("2"),
	            text(" + O"),
	            sub("2"),
	            text(" -> 2H"),
	            sup("2"),
	            text("O.")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-96")
	public HTMLContent TestCase_96(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(
	            text("This is a longword "),
	            wbr(),
	            text(" with a word break.")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-97")
	public HTMLContent TestCase_97(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(abbr("HTML").attr("title", "Hypertext Markup Language"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-98")
	public HTMLContent TestCase_98(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(canvas().attr("width", "200").attr("height", "100"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-99")
	public HTMLContent TestCase_99(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(canvas().withWidth("200").withHeight("100"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-100")
	public HTMLContent TestCase_100(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(label(
	            input().withType("checkbox").withId("toggle"),
	            span().withClass("slider")
	        ).withClass("toggle"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-101")
	public HTMLContent TestCase_101() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert( map().withName("imageMap").with(
                area().withShape("rect").withCoords("0,0,100,100").withHref("#"),
                area().withShape("circle").withCoords("200,200,50").withHref("#")
            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-102")
	public HTMLContent TestCase_102(String number) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(base().withHref("https://www.example.com/"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-103")
	public HTMLContent TestCase_103() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(col().withSpan("2"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-104")
	public HTMLContent TestCase_104() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(embed().withSrc("example.swf").withType("application/x-shockwave-flash").withWidth("400").withHeight("300"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-105")
	public HTMLContent TestCase_105() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(keygen().withId("keypair"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-106")
	public HTMLContent TestCase_106() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(link().withRel("stylesheet").withHref("styles.css"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-107")
	public HTMLContent TestCase_107() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(meta().withCharset("UTF-8").withName("description").withContent("This is a meta tag example."));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-108")
	public HTMLContent TestCase_108() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(param().withName("autoplay").withValue("true"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-109")
	public HTMLContent TestCase_109() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(source().withSrc("video.mp4").withType("video/mp4"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-110")
	public HTMLContent TestCase_110() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(audio(
	            source().withSrc("audio.mp3").withType("audio/mpeg")
		        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-111")
	public HTMLContent TestCase_111() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(colgroup(
	            col().withSpan("2"),
	            col().withSpan("1"),
	            col().withSpan("3")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-112")
	public HTMLContent TestCase_112(String country) {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(
	            text("The population of "),
	            data().withValue("37400000").withText(country),
	            text(" is larger than that of "),
	            data().withValue("18700000").withText("New York"),
	            text(".")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-113")
	public HTMLContent TestCase_113() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p(
	            text("The "),
	            dfn("HTML"),
	            text(" specification defines the structure of web documents.")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-114")
	public HTMLContent TestCase_114() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(figure(
	            img().withSrc("image.jpg").withAlt("Image"),
	            figcaption("Caption for the image")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-115")
	public HTMLContent TestCase_115() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(noscript(
	            p("JavaScript is disabled in your browser. Please enable it to view this website.")
		        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-116")
	public HTMLContent TestCase_116() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(rp("(pronunciation)"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-117")
	public HTMLContent TestCase_117() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(rt("furigana"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-118")
	public HTMLContent TestCase_118() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(samp("Sample output: Hello, world!"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-119")
	public HTMLContent TestCase_119() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(template(
	            p("This is a template.")
		        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-120")
	public HTMLContent TestCase_120() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(menu(
	            li(a("Home").withHref("/home")),
	            li(a("About").withHref("/about")),
	            li(a("Contact").withHref("/contact"))
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-121")
	public HTMLContent TestCase_121() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(noscript(
	            p("JavaScript is disabled in your browser. Please enable it to view this website.")
		        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-122")
	public HTMLContent TestCase_122() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            input().withId("num1").withType("number"),
	            input().withId("num2").withType("number"),
	            button("Calculate").withType("button"),
	            br(),
	            output().withId("result")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-123")
	public HTMLContent TestCase_123() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            input().withId("num1").withType("number"),
	            input().withId("num2").withType("number"),
	            button("Calculate").withType("button"),
	            br(),
	            output().withId("result")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-124")
	public HTMLContent TestCase_124() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(picture(
	            source().withSrcset("image-small.jpg").withMedia("(max-width: 600px)"),
	            img().withSrc("image-large.jpg").withAlt("A beautiful landscape")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-125")
	public HTMLContent TestCase_125() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(samp().attr("style", "color: red; font-weight: bold;").withText("Sample output: Hello, world!"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-126")
	public HTMLContent TestCase_126() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(section(
	            h2("Section Title"),
	            p("This is the content of the section.")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-127")
	public HTMLContent TestCase_127() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            p("This is a paragraph inside the slot."),
	            slot().withText("This is the default content.")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-128")
	public HTMLContent TestCase_128() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(tbody(
	            tr(td("Row 1, Column 1"), td("Row 1, Column 2")),
	            tr(td("Row 2, Column 1"), td("Row 2, Column 2"))
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-129")
	public HTMLContent TestCase_129() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(tfoot(
	            tr(
	                    td("Total:").attr("colspan", "2")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-130")
	public HTMLContent TestCase_130() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(thead(
	            tr(
	                    th("Name"),
	                    th("Age"),
	                    th("Email")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-131")
	public HTMLContent TestCase_131() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(object(
	            param().withName("autoplay").withValue("true"),
	            param().withName("loop").withValue("false")
	        )
	        .withType("application/x-shockwave-flash")
	        .withData("example.swf"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-132")
	public HTMLContent TestCase_132() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(video(
	            source().withSrc("movie.mp4").withType("video/mp4"),
	            source().withSrc("movie.webm").withType("video/webm")
	        )
	        .attr("controls", "controls"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-133")
	public HTMLContent TestCase_133() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
	            head(
	                    title("Example Page")
	                ),
	                body(
	                    h1("Main Content"),
	                    p("This is the main content of the page."),
	                    aside(
	                        h2("Related Information"),
	                        p("This is some related information."),
	                        p("It's not directly part of the main content but provides additional context.")
	                    )
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-134")
	public HTMLContent TestCase_134() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
	            head(
	                    title("Glossary")
	                ),
	                body(
	                    h1("Glossary"),
	                    p("The term "),
	                    dfn("HTML"),
	                    p(" stands for Hypertext Markup Language.")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-135")
	public HTMLContent TestCase_135() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(dialog(
	            h2("Welcome!"),
	            p("This is a dialog box."),
	            button("Close").attr("onclick", "closeDialog()")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-136")
	public HTMLContent TestCase_136() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(iframe()
	            .withSrc("https://www.example.com")
	            .attr("width", "800")
	            .attr("height", "600")
	            .attr("title", "Embedded Content")
	            .attr("frameborder", "0")
	            .attr("allowfullscreen", "")
	            .attr("sandbox", "allow-scripts allow-same-origin")
	            .withText("Your browser does not support iframes."));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-137")
	public HTMLContent TestCase_137() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Username:"),
	            input().withType("text").withName("username"),
	            br(),
	            label("Password:"),
	            input().withType("password").withName("password"),
	            br(),
	            button("Submit").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-138")
	public HTMLContent TestCase_138() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(table(
	            tr(
	                    th("Name"),
	                    th("Age"),
	                    th("Country")
	                ),
	                tr(
	                    td("John"),
	                    td("30"),
	                    td("USA")
	                ),
	                tr(
	                    td("Emily"),
	                    td("25"),
	                    td("Canada")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-139")
	public HTMLContent TestCase_139() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(a("Visit our website").withHref("https://www.example.com"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-140")
	public HTMLContent TestCase_140() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ol(
	            li("Item 1").withAccesskey("Key 1"),
	            li("Item 2").withDir("theDir"),
	            li("Item 3")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-141")
	public HTMLContent TestCase_141() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img().withSrc("image.jpg").withAlt("Image").isContenteditable());
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-142")
	public HTMLContent TestCase_142() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(audio().withSrc("audio.mp3").attr("controls", "").withIs("theLS"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-143")
	public HTMLContent TestCase_143() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(video().withSrc("video.mp4").attr("controls", "").withCondHidden(false));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-144")
	public HTMLContent TestCase_144() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(tag("svg")
	            .attr("width", "100")
	            .attr("height", "100")
	            .with(
	                tag("circle")
	                    .attr("cx", "50")
	                    .attr("cy", "50")
	                    .attr("r", "40")
	                    .attr("fill", "red")
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-145")
	public HTMLContent TestCase_145() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(meter().withValue("75").withMin("0").withMax("100").withHigh("90"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-146")
	public HTMLContent TestCase_146() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(details(
	            summary("More Information"),
	            p("Additional details...")
	        ).attr("open", ""));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-147")
	public HTMLContent TestCase_147() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(blockquote(
	            p("This is a quote."),
	            cite("John Doe")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-148")
	public HTMLContent TestCase_148() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert( p("Use the ")
                .with(code("System.out.println()")));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-149")
	public HTMLContent TestCase_149() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p("This is ")
                .with(small("small text")));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-150")
	public HTMLContent TestCase_150() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(p("H2")
                .with(sub("O")));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-151")
	public HTMLContent TestCase_151() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(table(
	            thead(
	                    tr(
	                        th("Name"),
	                        th("Age"),
	                        th("Country")
	                    )
	                ),
	                tbody(
	                    tr(
	                        td("John"),
	                        td("30"),
	                        td("USA")
	                    ),
	                    tr(
	                        td("Emily"),
	                        td("25"),
	                        td("Canada")
	                    )
	                ),
	                tfoot(
	                    tr(
	                        td("Total").withColspan("3")
	                    )
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-152")
	public HTMLContent TestCase_152() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Name:"),
	            input().withType("text").withName("name"),
	            br(),
	            label("Gender:"),
	            input().withType("radio").withName("gender").withValue("male").isChecked(),
	            label("Male"),
	            input().withType("radio").withName("gender").withValue("female"),
	            label("Female"),
	            br(),
	            label("Interests:"),
	            input().withType("checkbox").withName("interests").withValue("coding"),
	            label("Coding"),
	            input().withType("checkbox").withName("interests").withValue("reading"),
	            label("Reading"),
	            br(),
	            button("Submit").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-153")
	public HTMLContent TestCase_153() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(select(
	            option("Option 1"),
	            option("Option 2"),
	            option("Option 3")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-154")
	public HTMLContent TestCase_154() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(details(
	            summary("Main Details"),
	            p("Additional details..."),
	            details(
	                summary("Nested Details"),
	                p("More details...")
	            )
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-155")
	public HTMLContent TestCase_155() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(figure(
	            img().withSrc("image.jpg").withAlt("Image"),
	            figcaption("Image caption")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-156")
	public HTMLContent TestCase_156() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(article(
	            header(h1("Article Title")),
	            p("Main content of the article..."),
	            footer("© 2024 Example Company")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-157")
	public HTMLContent TestCase_157() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(details(
	            summary("Load Content"),
	            p("Click the summary to load content...")
	        ).attr("onclick", "loadContent()"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-158")
	public HTMLContent TestCase_158() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(header(
	            nav(
	                    a("Home").withHref("#"),
	                    a("About").withHref("#"),
	                    a("Contact").withHref("#")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-159")
	public HTMLContent TestCase_159() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(section(
	            h2("Section 1"),
	            p("Content of section 1..."),
	            section(
	                h3("Subsection 1.1"),
	                p("Content of subsection 1.1...")
	            ),
	            h2("Section 2"),
	            p("Content of section 2...")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-160")
	public HTMLContent TestCase_160() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(footer(
	            p("© 2024 Example Company")
		        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-161")
	public HTMLContent TestCase_161() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(img()
	            .withSrc("image.jpg")
	            .withAlt("Responsive Image")
	            .attr("srcset", "image.jpg 1024w, image-mobile.jpg 480w")
	            .attr("sizes", "(max-width: 480px) 100vw, 50vw"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-162")
	public HTMLContent TestCase_162() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(iframe()
	            .withSrc("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12455.650499927146!2d-0.14123153355180514!3d51.50103573310335!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4876055c84e3e455%3A0x4aef301801cd6d0!2sBuckingham+Palace!5e0!3m2!1sen!2suk!4v1569491572615!5m2!1sen!2suk")
	            .withWidth("600")
	            .withHeight("450"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-163")
	public HTMLContent TestCase_163() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(button("Click Me").withClass("btn btn-primary"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-164")
	public HTMLContent TestCase_164() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            span("This is an alert message.").withClass("alert alert-info")
		        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-165")
	public HTMLContent TestCase_165() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(video()
	            .withSrc("video.mp4")
	            .withSrc("video.webm")
	            .attr("controls", ""));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-166")
	public HTMLContent TestCase_166() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(nav(
	            a("Home").withHref("#"),
	            div(
	                a("Dropdown").withClass("dropdown-toggle").attr("data-toggle", "dropdown"),
	                div(
	                    a("Link 1").withClass("dropdown-item").withHref("#"),
	                    a("Link 2").withClass("dropdown-item").withHref("#")
	                ).withClass("dropdown-menu")
	            ).withClass("dropdown")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-167")
	public HTMLContent TestCase_167() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(nav(
	            ul(
	                    li(a("Home").withHref("#")),
	                    li(
	                        a("Services").withHref("#"),
	                        ul(
	                            li(a("Service 1").withHref("#")),
	                            li(a("Service 2").withHref("#")),
	                            li(a("Service 3").withHref("#"))
	                        )
	                    ),
	                    li(a("About").withHref("#")),
	                    li(a("Contact").withHref("#"))
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-168")
	public HTMLContent TestCase_168() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div(
	                    img().withSrc("image1.jpg").withClass("d-block w-100"),
	                    img().withSrc("image2.jpg").withClass("d-block w-100"),
	                    img().withSrc("image3.jpg").withClass("d-block w-100")
	                ).withClass("carousel-inner"),
	                a().withClass("carousel-control-prev").withHref("#carouselExample").withRel("button"),
	                span().withClass("carousel-control-prev-icon").withCondHidden(true),
	                a().withClass("carousel-control-next").withHref("#carouselExample").withRel("button"),
	                span().withClass("carousel-control-next-icon").withCondHidden(true)
	            ).withClass("carousel slide").withId("carouselExample").attr("data-ride", "carousel"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-169")
	public HTMLContent TestCase_169() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div(
	                    div(
	                        h3("Title 1"),
	                        p("Content 1")
	                    ).withClass("timeline-panel"),
	                    div().withClass("timeline-badge"),
	                    div().withClass("clearfix")
	                ).withClass("timeline-item"),
	                div(
	                    div(
	                        h3("Title 2"),
	                        p("Content 2")
	                    ).withClass("timeline-panel"),
	                    div().withClass("timeline-badge"),
	                    div().withClass("clearfix")
	                ).withClass("timeline-item")
	            ).withClass("timeline"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-170")
	public HTMLContent TestCase_170() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div(
	                    div(
	                        h4("Modal Title").withClass("modal-title"),
	                        button("&times;").withType("button").withClass("close").attr("data-dismiss", "modal")
	                    ).withClass("modal-header"),
	                    div(
	                        p("Modal content goes here...")
	                    ).withClass("modal-body"),
	                    div(
	                        button("Close").withType("button").withClass("btn btn-secondary").attr("data-dismiss", "modal")
	                    ).withClass("modal-footer")
	                ).withClass("modal-content")
	            ).withClass("modal-dialog").withDir("document"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-171")
	public HTMLContent TestCase_171() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            div(
	                    h5("Accordion Heading 1").withClass("mb-0"),
	                    button("&plus;").withType("button").withClass("btn btn-link").attr("data-toggle", "collapse").attr("data-target", "#collapse1"),
	                    div(
	                        p("Accordion Content 1")
	                    ).withClass("collapse").withId("collapse1")
	                ).withClass("card"),
	                div(
	                    div(
	                        h5("Accordion Heading 2").withClass("mb-0"),
	                        button("&plus;").withType("button").withClass("btn btn-link").attr("data-toggle", "collapse").attr("data-target", "#collapse2"),
	                        div(
	                            p("Accordion Content 2")
	                        ).withClass("collapse").withId("collapse2")
	                    ).withClass("card")
	                ).withClass("card")
	            ).withClass("accordion"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-172")
	public HTMLContent TestCase_172() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            img().withSrc("product-image.jpg").withClass("card-img-top"),
	            div(
	                h5("Product Title").withClass("card-title"),
	                p("Product Description").withClass("card-text"),
	                a("Buy Now").withClass("btn btn-primary").withHref("#")
	            ).withClass("card-body")
	        ).withClass("card"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-173")
	public HTMLContent TestCase_173() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(ul(
	            li("Item 1").withClass("list-group-item"),
	            li("Item 2").withClass("list-group-item"),
	            li("Item 3").withClass("list-group-item")
	        ).withClass("list-group"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-174")
	public HTMLContent TestCase_174() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(nav(
	            ul(
	                    li(a("1").withHref("#")).withClass("page-item active"),
	                    li(a("2").withHref("#")).withClass("page-item"),
	                    li(a("3").withHref("#")).withClass("page-item"),
	                    li(a("&raquo;").withHref("#")).withClass("page-item")
	                ).withClass("pagination")
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-175")
	public HTMLContent TestCase_175() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            strong("Alert!"),
	            p("This is an alert message.").withClass("alert alert-warning").attr("role", "alert")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-176")
	public HTMLContent TestCase_176() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Email:"),
	            input().withType("email").withName("email"),
	            button("Subscribe").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-177")
	public HTMLContent TestCase_177() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Username:"),
	            input().withType("text").withName("username"),
	            label("Password:"),
	            input().withType("password").withName("password"),
	            button("Login").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-178")
	public HTMLContent TestCase_178() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Username:"),
	            input().withType("text").withName("username"),
	            label("Email:"),
	            input().withType("email").withName("email"),
	            label("Password:"),
	            input().withType("password").withName("password"),
	            button("Register").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-179")
	public HTMLContent TestCase_179() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Name:"),
	            input().withType("text").withName("name"),
	            label("Email:"),
	            input().withType("email").withName("email"),
	            label("Message:"),
	            textarea().withName("message"),
	            button("Send Message").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-180")
	public HTMLContent TestCase_180() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            input().withType("text").withPlaceholder("Search..."),
	            button("Search").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-181")
	public HTMLContent TestCase_181() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            input().withType("text").withClass("form-control").attr("id", "datepicker")
		        ).withClass("input-group date").attr("data-provide", "datepicker"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-182")
	public HTMLContent TestCase_182() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Select file:"),
	            input().withType("file").withName("file"),
	            button("Upload").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-183")
	public HTMLContent TestCase_183() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Name:"),
	            input().withType("text").withName("name"),
	            label("Email:"),
	            input().withType("email").withName("email"),
	            button("Subscribe").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-184")
	public HTMLContent TestCase_184() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Card Number:"),
	            input().withType("text").withName("cardNumber"),
	            label("Expiry Date:"),
	            input().withType("text").withName("expiryDate"),
	            label("CVV:"),
	            input().withType("password").withName("cvv"),
	            button("Pay Now").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-185")
	public HTMLContent TestCase_185() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Feedback:"),
	            textarea().withName("feedback"),
	            label("Rating:"),
	            input().withType("range").withName("rating").withMin("1").withMax("5").withStep("1"),
	            button("Submit").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-186")
	public HTMLContent TestCase_186() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Full Name:"),
	            input().withType("text").withName("fullName"),
	            label("Email:"),
	            input().withType("email").withName("email"),
	            label("Bio:"),
	            textarea().withName("bio"),
	            button("Update Profile").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-187")
	public HTMLContent TestCase_187() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Email:"),
	            input().withType("email").withName("email"),
	            button("Reset Password").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-188")
	public HTMLContent TestCase_188() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Review Title:"),
	            input().withType("text").withName("title"),
	            label("Your Review:"),
	            textarea().withName("review"),
	            label("Rating:"),
	            input().withType("range").withName("rating").withMin("1").withMax("5").withStep("1"),
	            button("Submit Review").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-189")
	public HTMLContent TestCase_189() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Name:"),
	            input().withType("text").withName("name"),
	            label("Age:"),
	            input().withType("number").withName("age"),
	            label("Gender:"),
	            select(
	                option("Male"),
	                option("Female"),
	                option("Other")
	            ).withName("gender"),
	            label("Comments:"),
	            textarea().withName("comments"),
	            button("Submit").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-190")
	public HTMLContent TestCase_190() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(form(
	            label("Question 1: What is the capital of France?"),
	            input().withType("radio").withName("q1").withValue("paris"),
	            label("Paris"),
	            input().withType("radio").withName("q1").withValue("london"),
	            label("London"),
	            input().withType("radio").withName("q1").withValue("berlin"),
	            label("Berlin"),
	            label("Question 2: What is 2 + 2?"),
	            input().withType("radio").withName("q2").withValue("3"),
	            label("3"),
	            input().withType("radio").withName("q2").withValue("4"),
	            label("4"),
	            input().withType("radio").withName("q2").withValue("5"),
	            label("5"),
	            button("Submit").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-191")
	public HTMLContent TestCase_191() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            h3("Today's Weather"),
	            p("Temperature: 25°C"),
	            p("Condition: Sunny")
	        ).withClass("weather-widget"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-192")
	public HTMLContent TestCase_192() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            h2("Countdown Timer"),
	            p("Time remaining: "),
	            span("10:00").withId("timer")
	        ).withClass("countdown-timer"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-193")
	public HTMLContent TestCase_193() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            h3("Pasta Carbonara"),
	            p("Ingredients: Spaghetti, eggs, bacon, parmesan cheese"),
	            p("Instructions: Boil spaghetti, fry bacon, mix with eggs and cheese, serve hot")
	        ).withClass("recipe-card"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-194")
	public HTMLContent TestCase_194() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(iframe().withSrc("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12455.650499927146!2d-0.14123153355180514!3d51.50103573310335!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4876055c84e3e455%3A0x4aef301801cd6d0!2sBuckingham+Palace!5e0!3m2!1sen!2suk!4v1569491572615!5m2!1sen!2suk")
	            .withWidth("600")
	            .withHeight("450"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-195")
	public HTMLContent TestCase_195() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(div(
	            h3("Chat"),
	            div(
	                p("User 1: Hi, how are you?"),
	                p("User 2: I'm good, thanks!")
	            ).withClass("chat-messages"),
	            input().withType("text").withPlaceholder("Type your message..."),
	            button("Send").withType("submit")
	        ).withClass("chat-widget"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-196")
	public HTMLContent TestCase_196() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert( html(
                head(
                        title("Example Page"),
                        base().withHref("https://example.com/")
                    ),
                    body(
                        p("This is an example page with a base URL set.")
                    )
                ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-197")
	public HTMLContent TestCase_197() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert( table(
	            colgroup(
	                    col().attr("span", "2"), // Set the span attribute
	                    col().withDir("sample-dir") , // Set the width attribute
	                    col().withClass("highlight") // Set the class attribute
	                ),
	                tr(
	                    td("Cell 1"),
	                    td("Cell 2")
	                ),
	                tr(
	                    td("Cell 3"),
	                    td("Cell 4")
	                )
	            ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-198")
	public HTMLContent TestCase_198() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert( form(
	            label("Username:"),
	            input().withType("text").withName("username").isRequired(),
	            label("Password:"),
	            input().withType("password").withName("password").isRequired(),
	            label("Email:"),
	            input().withType("email").withName("email").isRequired(),
	            label("Date of Birth:"),
	            input().withType("date").withName("dob"),
	            label("Favorite Color:"),
	            input().withType("color").withName("color"),
	            button("Submit").withType("submit")
	        ));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-199")
	public HTMLContent TestCase_199() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(audio().isControls().withSrc("audio.mp3"));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/testCase-200")
	public HTMLContent TestCase_200() {
		HTMLContent theContent = new HTMLContent();
		J2HTMLBase e1 = new J2HTMLBase();
		String returnedContent = e1.htmlConvert(html(
                head(
                        title("Comprehensive Example"),
                        meta().withCharset("UTF-8"),
                        meta().withName("viewport").withContent("width=device-width, initial-scale=1.0"),
                        link().withRel("stylesheet").withHref("styles.css")
                    ),
                    body(
                        header(
                            h1("Welcome to our Website"),
                            nav(
                                ul(
                                    li(a("Home").withHref("/")),
                                    li(a("About Us").withHref("/about")),
                                    li(a("Services").withHref("/services")),
                                    li(a("Contact").withHref("/contact"))
                                )
                            )
                        ))));
		theContent.setContent(returnedContent);
		return theContent;
	}
	
	@GetMapping(value = "/headingParagraph")
	public HTMLContent getHeadingwithParagraph(@RequestParam String heading, String paragraph) {
		HTMLContent headingParagraph = new HTMLContent();
		J2HTMLBase hp = new J2HTMLBase();
		String actual = hp.htmlConvert(html(
				head(
						title("Heading with Paragraph")),
				body(
						h1(heading),
						p(paragraph))));
		headingParagraph.setContent(actual);
		return headingParagraph;
	}
	
	@GetMapping(value = "/headingWithParagraphAndId")
	public HTMLContent getHeadingwithParagraphandId(@RequestParam Integer Id, @RequestParam String heading, @RequestParam String paragraph) {
		HTMLContent headingParagraph = new HTMLContent();
		J2HTMLBase hp = new J2HTMLBase();
		String actual = hp.htmlConvert(html(
				head(
						title("Heading with Paragraph and Id")),
				body(
						h1(heading),
                        p(paragraph),
                        p("Id: " + Id))));
		headingParagraph.setContent(actual);
		return headingParagraph;
	}
	
	@GetMapping(value = "/headingWithAnchor")
	public HTMLContent getHeadingwithAnchor(@RequestParam String anchorText, @RequestParam String anchorUrl, @RequestParam String heading) {
		HTMLContent headingParagraph = new HTMLContent();
		J2HTMLBase hp = new J2HTMLBase();
		
		ContainerTag anchorTag = a().withHref(anchorUrl).withText(anchorText);
		String actual = hp.htmlConvert(html(
				head(
						title("Heading with Anchor")),
				body(
						h1(heading),
                        p("Paragraph with an achor: ").with(anchorTag))));
		headingParagraph.setContent(actual);
		return headingParagraph;
	}
	
	@GetMapping(value = "/headingWithAnchorAndId")
	public HTMLContent getHeadingwithAnchorandId(@RequestParam String anchorText, @RequestParam String anchorUrl, @RequestParam String heading, @RequestParam String Id) {
		HTMLContent headingParagraph = new HTMLContent();
		J2HTMLBase hp = new J2HTMLBase();
		
		ContainerTag anchorTag = a().withHref(anchorUrl).withText(anchorText).withId(Id);
		String actual = hp.htmlConvert(html(
				head(
						title("Heading with Anchor")),
				body(
						h1(heading),
                        p("Paragraph with an achor: ").with(anchorTag))));
		headingParagraph.setContent(actual);
		return headingParagraph;
	}
	
	@GetMapping(value = "/headingWithParagraphAnchorAndId")
	public HTMLContent getHeadingwithParagraphandAnchorandId(@RequestParam String anchorText, @RequestParam String anchorUrl, @RequestParam String heading, @RequestParam String Id, @RequestParam String paragraph) {
		HTMLContent headingParagraph = new HTMLContent();
		J2HTMLBase hp = new J2HTMLBase();
		
		ContainerTag anchorTag = a().withHref(anchorUrl).withText(anchorText).withId(Id);
		String actual = hp.htmlConvert(html(
				head(
						title("Heading with Anchor")),
				body(
						h1(heading),
						p(paragraph),
                        p("Paragraph with an achor: ").with(anchorTag))));
		headingParagraph.setContent(actual);
		return headingParagraph;
	}
	
}