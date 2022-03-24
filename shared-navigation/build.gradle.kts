plugins {
    id("android-library-convection")
}

dependencies {
    implementation(AndroidX.navigation)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)
}
