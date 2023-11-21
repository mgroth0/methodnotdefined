plugins {
    kotlin("multiplatform")
}
repositories {
    mavenCentral()
}

kotlin {

    jvm {


        dependencies {


//            implementation()


        }
        testRuns.configureEach {
            executionTask.configure {

            }
        }
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":k:sub2"))

            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}