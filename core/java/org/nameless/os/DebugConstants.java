/*
 * Copyright (C) 2024 The Nameless-AOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.nameless.os;

import android.os.SystemProperties;

/** @hide */
public class DebugConstants {

    private DebugConstants() {}

    // Enable this to debug TopActivityRecorder
    // Package: com.android.server.wm.TopActivityRecorder
    // Key: TopActivityRecorder
    public static final boolean DEBUG_WMS_TOP_APP = DEBUG_GLOBAL || SystemProperties.getBoolean(
        "persist.sys.nameless.wm.top_app.debug", false
    );
}
