Mobile exercise 3 

To make connection to the mobilecloud - 
place your token in the token.properties file inside project root directory.



To run native local tests:
mvn test -P native

To run native Cloud iOS tests:
mvn test -P nativeCloudIOS

To run native Cloud Andoid tests:
mvn test -P nativeCloudAndoid


To run web local tests:
mvn test -P web

To run web Cloud iOS tests:
mvn test -P webCloudIOS

To run web Cloud Android tests:
mvn test -P webCloudAndroid

