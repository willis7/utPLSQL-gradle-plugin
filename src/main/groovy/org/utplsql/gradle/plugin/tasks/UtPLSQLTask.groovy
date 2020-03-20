package org.utplsql.gradle.plugin.tasks

import groovy.transform.CompileStatic
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

/**
 * UtplsqlTask
 *
 * Defines the behaviour for the main task
 */
@CompileStatic
class UtPLSQLTask extends DefaultTask{
    @TaskAction
    void executeAction() {
        println "Hello from plugin 'org.utplsql.gradle.plugin.utplsql'"
    }
}
