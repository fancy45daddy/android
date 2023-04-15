package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.LinkedList;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class J1 {
    public final InterfaceC0468Iz A0B;
    public final boolean A0F;
    public final String A0C = J1.class.getSimpleName();
    public final int A07 = j.AppCompatTheme_textAppearanceSearchResultSubtitle;
    public final int A0A = j.AppCompatTheme_textAppearanceSearchResultTitle;
    public final int A08 = j.AppCompatTheme_textAppearanceSmallPopupMenu;
    public final int A03 = j.AppCompatTheme_textColorAlertDialogListItem;
    public final int A09 = j.AppCompatTheme_textColorSearchUrl;
    public final int A02 = j.AppCompatTheme_toolbarNavigationButtonStyle;
    public final int A04 = j.AppCompatTheme_toolbarStyle;
    public final int A05 = j.AppCompatTheme_tooltipForegroundColor;
    public final int A06 = j.AppCompatTheme_tooltipFrameBackground;
    public final int A01 = j.AppCompatTheme_viewInflaterClass;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<J0> A0D = new LinkedList();

    public J1(C7G c7g, InterfaceC0468Iz interfaceC0468Iz) {
        int nativeViewabilityHistorySamplingRate = IF.A0D(c7g);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c7g.A07().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC0468Iz;
    }

    private int A00() {
        return this.A0B.A6C();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(J0 j0) {
        synchronized (this.A0D) {
            this.A0D.add(j0);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_viewInflaterClass, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_toolbarNavigationButtonStyle, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_textColorAlertDialogListItem, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_tooltipFrameBackground, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_tooltipForegroundColor, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new J0(0, j.AppCompatTheme_textAppearanceSearchResultSubtitle, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_textColorSearchUrl, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_textAppearanceSearchResultTitle, A00(), null));
    }

    public final void A0C(C7G c7g, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), j.AppCompatTheme_textAppearanceSmallPopupMenu, A00(), null));
        LJ.A06.execute(new RunnableC0467Iy(this, str, c7g));
    }
}
