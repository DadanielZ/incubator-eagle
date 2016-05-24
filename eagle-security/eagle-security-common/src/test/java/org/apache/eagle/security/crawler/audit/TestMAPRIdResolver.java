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

package org.apache.eagle.security.crawler.audit;
import junit.framework.Assert;
import org.apache.eagle.security.resolver.MAPRIdResolver;
import org.junit.Test;

public class TestMAPRIdResolver {

    @Test
    public  void testFidToName() {
        MAPRIdResolver resolver = new MAPRIdResolver();
        String id = "2050.36.131336";
        String name = "";
        try{
            name = resolver.fidToName(id);
        }catch (Exception e){
            System.out.println("Exception is"+e.getMessage());
        }
        Assert.assertEquals("/tmp/file.w", name);
    }

    @Test
    public void testNameToFid() {
        MAPRIdResolver resolver = new MAPRIdResolver();
        String name = "/tmp/file.w";
        String id = "";
        try{
            id = resolver.nameToFid(name);
        }catch(Exception e){
            System.out.println("Exception is"+ e.getMessage());
        }
        Assert.assertEquals("2050.36.131336",id);
    }

}