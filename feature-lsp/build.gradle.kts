plugins {
    id("android-library-convection")
}

dependencies {
    implementation(project(":shared-navigation"))
    implementation(project(":shared-solid"))

    implementation(AndroidX.material)
    implementation(Libraries.viewBinding)
}
