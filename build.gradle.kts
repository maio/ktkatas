plugins {
    kotlin("jvm") version "1.4.32"
}

group = "com.bitsafe"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")
    testImplementation("com.approvaltests:approvaltests:10.4.0")

}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
