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

rootProject.name = "notes"
include(":app")
include(":main-notes")
include(":settings")
include(":notes-edit")
include(":core-ui")
include(":main-notes:data")
include(":main-notes:domain")
include(":main-notes:presentation")
include(":main-notes:navigationApi")
include(":notes-edit:data")
include(":notes-edit:domain")
include(":notes-edit:presentation")
include(":settings:data")
include(":settings:domain")
include(":settings:presentation")
include(":settings:navigationApi")
include(":notes-edit:navigationApi")
