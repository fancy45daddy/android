package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.4S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4S extends SV<C0627Pi> implements C7E {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public C0806Wj A00;
    public boolean A01;

    public C4S(C0627Pi c0627Pi, C0806Wj c0806Wj) {
        super(c0627Pi);
        this.A00 = c0806Wj;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0D().A38(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4S.A06():void");
    }

    @Override // com.facebook.ads.redexgen.X.C7E
    public final C0806Wj A5Z() {
        return this.A00;
    }
}
