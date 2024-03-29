import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

plugins {
	id("com.android.application")
	kotlin("android")
	kotlin("kapt")
}

configure<BaseAppModuleExtension> {
	compileSdk = 31

	defaultConfig {
		minSdk = 26
		targetSdk = 31
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
}
