/*
 * Copyright (C) 2024 The Nameless-AOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.server.am;

import android.content.Intent;

import com.android.server.wm.PopUpBroadcastReceiver;

class ActivityManagerServiceExt {

    private static class InstanceHolder {
        private static final ActivityManagerServiceExt INSTANCE = new ActivityManagerServiceExt();
    }

    static ActivityManagerServiceExt getInstance() {
        return InstanceHolder.INSTANCE;
    }

    Intent hookIntentBeforeBroadcast(Intent intent) {
        intent = PopUpBroadcastReceiver.getInstance().hookMiFreeformIntent(intent);
        return intent;
    }
}
