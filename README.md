# phonekeys2letters
### Objectives

To conduct a comprehensive deliverable to demonstrate project activities and results.

### Target

a Java demo application to show Maven abilities to allow users to input phone dialing keys to obtain all possible alphabetical character combinations.

### Requirements

-	A map of numeric digits to alphabetical letters reflects the phone keypad matrix;
-	Users can input multiple numeric digits from 0 to 99;
-	Users can observe all the possible alphabetical letter combinations from the output of the application according to the phone pad digit to letter layout;
-	Coding needs to be done with a Maven project with unit test, and established on Github.

### Application Design

-	Inputs: 1-2 numeric digits from 0 to 99 (ideally 1-N inputs, to show the basic functions of the application, we use 1-2 inputs instead);
-	Outputs: all possible alphabet combinations following phone pad matrix;
-	Monolithic application: for the clear implementing purpose, not using any other application architectures;
- GUI: Console output;
-	Map: Proper data structure to contain the digit to letter mapping;
- List: Proper data structure to transfer the letter combination result;
-	Json: api implementation if necessary.

### Extended Design

This application is for demonstration of the Maven project only. In the real production implementation, we can use database to help increase computing speed and user experience.
Because every digit, except 0 and 1, is mapped to multiple alphabets, the code needs to handle combinations in enumerative or recursive way when users put the first and second digit inputs together. The single digit input, e.g. 0 to 9, will be easy to handle in the Java functions, however, extra computing effort will be needed when the inputs climb up to double digits, e.g. 10 to 99. In order to increase the computing speed, a MySQL database can be used to record the results of the combinations when every time user combine the first single digit to obtain the letter outcomes, and we can use the recording in DB to help combine double digit inputs after. This will give users a clear speed increasing of the application.

### Prerequisitions

- Java JDK 1.8.0_241
- Junit 4.13
- Eclipse Java EE IDE  ver. 2019-12 (4.14.0) (Maven 3.6.3 included)

### Action Plan

1.	Set up the development environment and development components, including Java JDK 1.8.0_241, Maven 3.6.3, and Eclipse Java EE IDE  ver. 2019-12 (4.14.0)
2.	Maven project implementation
3.	Unit test implementation, including testing
4.	Documenting and Github upload

### Process Schedule

Scheduling excel sheet is available to download.

### Porject Result

a runnable Maven structured and managed Java code with unit tests is provided and available for download.

### User Guide
- open the Java project by Eclipse (or any other capatible IDE)
- go to the "phonekeys2letters" project, directory/file path "src/main/java" -> "com.xzy.phonekeys2letters" -> "PhoneKeyConverter.java"
- double click to open the "PhoneKeyConverter.java" on text editor of the Eclipse IDE (or other capatible IDEs)
- change the String type variable of str to be your own input in the main method, please follow the example text format on the comment section
- verify your output on the IDE console

### About the author

Zhiyao Xu (许志尧), bachelor of Science, Computer Engineering degree from University of New Brunswick. Worked as software quality assurance consultant, electrical designer, software developer, sales representative, and marketing associate. Interested in innovation, motivation, outdoor activities, group projects (open topic).
