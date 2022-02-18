plugins {
    id("android-library-convection")
}

dependencies {
    implementation(project(":feature-creational"))
    implementation(project(":shared-navigation"))
    implementation(project(":shared-core"))

    implementation(AndroidX.appcompat)
    implementation(AndroidX.fragment)
    implementation(AndroidX.material)
    implementation(AndroidX.navigation)
    implementation(AndroidX.navigationUi)
    implementation(Libraries.viewBinding)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)

    implementation(Dagger.DAGGER_ANDROID)
    implementation(Dagger.DAGGER_ANDROID_SUPPORT)
    kapt(Dagger.DAGGER_ANDROID_PROCESSOR)
}
