# Kayak Automation Problem - SDET Assessment

Test automation program for the following actions:

Go to https://www.kayak.com.co/ 

1. Search for a trip:
  - From Medellín to San Francisco 
  - Depart date March 10, 2021 
  - Return Date March 20, 2021
  - 2 Adults and 1 Child
2. After searching, update the departure date to April 10, 2021 and return date to April 20, 2021, and search again.
3. Select the option with the lowest price.
4. See the offer (it will redirect to a new page).
5. Validate that the offer is for the trip from Medellin to San Francisco.

# Assumptions

According to the original statement, the program should update the departure date to December 15, 2020 and the return date to January 5, 2021. But kayak.com.co does not allow you to look for dates that are less than the current date. Therefore, I used April 10, 2020 and April 20, 2020 instead.

# Languages and technologies

The languages and technologies used in this project are the following:

- Java 1.8.0
- Serenity BDD 2.1.2
- Screenplay
- Cucumber 1.9.45
- Gherkin
- JUnit 4.12 
- Git

# Instructions

To run this program, the following steps must be performed:

1. Create folder KayakAutomationAssessment in your local files
2. Create new Git repository in KayakAutomationAssessment folder > git init
3. Clone the project > git remote add origin https://github.com/JhonnyOcampo/KayakAutomationAssessment.git
4. Pull the project > git pull origin master
5. Open the project with your favorite IDE (IntelliJ, Eclipse, etc), gradle will automatically download the dependencies.
6. Add the plugins Cucumber for Java and Gherkin in your IDE
7. Execute the Runner "Kayak" with JUnit or Gradle
8. Execute :aggregate in order to generate report


# Report

Report on test results can be found in the following folder: 
https://github.com/JhonnyOcampo/KayakAutomationAssessment/tree/master/target/site/serenity

To open the report, you must download the folder and open the index.html file.
