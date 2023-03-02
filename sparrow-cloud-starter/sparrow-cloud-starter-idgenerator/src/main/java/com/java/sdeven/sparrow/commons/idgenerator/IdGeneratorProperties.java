/**
 *    Copyright 2023 sdeven.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.java.sdeven.sparrow.commons.idgenerator;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * ZookeeperProperties
 *
 * @Date 2020/2/17 下午4:37
 * @Author  sdeven
 */
@Data
@ConfigurationProperties("sdeven.commons.idgenerator")
public class IdGeneratorProperties {

    private Boolean enabled;

    private Integer dataCenterId;
    private String zkAppPath;

    @NestedConfigurationProperty
    private CuratorProperties curator;
}
