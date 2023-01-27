plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.appium:java-client:7.3.0")
    implementation("io.cucumber:cucumber-jvm:7.11.0")
    testImplementation("io.cucumber:cucumber-junit:7.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("io.cucumber:cucumber-java:7.11.0")
    // implementation("io.cucumber:cucumber-plugin:7.11.0")
    // implementation("io.cucumber:cucumber-jvm:7.11.0")
    // implementation("io.cucumber:cucumber-gherkin:7.11.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}