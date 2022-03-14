plugins {
    id("android-library-convection")
}

dependencies {
    implementation(project(":shared-navigation"))
    implementation(project(":shared-core"))
    implementation(project(":shared-solid"))

    //todo вот эту штуку надо обяз исправить
    implementation(project(":feature-srp"))
    implementation(project(":feature-ocp"))
    implementation(project(":feature-lsp"))
    implementation(project(":feature-isp"))
    implementation(project(":feature-dip"))

    implementation(AndroidX.fragment)
    implementation(AndroidX.material)
    implementation(Libraries.viewBinding)

    implementation(Dagger.dagger)
    kapt(Dagger.daggerCompile)
}
