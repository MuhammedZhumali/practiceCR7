plugins {
    id("java")
}

group = "com.practice.java.oop"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}


repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
}
