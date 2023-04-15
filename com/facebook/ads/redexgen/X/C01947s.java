package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
/* renamed from: com.facebook.ads.redexgen.X.7s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01947s implements SensorEventListener {
    public C01947s() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C01967u.A0D(sensorEvent.values);
        C01967u.A04();
    }
}
