plugins {
    id("kotlin-conventions")
    id("jacoco-report-aggregation")
}

repositories {
    mavenCentral()
}

dependencies {
    jacocoAggregation(projects.moduleA)
    jacocoAggregation(projects.parentModuleB.childModuleBA)
    jacocoAggregation(projects.parentModuleB.childModuleBB)
    jacocoAggregation(projects.parentModuleC.childModuleCA)
    jacocoAggregation(projects.parentModuleC.childModuleCB)
}

tasks.jacocoTestReport {
    finalizedBy(tasks.named<JacocoReport>("testCodeCoverageReport")) // report is always generated after tests run
}
