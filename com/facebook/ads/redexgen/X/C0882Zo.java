package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Zo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0882Zo {
    public final InterfaceC0886Zs A00;
    public final String A01;
    public final Collection<C0897a3> A02;
    public final Collection<C0897a3> A03;
    public final List<Rect> A04;

    public C0882Zo(String str, InterfaceC0886Zs interfaceC0886Zs, List<Rect> rects, Collection<C0897a3> collection, Collection<C0897a3> collection2) {
        this.A01 = str;
        this.A00 = interfaceC0886Zs;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
