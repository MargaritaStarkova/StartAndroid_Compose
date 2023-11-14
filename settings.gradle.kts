pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StartAndroid_Compose"
include(":l1-5_basics")
include(":l6_state")
include(":l7_checkbox")
include(":l7_textfield")
include(":l8_recomposition")
