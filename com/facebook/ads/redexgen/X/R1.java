package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: assets/audience_network.dex */
public final class R1 {
    public static byte[] A02;
    public static String[] A03 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", "r", "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};
    @VisibleForTesting
    public BlockingDeque<R2> A00 = new LinkedBlockingDeque();
    @Nullable
    public final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textColorAlertDialogListItem);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A05(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        for (Long l : list) {
            A08(sb, A00(l.longValue()));
        }
        return A03(sb.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A06(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A07() {
        A02 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, 73, 72, 75, 74, 69, 68, 71, 124, Byte.MAX_VALUE, 126, 121, 120, 123, 122, 117, 116, 119, 118, 113, 112, 115, 114, 109, 108, 111, 110, 105, 104, 107, 106, 101, 100, 103, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, 22, 55, 62, 38, 51, 45, 123, 42, 13, 57, 40, 37, 35, 57, 49, 28, 6, 38, 26, 0, 27, 17, 58, 27, 10, 25, 14, 15, 21, 19, 18, 109, 52, 115, 100, 100, 52, 44, 52, 69, 95, 76, 83, 73, 83, 78, 85, 83, 83, 82, 73, 91, 87, 78, 73, 85, 87, 70, 52, 107};
    }

    static {
        A07();
    }

    public R1(@Nullable String str) {
        this.A01 = str;
    }

    public static long A00(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static long A01(List<R2> list) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i < list.size(); i++) {
            long A032 = list.get(i).A03();
            long playerPts = list.get(i).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(playerPts))) {
                hashMap.put(Long.valueOf(playerPts), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(playerPts))).intValue() + 1));
            } else {
                Long valueOf = Long.valueOf(playerPts);
                String[] strArr = A03;
                String str = strArr[6];
                String str2 = strArr[0];
                int i2 = str.charAt(27);
                if (i2 != str2.charAt(27)) {
                    throw new RuntimeException();
                }
                A03[5] = "bvHx6KIUVUv7zPzX2p7QZTtdwWrhQsKz";
                hashMap.put(valueOf, 1);
            }
        }
        long j = 3333;
        int baseCountMax = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = 1; baseCountMax2 < list.size(); baseCountMax2++) {
            list.get(baseCountMax2).A08(list.get(baseCountMax2).A03() - j);
            list.get(baseCountMax2).A06(list.get(baseCountMax2).A01() - j);
        }
        return j;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.charAt"})
    public static String A03(String str) {
        String A022 = A02(0, 64, j.AppCompatTheme_windowFixedWidthMinor);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A03;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A03[2] = "LfiGB0y4";
                sb3.append('=');
                sb.append((char) 0);
                length++;
            }
        }
        for (int n4 = 0; n4 < sb.length(); n4 += 3) {
            int charAt = (sb.charAt(n4) << 16) + (sb.charAt(n4 + 1) << '\b') + sb.charAt(n4 + 2);
            int c = (charAt >> 18) & 63;
            sb2.append(A022.charAt(c));
            sb2.append(A022.charAt((charAt >> 12) & 63));
            sb2.append(A022.charAt((charAt >> 6) & 63));
            sb2.append(A022.charAt(charAt & 63));
        }
        StringBuilder r = new StringBuilder();
        String base64chars = sb2.substring(0, sb2.length() - sb3.length());
        r.append(base64chars);
        r.append((Object) sb3);
        String base64chars2 = r.toString();
        return base64chars2;
    }

    @Nullable
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public static String A04(@Nullable List<R2> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 35), list.get(0).A04());
        hashMap.put(A02(92, 7, 20), 1);
        boolean z = false;
        if (list.size() > 1) {
            A09(list);
            hashMap.put(A02(64, 9, 58), Long.valueOf(A01(list)));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 1; i < list.size(); i++) {
                arrayList.add(Long.valueOf(list.get(i).A03()));
                arrayList.add(Long.valueOf(list.get(i).A01()));
                arrayList.add(Long.valueOf(list.get(i).A02()));
                arrayList2.add(Long.valueOf(list.get(i).A00()));
                if (list.get(i).A00() != 0) {
                    z = true;
                }
            }
            hashMap.put(A02(81, 2, 55), A05(arrayList));
            hashMap.put(A02(75, 6, 36), A05(arrayList2));
            hashMap.put(A02(83, 9, 29), Boolean.valueOf(z));
        }
        String A06 = A06(hashMap);
        if (A06.length() > 900000) {
            return A02(99, 29, 126);
        }
        return A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(java.lang.StringBuilder r5, long r6) {
        /*
            r4 = 128(0x80, float:1.8E-43)
        L2:
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L15
            int r0 = r4 + (-1)
            long r2 = (long) r0
            long r2 = r2 & r6
            long r0 = (long) r4
            long r2 = r2 | r0
            int r0 = (int) r2
            char r1 = (char) r0
            r0 = 7
            long r6 = r6 >> r0
            r5.append(r1)
            goto L2
        L15:
            int r0 = (int) r6
            char r3 = (char) r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.R1.A03
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L31
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L31:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.R1.A03
            java.lang.String r1 = "TgLp8xzira9J3G7G7T0jqPUigov5tglm"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6"
            r0 = 0
            r2[r0] = r1
            r5.append(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.R1.A08(java.lang.StringBuilder, long):void");
    }

    public static void A09(List<R2> list) {
        long A00;
        for (int size = list.size() - 1; size > 0; size--) {
            int i = size - 1;
            list.get(size).A08(list.get(size).A03() - list.get(i).A03());
            int i2 = size - 1;
            list.get(size).A06(list.get(size).A01() - list.get(i2).A01());
            int i3 = size - 1;
            list.get(size).A07(list.get(size).A02() - list.get(i3).A02());
            R2 r2 = list.get(size);
            int i4 = size - 1;
            if (list.get(i4).A00() == -1) {
                A00 = 0;
            } else {
                int i5 = size - 1;
                A00 = list.get(size).A00() - list.get(i5).A00();
            }
            r2.A05(A00);
            list.get(size).A07(list.get(size).A02() - list.get(size).A01());
        }
    }

    public final List<R2> A0A() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0B(R2 r2) {
        R2 peekLast = this.A00.peekLast();
        if (peekLast != null) {
            long A032 = peekLast.A03();
            if (A03[7].length() == 7) {
                throw new RuntimeException();
            }
            A03[1] = "fQhMIvl";
            if (A032 == r2.A03() && peekLast.A01() == r2.A01()) {
                return;
            }
        }
        this.A00.add(r2);
    }
}
