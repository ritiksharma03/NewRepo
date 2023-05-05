## ReadME File of Project ##
We are testing the functionalities of API Demo apk.

## Tools Used: ##
• Appium
• TestNG
• Maven
• Java
• Cucumber

## Command to run tests ##
You can run tests using Testrunner.java and to run tests in cmd you can use command mvn test.

## Test Data ##
All test data is available in config file under Resources Folder. Both excel and properties file is there.

## Packages Information ##

//src/main/java

• apiDemoScreens - Define screens needed for test and contains locators and all the methods which are needed to perform click
action and getText function.

• basePage - Contains the basefile which define all the dependencies needed for app.

• excel - This package contains the ExcelFile class which is neee to read excel data.

• screenshot - This package contains Screenshot class.

• utilities - This package contains utils class which has reusable method.

//src/main/resources

log4j2.xml - This is a XML file which is used to generate the logs.

//src/test/java

• features - Define all scenario and features to be tested. There are four Features file that test the functionality of different 
features of API Demos app.
  1. Animation.feature - Feature file for Animation functionality.
  2. Graphic.feature - Feature file for Graphic functionality.
  3. OS.feature - Feature file for OS functionality.
  4. ViewTab.feature - Feature file for ViewTab functionality.

• defaultPackage: Contains Testrunner class which has cucumber features like glue, plugin and tags.

• stepdefinition: Contains all step definitions which are related to feature files.
  1. AnimationStepDef.class - Step definition class for Animation feature which has Given, when, then statements.
  2. GraphicStepDef.class - Step definition class for Graphic feature which has Given, when, then statements.
  3. OSStepDef.class - Step definition class for OS feature which has Given, when, then statements.
  4. ViewStepDef.class - Step definition class for View feature which has Given, when, then statements.
  
//src/test/resources

• extent.properties - Define properties for generating the extent report.  

## Folders Information ##

• App - This folder contains the API demos apk.

• Logs - This folder contains the GeneratedLogs.log file which has the the information of all the logs.

• Resources - This folder contains the Config.properties and TestData.xls file.

• Screenshot - This folder contains the screenshot of all the failed test cases.










