/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package org.utplsql.gradle.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

public class UtPLSQLGradlePluginPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("org.utplsql.gradle.plugin.utplsql")

        then:
        project.tasks.findByName("utplsql") != null
    }
}
