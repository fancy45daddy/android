package com.facebook.ads.redexgen.X;

import android.widget.MediaController;
/* loaded from: assets/audience_network.dex */
public class PX implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ TextureView$SurfaceTextureListenerC0418Gz A00;

    public PX(TextureView$SurfaceTextureListenerC0418Gz textureView$SurfaceTextureListenerC0418Gz) {
        this.A00 = textureView$SurfaceTextureListenerC0418Gz;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        PS ps;
        PS ps2;
        ps = this.A00.A0C;
        if (ps != null) {
            ps2 = this.A00.A0C;
            return ps2.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        PS ps;
        PS ps2;
        ps = this.A00.A0C;
        if (ps != null) {
            ps2 = this.A00.A0C;
            return ps2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        PS ps;
        PS ps2;
        ps = this.A00.A0C;
        if (ps != null) {
            ps2 = this.A00.A0C;
            if (ps2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC0625Pg interfaceC0625Pg;
        InterfaceC0625Pg interfaceC0625Pg2;
        interfaceC0625Pg = this.A00.A0F;
        if (interfaceC0625Pg != null) {
            interfaceC0625Pg2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            interfaceC0625Pg2.ABL();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC0625Pg interfaceC0625Pg;
        InterfaceC0625Pg interfaceC0625Pg2;
        interfaceC0625Pg = this.A00.A0F;
        if (interfaceC0625Pg != null) {
            interfaceC0625Pg2 = this.A00.A0F;
            interfaceC0625Pg2.ABM();
        }
    }
}
