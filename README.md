# Jersey-Jetty-REST

A simple RESTful web service realized with Maven, Jersey and Jetty.

| Endpoint      | HTTP Method   | Response  |
| ------------- |:-------------:| -----:|
| /resources    | GET           | A list of available resources |
| /resources/{id} | GET         | Content of the resource with the given id |

## Usage

`mvn package`

`java -jar ./target/REST-1.0-jar-with-dependencies.jar
