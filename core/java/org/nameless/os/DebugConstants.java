/*
 * Copyright (C) 2024 The Nameless-AOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.nameless.os;

import android.os.Build;
import android.os.SystemProperties;

import java.util.LinkedHashMap;

/** @hide */
public class DebugConstants {

    private DebugConstants() {}

    public static LinkedHashMap<String, String> CONSTANTS_MAP = new LinkedHashMap<>();

    static {
        CONSTANTS_MAP.put("DEBUG_GLOBAL", "persist.sys.nameless.debug.global");
        CONSTANTS_MAP.put("DEBUG_POP_UP", "persist.sys.nameless.popup.debug");
        CONSTANTS_MAP.put("DEBUG_WMS_TOP_APP", "persist.sys.nameless.wm.top_app.debug");
    }

    public static boolean shouldShowDebugManager() {
        return Build.IS_ENG || SystemProperties.getBoolean("persist.sys.nameless.debug.manager", false);
    }

    // Enable this to debug all nameless features
    private static final boolean DEBUG_GLOBAL = Build.IS_ENG || SystemProperties.getBoolean(
        "persist.sys.nameless.debug.global", false
    );

    // Enable this to debug Pop-Up View
    // Packages and keys are not listed cause they are too much
    // Search DEBUG_POP_UP for usage
    public static final boolean DEBUG_POP_UP = DEBUG_GLOBAL || SystemProperties.getBoolean(
        "persist.sys.nameless.popup.debug", false
    );

    // Enable this to debug TopActivityRecorder
    // Package: com.android.server.wm.TopActivityRecorder
    // Key: TopActivityRecorder
    public static final boolean DEBUG_WMS_TOP_APP = DEBUG_GLOBAL || SystemProperties.getBoolean(
        "persist.sys.nameless.wm.top_app.debug", false
    );
}
