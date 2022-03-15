plugins {
    id("android-application-convection")
}

dependencies {
    implementation(project(":shared-core"))
    implementation(project(":shared-navigation"))

    implementation(project(":feature-selection"))
    implementation(project(":feature-solid"))
    implementation(project(":feature-srp"))
    implementation(project(":feature-ocp"))
    implementation(project(":feature-lsp"))
    implementation(project(":feature-isp"))
    implementation(project(":feature-dip"))

    implementation (AndroidX.material)
    implementation (AndroidX.navigation)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)
}
