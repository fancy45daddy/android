package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: assets/audience_network.dex */
public final class K1 {
    public static String[] A00 = {"XnOcKNlJJ8CDQQR", "VGhv6FkZrITxQRu9gbMUemqcetkh7B5f", "vVz2BTpV32jHfI", "d8hV", "Sy49NQqrKXgvTEWwSBtXX6HecYQBIBGU", "Db46iG0BOxvexN4G9aNEWNZ9mU0XJx13", "mKukGrwwCcIhJco4KmzrvmgYUSCtT5hL", "T8hiTRn5Amgadg81lccjSSIUWb1StHzV"};
    public static final AtomicReference<K0> A01 = new AtomicReference<>(null);

    public static K0 A00() {
        K0 k0 = A01.get();
        if (A00[5].charAt(26) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "JAkiPTeS8Sgp4wJmZ2cE1Xuhf0WoAHfE";
        strArr[4] = "TWyum6rZOmg61QmMcVNeRxvFtffIUfDC";
        if (k0 == null) {
            K0 errorLogger = new C0704Sh();
            return errorLogger;
        }
        return k0;
    }

    public static void A01(K0 k0) {
        A01.set(k0);
    }
}
