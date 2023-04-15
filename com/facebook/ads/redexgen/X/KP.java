package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
/* loaded from: assets/audience_network.dex */
public final class KP {
    public static AdError A00(J3 j3) {
        if (j3.A03().isPublicError()) {
            return new AdError(j3.A03().getErrorCode(), j3.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
