plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "sonarqube-with-multimodule"

include("moduleA")
include("parentModuleC")
include("parentModuleB")
include("parentModuleB:childModuleBA")
include("parentModuleB:childModuleBB")
include("parentModuleC:childModuleCA")
include("parentModuleC:childModuleCB")
include("code-coverage-report")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
