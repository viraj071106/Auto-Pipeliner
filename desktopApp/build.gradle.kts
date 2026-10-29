import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

dependencies {
    implementation(project(":shared"))

    implementation(compose.desktop.currentOs)
    implementation(libs.kotlinx.coroutinesSwing)

    implementation(libs.compose.uiToolingPreview)
}

compose.desktop {
    application {
        //javaHome = "/usr/lib/jvm/java-25-openjdk"
        mainClass = "com.example.auto_pipeliner.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Rpm, TargetFormat.Deb, TargetFormat.Msi, TargetFormat.Dmg)
            packageName = "auto-pipeliner"
            packageVersion = "1.0.0"

            linux {
                shortcut = true
                menuGroup = "Development"
            }
        }
    }
}