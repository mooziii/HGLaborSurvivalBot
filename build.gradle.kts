plugins {
    java
    kotlin("jvm") version "1.4.31"
    application
}

group = "de.hglabor"
version = "1.0.0"

repositories {
    mavenCentral()
    jcenter()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("dev.kord:kord-core:0.7.x-SNAPSHOT")
    implementation("com.gitlab.kordlib:kordx.emoji:0.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
    implementation("io.github.config4k:config4k:0.4.2")
    implementation("org.slf4j:slf4j-simple:1.7.30")
    implementation("org.apache.commons:commons-lang3:3.11")
}

application {
    mainClass.set("de.hglabor.ManagerKt")
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>{
        kotlinOptions.jvmTarget = "11"
    }
}
