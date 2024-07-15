package com.sdetadda.allure;
import java.text.SimpleDateFormat;

import io.restassured.response.Response;

import org.testng.annotations.Test;

import net.datafaker.Faker;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class RestAssuredTestCases {
	Faker faker = new Faker();
	@Test
	void test_01() {
		Faker faker = new Faker();
		String name = faker.name().firstName() + " " + faker.name().lastName();
		String airCraft = faker.aviation().aircraft();
		given().get("http://localhost:8080/testCase-01?name=" + name + "&airCraft=" + airCraft).then().body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><p id=\"p\" class=\"content\">Heading!</p><table><tr><td>The Name: " + name + "</td>" + "<td>The Aircraft: " + airCraft + "</td></tr></table></body></html>"));
		
	}
	
	@Test
	void test_02() {
		Faker faker = new Faker();
		String animal = faker.animal().name();
		String scientificName = faker.animal().scientificName();
		given().get("http://localhost:8080/testCase-02?animal=" + animal + "&scentificName=" + scientificName).then().body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><ul><li>" + animal + "</li><li>" + scientificName + "</li></ul></body></html>"));
		
	}
	
	@Test
    void test_03() {
		Faker faker = new Faker();
        String data1 = faker.name().fullName();
        String data2 = faker.name().lastName();
        given().get("http://localhost:8080/testCase-03?data1=" + data1 + "&data2=" + data2)
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><table><tr><td></td><td>" + data1 + "</td><td>" + data2 + "</td></tr></table></body></html>"));
    }

    @Test
    void test_04() {
    	Faker faker = new Faker();
		String animal = faker.animal().name();
        given().get("http://localhost:8080/testCase-04?animalName=" + animal)
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>" + animal + "</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><dl><dt></dt><dd></dd><dt></dt><dd></dd></dl></body></html>"));
    }

    @Test
    void test_05() {
        given().get("http://localhost:8080/testCase-05")
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><pre></pre></body></html>"));
    }

    @Test
    void test_06() {
        given().get("http://localhost:8080/testCase-06")
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><ol><li></li><li></li><li></li></ol></body></html>"));
    }

    @Test
    void test_07() {
        given().get("http://localhost:8080/testCase-07")
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><bdo></bdo></body></html>"));
    }
    
    @Test
    void test_08() {
        given().get("http://localhost:8080/testCase-08")
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><blockquote hidden></blockquote></body></html>"));
    }

    @Test
    void test_09() {
    	Faker faker = new Faker();
        String buttonText = faker.lorem().word();
        given().get("http://localhost:8080/testCase-09?buttonText=" + buttonText)
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><button type=\"submit\" style=\"background-color:pink;color:white;\">" + buttonText + "</button></body></html>"));
    }

    @Test
    void test_10() {
        given().get("http://localhost:8080/testCase-10")
                .then()
                .body("content", equalTo("<html><head id=\"head\" class=\"header-content\"><title>Title</title><link rel=\"stylesheet\" href=\"/css/main.css\"></head><body><input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Enter your email\" value=\"\" required><input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password\" value=\"password123\" required></body></html>"));
    }
    
    @Test
    void test_11() {
        given().get("http://localhost:8080/testCase-11")
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" alt=\"\">"));
    }

    @Test
    void test_12() {
        String userScript = "User Script Content";
        given().get("http://localhost:8080/testCase-12?userScript=" + userScript)
                .then()
                .body("content", equalTo("<p>" + userScript + "</p>"));
    }

    @Test
    void test_13() {
    	Faker faker = new Faker();
        String name = faker.name().fullName();
        given().get("http://localhost:8080/testCase-13?name=" + name)
                .then()
                .body("content", equalTo("<p>Hello, " + name + "!</p>"));
    }

    @Test
    void test_14() {
        given().get("http://localhost:8080/testCase-14")
                .then()
                .body("content", equalTo("<div class=\"invalid\"></div>"));
    }

    @Test
    void test_15() {
    	Faker faker = new Faker();
        String title = faker.book().title();
        String para1 = faker.lorem().paragraph(1);
        String para2 = faker.lorem().paragraph(1);
        given().get("http://localhost:8080/testCase-15?title=" + title + "&para1=" + para1 + "&para2=" + para2)
                .then()
                .body("content", equalTo("<div><h1>" + title + "</h1><p>" + para1 + "</p><p>" + para2 + "</p></div>"));
    }

    @Test
    void test_16() {
    	Faker faker = new Faker();
        String dynamicClass = faker.lorem().word();
        String sampleText = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-16?dynamicClass=" + dynamicClass + "&sampleText=" + sampleText)
                .then()
                .body("content", equalTo("<div class=\"" + dynamicClass + "\">" + sampleText + "</div>"));
    }

    @Test
    void test_17() {
        given().get("http://localhost:8080/testCase-17")
                .then()
                .body("content", equalTo("<div>Condition true with </div>"));
    }

    @Test
    void test_18() {
    	Faker faker = new Faker();
        String sampleText1 = faker.lorem().sentence();
        String sampleText2 = faker.lorem().sentence();
        String sampleText3 = faker.lorem().sentence();
        String sampleText4 = faker.lorem().sentence();
        String sampleText5 = faker.lorem().sentence();
        String sampleText6 = faker.lorem().sentence();
        String sampleText7 = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-18?sampleText1=" + sampleText1 + "&sampleText2=" + sampleText2 + "&sampleText3=" + sampleText3 + "&sampleText4=" + sampleText4 + "&sampleText5=" + sampleText5 + "&sampleText6=" + sampleText6 + "&sampleText7=" + sampleText7)
                .then()
                .body("content", equalTo("<div class=\"header\"><img src=\"proDep.png\" alt=\"ProDep\"><div class=\"header-right\"><a href=\"The Home Page.html\">" + sampleText1 + "</a><a href=\"Components.html\">" + sampleText2 + "</a><a class=\"active\" href=\"#\">" + sampleText3 + "</a><a href=\"Documents.html\">" + sampleText4 + "</a><a href=\"Presentations.html\">" + sampleText5 + "</a><a href=\"About.html\">" + sampleText6 + "</a><a href=\"Contact Us.html\">" + sampleText7 + "</a></div></div>"));
    }

    @Test
    void test_19() {
        given().get("http://localhost:8080/testCase-19")
                .then()
                .body("content", equalTo("<div class=\"row\"><div class=\"column\"></div><div class=\"column\"><a href=\"sampleHref1\" target=\"_blank\"><img src=\"Documents/log books.png\" alt=\"log books\" style=\"width:70%\"></a></div><div class=\"column\"><a href=\"sampleHref2\" target=\"_blank\"><img src=\"Documents/final reports.png\" alt=\"final reports\" style=\"width:70%\"></a></div><div class=\"column\"></div></div>"));
    }

    @Test
    void test_20() {
    	Faker faker = new Faker();
        String sampleText1 = faker.lorem().sentence();
        String sampleText2 = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-20?sampleText1=" + sampleText1 + "&sampleText2=" + sampleText2)
                .then()
                .body("content", equalTo("<div>" + sampleText1 + " " + sampleText2 + "</div>"));
    }
    
    @Test
    void test_21() {
        given().get("http://localhost:8080/testCase-21")
                .then()
                .body("content", equalTo("<div class=\"sampleClass\"></div>"));
    }

    @Test
    void test_22() {
        given().get("http://localhost:8080/testCase-22")
                .then()
                .body("content", equalTo("<div id=\"sampleId\"></div>"));
    }

    @Test
    void test_23() {
    	Faker faker = new Faker();
        String sampleAText = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-23?sampleAText=" + sampleAText)
                .then()
                .body("content", equalTo("<a href=\"https://example.com\">" + sampleAText + "</a>"));
    }

    @Test
    void test_24() {
        given().get("http://localhost:8080/testCase-24")
                .then()
                .body("content", equalTo("<img src=\"sampleImage\">"));
    }

    @Test
    void test_25() {
    	Faker faker = new Faker();
        String sampleParagraph = faker.lorem().paragraph();
        given().get("http://localhost:8080/testCase-25?sampleParagraph=" + sampleParagraph)
                .then()
                .body("content", equalTo("<p style=\"color:red;\">" + sampleParagraph + "</p>"));
    }

    @Test
    void test_26() {
    	Faker faker = new Faker();
        String item1 = faker.lorem().sentence();
        String item2 = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-26?item1=" + item1 + "&item2=" + item2)
                .then()
                .body("content", equalTo("<ol><li>" + item1 + "</li><li>" + item2 + "</li></ol>"));
    }

    @Test
    void test_27() {
    	Faker faker = new Faker();
        String item1 = faker.lorem().sentence();
        String item2 = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-27?item1=" + item1 + "&item2=" + item2)
                .then()
                .body("content", equalTo("<ul><li>" + item1 + "</li><li>" + item2 + "</li></ul>"));
    }

    @Test
    void test_28() {
    	Faker faker = new Faker();
        String sampleHeading = faker.lorem().sentence();
        String paragraph = faker.lorem().paragraph();
        String sampleItem1 = faker.vehicle().make();
        String sampleItem2 = faker.vehicle().model();
        given().get("http://localhost:8080/testCase-28?sampleHeading=" + sampleHeading + "&paragraph=" + paragraph + "&sampleItem1=" + sampleItem1 + "&sampleItem2=" + sampleItem2)
                .then()
                .body("content", equalTo("<div><h1>" + sampleHeading + "</h1><p>null</p><ul><li>" + sampleItem1 + "</li><li>" + sampleItem2 + "</li></ul></div>"));
    }

    @Test
    void test_29() {
        given().get("http://localhost:8080/testCase-29")
                .then()
                .body("content", equalTo("<div style=\"color:red; font-size:16px;\"></div>"));
    }

    @Test
    void test_30() {
    	Faker faker = new Faker();
        String sampleString = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-30?sampleString=" + sampleString)
                .then()
                .body("content", equalTo("<a href=\"#\" target=\"_blank\">" + sampleString + "</a>"));
    }
    
    @Test
    void test_31() {
    	Faker faker = new Faker();
        String sampleDescription = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-31?sampleDescription=" + sampleDescription)
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" alt=\"sampleDescription\">"));
    }

    @Test
    void test_32() {
    	Faker faker = new Faker();
        String sampleCar = faker.vehicle().model();
        given().get("http://localhost:8080/testCase-32?sampleCar=" + sampleCar)
                .then()
                .body("content", equalTo("<h2>" + sampleCar + "</h2>"));
    }

    @Test
    void test_33() {
        given().get("http://localhost:8080/testCase-33")
                .then()
                .body("content", equalTo("<form action=\"formAction\"></form>"));
    }

    @Test
    void test_34() {
    	Faker faker = new Faker();
    	String[] inputTypes = {"text", "email", "password", "number", "date"}; // Predefined list of input types
        int randomIndex = faker.random().nextInt(inputTypes.length);
        String formStuff = inputTypes[randomIndex];
        given().get("http://localhost:8080/testCase-34?formStuff=" + formStuff)
                .then()
                .body("content", equalTo("<input type=\"" + formStuff + "\" autofocus>"));
    }

    @Test
    void test_35() {
    	Faker faker = new Faker();
    	String[] inputTypes = {"Submit", "Refresh"}; // Predefined list of input types
        int randomIndex = faker.random().nextInt(inputTypes.length);
        String buttonText = inputTypes[randomIndex];
        given().get("http://localhost:8080/testCase-35?buttonText=" + buttonText)
                .then()
                .body("content", equalTo("<button type=\"" + buttonText + "\">buttonText</button>"));
    }

    @Test
    void test_36() {
    	Faker faker = new Faker();
        String sampleValue = faker.lorem().word();
        String sampleValue2 = faker.lorem().word();
        given().get("http://localhost:8080/testCase-36?sampleValue=" + sampleValue + "&sampleValue2=" + sampleValue2)
                .then()
                .body("content", equalTo("<select><option value=\"" + sampleValue + "\">Option 1</option><option value=\"" + sampleValue2 + "\">Option 2</option></select>"));
    }

    @Test
    void test_37() {
    	Faker faker = new Faker();
        String data1 = faker.name().fullName();
        String data2 = faker.internet().emailAddress();
        given().get("http://localhost:8080/testCase-37?data1=" + data1 + "&data2=" + data2)
                .then()
                .body("content", equalTo("<table><tr><th>Header 1</th><th>Header 2</th></tr><tr><td>" + data1 + "</td><td>" + data2 + "</td></tr></table>"));
    }

    @Test
    void test_38() {
    	Faker faker = new Faker();
        String sampleText = faker.lorem().word();
        given().get("http://localhost:8080/testCase-38?sampleText=" + sampleText)
                .then()
                .body("content", equalTo("<textarea>" + sampleText + "</textarea>"));
    }

    @Test
    void test_39() {
    	Faker faker = new Faker();
        String sampleBtn = faker.lorem().word();
        given().get("http://localhost:8080/testCase-39?sampleBtn=" + sampleBtn)
                .then()
                .body("content", equalTo("<button class=\"btn btn-primary\" type=\"button\" id=\"" + sampleBtn + "\">Click me</button>"));
    }

    @Test
    void test_40() {
    	Faker faker = new Faker();
        String samplePlaceholder = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-40?samplePlaceholder=" + samplePlaceholder)
                .then()
                .body("content", equalTo("<input type=\"text\" placeholder=\"" + samplePlaceholder + "\">"));
    }
    
    @Test
    void test_41() {
    	Faker faker = new Faker();
        String sampleAnchorText = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-41?sampleAnchorText=" + sampleAnchorText)
                .then()
                .body("content", equalTo("<a href=\"https://example.com\" target=\"_blank\">" + sampleAnchorText + "</a>"));
    }

    @Test
    void test_42() {
    	Faker faker = new Faker();
    	int width = faker.number().numberBetween(100, 1000);
    	int height = faker.number().numberBetween(100, 1000);
        String sampleWidth = String.valueOf(width) + "px";
        String sampleHeight = String.valueOf(height) + "px";
        given().get("http://localhost:8080/testCase-42?sampleWidth=" + sampleWidth + "&sampleHeight=" + sampleHeight)
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" alt=\"Description\" width=\"" + sampleWidth + "\" height=\"" + sampleHeight + "\">"));
    }

    @Test
    void test_43() {
    	Faker faker = new Faker();
        String sampleValue = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-43?sampleValue=" + sampleValue)
                .then()
                .body("content", equalTo("<p id=\"para1\">" + sampleValue + "</p>"));
    }

    @Test
    void test_44() {
    	Faker faker = new Faker();
        String sampleItem = faker.lorem().word();
        given().get("http://localhost:8080/testCase-44?sampleItem=" + sampleItem)
                .then()
                .body("content", equalTo("<li class=\"list-item\" style=\"color: blue;\">" + sampleItem + "</li>"));
    }

    @Test
    void test_45() {
    	Faker faker = new Faker();
        String sampleId = faker.idNumber().valid();
        String sampleHeading = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-45?sampleId=" + sampleId + "&sampleHeading=" + sampleHeading)
                .then()
                .body("content", equalTo("<h2 id=\"" + sampleId + "\" title=\"This is a subheading\">" + sampleHeading + "</h2>"));
    }

    @Test
    void test_46() {
    	Faker faker = new Faker();
        String sampleItem1 = faker.lorem().sentence();
        String sampleItem2 = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-46?sampleItem=" + sampleItem1 + "&sampleItem2=" + sampleItem2)
                .then()
                .body("content", equalTo("<tr style=\"background-color: yellow;\"><td>" + sampleItem1 + "</td><td>" + sampleItem2 + "</td></tr>"));
    }

    @Test
    void test_47() {
    	Faker faker = new Faker();
        String option1 = faker.lorem().word();
        String option2 = faker.lorem().word();
        given().get("http://localhost:8080/testCase-47?option1=" + option1 + "&option2=" + option2)
                .then()
                .body("content", equalTo("<select multiple><option value=\"" + option1 + "\"></option><option value=\"" + option2 + "\"></option></select>"));
    }

    @Test
    void test_48() {
    	Faker faker = new Faker();
        String key1 = faker.lorem().word();
        String value1 = faker.lorem().sentence();
        String key2 = faker.lorem().word();
        String value2 = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-48?key1=" + key1 + "&value1=" + value1 + "&key2=" + key2 + "&value2=" + value2)
                .then()
                .body("content", equalTo("<div data-" + key1 + "=\"" + value1 + "\" data-" + key2 + "=\"" + value2 + "\"></div>"));
    }

    @Test
    void test_49() {
        given().get("http://localhost:8080/testCase-49")
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" contenteditable=\"true\">"));
    }

    @Test
    void test_50() {
        given().get("http://localhost:8080/testCase-50")
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" translate=\"no\">"));
    }
    
    @Test
    void test_51() {
        given().get("http://localhost:8080/testCase-51")
                .then()
                .body("content", equalTo("<track src=\"subtitles_en.vtt\" kind=\"subtitles\" label=\"English\">"));
    }

    @Test
    void test_52() {
    	Faker faker = new Faker();
    	int width = faker.number().numberBetween(100, 1000);
    	int height = faker.number().numberBetween(100, 1000);
        String width1 = String.valueOf(width) + "px";
        String height1 = String.valueOf(height) + "px";
        given().get("http://localhost:8080/testCase-52?width=" + width1 + "&height=" + height1)
                .then()
                .body("content", equalTo("<div style=\"width: " + width1 + ";height: " + height1 + "\"></div>"));
    }

    @Test
    void test_53() {
    	Faker faker = new Faker();
        String article = faker.book().title();
        String description = faker.lorem().paragraph();
        given().get("http://localhost:8080/testCase-53?article=" + article + "&description=" + description)
                .then()
                .body("content", equalTo("<article><h1>" + article + "</h1><p>" + description + "</p></article>"));
    }

    @Test
    void test_54() {
    	Faker faker = new Faker();
        String message = faker.lorem().paragraph();
        given().get("http://localhost:8080/testCase-54?message=" + message)
                .then()
                .body("content", equalTo("<header><h1>Page Header</h1><p>" + message + "</p></header>"));
    }

    @Test
    void test_55() {
    	Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        given().get("http://localhost:8080/testCase-55?email=" + email)
                .then()
                .body("content", equalTo("<footer><p>Copyright © 2024. All rights reserved.</p><p>Contact: " + email + "</p></footer>"));
    }

    @Test
    void test_56() {
    	Faker faker = new Faker();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(faker.date().birthday());
        given().get("http://localhost:8080/testCase-56?date=" + date)
                .then()
                .body("content", equalTo("<time datetime=\"" + date + "\"></time>"));
    }

    @Test
    void test_57() {
        given().get("http://localhost:8080/testCase-57")
                .then()
                .body("content", equalTo("<em>Emphasized text</em>"));
    }

    @Test
    void test_58() {
    	Faker faker = new Faker();
        String number1 = faker.number().digits(1);
        String number2 = faker.number().digits(1);
        String number3 = faker.number().digits(1);
        given().get("http://localhost:8080/testCase-58?number1=" + number1 + "&number2=" + number2 + "&number3=" + number3)
                .then()
                .body("content", equalTo("<select name=\"options\"><option value=\"" + number1 + "\">Option 1</option><option value=\"" + number2 + "\" selected>Option 2</option><option value=\"" + number3 + "\">Option 3</option></select>"));
    }

    @Test
    void test_59() {
        String color1 = "red";
        String color2 = "blue";
        given().get("http://localhost:8080/testCase-59?color1=" + color1 + "&color2=" + color2)
                .then()
                .body("content", equalTo("<div class=\"outer-div\"><div class=\"inner-div\" style=\"color:" + color1 + ";\">Inner div 1</div><div class=\"inner-div\" style=\"color:" + color2 + ";\">Inner div 2</div></div>"));
    }

    @Test
    void test_60() {
    	Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();
        given().get("http://localhost:8080/testCase-60?name=" + name + "&email=" + email)
                .then()
                .body("content", equalTo("<form><fieldset><legend>Contact Information</legend><label>Name:<input type=\"text\" name=\"" + name + "\"></label><label>Email:<input type=\"email\" name=\"" + email + "\"></label></fieldset></form>"));
    }

    @Test
    void test_61() {
        given().get("http://localhost:8080/testCase-61")
                .then()
                .body("content", equalTo("<div class=\"grid-container\"><div class=\"column\">Column 1</div><div class=\"column\">Column 2</div><div class=\"column\">Column 3</div></div>"));
    }

    @Test
    void test_62() {
    	Faker faker = new Faker();
        String option1 = faker.lorem().word();
        String option2 = faker.lorem().word();
        String option3 = faker.lorem().word();
        String option4 = faker.lorem().word();
        given().get("http://localhost:8080/testCase-62?option1=" + option1 + "&option2=" + option2 + "&option3=" + option3 + "&option4=" + option4)
                .then()
                .body("content", equalTo("<select><optgroup><label>Group 1</label><option>" + option1 + "</option><option>" + option2 + "</option></optgroup><optgroup><label>Group 2</label><option>" + option3 + "</option><option>" + option4 + "</option></optgroup></select>"));
    }

    @Test
    void test_63() {
        given().get("http://localhost:8080/testCase-63")
                .then()
                .body("content", equalTo("<nav><ul><li><a href=\"/home\">Home</a></li><li><a href=\"/about\">About</a></li><li><a href=\"/contact\">Contact</a></li></ul></nav>"));
    }

    @Test
    void test_64() {
    	Faker faker = new Faker();
        String imgName = faker.lorem().word() + ".jpg";
        String imgCaption = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-64?imgName=" + imgName + "&imgCaption=" + imgCaption)
                .then()
                .body("content", equalTo("<figure><img src=\"image.jpg\" alt=\"" + imgName + "\"><figcaption>" + imgCaption + "</figcaption></figure>"));
    }

    @Test
    void test_65() {
    	Faker faker = new Faker();
        int valueInt =  faker.number().numberBetween(0, 50);
        given().get("http://localhost:8080/testCase-65?value=" + String.valueOf(valueInt))
                .then()
                .body("content", equalTo("<progress value=\"" + String.valueOf(valueInt) + "\" max=\"100\"></progress>"));
    }

    @Test
    void test_66() {
    	Faker faker = new Faker();
        String article = faker.book().title();
        String articleContent = faker.lorem().paragraph();
        String webSite = faker.internet().url();
        String author = faker.name().fullName();
        given().get("http://localhost:8080/testCase-66?article=" + article + "&articleContent=" + articleContent + "&webSite=" + webSite + "&author=" + author)
                .then()
                .body("content", equalTo("<article><h2>" + article + "</h2><p>" + articleContent + "</p><address><p>Written by " + author + "</p><p>" + webSite + "</p></address></article>"));
    }

    @Test
    void test_67() {
        given().get("http://localhost:8080/testCase-67")
                .then()
                .body("content", equalTo("<dialog><p>This is a dialog box.</p><button onclick=\"this.parentElement.close()\">Close</button></dialog>"));
    }

    @Test
    void test_68() {
    	Faker faker = new Faker();
        String message = faker.lorem().paragraph();
        given().get("http://localhost:8080/testCase-68?message=" + message)
                .then()
                .body("content", equalTo("<details><summary>Click to expand</summary><p>" + message + "</p></details>"));
    }

    @Test
    void test_69() {
    	Faker faker = new Faker();
        String item1 = faker.lorem().word();
        String item2 = faker.lorem().word();
        String item3 = faker.lorem().word();
        String item4 = faker.lorem().word();
        String item5 = faker.lorem().word();
        given().get("http://localhost:8080/testCase-69?item1=" + item1 + "&item2=" + item2 + "&item3=" + item3 + "&item4=" + item4 + "&item5=" + item5)
                .then()
                .body("content", equalTo("<div><div class=\"grid-item\">" + item1 + "</div><div class=\"grid-item\">" + item2 + "</div><div class=\"grid-item\">" + item3 + "</div><div class=\"grid-item\">" + item4 + "</div><div class=\"grid-item\">" + item5 + "</div></div>"));
    }

    @Test
    void test_70() {
    	Faker faker = new Faker();
        String movieName = faker.book().title();
        given().get("http://localhost:8080/testCase-70?movieName=" + movieName)
                .then()
                .body("content", equalTo("<video src=\"" + movieName + ".mp4\" dir=\"Sample Directory\"></video>"));
    }
    
    @Test
    void test_71() {
    	Faker faker = new Faker();
        String user1 = faker.name().fullName();
        String user2 = faker.name().fullName();
        given().get("http://localhost:8080/testCase-71?user1=" + user1 + "&user2=" + user2)
                .then()
                .body("content", equalTo("<ul><li>User 1: Hi " + user1 + "</li><li>User 2: Hello! " + user2 + "</li></ul>"));
    }

    @Test
    void test_72() {
    	Faker faker = new Faker();
        int widthInt = faker.number().numberBetween(0, 400);
        int heightInt = faker.number().numberBetween(0, 200);
        
        String width = String.valueOf(widthInt);
        String height = String.valueOf(heightInt);
        given().get("http://localhost:8080/testCase-72?width=" + width + "&height=" + height)
                .then()
                .body("content", equalTo("<canvas width=\"" + width + "\" height=\"" + height + "\"></canvas>"));
    }

    @Test
    void test_73() {
    	Faker faker = new Faker();
        String author = faker.name().fullName();
        given().get("http://localhost:8080/testCase-73?author=" + author)
                .then()
                .body("content", equalTo("<blockquote><p>This is a quote.</p><footer>Author: " + author + "</footer></blockquote>"));
    }

    @Test
    void test_74() {
        given().get("http://localhost:8080/testCase-74")
                .then()
                .body("content", equalTo("<form><input type=\"file\" name=\"files\" multiple><button type=\"submit\">Upload</button></form>"));
    }

    @Test
    void test_75() {
    	Faker faker = new Faker();
        String question = faker.lorem().sentence();
        String answer = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-75?question=" + question + "&answer=" + answer)
                .then()
                .body("content", equalTo("<details><summary>" + question + "</summary><p>" + answer + "</p></details>"));
    }

    @Test
    void test_76() {
        given().get("http://localhost:8080/testCase-76")
                .then()
                .body("content", equalTo("<ul><li>Event 1: null</li><li>Event 2: null</li><li>Event 3: null</li></ul>"));
    }

    @Test
    void test_77() {
        String width = "800";
        String height = "600";
        String webSite = "https://example.com";
        given().get("http://localhost:8080/testCase-77?width=" + width + "&height=" + height + "&webSite=" + webSite)
                .then()
                .body("content", equalTo("<iframe src=\"" + webSite + "\" width=\"" + width + "\" height=\"" + height + "\"></iframe>"));
    }

    @Test
    void test_78() {
    	Faker faker = new Faker();
        String imgSrc = faker.lorem().word() + ".jpg";
        String imgCaption = "Image Caption";
        given().get("http://localhost:8080/testCase-78?imgSrc=" + imgSrc + "&img=" + imgCaption)
                .then()
                .body("content", equalTo("<figure><img src=\"" + imgSrc + "\"><figcaption>" + imgCaption + "</figcaption></figure>"));
    }

    @Test
    void test_79() {
        given().get("http://localhost:8080/testCase-79")
                .then()
                .body("content", equalTo("<meter value min max></meter>"));
    }

    @Test
    void test_80() {
    	Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String message = faker.lorem().sentence();
        given().get("http://localhost:8080/testCase-80?name=" + name + "&email=" + email + "&message=" + message)
                .then()
                .body("content", equalTo("<form onsubmit=\"submitMessage()\"><label>" + name + "<input type=\"text\"></label><label>" + email + "<input type=\"email\"></label><label>" + message + "<textarea></textarea></label><button type=\"submit\">Submit</button></form>"));
    }
    
    @Test
    void test_81() {
        given().get("http://localhost:8080/testCase-81")
                .then()
                .body("content", equalTo("<div class=\"carousel\"><ul><li><img src=\"image1.jpg\"></li><li><img src=\"image2.jpg\"></li><li><img src=\"image3.jpg\"></li></ul></div>"));
    }

    @Test
    void test_82() {
        given().get("http://localhost:8080/testCase-82")
                .then()
                .body("content", equalTo("<meter value=\"60\" min=\"0\" max=\"100\" label=\"Progress\" style=\"width: 200px; height: 20px; background-color: #f0f0f0;\"></meter>"));
    }

    @Test
    void test_83() {
        given().get("http://localhost:8080/testCase-83")
                .then()
                .body("content", equalTo("<ul><li><a href=\"#\">Home</a><ul><li><a href=\"subMenu1\">Submenu 1</a></li><li><a href=\"subMenu2\">Submenu 2</a></li></ul></li></ul>"));
    }

    @Test
    void test_84() {
        String width = "400";
        String height = "200";
        given().get("http://localhost:8080/testCase-84?width=" + width + "&height=" + height)
                .then()
                .body("content", equalTo("<canvas id=\"myCanvas\" width=\"" + width + "\" height=\"" + height + "\"></canvas>"));
    }

    @Test
    void test_85() {
    	Faker faker = new Faker();
        String movie1 = faker.book().title();
        String movie2 = faker.book().title();
        given().get("http://localhost:8080/testCase-85?movie1=" + movie1 + "&movie2=" + movie2)
                .then()
                .body("content", equalTo("<video controls><source src=\"" + movie1 + ".mp4\" type=\"video/mp4\"><source src=\"" + movie2 + ".ogg\" type=\"video/ogg\"></video>"));
    }

    @Test
    void test_86() {
    	Faker faker = new Faker();
        String movie1 = faker.book().title();
        String movie2 = faker.book().title();
        given().get("http://localhost:8080/testCase-86?movie1=" + movie1 + "&movie2=" + movie2)
                .then()
                .body("content", equalTo("<video controls><source src=\"" + movie1 + ".mp4\" type=\"video/mp4\"><source src=\"" + movie2 + ".ogg\" type=\"video/ogg\"></video>"));
    }

    @Test
    void test_87() {
        given().get("http://localhost:8080/testCase-87")
                .then()
                .body("content", equalTo("<abbr title=\"HyperText Markup Language\">HTML</abbr>"));
    }

    @Test
    void test_88() {
        given().get("http://localhost:8080/testCase-88")
                .then()
                .body("content", equalTo("<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3873.914669507377!2d-122.40860548578645!3d37.783697574566674!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8085808f05665937%3A0x5ef3f7f7a03f9b93!2sGolden%20Gate%20Bridge!5e0!3m2!1sen!2sus!4v1646477310675!5m2!1sen!2sus\" width=\"600\" height=\"450\" style=\"border:0;\"></iframe>"));
    }

    @Test
    void test_89() {
        given().get("http://localhost:8080/testCase-89")
                .then()
                .body("content", equalTo("<picture><source srcset=\"image-large.jpg\" media=\"(min-width: 1200px)\"><source srcset=\"image-medium.jpg\" media=\"(min-width: 800px)\"><img src=\"image-small.jpg\" alt=\"Responsive Image\"></picture>"));
    }

    @Test
    void test_90() {
        String color = "#FF0000";
        given().get("http://localhost:8080/testCase-90?color=" + color)
                .then()
                .body("content", equalTo("<progress value=\"50\" max=\"100\" style=\"width: 200px; height: 20px; background-color: " + color + ";\"></progress>"));
    }
    
    @Test
    void test_91() {
        String temp = "25°C";
        given().get("http://localhost:8080/testCase-91?temp=" + temp)
                .then()
                .body("content", equalTo("<p>The temperature is: " + temp + "</p>"));
    }

    @Test
    void test_92() {
    	Faker faker = new Faker();
    	int intNumber = faker.number().numberBetween(0, 10);
        String number = String.valueOf(intNumber);
        given().get("http://localhost:8080/testCase-92?number=" + number)
                .then()
                .body("content", equalTo("<details style=\"background-color: #f4f4f4; padding: " + number + "px;\"><summary>Click to toggle</summary><p>Additional content goes here.</p></details>"));
    }

    @Test
    void test_93() {
    	Faker faker = new Faker();
    	int intNumber = faker.number().numberBetween(0, 5);
        String number = String.valueOf(intNumber);
        given().get("http://localhost:8080/testCase-93?number=" + number)
                .then()
                .body("content", equalTo("<table><tr><th>Mon</th><th>Tue</th><th>Wed</th><th>Thu</th><th>Fri</th><th>Sat</th><th>Sun</th></tr><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td></tr><tr><td>8</td><td>9</td><td>10</td><td>11</td><td>12</td><td>13</td><td>14</td></tr><tr><td>15</td><td>16</td><td>17</td><td>18</td><td>19</td><td>20</td><td>21</td></tr><tr><td>22</td><td>23</td><td>24</td><td>25</td><td>26</td><td>27</td><td>28</td></tr></table>"));
    }

    @Test
    void test_94() {
        given().get("http://localhost:8080/testCase-94")
                .then()
                .body("content", equalTo("<nav><ul><li><a href=\"/\">Home</a></li><li><a href=\"/products\">Products</a></li><li><a href=\"/category\">Category</a></li><li>Current Page</li></ul></nav>"));
    }

    @Test
    void test_95() {
        given().get("http://localhost:8080/testCase-95")
                .then()
                .body("content", equalTo("<p>The chemical formula is H<sup>2</sup>O, and the equation is 2H<sub>2</sub> + O<sub>2</sub> -&gt; 2H<sup>2</sup>O.</p>"));
    }

    @Test
    void test_96() {
        given().get("http://localhost:8080/testCase-96")
                .then()
                .body("content", equalTo("<p>This is a longword <wbr> with a word break.</p>"));
    }

    @Test
    void test_97() {
        given().get("http://localhost:8080/testCase-97")
                .then()
                .body("content", equalTo("<abbr title=\"Hypertext Markup Language\">HTML</abbr>"));
    }

    @Test
    void test_98() {
        given().get("http://localhost:8080/testCase-98")
                .then()
                .body("content", equalTo("<canvas width=\"200\" height=\"100\"></canvas>"));
    }

    @Test
    void test_99() {
        given().get("http://localhost:8080/testCase-99")
                .then()
                .body("content", equalTo("<canvas width=\"200\" height=\"100\"></canvas>"));
    }

    @Test
    void test_100() {
        given().get("http://localhost:8080/testCase-100")
                .then()
                .body("content", equalTo("<label class=\"toggle\"><input type=\"checkbox\" id=\"toggle\"><span class=\"slider\"></span></label>"));
    }
    
    @Test
    void test_101() {
        given().get("http://localhost:8080/testCase-101")
                .then()
                .body("content", equalTo("<map name=\"imageMap\"><area shape=\"rect\" coords=\"0,0,100,100\" href=\"#\"><area shape=\"circle\" coords=\"200,200,50\" href=\"#\"></map>"));
    }

    @Test
    void test_102() {
        given().get("http://localhost:8080/testCase-102")
                .then()
                .body("content", equalTo("<base href=\"https://www.example.com/\">"));
    }

    @Test
    void test_103() {
        given().get("http://localhost:8080/testCase-103")
                .then()
                .body("content", equalTo("<col span=\"2\">"));
    }

    @Test
    void test_104() {
        given().get("http://localhost:8080/testCase-104")
                .then()
                .body("content", equalTo("<embed src=\"example.swf\" type=\"application/x-shockwave-flash\" width=\"400\" height=\"300\">"));
    }

    @Test
    void test_105() {
        given().get("http://localhost:8080/testCase-105")
                .then()
                .body("content", equalTo("<keygen id=\"keypair\">"));
    }

    @Test
    void test_106() {
        given().get("http://localhost:8080/testCase-106")
                .then()
                .body("content", equalTo("<link rel=\"stylesheet\" href=\"styles.css\">"));
    }

    @Test
    void test_107() {
        given().get("http://localhost:8080/testCase-107")
                .then()
                .body("content", equalTo("<meta charset=\"UTF-8\" name=\"description\" content=\"This is a meta tag example.\">"));
    }

    @Test
    void test_108() {
        given().get("http://localhost:8080/testCase-108")
                .then()
                .body("content", equalTo("<param name=\"autoplay\" value=\"true\">"));
    }

    @Test
    void test_109() {
        given().get("http://localhost:8080/testCase-109")
                .then()
                .body("content", equalTo("<source src=\"video.mp4\" type=\"video/mp4\">"));
    }

    @Test
    void test_110() {
        given().get("http://localhost:8080/testCase-110")
                .then()
                .body("content", equalTo("<audio><source src=\"audio.mp3\" type=\"audio/mpeg\"></audio>"));
    }
    
    @Test
    void test_111() {
        given().get("http://localhost:8080/testCase-111")
                .then()
                .body("content", equalTo("<colgroup><col span=\"2\"><col span=\"1\"><col span=\"3\"></colgroup>"));
    }

    @Test
    void test_112() {
        given().param("country", "USA").get("http://localhost:8080/testCase-112")
                .then()
                .body("content", equalTo("<p>The population of <data value=\"37400000\">USA</data> is larger than that of <data value=\"18700000\">New York</data>.</p>"));
    }

    @Test
    void test_113() {
        given().get("http://localhost:8080/testCase-113")
                .then()
                .body("content", equalTo("<p>The <dfn>HTML</dfn> specification defines the structure of web documents.</p>"));
    }

    @Test
    void test_114() {
        given().get("http://localhost:8080/testCase-114")
                .then()
                .body("content", equalTo("<figure><img src=\"image.jpg\" alt=\"Image\"><figcaption>Caption for the image</figcaption></figure>"));
    }

    @Test
    void test_115() {
        given().get("http://localhost:8080/testCase-115")
                .then()
                .body("content", equalTo("<noscript><p>JavaScript is disabled in your browser. Please enable it to view this website.</p></noscript>"));
    }

    @Test
    void test_116() {
        given().get("http://localhost:8080/testCase-116")
                .then()
                .body("content", equalTo("<rp>(pronunciation)</rp>"));
    }

    @Test
    void test_117() {
        given().get("http://localhost:8080/testCase-117")
                .then()
                .body("content", equalTo("<rt>furigana</rt>"));
    }

    @Test
    void test_118() {
        given().get("http://localhost:8080/testCase-118")
                .then()
                .body("content", equalTo("<samp>Sample output: Hello, world!</samp>"));
    }

    @Test
    void test_119() {
        given().get("http://localhost:8080/testCase-119")
                .then()
                .body("content", equalTo("<template><p>This is a template.</p></template>"));
    }

    @Test
    void test_120() {
        given().get("http://localhost:8080/testCase-120")
                .then()
                .body("content", equalTo("<menu><li><a href=\"/home\">Home</a></li><li><a href=\"/about\">About</a></li><li><a href=\"/contact\">Contact</a></li></menu>"));
    }
    
    @Test
    void test_121() {
        given().get("http://localhost:8080/testCase-121")
                .then()
                .body("content", equalTo("<noscript><p>JavaScript is disabled in your browser. Please enable it to view this website.</p></noscript>"));
    }

    @Test
    void test_122() {
        given().get("http://localhost:8080/testCase-122")
                .then()
                .body("content", equalTo("<form><input id=\"num1\" type=\"number\"><input id=\"num2\" type=\"number\"><button type=\"button\">Calculate</button><br><output id=\"result\"></output></form>"));
    }

    @Test
    void test_123() {
        given().get("http://localhost:8080/testCase-123")
                .then()
                .body("content", equalTo("<form><input id=\"num1\" type=\"number\"><input id=\"num2\" type=\"number\"><button type=\"button\">Calculate</button><br><output id=\"result\"></output></form>"));
    }

    @Test
    void test_124() {
        given().get("http://localhost:8080/testCase-124")
                .then()
                .body("content", equalTo("<picture><source srcset=\"image-small.jpg\" media=\"(max-width: 600px)\"><img src=\"image-large.jpg\" alt=\"A beautiful landscape\"></picture>"));
    }

    @Test
    void test_125() {
        given().get("http://localhost:8080/testCase-125")
                .then()
                .body("content", equalTo("<samp style=\"color: red; font-weight: bold;\">Sample output: Hello, world!</samp>"));
    }

    @Test
    void test_126() {
        given().get("http://localhost:8080/testCase-126")
                .then()
                .body("content", equalTo("<section><h2>Section Title</h2><p>This is the content of the section.</p></section>"));
    }

    @Test
    void test_127() {
        given().get("http://localhost:8080/testCase-127")
                .then()
                .body("content", equalTo("<div><p>This is a paragraph inside the slot.</p><slot>This is the default content.</slot></div>"));
    }

    @Test
    void test_128() {
        given().get("http://localhost:8080/testCase-128")
                .then()
                .body("content", equalTo("<tbody><tr><td>Row 1, Column 1</td><td>Row 1, Column 2</td></tr><tr><td>Row 2, Column 1</td><td>Row 2, Column 2</td></tr></tbody>"));
    }

    @Test
    void test_129() {
        given().get("http://localhost:8080/testCase-129")
                .then()
                .body("content", equalTo("<tfoot><tr><td colspan=\"2\">Total:</td></tr></tfoot>"));
    }

    @Test
    void test_130() {
        given().get("http://localhost:8080/testCase-130")
                .then()
                .body("content", equalTo("<thead><tr><th>Name</th><th>Age</th><th>Email</th></tr></thead>"));
    }
    
    @Test
    void test_131() {
        given().get("http://localhost:8080/testCase-131")
                .then()
                .body("content", equalTo("<object type=\"application/x-shockwave-flash\" data=\"example.swf\"><param name=\"autoplay\" value=\"true\"><param name=\"loop\" value=\"false\"></object>"));
    }

    @Test
    void test_132() {
        given().get("http://localhost:8080/testCase-132")
                .then()
                .body("content", equalTo("<video controls=\"controls\"><source src=\"movie.mp4\" type=\"video/mp4\"><source src=\"movie.webm\" type=\"video/webm\"></video>"));
    }

    @Test
    void test_133() {
        given().get("http://localhost:8080/testCase-133")
                .then()
                .body("content", equalTo("<html><head><title>Example Page</title></head><body><h1>Main Content</h1><p>This is the main content of the page.</p><aside><h2>Related Information</h2><p>This is some related information.</p><p>It&#x27;s not directly part of the main content but provides additional context.</p></aside></body></html>"));
    }

    @Test
    void test_134() {
        given().get("http://localhost:8080/testCase-134")
                .then()
                .body("content", equalTo("<html><head><title>Glossary</title></head><body><h1>Glossary</h1><p>The term </p><dfn>HTML</dfn><p> stands for Hypertext Markup Language.</p></body></html>"));
    }

    @Test
    void test_135() {
        given().get("http://localhost:8080/testCase-135")
                .then()
                .body("content", equalTo("<dialog><h2>Welcome!</h2><p>This is a dialog box.</p><button onclick=\"closeDialog()\">Close</button></dialog>"));
    }

    @Test
    void test_136() {
        given().get("http://localhost:8080/testCase-136")
                .then()
                .body("content", equalTo("<iframe src=\"https://www.example.com\" width=\"800\" height=\"600\" title=\"Embedded Content\" frameborder=\"0\" allowfullscreen=\"\" sandbox=\"allow-scripts allow-same-origin\">Your browser does not support iframes.</iframe>"));
    }

    @Test
    void test_137() {
        given().get("http://localhost:8080/testCase-137")
                .then()
                .body("content", equalTo("<form><label>Username:</label><input type=\"text\" name=\"username\"><br><label>Password:</label><input type=\"password\" name=\"password\"><br><button type=\"submit\">Submit</button></form>"));
    }

    @Test
    void test_138() {
        given().get("http://localhost:8080/testCase-138")
                .then()
                .body("content", equalTo("<table><tr><th>Name</th><th>Age</th><th>Country</th></tr><tr><td>John</td><td>30</td><td>USA</td></tr><tr><td>Emily</td><td>25</td><td>Canada</td></tr></table>"));
    }

    @Test
    void test_139() {
        given().get("http://localhost:8080/testCase-139")
                .then()
                .body("content", equalTo("<a href=\"https://www.example.com\">Visit our website</a>"));
    }

    @Test
    void test_140() {
        given().get("http://localhost:8080/testCase-140")
                .then()
                .body("content", equalTo("<ol><li accesskey=\"Key 1\">Item 1</li><li dir=\"theDir\">Item 2</li><li>Item 3</li></ol>"));
    }
    
    @Test
    void test_141() {
        given().get("http://localhost:8080/testCase-141")
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" alt=\"Image\" contenteditable=\"true\">"));
    }

    @Test
    void test_142() {
        given().get("http://localhost:8080/testCase-142")
                .then()
                .body("content", equalTo("<audio src=\"audio.mp3\" controls=\"\" is=\"theLS\"></audio>"));
    }

    @Test
    void test_143() {
        given().get("http://localhost:8080/testCase-143")
                .then()
                .body("content", equalTo("<video src=\"video.mp4\" controls=\"\"></video>"));
    }

    @Test
    void test_144() {
        given().get("http://localhost:8080/testCase-144")
                .then()
                .body("content", equalTo("<svg width=\"100\" height=\"100\"><circle cx=\"50\" cy=\"50\" r=\"40\" fill=\"red\"></circle></svg>"));
    }

    @Test
    void test_145() {
        given().get("http://localhost:8080/testCase-145")
                .then()
                .body("content", equalTo("<meter value=\"75\" min=\"0\" max=\"100\" high=\"90\"></meter>"));
    }

    @Test
    void test_146() {
        given().get("http://localhost:8080/testCase-146")
                .then()
                .body("content", equalTo("<details open=\"\"><summary>More Information</summary><p>Additional details...</p></details>"));
    }

    @Test
    void test_147() {
        given().get("http://localhost:8080/testCase-147")
                .then()
                .body("content", equalTo("<blockquote><p>This is a quote.</p><cite>John Doe</cite></blockquote>"));
    }

    @Test
    void test_148() {
        given().get("http://localhost:8080/testCase-148")
                .then()
                .body("content", equalTo("<p>Use the <code>System.out.println()</code></p>"));
    }

    @Test
    void test_149() {
        given().get("http://localhost:8080/testCase-149")
                .then()
                .body("content", equalTo("<p>This is <small>small text</small></p>"));
    }

    @Test
    void test_150() {
        given().get("http://localhost:8080/testCase-150")
                .then()
                .body("content", equalTo("<p>H2<sub>O</sub></p>"));
    }
    
    @Test
    void test_151() {
        given().get("http://localhost:8080/testCase-151")
                .then()
                .body("content", equalTo("<table><thead><tr><th>Name</th><th>Age</th><th>Country</th></tr></thead><tbody><tr><td>John</td><td>30</td><td>USA</td></tr><tr><td>Emily</td><td>25</td><td>Canada</td></tr></tbody><tfoot><tr><td colspan=\"3\">Total</td></tr></tfoot></table>"));
    }

    @Test
    void test_152() {
        given().get("http://localhost:8080/testCase-152")
                .then()
                .body("content", equalTo("<form><label>Name:</label><input type=\"text\" name=\"name\"><br><label>Gender:</label><input type=\"radio\" name=\"gender\" value=\"male\" checked><label>Male</label><input type=\"radio\" name=\"gender\" value=\"female\"><label>Female</label><br><label>Interests:</label><input type=\"checkbox\" name=\"interests\" value=\"coding\"><label>Coding</label><input type=\"checkbox\" name=\"interests\" value=\"reading\"><label>Reading</label><br><button type=\"submit\">Submit</button></form>"));
    }

    @Test
    void test_153() {
        given().get("http://localhost:8080/testCase-153")
                .then()
                .body("content", equalTo("<select><option>Option 1</option><option>Option 2</option><option>Option 3</option></select>"));
    }

    @Test
    void test_154() {
        given().get("http://localhost:8080/testCase-154")
                .then()
                .body("content", equalTo("<details><summary>Main Details</summary><p>Additional details...</p><details><summary>Nested Details</summary><p>More details...</p></details></details>"));
    }

    @Test
    void test_155() {
        given().get("http://localhost:8080/testCase-155")
                .then()
                .body("content", equalTo("<figure><img src=\"image.jpg\" alt=\"Image\"><figcaption>Image caption</figcaption></figure>"));
    }

    @Test
    void test_156() {
        given().get("http://localhost:8080/testCase-156")
                .then()
                .body("content", equalTo("<article><header><h1>Article Title</h1></header><p>Main content of the article...</p><footer>© 2024 Example Company</footer></article>"));
    }

    @Test
    void test_157() {
        given().get("http://localhost:8080/testCase-157")
                .then()
                .body("content", equalTo("<details onclick=\"loadContent()\"><summary>Load Content</summary><p>Click the summary to load content...</p></details>"));
    }

    @Test
    void test_158() {
        given().get("http://localhost:8080/testCase-158")
                .then()
                .body("content", equalTo("<header><nav><a href=\"#\">Home</a><a href=\"#\">About</a><a href=\"#\">Contact</a></nav></header>"));
    }

    @Test
    void test_159() {
        given().get("http://localhost:8080/testCase-159")
                .then()
                .body("content", equalTo("<section><h2>Section 1</h2><p>Content of section 1...</p><section><h3>Subsection 1.1</h3><p>Content of subsection 1.1...</p></section><h2>Section 2</h2><p>Content of section 2...</p></section>"));
    }

    @Test
    void test_160() {
        given().get("http://localhost:8080/testCase-160")
                .then()
                .body("content", equalTo("<footer><p>© 2024 Example Company</p></footer>"));
    }
    
    @Test
    void test_161() {
        given().get("http://localhost:8080/testCase-161")
                .then()
                .body("content", equalTo("<img src=\"image.jpg\" alt=\"Responsive Image\" srcset=\"image.jpg 1024w, image-mobile.jpg 480w\" sizes=\"(max-width: 480px) 100vw, 50vw\">"));
    }

    @Test
    void test_162() {
        given().get("http://localhost:8080/testCase-162")
                .then()
                .body("content", equalTo("<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12455.650499927146!2d-0.14123153355180514!3d51.50103573310335!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4876055c84e3e455%3A0x4aef301801cd6d0!2sBuckingham+Palace!5e0!3m2!1sen!2suk!4v1569491572615!5m2!1sen!2suk\" width=\"600\" height=\"450\"></iframe>"));
    }

    @Test
    void test_163() {
        given().get("http://localhost:8080/testCase-163")
                .then()
                .body("content", equalTo("<button class=\"btn btn-primary\">Click Me</button>"));
    }

    @Test
    void test_164() {
        given().get("http://localhost:8080/testCase-164")
                .then()
                .body("content", equalTo("<div><span class=\"alert alert-info\">This is an alert message.</span></div>"));
    }

    @Test
    void test_165() {
        given().get("http://localhost:8080/testCase-165")
                .then()
                .body("content", equalTo("<video src=\"video.webm\" controls=\"\"></video>"));
    }

    @Test
    void test_166() {
        given().get("http://localhost:8080/testCase-166")
                .then()
                .body("content", equalTo("<nav><a href=\"#\">Home</a><div class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown</a><div class=\"dropdown-menu\"><a class=\"dropdown-item\" href=\"#\">Link 1</a><a class=\"dropdown-item\" href=\"#\">Link 2</a></div></div></nav>"));
    }

    @Test
    void test_167() {
        given().get("http://localhost:8080/testCase-167")
                .then()
                .body("content", equalTo("<nav><ul><li><a href=\"#\">Home</a></li><li><a href=\"#\">Services</a><ul><li><a href=\"#\">Service 1</a></li><li><a href=\"#\">Service 2</a></li><li><a href=\"#\">Service 3</a></li></ul></li><li><a href=\"#\">About</a></li><li><a href=\"#\">Contact</a></li></ul></nav>"));
    }

    @Test
    void test_168() {
        given().get("http://localhost:8080/testCase-168")
                .then()
                .body("content", equalTo("<div class=\"carousel slide\" id=\"carouselExample\" data-ride=\"carousel\"><div class=\"carousel-inner\"><img src=\"image1.jpg\" class=\"d-block w-100\"><img src=\"image2.jpg\" class=\"d-block w-100\"><img src=\"image3.jpg\" class=\"d-block w-100\"></div><a class=\"carousel-control-prev\" href=\"#carouselExample\" rel=\"button\"></a><span class=\"carousel-control-prev-icon\" hidden></span><a class=\"carousel-control-next\" href=\"#carouselExample\" rel=\"button\"></a><span class=\"carousel-control-next-icon\" hidden></span></div>"));
    }

    @Test
    void test_169() {
        given().get("http://localhost:8080/testCase-169")
                .then()
                .body("content", equalTo("<div class=\"timeline\"><div class=\"timeline-item\"><div class=\"timeline-panel\"><h3>Title 1</h3><p>Content 1</p></div><div class=\"timeline-badge\"></div><div class=\"clearfix\"></div></div><div class=\"timeline-item\"><div class=\"timeline-panel\"><h3>Title 2</h3><p>Content 2</p></div><div class=\"timeline-badge\"></div><div class=\"clearfix\"></div></div></div>"));
    }

    @Test
    void test_170() {
        given().get("http://localhost:8080/testCase-170")
                .then()
                .body("content", equalTo("<div class=\"modal-dialog\" dir=\"document\"><div class=\"modal-content\"><div class=\"modal-header\"><h4 class=\"modal-title\">Modal Title</h4><button type=\"button\" class=\"close\" data-dismiss=\"modal\">&amp;times;</button></div><div class=\"modal-body\"><p>Modal content goes here...</p></div><div class=\"modal-footer\"><button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button></div></div></div>"));
    }
    
    @Test
    void test_171() {
        given().get("http://localhost:8080/testCase-171")
                .then()
                .body("content", equalTo("<div class=\"accordion\"><div class=\"card\"><h5 class=\"mb-0\">Accordion Heading 1</h5><button type=\"button\" class=\"btn btn-link\" data-toggle=\"collapse\" data-target=\"#collapse1\">&amp;plus;</button><div class=\"collapse\" id=\"collapse1\"><p>Accordion Content 1</p></div></div><div class=\"card\"><div class=\"card\"><h5 class=\"mb-0\">Accordion Heading 2</h5><button type=\"button\" class=\"btn btn-link\" data-toggle=\"collapse\" data-target=\"#collapse2\">&amp;plus;</button><div class=\"collapse\" id=\"collapse2\"><p>Accordion Content 2</p></div></div></div></div>"));
    }

    @Test
    void test_172() {
        given().get("http://localhost:8080/testCase-172")
                .then()
                .body("content", equalTo("<div class=\"card\"><img src=\"product-image.jpg\" class=\"card-img-top\"><div class=\"card-body\"><h5 class=\"card-title\">Product Title</h5><p class=\"card-text\">Product Description</p><a class=\"btn btn-primary\" href=\"#\">Buy Now</a></div></div>"));
    }

    @Test
    void test_173() {
        given().get("http://localhost:8080/testCase-173")
                .then()
                .body("content", equalTo("<ul class=\"list-group\"><li class=\"list-group-item\">Item 1</li><li class=\"list-group-item\">Item 2</li><li class=\"list-group-item\">Item 3</li></ul>"));
    }

    @Test
    void test_174() {
        given().get("http://localhost:8080/testCase-174")
                .then()
                .body("content", equalTo("<nav><ul class=\"pagination\"><li class=\"page-item active\"><a href=\"#\">1</a></li><li class=\"page-item\"><a href=\"#\">2</a></li><li class=\"page-item\"><a href=\"#\">3</a></li><li class=\"page-item\"><a href=\"#\">&amp;raquo;</a></li></ul></nav>"));
    }

    @Test
    void test_175() {
        given().get("http://localhost:8080/testCase-175")
                .then()
                .body("content", equalTo("<div><strong>Alert!</strong><p class=\"alert alert-warning\" role=\"alert\">This is an alert message.</p></div>"));
    }

    @Test
    void test_176() {
        given().get("http://localhost:8080/testCase-176")
                .then()
                .body("content", equalTo("<form><label>Email:</label><input type=\"email\" name=\"email\"><button type=\"submit\">Subscribe</button></form>"));
    }

    @Test
    void test_177() {
        given().get("http://localhost:8080/testCase-177")
                .then()
                .body("content", equalTo("<form><label>Username:</label><input type=\"text\" name=\"username\"><label>Password:</label><input type=\"password\" name=\"password\"><button type=\"submit\">Login</button></form>"));
    }

    @Test
    void test_178() {
        given().get("http://localhost:8080/testCase-178")
                .then()
                .body("content", equalTo("<form><label>Username:</label><input type=\"text\" name=\"username\"><label>Email:</label><input type=\"email\" name=\"email\"><label>Password:</label><input type=\"password\" name=\"password\"><button type=\"submit\">Register</button></form>"));
    }

    @Test
    void test_179() {
        given().get("http://localhost:8080/testCase-179")
                .then()
                .body("content", equalTo("<form><label>Name:</label><input type=\"text\" name=\"name\"><label>Email:</label><input type=\"email\" name=\"email\"><label>Message:</label><textarea name=\"message\"></textarea><button type=\"submit\">Send Message</button></form>"));
    }

    @Test
    void test_180() {
        given().get("http://localhost:8080/testCase-180")
                .then()
                .body("content", equalTo("<form><input type=\"text\" placeholder=\"Search...\"><button type=\"submit\">Search</button></form>"));
    }
    
    @Test
    void test_181() {
        given().get("http://localhost:8080/testCase-181")
                .then()
                .body("content", equalTo("<div class=\"input-group date\" data-provide=\"datepicker\"><input type=\"text\" class=\"form-control\" id=\"datepicker\"></div>"));
    }

    @Test
    void test_182() {
        given().get("http://localhost:8080/testCase-182")
                .then()
                .body("content", equalTo("<form><label>Select file:</label><input type=\"file\" name=\"file\"><button type=\"submit\">Upload</button></form>"));
    }

    @Test
    void test_183() {
        given().get("http://localhost:8080/testCase-183")
                .then()
                .body("content", equalTo("<form><label>Name:</label><input type=\"text\" name=\"name\"><label>Email:</label><input type=\"email\" name=\"email\"><button type=\"submit\">Subscribe</button></form>"));
    }

    @Test
    void test_184() {
        given().get("http://localhost:8080/testCase-184")
                .then()
                .body("content", equalTo("<form><label>Card Number:</label><input type=\"text\" name=\"cardNumber\"><label>Expiry Date:</label><input type=\"text\" name=\"expiryDate\"><label>CVV:</label><input type=\"password\" name=\"cvv\"><button type=\"submit\">Pay Now</button></form>"));
    }

    @Test
    void test_185() {
        given().get("http://localhost:8080/testCase-185")
                .then()
                .body("content", equalTo("<form><label>Feedback:</label><textarea name=\"feedback\"></textarea><label>Rating:</label><input type=\"range\" name=\"rating\" min=\"1\" max=\"5\" step=\"1\"><button type=\"submit\">Submit</button></form>"));
    }

    @Test
    void test_186() {
        given().get("http://localhost:8080/testCase-186")
                .then()
                .body("content", equalTo("<form><label>Full Name:</label><input type=\"text\" name=\"fullName\"><label>Email:</label><input type=\"email\" name=\"email\"><label>Bio:</label><textarea name=\"bio\"></textarea><button type=\"submit\">Update Profile</button></form>"));
    }

    @Test
    void test_187() {
        given().get("http://localhost:8080/testCase-187")
                .then()
                .body("content", equalTo("<form><label>Email:</label><input type=\"email\" name=\"email\"><button type=\"submit\">Reset Password</button></form>"));
    }

    @Test
    void test_188() {
        given().get("http://localhost:8080/testCase-188")
                .then()
                .body("content", equalTo("<form><label>Review Title:</label><input type=\"text\" name=\"title\"><label>Your Review:</label><textarea name=\"review\"></textarea><label>Rating:</label><input type=\"range\" name=\"rating\" min=\"1\" max=\"5\" step=\"1\"><button type=\"submit\">Submit Review</button></form>"));
    }

    @Test
    void test_189() {
        given().get("http://localhost:8080/testCase-189")
                .then()
                .body("content", equalTo("<form><label>Name:</label><input type=\"text\" name=\"name\"><label>Age:</label><input type=\"number\" name=\"age\"><label>Gender:</label><select name=\"gender\"><option>Male</option><option>Female</option><option>Other</option></select><label>Comments:</label><textarea name=\"comments\"></textarea><button type=\"submit\">Submit</button></form>"));
    }

    @Test
    void test_190() {
        given().get("http://localhost:8080/testCase-190")
                .then()
                .body("content", equalTo("<form><label>Question 1: What is the capital of France?</label><input type=\"radio\" name=\"q1\" value=\"paris\"><label>Paris</label><input type=\"radio\" name=\"q1\" value=\"london\"><label>London</label><input type=\"radio\" name=\"q1\" value=\"berlin\"><label>Berlin</label><label>Question 2: What is 2 + 2?</label><input type=\"radio\" name=\"q2\" value=\"3\"><label>3</label><input type=\"radio\" name=\"q2\" value=\"4\"><label>4</label><input type=\"radio\" name=\"q2\" value=\"5\"><label>5</label><button type=\"submit\">Submit</button></form>"));
    }
    
    @Test
    void test_191() {
        given().get("http://localhost:8080/testCase-191")
                .then()
                .body("content", equalTo("<div class=\"weather-widget\"><h3>Today&#x27;s Weather</h3><p>Temperature: 25°C</p><p>Condition: Sunny</p></div>"));
    }

    @Test
    void test_192() {
        given().get("http://localhost:8080/testCase-192")
                .then()
                .body("content", equalTo("<div class=\"countdown-timer\"><h2>Countdown Timer</h2><p>Time remaining: </p><span id=\"timer\">10:00</span></div>"));
    }

    @Test
    void test_193() {
        given().get("http://localhost:8080/testCase-193")
                .then()
                .body("content", equalTo("<div class=\"recipe-card\"><h3>Pasta Carbonara</h3><p>Ingredients: Spaghetti, eggs, bacon, parmesan cheese</p><p>Instructions: Boil spaghetti, fry bacon, mix with eggs and cheese, serve hot</p></div>"));
    }

    @Test
    void test_194() {
        given().get("http://localhost:8080/testCase-194")
                .then()
                .body("content", equalTo("<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12455.650499927146!2d-0.14123153355180514!3d51.50103573310335!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4876055c84e3e455%3A0x4aef301801cd6d0!2sBuckingham+Palace!5e0!3m2!1sen!2suk!4v1569491572615!5m2!1sen!2suk\" width=\"600\" height=\"450\"></iframe>"));
    }

    @Test
    void test_195() {
        given().get("http://localhost:8080/testCase-195")
                .then()
                .body("content", equalTo("<div class=\"chat-widget\"><h3>Chat</h3><div class=\"chat-messages\"><p>User 1: Hi, how are you?</p><p>User 2: I&#x27;m good, thanks!</p></div><input type=\"text\" placeholder=\"Type your message...\"><button type=\"submit\">Send</button></div>"));
    }

    @Test
    void test_196() {
        given().get("http://localhost:8080/testCase-196")
                .then()
                .body("content", equalTo("<html><head><title>Example Page</title><base href=\"https://example.com/\"></head><body><p>This is an example page with a base URL set.</p></body></html>"));
    }

    @Test
    void test_197() {
        given().get("http://localhost:8080/testCase-197")
                .then()
                .body("content", equalTo("<table><colgroup><col span=\"2\"><col dir=\"sample-dir\"><col class=\"highlight\"></colgroup><tr><td>Cell 1</td><td>Cell 2</td></tr><tr><td>Cell 3</td><td>Cell 4</td></tr></table>"));
    }

    @Test
    void test_198() {
        given().get("http://localhost:8080/testCase-198")
                .then()
                .body("content", equalTo("<form><label>Username:</label><input type=\"text\" name=\"username\" required><label>Password:</label><input type=\"password\" name=\"password\" required><label>Email:</label><input type=\"email\" name=\"email\" required><label>Date of Birth:</label><input type=\"date\" name=\"dob\"><label>Favorite Color:</label><input type=\"color\" name=\"color\"><button type=\"submit\">Submit</button></form>"));
    }

    @Test
    void test_199() {
        given().get("http://localhost:8080/testCase-199")
                .then()
                .body("content", equalTo("<audio controls src=\"audio.mp3\"></audio>"));
    }

    @Test
    void test_200() {
        given().get("http://localhost:8080/testCase-200")
                .then()
                .body("content", equalTo("<html><head><title>Comprehensive Example</title><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"styles.css\"></head><body><header><h1>Welcome to our Website</h1><nav><ul><li><a href=\"/\">Home</a></li><li><a href=\"/about\">About Us</a></li><li><a href=\"/services\">Services</a></li><li><a href=\"/contact\">Contact</a></li></ul></nav></header></body></html>"));
    }
    
    @Test
	void test_HeadingWithParagraph() {
		String heading = faker.name().fullName();
		String paragraph = faker.lorem().paragraph();
		
		Response actual = given().queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingParagraph");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphWithMissingParameters() {
		given().queryParam("heading", "").queryParam("paragraph", "").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithNullParameters() {
		String heading = null;
		String paragraph = null;
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithNullHeadingParameters() {
		String heading = null;
		String paragraph = faker.lorem().paragraph();
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p>" + paragraph + "</p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithNullHeadingEmptyParagraphParameters() {
		String heading = null;
		String paragraph = "";
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithEmptyHeadingNullParagraphParameters() {
		String heading = "";
		String paragraph = null;
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithNullParagraphParameters() {
		String heading = faker.name().fullName();
		String paragraph = null;
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithLongHeadingNullParagraphParameters() {
		String heading = faker.lorem().paragraph();
		String paragraph = null;
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithInvalidHeadingParameters() {
		String heading = "Invalid Heading";
		String paragraph = "";
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithInvalidParagraphParameters() {
		String heading = "";
		String paragraph = "Invalid Paragraph";
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p>" + paragraph + "</p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithInvalidHeadingAndParagraphParameters() {
		String heading = "Invalid Heading";
		String paragraph = "Invalid Paragraph";
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithLongHeadingParameters() {
		String heading = faker.lorem().paragraph();
		String paragraph = "";
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphWithLongHeadingAndParagraphParameters() {
		String heading = faker.lorem().paragraph();
		String paragraph = faker.lorem().paragraph();
		given().queryParam("heading", heading).queryParam("paragraph", paragraph).when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphsWithSpecialCharactersHeadingParameter() {
		given().queryParam("heading", "!@#$%^&*()_+").queryParam("paragraph", "").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>!@#$%^&amp;*()_+</h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphsWithSpecialCharactersParagraphParameter() {
		given().queryParam("heading", "").queryParam("paragraph", "!@#$%^&*()_+").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p>!@#$%^&amp;*()_+</p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphsWithSpecialCharactersHeadingAndParagraphParameter() {
		given().queryParam("heading", "!@#$%^&*()_+").queryParam("paragraph", "!@#$%^&*()_+").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>!@#$%^&amp;*()_+</p></body></html>"));
	}
	
	// ------------------------------------------------------- Heading with Paragraph and Id --------------------------------------------------------------------------------------
	
	@Test
	void test_HeadingWithParagraphAndId() {
		String heading = faker.name().fullName();
		String paragraph = faker.lorem().paragraph();
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdEmptyHeading() {
		String heading = "";
		String paragraph = faker.lorem().paragraph();
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdLongHeading() {
		String heading = faker.lorem().paragraph();
		String paragraph = faker.lorem().paragraph();
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdLongHeadingEmptyParagraph() {
		String heading = faker.lorem().paragraph();
		String paragraph = "";
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdLongHeadingNullParagraph() {
		String heading = faker.lorem().paragraph();
		String paragraph = "";
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p></p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdNullHeading() {
		String heading = null;
		String paragraph = faker.lorem().paragraph();
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1></h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdEmptyParagraph() {
		String heading = faker.name().fullName();
		String paragraph = "";
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdNullParagraph() {
		String heading = faker.name().fullName();
		String paragraph = null;
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p></p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdNullId() { // Can't find Id in the RestAPI when it is null
		String heading = faker.name().fullName();
		String paragraph = faker.lorem().paragraph();
		Integer id = null;
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p></p><p>Id: </p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdNullHeadingAndParagraph() {
		String heading = null;
		String paragraph = null;
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1></h1><p></p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdEmptyHeadingAndParagraph() {
		String heading = "";
		String paragraph = "";
		Integer id = faker.idNumber().hashCode();
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdZeroId() {
		String heading = faker.name().fullName();
		String paragraph = faker.lorem().paragraph();
		Integer id = 0;
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdZeroIdEmptyHeading() {
		String heading = "";
		String paragraph = faker.lorem().paragraph();
		Integer id = 0;
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdZeroIdNullHeading() {
		String heading = null;
		String paragraph = faker.lorem().paragraph();
		Integer id = 0;
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1></h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdZeroIdEmptyParagraph() {
		String heading = faker.name().fullName();
		String paragraph = "";
		Integer id = 0;
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p>" + paragraph + "</p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdZeroIdNullParagraph() {
		String heading = faker.name().fullName();
		String paragraph = null;
		Integer id = 0;
		
		Response actual = given().queryParam("Id", id).queryParam("heading", heading).queryParam("paragraph", paragraph).when().get("/headingWithParagraphAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Paragraph and Id</title></head><body><h1>" + heading + "</h1><p></p><p>Id: " + id + "</p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdSpecialCharactersHeadingParameter() {
		Integer id = faker.idNumber().hashCode();
		given().queryParam("Id", id).queryParam("heading", "!@#$%^&*()_+").queryParam("paragraph", "").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>!@#$%^&amp;*()_+</h1><p></p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdSpecialCharactersParagraphParameter() {
		Integer id = faker.idNumber().hashCode();
		given().queryParam("Id", id).queryParam("heading", "").queryParam("paragraph", "!@#$%^&*()_+").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1></h1><p>!@#$%^&amp;*()_+</p></body></html>"));
	}
	
	@Test
	void testGetHeadingWithParagraphAndIdSpecialCharactersHeadingAndParagraphParameter() {
		Integer id = faker.idNumber().hashCode();
		given().queryParam("Id", id).queryParam("heading", "!@#$%^&*()_+").queryParam("paragraph", "!@#$%^&*()_+").when()
			.get("/headingParagraph")
			.then().body("content", equalTo("<html><head><title>Heading with Paragraph</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>!@#$%^&amp;*()_+</p></body></html>"));
	}
	
	// -------------------------------------- Heading with Anchor ----------------------------------------------------------------------------------------------------------------
	@Test
	void test_HeadingWithAnchor() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorEmptyHeading() {
		String heading = "";
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorEmptyHeadingAndAnchorText() {
		String heading = "";
		String anchorText = "";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorEmptyHeadingAndAnchorTextAndAnchorUrl() {
		String heading = "";
		String anchorText = "";
		String anchorUrl = "";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorEmptyAnchorUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorEmptyAnchorText() {
		String heading = faker.name().fullName();
		String anchorText = "";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorNullHeading() {
		String heading = null;
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorNullHeadingAndAnchorText() {
		String heading = null;
		String anchorText = null;
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorNullHeadingAndAnchorTextAndAnchorUrl() {
		String heading = null;
		String anchorText = null;
		String anchorUrl = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorNullAnchorUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorNullAnchorText() {
		String heading = faker.name().fullName();
		String anchorText = null;
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorLongHeading() {
		String heading = faker.lorem().paragraph();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorLongHeadingAndAnchorText() {
		String heading = faker.lorem().paragraph();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorLongHeadingAndAnchorTextAndAnchorUrl() {
		String heading = faker.lorem().paragraph();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = faker.lorem().paragraph();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorLongAnchorUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = faker.lorem().paragraph();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorLongAnchorText() {
		String heading = faker.name().fullName();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorSpecialCharactersHeading() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorSpecialCharactersHeadingAndAnchorText() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorSpecialCharactersHeadingAndAnchorTextAndAnchorUrl() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "!@#$%^&*()_+";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorSpecialCharactersAnchorUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "!@#$%^&*()_+";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\">" + anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorSpecialCharactersAnchorText() {
		String heading = faker.name().fullName();
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "www.google.com";
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).when().get("/headingWithAnchor");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	// -------------------------------------------------- Heading With Anchor and ID -------------------------------------------------------------------------------------------
	
	@Test
	void test_HeadingWithAnchorAndId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeading() {
		String heading = "";
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyText() {
		String heading = faker.name().fullName();
		String anchorText = "";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyTextAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyTextAndUrl() {
		String heading = faker.name().fullName();
		String anchorText = "";
		String anchorUrl = "";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyTextAndUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "";
		String anchorUrl = "";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndZeroId() {
		String heading = "";
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndUrl() {
		String heading = "";
		String anchorText = "Anchor";
		String anchorUrl = "";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndUrlZeroId() {
		String heading = "";
		String anchorText = "Anchor";
		String anchorUrl = "";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndText() {
		String heading = "";
		String anchorText = "";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndTextAndZeroId() {
		String heading = "";
		String anchorText = "";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndTextAndUrl() {
		String heading = "";
		String anchorText = "";
		String anchorUrl = "";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdEmptyHeadingAndTextAndUrlAndZeroId() {
		String heading = "";
		String anchorText = "";
		String anchorUrl = "";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeading() {
		String heading = null;
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = null;
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = null;
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"\" id=\"\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullText() {
		String heading = faker.name().fullName();
		String anchorText = null;
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullTextAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = null;
		String anchorUrl = "www.google.com";
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullTextAndUrl() {
		String heading = faker.name().fullName();
		String anchorText = null;
		String anchorUrl = null;
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullTextAndUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = null;
		String anchorUrl = null;
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"\" id=\"\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndZeroId() {
		String heading = null;
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndUrl() {
		String heading = null;
		String anchorText = "Anchor";
		String anchorUrl = null;
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndUrlZeroId() {
		String heading = null;
		String anchorText = "Anchor";
		String anchorUrl = null;
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"\" id=\"\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndText() {
		String heading = null;
		String anchorText = null;
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndTextAndZeroId() {
		String heading = null;
		String anchorText = null;
		String anchorUrl = "www.google.com";
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndTextAndUrl() {
		String heading = null;
		String anchorText = null;
		String anchorUrl = null;
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdNullHeadingAndTextAndUrlAndZeroId() {
		String heading = null;
		String anchorText = null;
		String anchorUrl = null;
		Integer Id = null;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>Paragraph with an achor: <a href=\"\" id=\"\"></a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeading() {
		String heading = faker.lorem().paragraph();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	
	@Test
	void testGetHeadingWithAnchorAndIdLongUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongText() {
		String heading = faker.name().fullName();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongTextAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongTextAndUrl() {
		String heading = faker.name().fullName();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongTextAndUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndZeroId() {
		String heading = faker.lorem().paragraph();
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndUrl() {
		String heading = faker.lorem().paragraph();
		String anchorText = "Anchor";
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndUrlZeroId() {
		String heading = faker.lorem().paragraph();
		String anchorText = "Anchor";
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndText() {
		String heading = faker.lorem().paragraph();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndTextAndZeroId() {
		String heading = faker.lorem().paragraph();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndTextAndUrl() {
		String heading = faker.lorem().paragraph();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdLongHeadingAndTextAndUrlAndZeroId() {
		String heading = faker.lorem().paragraph();
		String anchorText = faker.lorem().paragraph();
		String anchorUrl = faker.lorem().paragraph();
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeading() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersUrl() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "Anchor";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersText() {
		String heading = faker.name().fullName();
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersTextAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" + heading + "</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersTextAndUrl() {
		String heading = faker.name().fullName();
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersTextAndUrlAndZeroId() {
		String heading = faker.name().fullName();
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
								+ heading + "</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndZeroId() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "Anchor";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndUrl() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "Anchor";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndUrlZeroId() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "Anchor";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">" 
								+ anchorText + "</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndText() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "www.google.com";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"" + anchorUrl + "\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndTextAndZeroId() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "www.google.com";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"" 
								+ anchorUrl + "\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndTextAndUrl() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = faker.number().hashCode();
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	@Test
	void testGetHeadingWithAnchorAndIdSpecialCharactersHeadingAndTextAndUrlAndZeroId() {
		String heading = "!@#$%^&*()_+";
		String anchorText = "!@#$%^&*()_+";
		String anchorUrl = "!@#$%^&*()_+";
		Integer Id = 0;
		
		Response actual = given().queryParam("anchorText", anchorText).queryParam("anchorUrl", anchorUrl).queryParam("heading", heading).queryParam("Id", Id).when().get("/headingWithAnchorAndId");
		actual
			.then()
			.body(
					"content",
					equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>!@#$%^&amp;*()_+</h1><p>Paragraph with an achor: <a href=\"!@#$%^&amp;*()_+\" id=\"" + Id + "\">!@#$%^&amp;*()_+</a></p></body></html>"
							));
	}
	
	// -------------------------------------------------- Heading With Paragraph Anchor and ID -------------------------------------------------------------------------------------------
	
		@Test
		void test_HeadingWithParagraphAndAnchorAndId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyParagraphZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyUrl() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyUrlZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyUrlAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyUrlAndParagraphAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyText() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndParagraphAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndUrl() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndUrlAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}

		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndUrlAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyTextAndUrlAndParagraphAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeading() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndParagraph() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndZeroId() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndParagraphAndZeroId() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndUrl() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndUrlAndParagraph() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndUrlAndZeroId() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndUrlAndParagraphAndZeroId() {
			String heading = "";
			String anchorText = "Anchor";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndText() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndParagraph() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndZeroId() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndParagraphAndZeroId() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndUrl() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndUrlAndParagraph() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = faker.number().hashCode();
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndUrlAndZeroId() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdEmptyHeadingAndTextAndUrlAndParagraphAndZeroId() {
			String heading = "";
			String anchorText = "";
			String anchorUrl = "";
			Integer Id = 0;
			String paragraph = "";
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		// TEST
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullParagraphAndId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullUrl() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullUrlAndId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullUrlAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullUrlAndParagraphAndId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullText() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndId() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndParagraphAndId() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndUrl() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndUrlAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}

		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndUrlAndId() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullTextAndUrlAndParagraphAndId() {
			String heading = faker.name().fullName();
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeading() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndParagraph() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndId() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndParagraphAndId() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndUrl() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndUrlAndParagraph() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndUrlAndId() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndUrlAndParagraphAndId() {
			String heading = null;
			String anchorText = "Anchor";
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndText() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndParagraph() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndId() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndParagraphAndId() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = "www.google.com";
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndUrl() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndUrlAndParagraph() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = faker.number().hashCode();
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"" + Id + "\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndUrlAndId() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdNullHeadingAndTextAndUrlAndParagraphAndId() {
			String heading = null;
			String anchorText = null;
			String anchorUrl = null;
			Integer Id = null;
			String paragraph = null;
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1></h1><p></p><p>Paragraph with an achor: <a href=\"\" id=\"\"></a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongParagraphZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongUrl() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongUrlZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongUrlAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongUrlAndParagraphAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongText() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndParagraphAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndUrl() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndUrlAndParagraph() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}

		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndUrlAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongTextAndUrlAndParagraphAndZeroId() {
			String heading = faker.name().fullName();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeading() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndParagraph() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndParagraphAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndUrl() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndUrlAndParagraph() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndUrlAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndUrlAndParagraphAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = "Anchor";
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndText() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndTextAndParagraph() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndTextAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndTextAndParagraphAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = "www.google.com";
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndTextAndUrl() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndTextAndUrlAndParagraph() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = faker.number().hashCode();
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
		
		@Test
		void test_HeadingWithParagraphAndAnchorAndIdLongHeadingAndTextAndUrlAndZeroId() {
			String heading = faker.lorem().paragraph();
			String anchorText = faker.lorem().paragraph();
			String anchorUrl = faker.lorem().paragraph();
			Integer Id = 0;
			String paragraph = faker.lorem().paragraph();
			
			Response actual = given()
					.queryParam("anchorText", anchorText)
					.queryParam("anchorUrl", anchorUrl)
					.queryParam("heading", heading)
					.queryParam("Id", Id)
					.queryParam("paragraph", paragraph)
					.when().get("/headingWithParagraphAnchorAndId");
			actual
				.then()
				.body(
						"content",
						equalTo("<html><head><title>Heading with Anchor</title></head><body><h1>" 
									+ heading + "</h1><p>" + paragraph + "</p><p>Paragraph with an achor: <a href=\"" 
									+ anchorUrl + "\" id=\"" + Id + "\">" 
									+ anchorText + "</a></p></body></html>"
								));
		}
    
    
}
