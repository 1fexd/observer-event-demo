plugins {
    java
    kotlin("jvm") version "1.8.21"
}

group = "fe.observer-event-demo"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
