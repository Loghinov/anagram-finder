                                            Anagram Finder
This is a small Java project that reads a text file containing words and groups the anagrams.

# Tech stack used
- Java 21 
- Maven 
- Git

# Before starting the application, make sure that:
- JDK 21 is installed. 
- Maven is installed. 
- The project is cloned locally using git clone.

# Compiling the project
- Directly from the IDE 
- On the right side panel, find the Maven tab 
- Select the project, in our case "anagram-finder"
- Open the LifeCycle section 
- Select Install.

# From the terminal (bash)
-Run the command in the terminal: mvn clean install.

# How to run the application!
- Go to Run -> Edit -> Program arguments -> Add the path to your file, for example "sample.txt" -> Click OK. 
- Press Run to start the application. 

# The input file will contain:
act
cat
tree
race
care
acre
bee

The output will be:
[act, cat]
[tree]
[race, care, acre]
[bee]

# Design decisions
- For this information, please refer to DESIGN.md