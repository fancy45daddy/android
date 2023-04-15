package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class TY implements H0 {
    public static byte[] A02;
    public static String[] A03 = {"", "E0qfI7DZu8nkzGv3MH4nJgqlD44FCDGV", "PylumRpOhcOqV8SE", "Pn3Or3lb8D1PR4hBSIJHER", "QrYBpEt5fxgmrBLneQSlInRulpYQYEG6", "kBYBv8gRMrLmplmIT6dDUsqqwhnWF3zw", "1HLCV5Ojolr5GVwArEzJLOO78iGdJHxw", "UyANx1"};
    public static final TY A04;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A03[3] = "rKK8X5tVBBDKhSudhE31wx";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
            if (A03[2].length() != 16) {
                String[] strArr2 = A03;
                strArr2[7] = "FSEtti";
                strArr2[0] = "";
                i4 += 0;
            } else {
                String[] strArr3 = A03;
                strArr3[5] = "3tkzovd4FYEmOrd3uFeQsH7k2lQqNCGR";
                strArr3[4] = "QPp8yxf18vRmRgJoVMCalcriT9AA2Yst";
                i4++;
            }
        }
    }

    public static void A03() {
        byte[] bArr = {-121, -84, -76, -97, -86, -89, -94, 94, -76, -97, -86, -77, -93, 94, -79, -89, -72, -93, 120, 94, 11, 31, 28, -41, 42, 32, 49, 28, -41, 38, 29, -41, -36, 42, -41, -33, -36, 27, -32, -41, 32, 42, -41, 30, 41, 28, 24, 43, 28, 41, -41, 43, 31, 24, 37, -41, 36, 24, 47, 32, 36, 44, 36, -41, 24, 35, 35, 38, 46, 28, 27, -15, -41, -36, 27, -31, -32, -46, -71, -60};
        if (A03[3].length() != 22) {
            throw new RuntimeException();
        }
        A03[1] = "Wq4xFI36yK0vrvDqIYZkxKx0C2M1IMKh";
        A02 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A05(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            byte[] A07 = A07(map.get(str));
            if (A07.length > 10485760) {
                throw new IllegalArgumentException(String.format(A01(20, 55, 121), str, Integer.valueOf(A07.length), 10485760));
            }
            hashMap.put(str, A07);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A06(Map<String, byte[]> map) {
        if (this.A01.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    static {
        A03();
        A04 = new TY(Collections.emptyMap());
    }

    public TY(Map<String, byte[]> metadata) {
        this.A01 = Collections.unmodifiableMap(metadata);
    }

    public static TY A00(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String name = dataInputStream.readUTF();
            int valueSize = dataInputStream.readInt();
            if (A03[6].charAt(12) != 'G') {
                throw new RuntimeException();
            }
            A03[3] = "zQpUPHnv7TxzcbRfe6tZ6j";
            if (valueSize < 0 || valueSize > 10485760) {
                throw new IOException(A01(0, 20, 0) + valueSize);
            }
            byte[] bArr = new byte[valueSize];
            dataInputStream.readFully(bArr);
            hashMap.put(name, bArr);
        }
        return new TY(hashMap);
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> otherMetadata, H2 h2) {
        HashMap hashMap = new HashMap(otherMetadata);
        A04(hashMap, h2.A04());
        A05(hashMap, h2.A05());
        return hashMap;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(java.util.HashMap<java.lang.String, byte[]> r2, java.util.List<java.lang.String> r3) {
        /*
            r1 = 0
        L1:
            int r0 = r3.size()
            if (r1 >= r0) goto L11
            java.lang.Object r0 = r3.get(r1)
            r2.remove(r0)
            int r1 = r1 + 1
            goto L1
        L11:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TY.A04(java.util.HashMap, java.util.List):void");
    }

    public static byte[] A07(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(A01(75, 5, 78)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final TY A08(H2 h2) {
        Map<String, byte[]> A022 = A02(this.A01, h2);
        if (A06(A022)) {
            return this;
        }
        return new TY(A022);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final long A5V(String str, long j) {
        if (this.A01.containsKey(str)) {
            byte[] bytes = this.A01.get(str);
            return ByteBuffer.wrap(bytes).getLong();
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.H0
    public final String A5X(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 78)));
        }
        return str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A06(((TY) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 0;
            Iterator<Map.Entry<String, byte[]>> it = this.A01.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String[] strArr = A03;
                String str = strArr[7];
                String str2 = strArr[0];
                int length = str.length();
                int result = str2.length();
                if (length == result) {
                    throw new RuntimeException();
                }
                A03[3] = "oFmiTb5ocNjXgy8itQp3Jt";
                if (hasNext) {
                    Map.Entry<String, byte[]> entry = it.next();
                    int hashCode = entry.getKey().hashCode();
                    int result2 = Arrays.hashCode(entry.getValue());
                    i += hashCode ^ result2;
                } else {
                    this.A00 = i;
                    break;
                }
            }
        }
        int result3 = this.A00;
        return result3;
    }
}
