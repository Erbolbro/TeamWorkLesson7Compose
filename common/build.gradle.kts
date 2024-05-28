plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_18
    targetCompatibility = JavaVersion.VERSION_18
}
dependencies {
    implementation(libs.compose.preview.renderer)
    implementation(project(":common"))
    implementation(project(":data"))
}