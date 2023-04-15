package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
/* renamed from: com.facebook.ads.redexgen.X.Lb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0518Lb extends LinearLayout {
    public static int A00 = (int) (Kd.A02 * 56.0f);

    public abstract void A04(C1K c1k, boolean z);

    public abstract boolean A05();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setPageDetails(C1U c1u, String str, int i, C00341b c00341b);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i);

    public abstract void setToolbarListener(InterfaceC0517La interfaceC0517La);

    public AbstractC0518Lb(Context context) {
        super(context);
    }
}
