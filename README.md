# LongNesbett-ActivityTracker
Semester long project for CSCI 360: Software Architecture and Design

### Link to the presentation: https://drive.google.com/file/d/1zXLYvYMOnhZfIcrYTRQtbx4a5tyhIRFi/view?usp=sharing

# Overview
Activity trackers, or sometimes referred to as fitness trackers, is a device or application for monitoring and tracking fitness-related metrics. Typical fitness trackers keep a record of parameters such as distance walked, calorie consumed, time asleep, and even a user's heartbeat. In 2015 the International Journal of Cardiology labeled Fitbit as an extremely accurate and reliable device for wireless physical activity tracking. Physicians at the Journal of Cardiology recognized the importance of these devices when it comes to monitoring physical activity for the prevention and maintenance of chronic diseases. 

For our semater long project is Software Architecuture and Design, we will be building an Activity Tracker that helps users with thir daily exersice habits

## Getting Started

``` git clone https://github.com/ctlong12/LongNesbett-ActivityTracker.git```

Ideally, the program should work as soon as it it clones. However, if it doesnt seem to be working we can trouble shoot it a little bit. 

### Option 1: Java SDK 13
The Activity Tracker needs to run on Java SDK 13. To check this go to File > Project Structure > Modules and make sure Java SDK 13 is selected

### Option 2: JSON.jar File
A JSON package is required to make API requests. This may not be initualized at first. To add it to the project simply go to 
File > Project Structure > Modules and add the JSON.jar file found under the directory **prototypes**

### Option 3: JUnit Package Error
The JUnit package we use for texting may not be connected right away. To link that connection, go to User.java and right click User where we delcare the inital class. Right click User then Goto > Test > Create New Test > Fix. After clicking Fix just hit cancel and the link should be made. 

### Option 4: JavaFX Package Error
You may need to install the JavaFX librarys to get the User Interface to work. To install the library go to File > Project Structure > Modules. Find to where you downloaded JavaFX and import the lib folder from your JavaFX Package. 

### Option 5: Editing Configurations 
You may just need to esablish your inital configration to the Acvtivity Tracker. To do this go to the dropdown at the top right and click Eit Configurations and add the following to the given fields. 

Main Class: ActivityTracker.ActivityTracker<br>
VM OPtions: --module-path /path/to/javafx-sdk-{YOUR JAVA 13 VERSION}/lib --add-modules javafx.controls,javafx.fxml<br>
Working Directory: /path/to/LongNesbett-ActivityTracker<br>
Use Classpath of Module: LongNesbett-ActivityTracker<br>
JRE: 13<br>


Following these steps should endure the application is able to build if not successful upon first launch. 






