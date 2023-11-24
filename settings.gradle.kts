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
include(":l9_remember")
include(":l10_remember_mutablestateof")
include(":l11_list_callsite_key")
include(":l12_viewmodel")
include(":l12_flow_rx_livedata")
include(":l12_uistate")
include(":l13_modifier")
include(":l13_modifier_scope")
