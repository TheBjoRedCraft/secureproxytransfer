plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "secureproxytransfer"
include("secureproxytransfer-api")
include("secureproxytransfer-paper")
include("secureproxytransfer-velocity")
include("secureproxytransfer-common")