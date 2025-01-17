description = "Alter Servers Plugins"

dependencies {
    implementation(projects.gameServer)
    implementation(projects.util)
    implementation(projects.net)
    implementation(libs.openrs2.cache)
    implementation(kotlin("script-runtime"))
    implementation(project(":game-api"))
}

tasks.named<Jar>("jar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
