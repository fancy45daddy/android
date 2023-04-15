package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;
/* loaded from: assets/audience_network.dex */
public final class LA {
    public static EnumC0611Os A00(VideoStartReason videoStartReason) {
        int i = L9.A00[videoStartReason.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC0611Os.A03;
                }
                return EnumC0611Os.A04;
            }
            return EnumC0611Os.A03;
        }
        return EnumC0611Os.A02;
    }
}
