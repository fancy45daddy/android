package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.To  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0736To implements GQ {
    public static byte[] A05;
    public static String[] A06 = {"l2rBvT9KAEY6yl2SIp", "0cRN39km0cT", "q9WvQr", "pX7zul93kCJ6F7tIXqRnEpKrjeNmhaPh", "ddKujtHDPllkfb3cyYepVcXFvJyDikdo", "gNoa3Z", "AdKzyhJyCrP", "aoyUT4m5l2MLf3LhSWprSpj54sdxW1uC"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    @Nullable
    public final InterfaceC0405Gm<? super C0736To> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{37};
    }

    static {
        A01();
    }

    public C0736To() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C0736To(@Nullable InterfaceC0405Gm<? super C0736To> interfaceC0405Gm) {
        this.A04 = interfaceC0405Gm;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws GX {
        try {
            this.A01 = gu.A04;
            this.A02 = new RandomAccessFile(gu.A04.getPath(), A00(0, 1, 72));
            this.A02.seek(gu.A03);
            this.A00 = gu.A02 == -1 ? this.A02.length() - gu.A03 : gu.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                InterfaceC0405Gm<? super C0736To> interfaceC0405Gm = this.A04;
                if (interfaceC0405Gm != null) {
                    interfaceC0405Gm.ACV(this, gu);
                }
                long j = this.A00;
                if (A06[0].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[7] = "qz0up6ppIELboyns2CZBgMvSr8RDOOhA";
                strArr[3] = "iQKzkqELqDYakLKWZdfSUnFo9DHl6nVv";
                return j;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new GX(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws GX {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new GX(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0405Gm<? super C0736To> interfaceC0405Gm = this.A04;
                if (interfaceC0405Gm != null) {
                    interfaceC0405Gm.ACU(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i, int i2) throws GX {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.A00 -= read;
                InterfaceC0405Gm<? super C0736To> interfaceC0405Gm = this.A04;
                if (interfaceC0405Gm != null) {
                    interfaceC0405Gm.AAA(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new GX(e);
        }
    }
}
