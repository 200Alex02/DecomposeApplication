@file:Suppress(
    "UnstableApiUsage", "UnstableApiUsage", "UnstableApiUsage",
    "UnstableApiUsage"
)

include(":domain")



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

rootProject.name = "DecomposeApp"
include(":app")
include(":data")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
