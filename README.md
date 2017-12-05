# Website
This readme describes how to build and start web site with Reviews.
Edit file application.properties to use your Mysql database.

To build application you need maven. You can get it on maven.apache.org.

Run in console:<pre>mvn clean package</pre>
If build is successful, then build archive can be found in <pre>target/website-1.0-SNAPSHOT.war`</pre>
Deply it to your tomcat server.
