[1mdiff --git a/pom.xml b/pom.xml[m
[1mindex 59ac72a..9af6757 100644[m
[1m--- a/pom.xml[m
[1m+++ b/pom.xml[m
[36m@@ -1,6 +1,99 @@[m
[31m-<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">[m
[31m-  <modelVersion>4.0.0</modelVersion>[m
[31m-  <groupId>br.com.fernando.automationbddframework</groupId>[m
[31m-  <artifactId>Fernando_BDDAutomationFramework</artifactId>[m
[31m-  <version>0.0.1-SNAPSHOT</version>[m
[32m+[m[32m<project xmlns="http://maven.apache.org/POM/4.0.0"[m
[32m+[m	[32mxmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"[m
[32m+[m	[32mxsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">[m
[32m+[m	[32m<modelVersion>4.0.0</modelVersion>[m
[32m+[m	[32m<groupId>br.com.fernando.automationbddframework</groupId>[m
[32m+[m	[32m<artifactId>Fernando_BDDAutomationFramework</artifactId>[m
[32m+[m	[32m<version>0.0.1-SNAPSHOT</version>[m
[32m+[m
[32m+[m
[32m+[m
[32m+[m	[32m<build>[m
[32m+[m		[32m<testSourceDirectory>src</testSourceDirectory>[m
[32m+[m		[32m<plugins>[m
[32m+[m
[32m+[m			[32m<plugin>[m
[32m+[m				[32m<groupId>org.apache.maven.plugins</groupId>[m
[32m+[m				[32m<artifactId>maven-surefire-plugin</artifactId>[m
[32m+[m				[32m<version>2.21.0</version>[m
[32m+[m				[32m<configuration>[m
[32m+[m					[32m<includes>[m
[32m+[m						[32m<include>br/com/fernando/automationbddframework/**/*.java</include>[m
[32m+[m					[32m</includes>[m
[32m+[m					[32m<parallel>all</parallel>[m
[32m+[m					[32m<threadCount>2</threadCount>[m
[32m+[m				[32m</configuration>[m
[32m+[m			[32m</plugin>[m
[32m+[m
[32m+[m		[32m</plugins>[m
[32m+[m	[32m</build>[m
[32m+[m
[32m+[m	[32m<dependencies>[m
[32m+[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-junit -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>info.cukes</groupId>[m
[32m+[m			[32m<artifactId>cucumber-junit</artifactId>[m
[32m+[m			[32m<version>1.2.5</version>[m
[32m+[m			[32m<scope>test</scope>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-java -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>info.cukes</groupId>[m
[32m+[m			[32m<artifactId>cucumber-java</artifactId>[m
[32m+[m			[32m<version>1.2.5</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.seleniumhq.selenium</groupId>[m
[32m+[m			[32m<artifactId>selenium-java</artifactId>[m
[32m+[m			[32m<version>3.11.0</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>commons-io</groupId>[m
[32m+[m			[32m<artifactId>commons-io</artifactId>[m
[32m+[m			[32m<version>2.6</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.apache.maven.shared</groupId>[m
[32m+[m			[32m<artifactId>maven-shared-utils</artifactId>[m
[32m+[m			[32m<version>0.1</version>[m
[32m+[m			[32m<scope>test</scope>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.easetech</groupId>[m
[32m+[m			[32m<artifactId>easytest-core</artifactId>[m
[32m+[m			[32m<version>1.4.0</version>[m
[32m+[m			[32m<scope>test</scope>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m
[32m+[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/org.dom4j/dom4j -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.dom4j</groupId>[m
[32m+[m			[32m<artifactId>dom4j</artifactId>[m
[32m+[m			[32m<version>2.1.0</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.apache.poi</groupId>[m
[32m+[m			[32m<artifactId>poi-ooxml</artifactId>[m
[32m+[m			[32m<version>3.8</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m		[32m<!-- pom.xml -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>com.aventstack</groupId>[m
[32m+[m			[32m<artifactId>extentreports</artifactId>[m
[32m+[m			[32m<version>3.1.5</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m
[32m+[m	[32m</dependencies>[m
[32m+[m
 </project>[m
\ No newline at end of file[m
