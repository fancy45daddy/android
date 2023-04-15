package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;
/* renamed from: com.facebook.ads.redexgen.X.Gq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0409Gq {
    void A3P(String str, H2 h2) throws C0407Go;

    void A44(File file) throws C0407Go;

    long A5t();

    long A5u(String str, long j, long j2);

    @NonNull
    NavigableSet<C0413Gu> A5v(String str);

    long A66(String str);

    H0 A67(String str);

    void ADj(C0413Gu c0413Gu);

    void ADq(C0413Gu c0413Gu) throws C0407Go;

    void AEO(String str, long j) throws C0407Go;

    File AEo(String str, long j, long j2) throws C0407Go;

    C0413Gu AEq(String str, long j) throws InterruptedException, C0407Go;

    @Nullable
    C0413Gu AEr(String str, long j) throws C0407Go;
}
