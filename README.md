# ibello-examples
Example codes for the ibello test automation tool.

## Building the project
You need to build the project before running the tests.  

In case of gradle: 
```shell 
./gradlew build
```  
In case of maven:

```shell
./mvnw compile install
```  

## Running the tests
You can use the following command to run all tests:
```shell
ibello cucumber -texamples -thu
```
The command contains two switches:  
* `-texamples`: configures ibello to use parameters from `examples.properties`
* `-thu`: defines default language as Hungarian for Language UI tests 

If you want to learn more about switches, you can visit the following page https://www.ibello.hu/documentation-cli