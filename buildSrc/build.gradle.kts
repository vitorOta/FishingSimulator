//inspired from https://medium.com/android-dev-br/usando-arquivos-kotlin-para-gerenciar-suas-depend%C3%AAncia-b61d2480a501

plugins {
    `kotlin-dsl`
}

repositories {
    // The org.jetbrains.kotlin.jvm plugin requires a repository
    // where to download the Kotlin compiler dependencies from.
    jcenter()
}