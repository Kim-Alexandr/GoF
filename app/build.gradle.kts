plugins {
    id("android-application-convection")
}

dependencies {
    implementation(project(":shared-core"))
    implementation(project(":shared-navigation"))
    implementation(project(":feature-selection"))

    implementation (AndroidX.material)
    implementation (AndroidX.navigation)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)

    implementation(Dagger.DAGGER_ANDROID)
    implementation(Dagger.DAGGER_ANDROID_SUPPORT)
    kapt(Dagger.DAGGER_ANDROID_PROCESSOR)
}
