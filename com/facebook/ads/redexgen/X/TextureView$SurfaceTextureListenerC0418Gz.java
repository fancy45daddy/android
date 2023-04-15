package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
@TargetApi(14)
/* renamed from: com.facebook.ads.redexgen.X.Gz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class TextureView$SurfaceTextureListenerC0418Gz extends TextureView implements TextureView.SurfaceTextureListener, PP, InterfaceC0622Pd, PR {
    public static byte[] A0N;
    public static String[] A0O = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    @Nullable
    public Surface A07;
    public View A08;
    @Nullable
    public MediaController A09;
    public C0806Wj A0A;
    public EnumC0611Os A0B;
    @Nullable
    public PS A0C;
    public EnumC0624Pf A0D;
    public EnumC0624Pf A0E;
    @Nullable
    public InterfaceC0625Pg A0F;
    @Nullable
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0N = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, Byte.MAX_VALUE, 49, 116, 105, 114, 116, 97, 101, 120, 126, Byte.MAX_VALUE, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, Byte.MAX_VALUE, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, Byte.MAX_VALUE, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, 63, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, Byte.MAX_VALUE, 101, 125, 104, 49, 120, 118, Byte.MAX_VALUE, 126, 99, 116, 49, 120, 101, 63, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, Byte.MAX_VALUE, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, Byte.MAX_VALUE, 98, 100, 101, 43, 124, 98, Byte.MAX_VALUE, 99, 43, 120, 110, Byte.MAX_VALUE, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, Byte.MAX_VALUE, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, Byte.MAX_VALUE, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, Byte.MAX_VALUE, 37, 33, 30, 19, 18, 24, 87, 4, 3, 22, 3, 18, 87, 20, 31, 22, 25, 16, 18, 19, 87, 3, 24, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0O;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (ID.A1L(this.A0A) && this.A0D != EnumC0624Pf.A08) {
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            InterfaceC0625Pg interfaceC0625Pg = this.A0F;
            if (interfaceC0625Pg != null) {
                interfaceC0625Pg.AAk(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0P = TextureView$SurfaceTextureListenerC0418Gz.class.getSimpleName();
    }

    public TextureView$SurfaceTextureListenerC0418Gz(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A0D = EnumC0624Pf.A04;
        this.A0E = EnumC0624Pf.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0611Os.A03;
        this.A0K = false;
        this.A0A = c0806Wj;
    }

    public TextureView$SurfaceTextureListenerC0418Gz(C0806Wj c0806Wj, AttributeSet attributeSet) {
        super(c0806Wj, attributeSet);
        this.A0D = EnumC0624Pf.A04;
        this.A0E = EnumC0624Pf.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0611Os.A03;
        this.A0K = false;
        this.A0A = c0806Wj;
    }

    public TextureView$SurfaceTextureListenerC0418Gz(C0806Wj c0806Wj, AttributeSet attributeSet, int i) {
        super(c0806Wj, attributeSet, i);
        this.A0D = EnumC0624Pf.A04;
        this.A0E = EnumC0624Pf.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0611Os.A03;
        this.A0K = false;
        this.A0A = c0806Wj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r4.length() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (r5.A0K == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        r5.A0C.A0F(r5.A0A.A00(), r5.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Wj r1 = r5.A0A
            com.facebook.ads.redexgen.X.PS r0 = new com.facebook.ads.redexgen.X.PS
            r0.<init>(r1)
            r5.A0C = r0
            com.facebook.ads.redexgen.X.PS r0 = r5.A0C
            r0.A0H(r5)
            com.facebook.ads.redexgen.X.PS r0 = r5.A0C
            r0.A0G(r5)
            com.facebook.ads.redexgen.X.PS r0 = r5.A0C
            r3 = 0
            r0.A0I(r3)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L69
            boolean r0 = r5.A0I
            if (r0 != 0) goto L69
            com.facebook.ads.redexgen.X.Wj r0 = r5.A0A
            android.app.Activity r4 = r0.A0C()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0418Gz.A0O
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto L3a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0418Gz.A0O
            java.lang.String r1 = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto Lc0
            android.widget.MediaController r0 = new android.widget.MediaController
            r0.<init>(r4)
            r5.A09 = r0
            android.widget.MediaController r1 = r5.A09
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L56
            r0 = r5
        L56:
            r1.setAnchorView(r0)
            android.widget.MediaController r1 = r5.A09
            com.facebook.ads.redexgen.X.PX r0 = new com.facebook.ads.redexgen.X.PX
            r0.<init>(r5)
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r5.A09
            r0 = 1
            r1.setEnabled(r0)
        L69:
            java.lang.String r4 = r5.A0G
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0418Gz.A0O
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0418Gz.A0O
            java.lang.String r1 = "7OzxCvlMe7OewOex"
            r0 = 1
            r2[r0] = r1
            if (r4 == 0) goto L91
        L87:
            int r0 = r4.length()
            if (r0 == 0) goto L91
            boolean r0 = r5.A0K
            if (r0 == 0) goto L9e
        L91:
            com.facebook.ads.redexgen.X.PS r2 = r5.A0C
            com.facebook.ads.redexgen.X.Wj r0 = r5.A0A
            com.facebook.ads.redexgen.X.Wi r1 = r0.A00()
            android.net.Uri r0 = r5.A06
            r2.A0F(r1, r0)
        L9e:
            com.facebook.ads.redexgen.X.Pf r0 = com.facebook.ads.redexgen.X.EnumC0624Pf.A08
            r5.setVideoState(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto Lb0
            android.graphics.SurfaceTexture r0 = r5.getSurfaceTexture()
            r5.onSurfaceTextureAvailable(r0, r3, r3)
        Lb0:
            return
        Lb1:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0418Gz.A0O
            java.lang.String r1 = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L91
            goto L87
        Lc0:
            r0 = 0
            r5.A09 = r0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0418Gz.A04():void");
    }

    private void A05() {
        PS ps = this.A0C;
        if (ps == null) {
            return;
        }
        PQ A08 = ps.A08();
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (A08 != null) {
            A08(A08.A01, A08.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        PS ps = this.A0C;
        if (ps != null) {
            ps.A09();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0M = false;
        setVideoState(EnumC0624Pf.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return PS.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void A7s() {
        if (!this.A0H) {
            ACz(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final boolean A83() {
        PS ps = this.A0C;
        return ps != null && ps.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final boolean A84() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final boolean A8Y() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.PP
    public final void ABl(String str, Exception exc) {
        this.A0A.A0D().A9W(str);
        this.A0A.A0D().A2v(1);
        setVideoState(EnumC0624Pf.A03);
        this.A0A.A06().A8u(A03(219, 7, 124), C01877l.A1N, new C01887m(exc));
    }

    @Override // com.facebook.ads.redexgen.X.PP
    public final void ABm(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        if (i == 1) {
            setVideoState(EnumC0624Pf.A04);
        } else if (i == 2) {
            A05();
            int i2 = this.A01;
            if (A0O[1].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[2] = "9yr";
            strArr[7] = "mKFyaVoRgsxwFz3";
            if (i2 < 0) {
                return;
            }
            int i3 = this.A01;
            this.A01 = -1;
            InterfaceC0625Pg interfaceC0625Pg = this.A0F;
            if (interfaceC0625Pg == null) {
                return;
            }
            int currentPosition = getCurrentPosition();
            String[] strArr2 = A0O;
            String str = strArr2[3];
            String str2 = strArr2[0];
            int length = str.length();
            int seekFrom = str2.length();
            if (length != seekFrom) {
                interfaceC0625Pg.ACA(i3, currentPosition);
                return;
            }
            A0O[5] = "bt2gfLOq6VYcjgDmYUS3R";
            interfaceC0625Pg.ACA(i3, currentPosition);
        } else {
            if (i == 3) {
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j = this.A05;
                if (j > 0 && j < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z && this.A0M) {
                    setVideoState(EnumC0624Pf.A05);
                    return;
                } else if (z || this.A0D == EnumC0624Pf.A06) {
                    return;
                } else {
                    setVideoState(EnumC0624Pf.A07);
                    EnumC0624Pf enumC0624Pf = this.A0E;
                    String[] strArr3 = A0O;
                    if (strArr3[4].charAt(4) != strArr3[6].charAt(4)) {
                        String[] strArr4 = A0O;
                        strArr4[3] = "QOwsd8cFgtBxhwq2W5mYjt9JcX";
                        strArr4[0] = "NiYGjjh9hUScPgNoOA1xOqSddN";
                        if (enumC0624Pf != EnumC0624Pf.A0A) {
                            return;
                        }
                    } else if (enumC0624Pf != EnumC0624Pf.A0A) {
                        return;
                    }
                    AEn(this.A0B, 8);
                    EnumC0624Pf enumC0624Pf2 = EnumC0624Pf.A04;
                    String[] strArr5 = A0O;
                    if (strArr5[3].length() == strArr5[0].length()) {
                        A0O[5] = "yetXNvPdXumqVjXfCpilY";
                        this.A0E = enumC0624Pf2;
                        return;
                    }
                }
            } else if (i != 4) {
                return;
            } else {
                if (z) {
                    setVideoState(EnumC0624Pf.A06);
                }
                PS ps = this.A0C;
                if (A0O[5].length() == 21) {
                    A0O[5] = "KLjUXng8f5n9djrrPXv2F";
                    if (ps != null) {
                        ps.A0I(false);
                        if (!z) {
                            this.A0C.A0A();
                        }
                    }
                    this.A0M = false;
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PR
    public final void ACk(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void ACz(boolean z, int i) {
        this.A0A.A0D().A2r(i);
        this.A0E = EnumC0624Pf.A05;
        this.A0L = z;
        PS ps = this.A0C;
        if (ps != null) {
            ps.A0I(false);
        } else {
            setVideoState(EnumC0624Pf.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void AEi(int i) {
        this.A0A.A0D().A9X(i);
        setVideoState(EnumC0624Pf.A09);
        AEu(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void AEn(EnumC0611Os enumC0611Os, int i) {
        this.A0A.A0D().A32(i);
        this.A0L = false;
        this.A0E = EnumC0624Pf.A0A;
        this.A0B = enumC0611Os;
        if (this.A0C == null) {
            setup(this.A06);
        } else if (this.A0D != EnumC0624Pf.A07 && this.A0D != EnumC0624Pf.A05 && this.A0D != EnumC0624Pf.A06) {
        } else {
            this.A0C.A0I(true);
            setVideoState(EnumC0624Pf.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void AEu(int i) {
        this.A0A.A0D().A34(i);
        this.A0E = EnumC0624Pf.A04;
        PS ps = this.A0C;
        if (ps != null) {
            ps.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC0624Pf.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public int getCurrentPosition() {
        PS ps = this.A0C;
        if (ps != null) {
            return (int) ps.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public int getDuration() {
        PS ps = this.A0C;
        if (ps == null) {
            return 0;
        }
        return (int) ps.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public EnumC0611Os getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public EnumC0624Pf getState() {
        return this.A0D;
    }

    public EnumC0624Pf getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ID.A1v(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC0624Pf.A03);
            AEu(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        this.A07 = new Surface(surfaceTexture);
        PS ps = this.A0C;
        if (ps == null) {
            return;
        }
        ps.A0E(this.A07);
        if (this.A0D == EnumC0624Pf.A05 && !this.A0L) {
            AEn(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            PS ps = this.A0C;
            if (ps != null) {
                ps.A0E(null);
            }
        }
        if (this.A0D != EnumC0624Pf.A05) {
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            A0O[5] = "TScQzo9LVHiM3saFvXTgi";
            ACz(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC0624Pf.A05) {
                A7s();
            }
        } else if (this.A0D != EnumC0624Pf.A05 || this.A0L) {
        } else {
            AEn(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
            return;
        }
        long j = i;
        String[] strArr = A0O;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0O[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean isDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[1] = "HF5JdwiOlRNKOfaOH";
        if (!isDebugBuild) {
            return;
        }
        Log.w(A0P, A03(0, j.AppCompatTheme_textAppearanceSearchResultTitle, 85));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new PZ(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            String str = A0P;
            String[] strArr = A0O;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
            strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
            Log.w(str, A03(j.AppCompatTheme_textAppearanceSearchResultTitle, 94, 79));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new PY(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC0624Pf.A08 && this.A0D != EnumC0624Pf.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setVideoMPD(@Nullable String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC0624Pf enumC0624Pf) {
        if (enumC0624Pf != this.A0D) {
            if (this.A0A.A03().A8N()) {
                String str = A03(196, 23, 51) + enumC0624Pf;
            }
            this.A0D = enumC0624Pf;
            if (this.A0D == EnumC0624Pf.A0A) {
                this.A0M = true;
            }
            InterfaceC0625Pg interfaceC0625Pg = this.A0F;
            if (interfaceC0625Pg != null) {
                interfaceC0625Pg.ACm(enumC0624Pf);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setVideoStateChangeListener(@Nullable InterfaceC0625Pg interfaceC0625Pg) {
        this.A0F = interfaceC0625Pg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0622Pd
    public void setup(Uri uri) {
        this.A0A.A0D().A2u();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
