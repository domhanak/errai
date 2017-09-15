/*
 * Copyright (C) 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.apt.internal.generator;

import org.jboss.errai.common.apt.ErraiAptExportedTypes;
import org.jboss.errai.common.apt.ErraiAptGenerator;

/**
 * @author Tiago Bento <tfernand@redhat.com>
 */
public class TestExportedGenerator extends ErraiAptGenerator {

  public TestExportedGenerator(final ErraiAptExportedTypes exportedTypes) {
    super(exportedTypes);
  }

  @Override
  public String generate() {
    return "";
  }

  @Override
  public String getPackageName() {
    return "org.jboss.errai.apt.test";
  }

  @Override
  public String getClassSimpleName() {
    return "TestGeneratedSourceImpl";
  }
}