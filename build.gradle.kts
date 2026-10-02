plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "uk.co.developmentanddinosaurs"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation(libs.kotest.runner)
    testImplementation(libs.kotest.assertions)
}

tasks.test {
    useJUnitPlatform()
}
