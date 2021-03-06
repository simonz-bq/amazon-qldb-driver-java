/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package software.amazon.qldb;

import com.amazon.ion.IonValue;
import com.amazonaws.annotation.NotThreadSafe;

/**
 * Interface for the result of executing a statement in QLDB.
 *
 * Note that the result is AutoCloseable for usage within try-with-resources blocks, and implements Iterable to allow
 * iteration over the IonValues within the result.
 */
@NotThreadSafe
public interface Result extends Iterable<IonValue> {
    /**
     * Determine if the result contains no documents.
     *
     * @return True if the result contains no documents; false otherwise.
     */
    boolean isEmpty();
}
