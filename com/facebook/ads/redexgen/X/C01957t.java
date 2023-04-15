package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
/* renamed from: com.facebook.ads.redexgen.X.7t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01957t implements SensorEventListener {
    public C01957t() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C01967u.A0A = sensorEvent.values;
        C01967u.A07();
    }
}
