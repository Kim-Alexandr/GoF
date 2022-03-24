plugins {
    id("android-library-convection")
}

dependencies {
    implementation(project(":feature-solid"))
    implementation(project(":feature-srp"))
    implementation(project(":feature-ocp"))
    implementation(project(":feature-lsp"))
    implementation(project(":feature-isp"))
    implementation(project(":feature-dip"))
}
