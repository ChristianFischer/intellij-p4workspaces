package com.github.christianfischer.intellijp4workspaces.services

import com.github.christianfischer.intellijp4workspaces.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
