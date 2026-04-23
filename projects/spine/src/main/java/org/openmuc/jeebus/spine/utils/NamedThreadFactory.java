/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {
    private final String prefix;
    private final AtomicInteger threadNumber = new AtomicInteger(0);

    /**
     * Create a new ThreadFactory with the specified prefix as name
     *
     * @param prefix
     *     Text to be displayed before the thread number
     */
    public NamedThreadFactory(String prefix) {
        this.prefix = prefix;
    }

    /**
     * create a new named thread
     *
     * @param r
     *     Runnable
     * @return created thread
     */
    @Override
    public Thread newThread(Runnable r) {
        Thread t = Executors.defaultThreadFactory().newThread(r);
        t.setName(prefix + threadNumber.addAndGet(1));
        return t;
    }
}
