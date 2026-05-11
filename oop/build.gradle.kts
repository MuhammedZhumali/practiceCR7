plugins {
    id("java")
    id("application")
}

group = "com.practice.java.oop"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

application {
    mainClass.set("oop.JavaOopApplication")
}


repositories {
    mavenCentral()
}
