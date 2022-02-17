plugins {
    id("android-library-convection")
}

dependencies {
    implementation(project(":shared-navigation"))

//    implementation(AndroidX.appcompat)
    implementation(AndroidX.fragment)
    implementation(Libraries.viewBinding)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)

    implementation(Dagger.DAGGER_ANDROID)
    implementation(Dagger.DAGGER_ANDROID_SUPPORT)
    kapt(Dagger.DAGGER_ANDROID_PROCESSOR)
}
