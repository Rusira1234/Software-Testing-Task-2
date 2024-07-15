# j2html Test Suite

In this Test Suite, following testing tools are used.

1.	Junit
2.	TestNG
3.	Rest Assured
4.	Allure Reporting
5.	Faker
6.	aShot
7.	Evosuite

Evosuite was used to generate test cases automatically for JUnit test methods and it is avaliabe as a seperate project for the reference of how test cases can be generated.

The main reason to have seperate files for Junit test methods and test cases is to follow coding practices of java object oriented programming.

## Getting started
### 1. To build the project

1. right click on the parent directory "Software-Testing-Task-2".
2. go to maven -> Update Project

### 2. To run the JUnit Test cases

1. right click on 'JUnitTestCases' file avaliable on "src/test/java/com.sdetadda.allure" path.
2. run it as a JUnit test case.

### 3. To run the TestNG Test cases

1.  right click on 'TestNGTestCases' file avaliable on "src/test/java/com.sdetadda.allure" path.
2. run it as a TestNG test test.

### 4. To run the RestAssured Test cases
1. click on 'com.sdetadda.allure' parent folder avaliable on "src/test/java" path.
2. run it as a java application to start the springboot server.
3. After springboot server started, right click on "RestAssuredTestCases" and run it as a TestNG test.

### 5. The aShot usage
1. the aShot usage with chrome web driver is represented in the 'CaptureLogoImage' file.
2. this is where the screenshot of allure report is taken.
