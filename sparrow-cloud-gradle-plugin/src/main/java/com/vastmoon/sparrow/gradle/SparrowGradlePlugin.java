package com.vastmoon.sparrow.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.springframework.boot.gradle.plugin.SpringBootPlugin;
import org.springframework.boot.gradle.util.VersionExtractor;

/**
 * <p> ClassName: SparrowGradlePlugin
 * <p> Description: sparrow gradle plugin 插件
 * 这里主要是直接引用 spring boot plugin
 *
 * @author yousuf 2020/2/18
 */
public class SparrowGradlePlugin implements Plugin<Project> {
    private static final String VASTMOON_CLOUD_VERSION = VersionExtractor.forClass(DependencyManagementPluginAction.class);
    public static final String BOM_COORDINATES = "com.vastmoon.sparrow:sparrow-cloud-dependencies:" + VASTMOON_CLOUD_VERSION;
    @Override
    public void apply(Project project) {
        project.getPlugins().apply(SpringBootPlugin.class);
    }
}
