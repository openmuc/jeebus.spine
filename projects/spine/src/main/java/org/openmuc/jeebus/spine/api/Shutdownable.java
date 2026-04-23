/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

/**
 * Objects that hold references to long-running threads or executors, open network
 * connections, etc -- directly (as fields on the object) or indirectly (via child
 * objects) -- which can be shut down and released.
 */
public interface Shutdownable extends AutoCloseable {
    /**
     * Cleanly and promptly shut down this object, as well as all child objects and
     * objects depending on this one.
     * <p>
     *
     * @implSpec implementations should attempt to shut down promptly but still
     * perform cleanup if possible. There is not currently a timeout mechanism, so
     * use your judgment.
     * <p>
     * If any child objects are also {@code Shutdownable}, implementations should
     * call {@code close()} on them as well.
     */
    void close();
}
