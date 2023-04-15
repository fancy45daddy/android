package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
@RequiresApi(21)
/* renamed from: com.facebook.ads.redexgen.X.0a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00080a extends C00110d {
    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final C3P A08(View view, C3P c3p) {
        WindowInsets result = (WindowInsets) C3P.A01(c3p);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3P.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final C3P A09(View view, C3P c3p) {
        WindowInsets result = (WindowInsets) C3P.A01(c3p);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3P.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0F(View view, final InterfaceC00762s interfaceC00762s) {
        if (interfaceC00762s == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.36
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C3P compatInsets = interfaceC00762s.A9u(view2, C3P.A00(windowInsets));
                    return (WindowInsets) C3P.A01(compatInsets);
                }
            });
        }
    }
}
