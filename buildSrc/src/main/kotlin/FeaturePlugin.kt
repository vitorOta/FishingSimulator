import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

/**
 *
 * @author Vitor Ota
 * @since 14/05/2019
 */
class FeaturePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        configureDependencies(project)
        configurePlugins(project)

    }

    private fun configurePlugins(project: Project) {
        project.plugins.run {
            apply(BuildPlugins.kotlinAndroidExtensions)
            apply(BuildPlugins.navigationSafeArgs)
            //TODO add the others plugins here
        }
    }
}

private fun configureDependencies(project: Project) {
    val implementation = "implementation"
    val testImplementation = "testImplementation"
    val androidTestImplementation = "androidTestImplementation"

    project.dependencies {
        add(implementation, project(Modules.ui_components))

        add(implementation, Libraries.appCompat)
        add(implementation, Libraries.constraintLayout)
        add(implementation, Libraries.kotlin)
        add(implementation, Libraries.kotlinExtensions)
        add(implementation, Libraries.navigationFragment)
        add(implementation, Libraries.navigationUI)

        add(testImplementation, TestLibraries.jUnit)

        add(androidTestImplementation, TestLibraries.androidTestRunner)
        add(androidTestImplementation, TestLibraries.espresso)
    }
}