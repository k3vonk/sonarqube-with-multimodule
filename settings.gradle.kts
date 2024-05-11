plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "sonarqube-with-multimodule"

include("moduleA")
include("parentModuleC")
include("parentModuleB")
include("parentModuleB:childModuleBA")
//findProject(":parentModuleB:childModuleBA")?.name = "childModuleBA"
include("parentModuleB:childModuleBB")
//findProject(":parentModuleB:childModuleBB")?.name = "childModuleBB"
include("parentModuleC:childModuleCA")
//findProject(":parentModuleC:childModuleCA")?.name = "childModuleCA"
include("parentModuleC:childModuleCB")
//findProject(":parentModuleC:childModuleCB")?.name = "childModuleCB"
