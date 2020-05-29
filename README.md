# Spring Boot Apache Maven Multi-module example with jacoco coverage reported on sonarqube

This project imports JaCoCo's aggregate XML report to be able to report coverage across modules as well as unit
test coverage inside the module.
## Usage

* Build the project, execute all the tests and analyze the project with SonarQube Scanner for Maven:

        mvn clean verify sonar:sonar
        
* with integration tests

        mvn clean verify sonar:sonar -Pits
