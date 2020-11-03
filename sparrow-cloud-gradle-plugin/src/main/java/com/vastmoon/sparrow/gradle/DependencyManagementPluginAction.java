package com.vastmoon.sparrow.gradle;

import io.spring.gradle.dependencymanagement.DependencyManagementPlugin;
import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.util.Objects;

/**
 * <p> ClassName: DependencyManagementPluginAction
 * <p> Description: 获取版本信息
 *
 * @author yousuf 2020/11/2
 */
final class DependencyManagementPluginAction implements PluginApplicationAction {

    @Override
    public void execute(Project project) {
        Objects.requireNonNull(project.getExtensions().findByType(DependencyManagementExtension.class))
                .imports((importsHandler) -> importsHandler.mavenBom(SparrowGradlePlugin.BOM_COORDINATES));
    }

    @Override
    public Class<? extends Plugin<Project>> getPluginClass() {
        return DependencyManagementPlugin.class;
    }
}
