package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class W3 implements InterfaceC02369i {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;
    @Nullable
    public final B8<C0778Vh> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{73, 104, 107, 108, 120, 97, 121, 95, 104, 99, 105, 104, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, 126, 75, 108, 110, 121, 98, Byte.MAX_VALUE, 116, 31, 40, 40, 53, 40, 122, 51, 52, 41, 46, 59, 52, 46, 51, 59, 46, 51, 52, 61, 122, 28, 28, 55, 42, 63, 61, 122, 63, 34, 46, 63, 52, 41, 51, 53, 52, 28, 43, 43, 54, 43, 121, 48, 55, 42, 45, 56, 55, 45, 48, 56, 45, 48, 55, 62, 121, 31, 21, 24, 26, 121, 60, 33, 45, 60, 55, 42, 48, 54, 55, 92, 107, 107, 118, 107, 57, 112, 119, 106, 109, 120, 119, 109, 112, 120, 109, 112, 119, 126, 57, 86, 105, 108, 106, 57, 124, 97, 109, 124, 119, 106, 112, 118, 119, 52, 3, 3, 30, 3, 81, 24, 31, 2, 5, 16, 31, 5, 24, 16, 5, 24, 31, 22, 81, 39, 33, 72, 81, 20, 9, 5, 20, 31, 2, 24, 30, 31, 108, 79, 65, 68, 69, 68, 0, 102, 70, 77, 80, 69, 71, 97, 85, 68, 73, 79, 114, 69, 78, 68, 69, 82, 69, 82, 14, 31, 60, 50, 55, 54, 55, 115, 31, 58, 49, 53, 63, 50, 48, 18, 38, 55, 58, 60, 1, 54, 61, 55, 54, 33, 54, 33, 125, 65, 98, 108, 105, 104, 105, 45, 65, 100, 111, 98, 125, 120, 126, 76, 120, 105, 100, 98, 95, 104, 99, 105, 104, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, 35, 126, 93, 83, 86, 87, 86, 18, 126, 91, 80, 68, 66, 74, 100, 91, 86, 87, 93, 96, 87, 92, 86, 87, 64, 87, 64, 28, 119, 123, 121, 58, 114, 117, 119, 113, 118, 123, 123, Byte.MAX_VALUE, 58, 117, 112, 103, 58, 125, 122, 96, 113, 102, 122, 117, 120, 58, 113, 108, 123, 100, 120, 117, 109, 113, 102, 38, 58, 113, 108, 96, 58, 114, 114, 121, 100, 113, 115, 58, 82, 114, 121, 100, 113, 115, 85, 97, 112, 125, 123, 70, 113, 122, 112, 113, 102, 113, 102, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 40, 39, 42, 104, 35, 62, 41, 54, 42, 39, 63, 35, 52, 116, 104, 35, 62, 50, 104, 32, 42, 39, 37, 104, 10, 47, 36, 32, 42, 39, 37, 7, 51, 34, 47, 41, 20, 35, 40, 34, 35, 52, 35, 52, 121, 117, 119, 52, 124, 123, 121, Byte.MAX_VALUE, 120, 117, 117, 113, 52, 123, 126, 105, 52, 115, 116, 110, Byte.MAX_VALUE, 104, 116, 123, 118, 52, Byte.MAX_VALUE, 98, 117, 106, 118, 123, 99, Byte.MAX_VALUE, 104, 40, 52, Byte.MAX_VALUE, 98, 110, 52, 117, 106, 111, 105, 52, 86, 115, 120, 117, 106, 111, 105, 91, 111, 126, 115, 117, 72, Byte.MAX_VALUE, 116, 126, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, 104, 92, 80, 82, 17, 89, 94, 92, 90, 93, 80, 80, 84, 17, 94, 91, 76, 17, 86, 81, 75, 90, 77, 81, 94, 83, 17, 90, 71, 80, 79, 83, 94, 70, 90, 77, 13, 17, 90, 71, 75, 17, 73, 79, 6, 17, 115, 86, 93, 73, 79, 71, 105, 86, 91, 90, 80, 109, 90, 81, 91, 90, 77, 90, 77};
    }

    public W3(Context context) {
        this(context, 0);
    }

    public W3(Context context, int i) {
        this(context, null, i, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Deprecated
    public W3(Context context, @Nullable B8<C0778Vh> b8, int i, long j) {
        this.A02 = context;
        this.A00 = i;
        this.A01 = j;
        this.A03 = b8;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, @Nullable B8<C0778Vh> b8, long j, Handler handler, I9 i9, int extensionRendererIndex, ArrayList<W1> arrayList) {
        arrayList.add(new C1Y(context, InterfaceC0311Cs.A00, j, b8, false, handler, i9, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(469, 64, j.AppCompatTheme_windowFixedWidthMinor));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (W1) cls.getConstructor(clazz, clazz2, Handler.class, I9.class, clazz3).newInstance(true, Long.valueOf(j), handler, i9, 50));
                    Log.i(A00(0, 23, 71), A00(243, 27, j.AppCompatTheme_windowNoTitle));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(127, 33, 59), e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, @Nullable B8<C0778Vh> b8, A7[] a7Arr, Handler handler, AF af, int i, ArrayList<W1> arrayList) {
        int extensionRendererIndex;
        int i2;
        String A00 = A00(0, 23, 71);
        arrayList.add(new C00371e(context, InterfaceC0311Cs.A00, b8, false, handler, af, A0.A00(context), a7Arr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            extensionRendererIndex = size + 1;
        } catch (ClassNotFoundException unused) {
            extensionRendererIndex = size;
        } catch (Exception e) {
            e = e;
        }
        try {
            arrayList.add(size, (W1) Class.forName(A00(403, 66, 80)).getConstructor(Handler.class, AF.class, A7[].class).newInstance(handler, af, a7Arr));
            Log.i(A00, A00(215, 28, 71));
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            e = e2;
            throw new RuntimeException(A00(93, 34, 83), e);
        }
        try {
            i2 = extensionRendererIndex + 1;
            try {
                arrayList.add(extensionRendererIndex, (W1) Class.forName(A00(337, 66, 12)).getConstructor(Handler.class, AF.class, A7[].class).newInstance(handler, af, a7Arr));
                Log.i(A00, A00(187, 28, 25));
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(A00(59, 34, 19), e);
            }
        } catch (ClassNotFoundException unused4) {
            i2 = extensionRendererIndex;
        } catch (Exception e4) {
            e = e4;
        }
        try {
            try {
                try {
                    arrayList.add(i2, (W1) Class.forName(A00(270, 67, 94)).getConstructor(Handler.class, AF.class, A7[].class).newInstance(handler, af, a7Arr));
                    Log.i(A00, A00(160, 27, j.AppCompatTheme_toolbarNavigationButtonStyle));
                } catch (Exception e5) {
                    e = e5;
                    throw new RuntimeException(A00(23, 36, 16), e);
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, D5 d5, Looper looper, int i, ArrayList<W1> arrayList) {
        arrayList.add(new AnonymousClass35(d5, looper));
    }

    private final void A05(Context context, FN fn, Looper looper, int i, ArrayList<W1> arrayList) {
        arrayList.add(new AnonymousClass33(fn, looper));
    }

    private final A7[] A06() {
        return new A7[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02369i
    public final W1[] A4R(Handler handler, I9 i9, AF af, FN fn, D5 d5, @Nullable B8<C0778Vh> b8) {
        B8<C0778Vh> b82 = b8;
        if (b82 == null) {
            b82 = this.A03;
        }
        ArrayList<W1> arrayList = new ArrayList<>();
        A02(this.A02, b82, this.A01, handler, i9, this.A00, arrayList);
        A03(this.A02, b82, A06(), handler, af, this.A00, arrayList);
        A05(this.A02, fn, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, d5, handler.getLooper(), this.A00, arrayList);
        return (W1[]) arrayList.toArray(new W1[arrayList.size()]);
    }
}
