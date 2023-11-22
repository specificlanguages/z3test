plugins {
    application
}

dependencies {
    implementation("tools.aqua:z3-turnkey:4.12.2.1")
}

repositories {
    mavenCentral()
}

application {
    mainClass = "Z3Test"
}
