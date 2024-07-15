package com.sdetadda.allure;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HtmlComparisonTest {

    public String normalizeHtml(String html) {
        Document doc = Jsoup.parse(html);
        return doc.outerHtml();
    }

    @Test
    public void testHtmlResponse() {
        Response response = get("your/api/endpoint");

        String actualHtml = response.getBody().asString();
        String expectedHtml = "<html><head><title>Heading with Anchor</title></head><body><h1>Gabriella O'Keefe</h1><p>Paragraph with an achor: <a href=\"\" id=\"0\">Anchor</a></p></body></html>";

        // Normalize both HTML strings
        String normalizedActualHtml = normalizeHtml(actualHtml);
        String normalizedExpectedHtml = normalizeHtml(expectedHtml);

        assertEquals(normalizedActualHtml, normalizedExpectedHtml);
    }
}

