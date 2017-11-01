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
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.alipay.zxingdemo.R;

public class ZXingDemoMainActivity extends AppCompatActivity {

    private static final int REQUEST_FOR_SCAN = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onScanClicked(View view) {
        QRCodeScanActivity.start(this, REQUEST_FOR_SCAN);
    }

    public void onScanFullscreenClicked(View view) {
        QRCodeScanFullscreenActivity.start(this, REQUEST_FOR_SCAN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_FOR_SCAN) {
            if (resultCode == Activity.RESULT_OK) {
                String content = data.getStringExtra(QRCodeScanActivity.EXTRA_SCAN_CONTENT);
                Toast.makeText(this, content, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Scan Canceled!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
