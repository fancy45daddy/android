package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.9s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC02459s {
    void onAudioSessionId(C02449r c02449r, int i);

    void onAudioUnderrun(C02449r c02449r, int i, long j, long j2);

    void onDecoderDisabled(C02449r c02449r, int i, C0261Ai c0261Ai);

    void onDecoderEnabled(C02449r c02449r, int i, C0261Ai c0261Ai);

    void onDecoderInitialized(C02449r c02449r, int i, String str, long j);

    void onDecoderInputFormatChanged(C02449r c02449r, int i, Format format);

    void onDownstreamFormatChanged(C02449r c02449r, EZ ez);

    void onDrmKeysLoaded(C02449r c02449r);

    void onDrmKeysRemoved(C02449r c02449r);

    void onDrmKeysRestored(C02449r c02449r);

    void onDrmSessionManagerError(C02449r c02449r, Exception exc);

    void onDroppedVideoFrames(C02449r c02449r, int i, long j);

    void onLoadError(C02449r c02449r, EY ey, EZ ez, IOException iOException, boolean z);

    void onLoadingChanged(C02449r c02449r, boolean z);

    void onMediaPeriodCreated(C02449r c02449r);

    void onMediaPeriodReleased(C02449r c02449r);

    void onMetadata(C02449r c02449r, Metadata metadata);

    void onPlaybackParametersChanged(C02449r c02449r, C9T c9t);

    void onPlayerError(C02449r c02449r, AnonymousClass98 anonymousClass98);

    void onPlayerStateChanged(C02449r c02449r, boolean z, int i);

    void onPositionDiscontinuity(C02449r c02449r, int i);

    void onReadingStarted(C02449r c02449r);

    void onRenderedFirstFrame(C02449r c02449r, Surface surface);

    void onSeekProcessed(C02449r c02449r);

    void onSeekStarted(C02449r c02449r);

    void onTimelineChanged(C02449r c02449r, int i);

    void onTracksChanged(C02449r c02449r, TrackGroupArray trackGroupArray, GD gd);

    void onVideoSizeChanged(C02449r c02449r, int i, int i2, int i3, float f);
}
