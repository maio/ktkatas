import org.gradle.internal.impldep.org.junit.platform.launcher.EngineFilter.includeEngines
import org.jetbrains.kotlin.js.translate.context.Namer.kotlin

plugins {
    kotlin("jvm") version "1.9.21"
}

group = "cz.maio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("com.approvaltests:approvaltests:22.2.1")
    testImplementation("net.jqwik:jqwik:1.8.1")
}

tasks {
    test {
        useJUnitPlatform {
            includeEngines("jqwik", "junit-jupiter")
        }

        testLogging.exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        testLogging.showCauses = true
    }
}

kotlin {
    jvmToolchain(17)

    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}
