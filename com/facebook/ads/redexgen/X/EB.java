package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class EB extends AbstractC0848Yb {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public EB(C0806Wj c0806Wj, C00481p c00481p) {
        super(c0806Wj, c00481p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, j.AppCompatTheme_textColorAlertDialogListItem), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new Q8(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0J() {
        Z9 z9 = (Z9) this.A01;
        if (z9.A0T()) {
            if (this.A06 != null) {
                this.A06.A0B(z9);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0L(InterfaceC00200n interfaceC00200n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C00491q c00491q) {
        Z9 z9 = (Z9) interfaceC00200n;
        long currentTimeMillis = System.currentTimeMillis();
        YY yy = new YY(this, c00491q, z9, currentTimeMillis, anonymousClass81);
        A0C().postDelayed(yy, anonymousClass83.A05().A05());
        z9.A0L(this.A0B, new YX(this, yy, currentTimeMillis, anonymousClass81), this.A08, c00491q, C0718Sw.A0K());
    }
}
