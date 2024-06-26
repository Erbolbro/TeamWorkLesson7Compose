plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
dependencies {
    implementation(project(":presentation"))
    implementation(libs.kotlinx.coroutines.core)
    implementation(project(":common"))
    implementation(project(":common"))
}
