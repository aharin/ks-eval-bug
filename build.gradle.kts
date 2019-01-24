description = "Kotlin  Script Eval bug"

group = "co.wrisk"
version = "1.0"


plugins {
    //Tests fail when using kotlin 1.3.20 but pass in 1.3.11
    kotlin("jvm") version "1.3.20"
//    kotlin("jvm") version "1.3.11"
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val junit5Version = "5.3.1"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("compiler-embeddable"))
    implementation(kotlin("script-runtime"))
    implementation(kotlin("script-util"))

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit5Version")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junit5Version")
}

