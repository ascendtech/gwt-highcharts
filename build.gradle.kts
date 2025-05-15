plugins {
    java
    idea
    id("us.ascendtech.gwt.lib") version "0.11.1" apply false
    signing
    `maven-publish`
    alias(libs.plugins.reckon)
}

reckon {
    setDefaultInferredScope("patch")
    setScopeCalc(calcScopeFromProp())
    snapshots()
    stages("beta", "final")
    setStageCalc(calcStageFromProp())
}

allprojects {
    group = "us.ascendtech"
}


defaultTasks("build")

subprojects {

    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "signing")
    apply(plugin = "maven-publish")

    defaultTasks("build")
    group = "us.ascendtech"

    configurations.all {
        // check for updates every build more than 10 minutes apart (for snapshots)
        resolutionStrategy.cacheChangingModulesFor(10, TimeUnit.MINUTES)
    }

    tasks.withType<JavaCompile> {
        options.isDebug = true
        options.debugOptions.debugLevel = "source,lines,vars"
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

    sourceSets {
        main {
            java {
                srcDir("src/main/java")
            }
            resources {
                srcDir("src/main/java")
            }
        }
    }

    idea.module {
        resourceDirs = resourceDirs - file("src/main/java")
    }

    val sourcesJar = tasks.register<Jar>("sourcesJar") {
        dependsOn(JavaPlugin.CLASSES_TASK_NAME)
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allJava)
    }

    artifacts.add("archives", sourcesJar)

    tasks.withType<Jar> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                artifact(tasks["sourcesJar"])
                pom {
                    url.set("https://ascend-tech.us")
                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("mdavis")
                            name.set("Matt Davis")
                            email.set("matt.davis@ascend-tech.us")
                            organization.set("Ascendant Software Technology, LLC")
                            organizationUrl.set("https://www.ascend-tech.us")
                        }
                        developer {
                            id.set("payam.meyer")
                            name.set("Payam Mayer")
                            email.set("payam.meyer@ascend-tech.us")
                            organization.set("Ascendant Software Technology, LLC")
                            organizationUrl.set("https://www.ascend-tech.us")
                        }
                    }
                    scm {
                        connection.set("git@github.com:ascendtech/gwt-highcharts.git")
                        developerConnection.set("git@github.com:ascendtech/gwt-highcharts.git")
                        url.set("https://github.com/ascendtech/gwt-highcharts.git")
                    }
                    name.set(project.name)
                    description.set(project.name)
                }
            }
        }
    }

    repositories {
        mavenCentral()
    }



}