import org.ajoberstar.reckon.gradle.ReckonExtension

plugins {
    java
    idea
    signing
    `maven-publish`
    id("org.ajoberstar.reckon") version "0.13.0"
}

configure<ReckonExtension> {
    scopeFromProp()
    stageFromProp("rc", "final")
}

defaultTasks("build", "install")

subprojects {

    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "signing")
    apply(plugin = "maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    val sourcesJar = tasks.register<Jar>("sourcesJar") {
        dependsOn(JavaPlugin.CLASSES_TASK_NAME)
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allJava)
    }

    artifacts.add("archives", sourcesJar)

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

    defaultTasks("build")
    group = "us.ascendtech"

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("com.google.jsinterop:jsinterop-annotations:2.0.0")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    }

    tasks.withType<Jar> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

}