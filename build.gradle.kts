plugins {
    java
}

repositories {
    mavenCentral()
}

group = "com.devmind.testinaction"
version = "0.0.1-SNAPSHOT"

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {

}

tasks.withType<Test> {
    useJUnitPlatform()
}


