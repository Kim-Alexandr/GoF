plugins {
    id("android-library-convection")
}

dependencies {
    implementation(project(":shared-navigation"))
    implementation(project(":shared-core"))
    implementation(project(":shared-solid"))

    implementation(AndroidX.fragment)
    implementation(AndroidX.material)
    implementation(Libraries.viewBinding)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)
}
