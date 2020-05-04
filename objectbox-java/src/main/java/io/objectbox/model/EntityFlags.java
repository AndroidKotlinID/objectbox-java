/*
 * Copyright 2020 ObjectBox Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// automatically generated by the FlatBuffers compiler, do not modify

package io.objectbox.model;

/**
 * Not really an enum, but binary flags to use across languages
 */
public final class EntityFlags {
  private EntityFlags() { }
  /**
   * Use the default (no arguments) constructor to create entities
   */
  public static final int USE_NO_ARG_CONSTRUCTOR = 1;

  public static final String[] names = { "USE_NO_ARG_CONSTRUCTOR", };

  public static String name(int e) { return names[e - USE_NO_ARG_CONSTRUCTOR]; }
}

