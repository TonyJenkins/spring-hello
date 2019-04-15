# Spring Hello World

A simple web app intended to check that everything is set up correctly
for Spring development.

The app uses Apache Maven as its build automation tool. Once running
the app exposes a simple web page on port 8080 of the localhost.

To install Maven, if needed, on Linux:

    $ sudo apt install maven

Maven will automatically download all the dependencies needed.
To run the app using Maven:

    $ mvn spring-boot:run

Once the app has started, pointing a web browser at http://localhost:8080
should show a simple web page.

The current version uses Spring 2 and Java 8. These versions
are set in the `pom.xml` file.
