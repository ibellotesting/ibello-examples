# ibello-examples
Example codes for the ibello test automation tool.

## Building the project
You need to build the project before running the tests.  

In case of gradle:  
Linux: `./gradlew build`  
Windows: `.\gradlew build`

In case of maven:  
Linux: `./mvnw compile`  
Windows: `.\mvnw compile`

## Running the tests
You can use the following command to run all tests:  
`ibello cucumber -texamples -thu`  

The command contains two switches:  
* `-texamples`: configures ibello to use parameters from `examples.properties`
* `-thu`: defines default language as Hungarian for Language UI tests 

If you want to learn more about switches, you can visit the following page https://www.ibello.hu/documentation-cli.  

In case the repository was cloned from git, the following additional switches should be used:  
* For gradle build: `-tgradle`  
* For maven build: `-tmaven`