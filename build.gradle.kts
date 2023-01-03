plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("io.cucumber:cucumber-java:7.10.1")
    implementation("io.appium:java-client:7.3.0")
    testImplementation("io.cucumber:cucumber-junit:7.10.1")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}