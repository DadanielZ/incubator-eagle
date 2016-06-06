/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.eagle.alert.coordination.model;

import org.apache.eagle.alert.engine.coordinator.StreamDefinition;

/**
 * @since May 25, 2016
 *
 */
public class VersionedStreamDefinition {
    private String version;
    private StreamDefinition definition;

    public VersionedStreamDefinition() {
    }

    public VersionedStreamDefinition(String version, StreamDefinition def) {
        this.version = version;
        this.definition = def;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public StreamDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(StreamDefinition definition) {
        this.definition = definition;
    }

}
