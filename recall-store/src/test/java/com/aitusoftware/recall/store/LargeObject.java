/*
 * Copyright 2019 Aitu Software Limited.
 *
 * https://aitusoftware.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aitusoftware.recall.store;

import java.util.Arrays;

final class LargeObject
{
    static final int ONE_MEGABYTE = 1024 * 1024;
    private final byte[] data = new byte[ONE_MEGABYTE - Long.BYTES];
    private long id;

    void set(final long id, final byte datum)
    {
        this.id = id;
        Arrays.fill(data, datum);
    }

    byte[] getData()
    {
        return data;
    }

    long getId()
    {
        return id;
    }

    void setId(final long id)
    {
        this.id = id;
    }
}
