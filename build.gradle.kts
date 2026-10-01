plugins {
    id("java")
    id("jacoco")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5 (version 5.12.1)
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.1")
    
    // Hamcrest (version 2.2)
    testImplementation("org.hamcrest:hamcrest:2.2")
    
    // Mockito (version 5.14.2)
    testImplementation("org.mockito:mockito-core:5.14.2")
    testImplementation("org.mockito:mockito-junit-jupiter:5.14.2")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport{
    dependsOn(tasks.test)
}