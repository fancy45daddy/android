package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.5R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5R extends AsyncTask<C5T, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final C5S A00;
    public final C0806Wj A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5T... c5tArr) {
        if (!C0480Jm.A02(this) && c5tArr != null) {
            try {
                if (c5tArr.length >= 1) {
                    String str = c5tArr[0].A01;
                    String str2 = c5tArr[0].A00;
                    Bitmap A0N = new C6G(this.A01).A0N(str, -1, -1);
                    if (A0N != null) {
                        return C0718Sw.A05(this.A01, A0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th) {
                C0480Jm.A00(th, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowMinWidthMajor);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public C5R(C0806Wj c0806Wj, C5S c5s, boolean z) {
        this.A01 = c0806Wj;
        this.A00 = c5s;
        this.A02 = z;
    }

    public /* synthetic */ C5R(C0806Wj c0806Wj, C5S c5s, boolean z, X4 x4) {
        this(c0806Wj, c5s, z);
    }

    private final void A03(Drawable drawable) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.AAs(drawable);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5T[] c5tArr) {
        if (C0480Jm.A02(this)) {
            return null;
        }
        try {
            return A00(c5tArr);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
