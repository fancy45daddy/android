package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
/* renamed from: com.facebook.ads.redexgen.X.88  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass88 implements AudienceNetworkAds.InitResult {
    public final String A00;
    public final boolean A01;

    public AnonymousClass88(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public final String getMessage() {
        return this.A00;
    }

    public final boolean isSuccess() {
        return this.A01;
    }
}
