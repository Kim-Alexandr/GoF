plugins {
    id("android-library-convection")
}

dependencies {
    implementation(AndroidX.appcompat)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)
}
