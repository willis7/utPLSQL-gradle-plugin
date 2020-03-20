package org.utplsql.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.Plugin

import groovy.transform.CompileStatic
import org.utplsql.gradle.plugin.tasks.UtPLSQLTask

/**
 * UtPLSQLGradlePluginPlugin
 *
 * Defines the conventions of the plugin.
 *
 * See: https://guides.gradle.org/designing-gradle-plugins/#capabilities-vs-conventions
 */
@CompileStatic
class UtPLSQLGradlePluginPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.tasks.register("utplsql", UtPLSQLTask) {
            println("Hello from plugin 'org.utplsql.gradle.plugin.utplsql'")
        }
    }
}
