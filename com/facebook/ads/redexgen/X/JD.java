package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class JD {
    public static byte[] A04;
    public static String[] A05 = {"YPLhW1YthHwH", "C5pYKBzTNFhaTyoOn8CLtRZjld8VucJT", "nwsPGMG6WiL6DBh0FHrHZ0R5IXcuLobJ", "gK87iCVuQY9qRaZHEz4I1", "yLpaI56t1HZbTv34O8DVm8KvrNdbdGTz", "u7C3r8DCX9eoMUGzC5EwjUGrObNKQaYD", "hw4dG9XbulEGH2HnH1CXedNx1Lx9pLFE", "teiwDyYVI0VIQpP4hHHpy5xIPHWhYAA5"};
    public final JC A00;
    @Nullable
    public final Long A01;
    @Nullable
    public final String A02;
    @Nullable
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public JD(C7G c7g, @Nullable String str, @Nullable String str2, @Nullable J8 j8) throws J4 {
        String A01 = A01(270, 21, j.AppCompatTheme_textAppearanceSearchResultSubtitle);
        String A012 = A01(291, 11, 100);
        String A013 = A01(247, 14, 65);
        String A014 = A01(310, 4, 74);
        String A015 = A01(302, 8, 85);
        if (TextUtils.isEmpty(str)) {
            this.A00 = JC.A03;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (JB.A00[JC.valueOf(jSONObject.getString(A014).toUpperCase()).ordinal()] != 1) {
                AdErrorType adErrorType = AdErrorType.BID_PAYLOAD_ERROR;
                throw new J4(adErrorType, A01(210, 28, 16) + jSONObject.getString(A014));
            }
            this.A00 = JC.A02;
            this.A01 = Long.valueOf(jSONObject.getString(A01(241, 6, 45)));
            if (jSONObject.has(A013)) {
                this.A02 = jSONObject.getString(A013);
            } else {
                this.A02 = null;
            }
            this.A03 = jSONObject.getString(A01(261, 9, 2));
            if (!jSONObject.getString(A012).equals(c7g.A03().A7l())) {
                throw new J4(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 78), this.A01, jSONObject.getString(A012), c7g.A03().A7l()));
            }
            if (!jSONObject.getString(A01).equals(str2)) {
                throw new J4(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 34), this.A01, jSONObject.getString(A01), str2));
            }
            HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(J8.A0G.A03()), Integer.valueOf(J8.A0J.A03()), Integer.valueOf(J8.A0H.A03()), Integer.valueOf(J8.A0I.A03())));
            if (jSONObject.getInt(A015) != j8.A03()) {
                if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(A015))) || !hashSet.contains(Integer.valueOf(j8.A03()))) {
                    throw new J4(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(j.AppCompatTheme_textColorAlertDialogListItem, 48, 77), this.A01, Integer.valueOf(jSONObject.getInt(A015)), j8));
                }
            }
        } catch (JSONException e) {
            c7g.A06().A8u(A01(238, 3, 37), C01877l.A0P, new C01887m(e));
            throw new J4(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 27), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-13, 26, 21, -47, -42, 21, -47, 23, 32, 35, -47, 4, -11, -4, -47, 39, 22, 35, 36, 26, 32, 31, -47, -42, 36, -47, 19, 22, 26, 31, 24, -47, 38, 36, 22, 21, -47, 32, 31, -47, 4, -11, -4, -47, 39, 22, 35, 36, 26, 32, 31, -47, -42, 36, -57, -18, -23, -91, -86, -23, -91, -21, -12, -9, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -91, -25, -22, -18, -13, -20, -91, -6, -8, -22, -23, -91, -12, -13, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -14, 25, 20, -48, -43, 20, -48, 22, 31, 34, -48, 36, 21, 29, 32, 28, 17, 36, 21, -48, -43, 35, -48, 18, 21, 25, 30, 23, -48, 37, 35, 21, 20, -48, 31, 30, -48, 36, 21, 29, 32, 28, 17, 36, 21, -48, -43, 35, -57, -20, -12, -33, -22, -25, -30, -98, -64, -25, -30, -50, -33, -9, -22, -19, -33, -30, 15, 32, 40, 43, 39, 28, 47, 32, -37, -32, 46, -37, 36, 46, -37, 41, 42, 47, -37, 49, 28, 39, 36, 31, -37, 29, 28, 41, 41, 32, 45, -37, 47, 32, 40, 43, 39, 28, 47, 32, -56, -31, -26, -24, -29, -29, -30, -27, -25, -40, -41, -109, -75, -36, -41, -61, -44, -20, -33, -30, -44, -41, -109, -25, -20, -29, -40, -109, -23, -8, -15, -14, -7, -12, -17, -7, -12, 6, 13, 8, 3, 24, 13, 17, 9, 3, 24, 19, 15, 9, 18, -55, -54, -37, -50, -56, -54, -60, -50, -55, 58, 45, 59, 55, 52, 62, 45, 44, 39, 56, 52, 41, 43, 45, 53, 45, 54, 60, 39, 49, 44, 58, 43, 50, 38, 61, 44, 57, 58, 48, 54, 53, 44, 29, 37, 40, 36, 25, 44, 29, 33, 38, 29, 18};
    }

    static {
        A02();
    }

    public JD() {
        this.A00 = JC.A03;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    @Nullable
    public static J8 A00(String str) throws J4 {
        try {
            return J8.A00(new JSONObject(str).getInt(A01(302, 8, 85)));
        } catch (JSONException e) {
            throw new J4(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 27), e);
        }
    }

    public static void A03(J8 j8) throws J4 {
        if (J8.A0F.equals(j8) || J8.A0D.equals(j8) || J8.A0E.equals(j8) || J8.A0C.equals(j8)) {
            return;
        }
        throw new J4(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(170, 40, 88), Integer.valueOf(j8.A03())));
    }

    @Nullable
    public final String A04() {
        Long l = this.A01;
        if (l == null) {
            return null;
        }
        String l2 = l.toString();
        if (A05[5].charAt(0) != 'P') {
            A05[2] = "nWWGWN2JOSzWcz2EKeaa2WFuGi6FMoRa";
            return l2;
        }
        throw new RuntimeException();
    }

    @Nullable
    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != JC.A03;
    }
}
