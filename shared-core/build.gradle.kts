plugins {
    id("android-library-convection")
}

dependencies {
    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)
}
