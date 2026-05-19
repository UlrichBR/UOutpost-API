# UOutpost-API

The official integration API for the UltimateOutpost ecosystem. Built to provide content creators and developers with complete control over outpost management, internal hooks, and custom events.

[![Maven Central](https://img.shields.io/maven-central/v/io.github.ulrichbr/UltimateOutpost?color=blue&label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.ulrichbr/UltimateOutpost)
[![](https://jitpack.io/v/UlrichBR/UOutpost-API.svg)](https://jitpack.io/#UlrichBR/UOutpost-API)
[![Java Version](https://img.shields.io/badge/Java-8-orange?logo=openjdk)](https://pom.xml)

---

## 🚀 How to Integrate into Your Project

Choose one of the repositories below to add the UltimateOutpost API as a dependency in your build manager (Maven).

### Option 1: Maven Central (Recommended)
The official, fastest, and most stable method. It does not require adding any extra repository to your `pom.xml`, as the Maven ecosystem fetches the artifacts natively.

```xml
	dependencies {
	        implementation("io.github.ulrichbr:UltimateOutpost:VERSION")
	}
```

```xml
<dependencies>
    <dependency>
        <groupId>io.github.ulrichbr</groupId>
        <artifactId>UltimateOutpost</artifactId>
        <version>VERSION</version> 
        <scope>provided</scope>
    </dependency>
</dependencies>
```

### Option 2: JitPack (Alternative)
Use this option if you need to compile specific commits from branches or legacy versions hosted directly on the GitHub repository.

```xml

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        implementation 'com.github.UlrichBR:UOutpost-API:VERSION'
	}
```

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>[https://jitpack.io](https://jitpack.io)</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.UlrichBR</groupId>
        <artifactId>UOutpost-API</artifactId>
        <version>VERSION</version> 
        <scope>provided</scope>
    </dependency>
</dependencies>
```


### 📄 License
This project is licensed under the MIT License. See the LICENSE file for more details.