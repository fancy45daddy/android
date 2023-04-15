package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.facebook.ads.redexgen.X.Hc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0421Hc extends BufferedOutputStream {
    public boolean A00;

    public C0421Hc(OutputStream outputStream) {
        super(outputStream);
    }

    public C0421Hc(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(OutputStream outputStream) {
        H6.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable e = null;
        try {
            flush();
        } catch (Throwable th) {
            e = th;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e == null) {
                e = thrown;
            }
        }
        if (e != null) {
            C0430Hl.A0Y(e);
        }
    }
}
