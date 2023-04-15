package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.facebook.ads.redexgen.X.Tc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0724Tc implements GO {
    public static String[] A0B = {"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    public long A00;
    public long A01;
    public GU A02;
    public C0421Hc A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC0409Gq A09;
    public final boolean A0A;

    public C0724Tc(InterfaceC0409Gq interfaceC0409Gq, long j) {
        this(interfaceC0409Gq, j, 20480, true);
    }

    public C0724Tc(InterfaceC0409Gq interfaceC0409Gq, long j, int i, boolean z) {
        this.A09 = (InterfaceC0409Gq) H6.A01(interfaceC0409Gq);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            C0430Hl.A0X(this.A06);
            this.A06 = null;
            File fileToCommit = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A44(fileToCommit);
            } else {
                fileToCommit.delete();
            }
        } catch (Throwable th) {
            C0430Hl.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A44(file);
            } else {
                file.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AEo(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        this.A05 = new FileOutputStream(this.A04);
        int i = this.A07;
        if (i > 0) {
            C0421Hc c0421Hc = this.A03;
            if (c0421Hc == null) {
                this.A03 = new C0421Hc(this.A05, i);
            } else {
                c0421Hc.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final void ACs(GU gu) throws C0725Td {
        if (gu.A02 == -1 && !gu.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = gu;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e) {
            throw new C0725Td(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final void close() throws C0725Td {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new C0725Td(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final void write(byte[] bArr, int i, int i2) throws C0725Td {
        if (this.A02 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = (this.A01 > this.A08 ? 1 : (this.A01 == this.A08 ? 0 : -1));
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                A0B[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (i4 == 0) {
                    A00();
                    A01();
                }
                int bytesWritten = i2 - i3;
                int min = (int) Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i + i3;
                this.A06.write(bArr, bytesWritten2, min);
                i3 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e) {
                throw new C0725Td(e);
            }
        }
    }
}
