package com.github.ducanne.ideavimautoswitch.services

import com.intellij.openapi.project.Project
import com.github.ducanne.ideavimautoswitch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
