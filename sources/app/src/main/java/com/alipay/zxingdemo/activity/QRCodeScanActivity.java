/**
 * Android Jungle framework project.
 *
 * Copyright 2016 Arno Zhang <zyfgood12@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alipay.zxingdemo.activity;

import android.app.Activity;
import android.content.Intent;
import com.alipay.zxingdemo.R;

public class QRCodeScanActivity extends BaseQRCodeScanActivity {

    public static void start(Activity activity, int requestCode) {
        Intent intent = new Intent(activity, QRCodeScanActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }


    @Override
    protected int getContentLayoutResId() {
        return R.layout.activity_scan;
    }
}
