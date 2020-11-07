plugins {
    kotlin("jvm") version "1.4.0-rc"
}

group = "com.bitsafe"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.assertj:assertj-core:3.11.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
    testImplementation("com.approvaltests:approvaltests:9.3.0")

}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
