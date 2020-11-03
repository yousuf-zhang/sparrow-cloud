package com.vastmoon.sparrow.gradle;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * <p> ClassName: PluginApplicationAction
 * <p> Description: 插件接口
 *
 * @author yousuf 2020/11/2
 */
interface PluginApplicationAction extends Action<Project> {

    Class<? extends Plugin<? extends Project>> getPluginClass();
}
