/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tictok.configuration;

import com.tictok.TictokStarterPackage;
import com.tictok.properties.TictokProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@link EnableAutoConfiguration Auto-configuration} that fails the build fast for incompatible
 * versions of dependencies (e.g. invalid version of Boot).
 *
 * @author Marcin Grzejszczak
 * @since 1.3.6
 */
@Configuration
//类路径中必须有MyService 这个类时,才进行配置
//@ConditionalOnClass(TbkStarterProperties.class)
@ConditionalOnProperty(prefix = "tictok.starter.config.enable", value = "true", matchIfMissing = true)
//开启对@ConfigurationProperties注解支持,
@EnableConfigurationProperties({TictokProperties.class})
@ComponentScan(basePackageClasses = TictokStarterPackage.class)
public class TictokStarterAutoConfiguration {

}
