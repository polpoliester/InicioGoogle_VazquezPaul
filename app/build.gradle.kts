plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")
}

android {
    namespace = "vazquez.paul.practica10"
    compileSdk = 35

    defaultConfig {
        applicationId = "vazquez.paul.practica10"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("androidx.credentials:credentials:1.5.0-alpha05")

    // Firebase BoM (maneja las versiones de forma centralizada)
    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
    // Firebase Authentication
    implementation("com.google.firebase:firebase-auth")

    //Google
    // Google Identity Services (para iniciar sesión con Google One Tap)
    implementation("androidx.credentials:credentials:1.2.0-alpha01")
    implementation("androidx.credentials:credentials-play-services-auth:1.2.0-alpha01")
    // Jetpack Compose UI core
    implementation("androidx.compose.ui:ui:1.6.0")

    // Material Design components
    implementation("androidx.compose.material:material:1.6.0")

    // Herramientas para previsualización en el IDE
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.0")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.googleid)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}