# TheDavidBox client for Java (thedavidbox-client4j)
[![Build Status](http://travis-ci.org/vikingbrain/thedavidbox-client4j.svg?branch=master)](http://travis-ci.org/vikingbrain/thedavidbox-client4j "Check this project's build status on TravisCI")
[![Coverage Status](https://coveralls.io/repos/vikingbrain/thedavidbox-client4j/badge.png?branch=master)](https://coveralls.io/r/vikingbrain/thedavidbox-client4j?branch=master)
[![PayPal donate button](http://img.shields.io/paypal/donate.png?color=blue)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=9UAHFFF7B2BLG "Donate once-off to this project using Paypal")  
[![Bitcoin donation](http://static.vikingbrain.com/images/bitcoin-small.png)](https://blockchain.info/address/13t5W36tcrirhwwMG8WkDDc5aa89acmJe5 "Bitcoin donation") BTC: 13t5W36tcrirhwwMG8WkDDc5aa89acmJe5  
[![Ethereum donation](http://static.vikingbrain.com/images/ethereum-small.png)](https://www.etherchain.org/account/0x7fC401f9ca6c707177Bc082d193A1C7120659C51 "Ethereum donation") ETH: 0x7fC401f9ca6c707177Bc082d193A1C7120659C51

thedavidbox-client4j is a Java HTTP client for consuming [TheDavidBox Service API](https://developer.cloudmedia.com) on Networked Media Tank devices such as Popcorn Hour A200, A210, A300, A400, A410, C200, C300, PopBox 3D, PopBox V8 based in NMT system

## Requirements

java 1.5+

## Getting Started

The latest thedavidbox-client4j artifacts are published to maven central. Bringing thedavidbox-client4j into your project should be as simple as adding the following to your maven pom.xml file:

```xml
  <dependencies>
    <dependency>
      <groupId>com.vikingbrain</groupId>
      <artifactId>thedavidbox-client4j</artifactId>
      <version>1.2.1</version> <!-- or whatever the latest version is -->
    </dependency>
  </dependencies>
```

```xml
  <!-- Maven dependency for an Android application project -->
  <dependencies>
    <dependency>
      <groupId>com.vikingbrain</groupId>
      <artifactId>thedavidbox-client4j</artifactId>
      <version>1.2.1</version> <!-- or whatever the latest version is -->
      <exclusions>
		<exclusion>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
		</exclusion>
		<exclusion>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpcore</artifactId>
		</exclusion>
		<exclusion>
			<groupId>stax</groupId>
			<artifactId>stax</artifactId>
		</exclusion>
		<exclusion>
			<groupId>stax</groupId>
			<artifactId>stax-api</artifactId>
		</exclusion>
		<exclusion>
			<groupId>xpp3</groupId>
			<artifactId>xpp3</artifactId>
		</exclusion>
	  </exclusions>
    </dependency>
  </dependencies>
```

##Downloads:
* **[thedavidbox-client4j-1.2.1-jar-with-dependencies.jar](https://repo1.maven.org/maven2/com/vikingbrain/thedavidbox-client4j/1.2.1/thedavidbox-client4j-1.2.1-jar-with-dependencies.jar)** (All required dependencies attached)
* **[thedavidbox-client4j-1.2.1-android.jar](https://repo1.maven.org/maven2/com/vikingbrain/thedavidbox-client4j/1.2.1/thedavidbox-client4j-1.2.1-android.jar)** (Ready to use on your Android app)
* **[thedavidbox-client4j-1.2.1-sources.jar](https://repo1.maven.org/maven2/com/vikingbrain/thedavidbox-client4j/1.2.1/thedavidbox-client4j-1.2.1-sources.jar)**
* **[thedavidbox-client4j-1.2.1-javadoc.jar](https://repo1.maven.org/maven2/com/vikingbrain/thedavidbox-client4j/1.2.1/thedavidbox-client4j-1.2.1-javadoc.jar)**
* **[thedavidbox-client4j-1.2.1.jar](https://repo1.maven.org/maven2/com/vikingbrain/thedavidbox-client4j/1.2.1/thedavidbox-client4j-1.2.1.jar)** (Wihout dependencies)

### Quickstart

Creating a client:
```java
/** Create a client with default client options */
TheDavidBoxClient theDavidBoxClient = new TheDavidBoxClientImpl("IPorHostName");

/** Create a client with your custom default client options */
ClientOptions clientOptions = new ClientOptions.Builder()
	.defaultRotationDegree(RotationDegree.ROTATION_270)	//override default
	.defaultSlideInterval(23)							//override default
	.defaultDisplayMode(DisplayMode.SHOW)				//override default
	...
	.build();

TheDavidBoxClient theDavidBoxClient = new TheDavidBoxClientImpl("IPorHostName",
      clientOptions);
```

The thedavidbox-client4j operations are divided in ten modules: ModuleDownloadManager, ModuleDeployment, ModuleFile, ModuleNetworkBrowse, ModulePlayback, ModuleSetting, ModuleSystem, ModuleMetadata, ModuleMetadataDatabase, ModuleUpnp.

Create and execute an operation from a module:
```java
//Get the module for the operation
ModulePlayback modulePlayback = theDavidBoxClient.getModulePlayback();

String audioPath = "file:///opt/sybhttpd/localhost.drives/SATA_DISK/music/mock.mp3";

/** Operation start audio on NMT. It is built using the DisplayMode specified in your
default client options so you don't need to specify it every time. */
modulePlayback.buildStartAodOperation(audioPath).execute();

/** Or redefine the attributes for the operation at any time */
StartAodOperation startAodOperation = modulePlayback.buildStartAodOperation(audioPath);
startAodOperation.setDisplayMode(DisplayMode.HIDE); //background mode
startAodOperation.execute();


//Other operation examples
CreateDownloadTaskOperation operation = theDavidBoxClient.getModuleDownloadManager().
    buildCreateDownloadTaskOperation("http://movie.torrent", "MovieName");

ListNetworkResourceOperation operation = theDavidBoxClient.getModuleNetworkBrowse().
		buildListNetworkResourceOperation();
```

Using an operation listener will provide information about requests and responses from the NMT device:
```java
public class OperationListener implements TheDavidboxOperationListener{

	@Override
	public void onSendHttpRequest(String request) {
		logger.debug(request);
	}

	@Override
	public void onReceiveXmlResponse(String xmlResponse) {
		logger.debug(xmlResponse);
	}

}

//Use the constructor providing the listener
TheDavidBoxClient client = new TheDavidBoxClientImpl("IPorHostName",
      clientOptions, new OperationListener());
```

About the responses:
```java
try {
	ResponseGetPlaybackSpeedVod response = theDavidBoxClient.getModulePlayback().
			buildGetPlaybackSpeedVodOperation().execute();

	//Check first that response is valid
	if (response.isValid()){
		logger.info("Speed: " + response.getSpeed());
	} else {
		//if it is not valid you can see a description for the problem
		logger.info("Problem description: " + response.getTypeReturnValue().
            getDescription());
	}
} catch (TheDavidBoxClientException e) {
	//NMT device is switched off, problem parsing xml response, unreachable IP address, etc...
	e.printStackTrace();
}
```

## Building / Testing

To build locally you must use Java 1.5+ for compiling and apache maven 3.0.3+

```
mvn compile
```
To run tests:

```
mvn test
```
## Problems?

If you find any issues please [report them](https://github.com/vikingbrain/thedavidbox-client4j/issues) or better,
send a [pull request](https://github.com/vikingbrain/thedavidbox-client4j/pulls).

## Author:
* Rafael Iñigo (vikingBrain)

## License

Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0

## Disclaimer third parties

All product and company names are trademarks™ or registered® trademarks of their respective holders. Use of them does not imply any affiliation with or endorsement by them.
All specifications are subject to change without notice.
Popcorn Hour, Popbox, Networked Media Tank and SayaTv are trademarks of Syabas Technology Inc., Registered in the U.S.
