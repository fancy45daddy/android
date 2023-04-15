package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class TR implements InterfaceC0900a6<IJ, IO> {
    public TO A00;

    public TR(TO to) {
        this.A00 = to;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a3 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0900a6
    public final void A5H(C0897a3<IJ, IO> c0897a3, InterfaceC0886Zs interfaceC0886Zs) {
        int i = IH.A00[interfaceC0886Zs.A7m(c0897a3).ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.A00.A02(c0897a3, interfaceC0886Zs);
    }
}
