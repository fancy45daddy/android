package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Pd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0622Pd {
    void A7s();

    boolean A83();

    boolean A84();

    boolean A8Y();

    void ACz(boolean z, int i);

    void AEi(int i);

    void AEn(EnumC0611Os enumC0611Os, int i);

    void AEu(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC0611Os getStartReason();

    EnumC0624Pf getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(@Nullable InterfaceC0625Pg interfaceC0625Pg);

    void setup(Uri uri);
}
