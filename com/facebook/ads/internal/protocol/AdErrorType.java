package com.facebook.ads.internal.protocol;

import a.a.j;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public enum AdErrorType {
    UNKNOWN_ERROR(-1, A00(2564, 13, 63), false),
    NETWORK_ERROR(1000, A00(2090, 13, 82), true),
    NO_FILL(1001, A00(2103, 7, j.AppCompatTheme_textAppearanceSearchResultTitle), true),
    LOAD_TOO_FREQUENTLY(1002, A00(261, 31, 74), true),
    DISABLED_APP(1005, A00(368, 39, 20), true),
    SERVER_ERROR(2000, A00(2209, 12, 94), true),
    INTERNAL_ERROR(2001, A00(1620, 14, 50), true),
    CACHE_FAILURE_ERROR(2002, A00(2124, 19, 38), true),
    START_BEFORE_INIT(2005, A00(2528, 36, 24), true),
    REMOTE_ADS_SERVICE_ERROR(2008, A00(343, 25, 28), true),
    INTERSTITIAL_AD_TIMEOUT(2009, A00(2221, 31, j.AppCompatTheme_windowNoTitle), true),
    RV_AD_TIMEOUT(2010, A00(2252, 33, j.AppCompatTheme_windowFixedHeightMajor), true),
    AD_PRESENTATION_ERROR(9001, A00(150, 25, j.AppCompatTheme_windowMinWidthMajor), true),
    BROKEN_MEDIA_ERROR(2100, A00(1020, 34, 41), true),
    AD_REQUEST_FAILED(1111, A00(623, 39, 71), false),
    AD_REQUEST_TIMEOUT(1112, A00(662, 42, 56), false),
    PARSER_FAILURE(1201, A00(1054, 50, 14), false),
    UNKNOWN_RESPONSE(1202, A00(2343, 47, 51), false),
    ERROR_MESSAGE(1203, A00(575, 48, 14), true),
    NO_AD_PLACEMENT(1302, A00(704, 42, 45), false),
    MEDIATION_ERROR(3001, A00(1926, 15, 30), true),
    BID_IMPRESSION_MISMATCH(4001, A00(465, 36, 10), true),
    BID_PAYLOAD_ERROR(4002, A00(1673, 19, 67), false),
    NO_ADAPTER_ON_LOAD(5001, A00(292, 25, j.AppCompatTheme_windowFixedWidthMajor), false),
    NO_ADAPTER_ON_START(5002, A00(317, 26, 15), false),
    INTERSTITIAL_CONTROLLER_IS_NULL(5003, A00(1634, 39, 14), false),
    WEB_VIEW_FAILED_TO_LOAD(5004, A00(2443, 22, 33), false),
    WEB_VIEW_CACHE_FILE_WAS_DENIED(5005, A00(1104, 43, 24), false),
    NO_MEDIAVIEW_IN_NATIVEAD(6001, A00(1894, 32, 11), true),
    NO_MEDIAVIEW_IN_NATIVEBANNERAD(6002, A00(1847, 47, j.AppCompatTheme_toolbarStyle), true),
    UNSUPPORTED_AD_ASSET_NATIVEAD(6003, A00(2577, 29, 64), true),
    AD_ALREADY_STARTED(7001, A00(91, 18, 46), true),
    LOAD_CALLED_WHILE_SHOWING_AD(7002, A00(j.AppCompatTheme_tooltipFrameBackground, 41, 86), true),
    CLEAR_TEXT_SUPPORT_NOT_ALLOWED(7003, A00(1277, 343, 25), true),
    INCORRECT_STATE_ERROR(7004, A00(2492, 36, j.AppCompatTheme_windowFixedWidthMajor), true),
    MISSING_DEPENDENCIES_ERROR(7005, A00(746, 178, 100), true),
    API_NOT_SUPPORTED(7006, A00(924, 75, 25), true),
    NATIVE_AD_IS_NOT_LOADED(7007, A00(175, 86, j.AppCompatTheme_windowFixedHeightMajor), true),
    INCORRECT_API_CALL_ERROR(7008, A00(2465, 27, 86), true),
    IMAGE_CACHE_ERROR(8001, A00(999, 21, 85), false),
    LOAD_AD_CALLED_MORE_THAN_ONCE(8002, A00(1768, 38, 24), true);
    
    public static byte[] A03;
    public static String[] A04 = {"ovPjjuFE9om7OIefNXRfQwFL9PUdOP68", "Xxl4rLnj16XDfkQUiM3437m5W6qonc5R", "UVmnaLPTsQqsAUFvP4l9eFVdZ5Bnbi11", "1ZhKvMy3c0pCt", "Rh7YRMmCfK6BaL93vKCO6WgzdB7W", "p5EAmOIUOepdn0Id4WtjwtBc6P8vGfuC", "JnlGisJqZLjO7zfwdKKMw91nRUtIhmzE", "W9Yqfcw4l1PfnAsasbj5MfnOF9oeiem1"};
    public final int A00;
    public final String A01;
    public final boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-94, -91, -64, -94, -83, -77, -90, -94, -91, -70, -64, -76, -75, -94, -77, -75, -90, -91, -20, -17, 10, -5, -3, -16, -2, -16, -7, -1, -20, -1, -12, -6, -7, 10, -16, -3, -3, -6, -3, -115, -112, -85, -98, -111, -99, -95, -111, -97, -96, -85, -110, -115, -107, -104, -111, -112, -109, -106, -79, -92, -105, -93, -89, -105, -91, -90, -79, -90, -101, -97, -105, -95, -89, -90, -75, -60, -67, -45, -62, -61, -56, -45, -57, -55, -60, -60, -61, -58, -56, -71, -72, -79, -44, -112, -47, -36, -30, -43, -47, -44, -23, -112, -29, -28, -47, -30, -28, -43, -44, -39, -4, -72, -5, -7, 6, 6, 7, 12, -72, -6, -3, -72, 4, 7, -7, -4, -3, -4, -72, 15, 0, 1, 4, -3, -72, -6, -3, 1, 6, -1, -72, -4, 1, 11, 8, 4, -7, 17, -3, -4, -7, 28, -40, 27, 39, 45, 36, 28, -40, 38, 39, 44, -40, 26, 29, -40, 40, 42, 29, 43, 29, 38, 44, 29, 28, -11, 24, -44, 29, 39, -44, 34, 35, 40, -44, 32, 35, 21, 24, 25, 24, -30, -44, 1, 21, 31, 25, -44, 39, 41, 38, 25, -44, 40, 28, 21, 40, -44, 45, 35, 41, -44, 23, 21, 32, 32, -44, 32, 35, 21, 24, -11, 24, -36, -35, -44, 22, 25, 26, 35, 38, 25, -44, 38, 25, 27, 29, 39, 40, 25, 38, 10, 29, 25, 43, -6, 35, 38, -3, 34, 40, 25, 38, 21, 23, 40, 29, 35, 34, -36, -35, -51, -16, -84, 3, -19, -1, -84, -2, -15, -71, -8, -5, -19, -16, -15, -16, -84, 0, -5, -5, -84, -14, -2, -15, -3, 1, -15, -6, 0, -8, 5, -9, 26, 23, 38, 42, 27, 40, -42, 31, 41, -42, 36, 43, 34, 34, -42, 37, 36, 2, 37, 23, 26, -42, -9, 26, -110, -75, -78, -63, -59, -74, -61, 113, -70, -60, 113, -65, -58, -67, -67, 113, -64, -65, -92, -59, -78, -61, -59, 113, -110, -75, -97, -62, -47, 126, -79, -61, -48, -44, -57, -63, -61, 126, -50, -48, -51, -63, -61, -47, -47, 126, -61, -48, -48, -51, -48, -105, -58, -58, 118, -65, -55, 118, -70, -65, -55, -73, -72, -62, -69, -70, 118, -68, -56, -59, -61, 118, -61, -73, -63, -65, -60, -67, 118, -73, -70, 118, -56, -69, -57, -53, -69, -55, -54, -55, -72, -65, -70, -43, -65, -61, -58, -56, -69, -55, -55, -65, -59, -60, -43, -61, -65, -55, -61, -73, -54, -71, -66, -22, -15, -20, 7, -8, -23, 1, -12, -9, -23, -20, 7, -19, -6, -6, -9, -6, -29, -13, -16, -20, -26, -17, 0, -18, -26, -27, -22, -30, 0, -26, -13, -13, -16, -13, -114, -75, -80, 108, -68, -83, -59, -72, -69, -83, -80, 108, -80, -69, -79, -65, 108, -70, -69, -64, 108, -71, -83, -64, -81, -76, 108, -68, -72, -83, -81, -79, -71, -79, -70, -64, -24, -26, -24, -19, -22, 4, -21, -26, -18, -15, -6, -9, -22, 4, -22, -9, -9, -12, -9, -12, -3, -10, -14, 3, 16, 5, -10, 9, 5, 16, 4, 6, 1, 1, 0, 3, 5, 16, -1, 0, 5, 16, -14, -3, -3, 0, 8, -10, -11, -66, -61, -51, -69, -68, -58, -65, -66, -39, -69, -54, -54, -32, -19, -19, -22, -19, -6, -24, -32, -18, -18, -36, -30, -32, -106, -79, -77, -75, -78, -65, -65, -69, 112, -111, -76, -61, 112, -93, -108, -101, 112, -76, -75, -68, -71, -58, -75, -62, -55, 112, -62, -75, -61, -64, -65, -66, -61, -75, 112, -107, -62, -62, -65, -62, 112, -67, -75, -61, -61, -79, -73, -75, -49, -22, -20, -18, -21, -8, -8, -12, -87, -54, -19, -4, -87, -36, -51, -44, -87, -5, -18, -6, -2, -18, -4, -3, -87, -17, -8, -5, -87, -22, -19, -4, -87, -17, -22, -14, -11, -18, -19, -64, -37, -35, -33, -36, -23, -23, -27, -102, -69, -34, -19, -102, -51, -66, -59, -102, -20, -33, -21, -17, -33, -19, -18, -102, -32, -23, -20, -102, -37, -34, -19, -102, -18, -29, -25, -33, -34, -102, -23, -17, -18, -75, -48, -46, -44, -47, -34, -34, -38, -113, -80, -45, -30, -113, -62, -77, -70, -113, -31, -44, -29, -28, -31, -35, -44, -45, -113, -35, -34, -113, -48, -45, -113, -33, -37, -48, -46, -44, -36, -44, -35, -29, -30, -20, 7, 9, 11, 8, 21, 21, 17, -58, -25, 27, 10, 15, 11, 20, 9, 11, -58, -12, 11, 26, 29, 21, 24, 17, -58, -7, -22, -15, -58, 10, 21, 11, 25, 20, -51, 26, -58, 14, 7, 28, 11, -58, 7, 18, 18, -58, 24, 11, 23, 27, 15, 24, 11, 10, -58, 9, 18, 7, 25, 25, 11, 25, -44, -58, -10, 18, 11, 7, 25, 11, -46, -58, 9, 14, 11, 9, 17, -58, -14, 21, 13, -23, 7, 26, -58, 21, 27, 26, 22, 27, 26, -58, 12, 21, 24, -58, 26, 7, 13, -58, -53, 25, -44, -58, -7, 11, 11, -58, 19, 21, 24, 11, -32, -58, 14, 26, 26, 22, 25, -32, -43, -43, 10, 11, 28, 11, 18, 21, 22, 11, 24, 25, -44, 12, 7, 9, 11, 8, 21, 21, 17, -44, 9, 21, 19, -43, 10, 21, 9, 25, -43, 7, 27, 10, 15, 11, 20, 9, 11, -45, 20, 11, 26, 29, 21, 24, 17, -43, 7, 20, 10, 24, 21, 15, 10, -43, -58, -95, -68, -66, -64, -67, -54, -54, -58, 123, -100, -48, -65, -60, -64, -55, -66, -64, 123, -87, -64, -49, -46, -54, -51, -58, 123, -82, -97, -90, 123, -65, -54, -64, -50, -55, -126, -49, 123, -50, -48, -53, -53, -54, -51, -49, 123, -100, -55, -65, -51, -54, -60, -65, 123, -86, -82, 123, -47, -64, -51, -50, -60, -54, -55, -50, 123, -67, -64, -57, -54, -46, 123, -113, -119, -115, -35, 
        -8, 0, 3, -4, -5, -73, 11, 6, -73, -6, -8, -6, -1, -4, -73, 0, 4, -8, -2, -4, -79, -52, -44, -41, -48, -49, -117, -33, -38, -117, -41, -38, -52, -49, -117, -72, -48, -49, -44, -52, -117, -47, -38, -35, -117, -71, -52, -33, -44, -31, -48, -117, -84, -49, -106, -79, -71, -68, -75, -76, 112, -60, -65, 112, -64, -79, -62, -61, -75, 112, -106, -79, -77, -75, -78, -65, -65, -69, 112, -111, -76, -61, 112, -93, -108, -101, 112, -76, -75, -68, -71, -58, -75, -62, -55, 112, -62, -75, -61, -64, -65, -66, -61, -75, -96, -61, -58, -65, 122, -90, -55, -69, -66, 122, -64, -52, -55, -57, 122, -79, -65, -68, -80, -61, -65, -47, 122, -47, -69, -51, 122, -98, -65, -56, -61, -65, -66, 122, -64, -55, -52, 122, -99, -69, -67, -62, -65, -43, -39, -51, -45, -47, -21, -49, -51, -49, -44, -47, -21, -47, -34, -34, -37, -34, -73, -68, -79, -67, -64, -64, -77, -79, -62, -51, -81, -66, -73, -51, -79, -81, -70, -70, -51, -77, -64, -64, -67, -64, -98, -93, -104, -92, -89, -89, -102, -104, -87, -76, -88, -87, -106, -87, -102, -76, -102, -89, -89, -92, -89, -110, -105, -99, -114, -101, -105, -118, -107, -88, -114, -101, -101, -104, -101, 1, 6, 12, -3, 10, 11, 12, 1, 12, 1, -7, 4, 23, -7, -4, 23, 12, 1, 5, -3, 7, 13, 12, -75, -70, -64, -79, -66, -65, -64, -75, -64, -75, -83, -72, -53, -81, -69, -70, -64, -66, -69, -72, -72, -79, -66, -53, -75, -65, -53, -70, -63, -72, -72, -92, -55, 123, -54, -51, -65, -64, -51, 123, -49, -54, 123, -48, -50, -64, 123, -66, -68, -66, -61, -64, 123, -60, -55, 123, -95, -68, -66, -64, -67, -54, -54, -58, 123, -100, -48, -65, -60, -64, -55, -66, -64, 123, -87, -64, -49, -46, -54, -51, -58, 123, -82, -97, -90, 123, -44, -54, -48, 123, -50, -61, -54, -48, -57, -65, 123, -46, -61, -60, -49, -64, -57, -60, -50, -49, 123, -116, -115, -110, -119, -117, -119, -117, -119, -116, 123, -60, -55, 123, -44, -54, -48, -51, 123, -87, -64, -49, -46, -54, -51, -58, 123, -82, -64, -66, -48, -51, -60, -49, -44, 123, -98, -54, -55, -63, -60, -62, -48, -51, -68, -49, -60, -54, -55, -107, 101, -105, -65, -54, -56, -68, -60, -55, -120, -66, -54, -55, -63, -60, -62, 123, -66, -57, -64, -68, -51, -49, -64, -45, -49, -81, -51, -68, -63, -63, -60, -66, -85, -64, -51, -56, -60, -49, -49, -64, -65, -104, 125, -49, -51, -48, -64, 125, -103, 101, 123, 123, 123, 123, -105, -65, -54, -56, -68, -60, -55, 123, -60, -55, -66, -57, -48, -65, -64, -82, -48, -67, -65, -54, -56, -68, -60, -55, -50, -104, 125, -49, -51, -48, -64, 125, -103, -116, -115, -110, -119, -117, -119, -117, -119, -116, -105, -118, -65, -54, -56, -68, -60, -55, -103, 101, -105, -118, -65, -54, -56, -68, -60, -55, -120, -66, -54, -55, -63, -60, -62, -103, 101, -82, -64, -64, 123, -56, -54, -51, -64, -107, 123, -61, -49, -49, -53, -50, -107, -118, -118, -65, -64, -47, -64, -57, -54, -53, -64, -51, -50, -119, -63, -68, -66, -64, -67, -54, -54, -58, -119, -66, -54, -56, -118, -65, -54, -66, -50, -118, -68, -48, -65, -60, -64, -55, -66, -64, -120, -55, -64, -49, -46, -54, -51, -58, -118, -68, -55, -65, -51, -54, -60, -65, -120, -55, -64, -49, -46, -54, -51, -58, -120, -50, -64, -66, -48, -51, -60, -49, -44, -120, -66, -54, -55, -63, -60, -62, -67, -30, -24, -39, -26, -30, -43, -32, -108, -71, -26, -26, -29, -26, -103, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 112, -109, -65, -66, -60, -62, -65, -68, -68, -75, -62, 112, -71, -61, 112, -66, -59, -68, -68, 112, -61, -72, -65, -57, 112, -111, -76, -50, -13, -5, -26, -15, -18, -23, -91, -25, -18, -23, -91, -11, -26, -2, -15, -12, -26, -23, -27, -24, -38, -35, -8, -38, -35, -8, -36, -38, -27, -27, -34, -35, -8, -26, -24, -21, -34, -8, -19, -31, -38, -25, -8, -24, -25, -36, -34, 12, 15, 1, 4, 31, 3, 1, 12, 12, 5, 4, 31, 23, 8, 9, 12, 5, 31, 19, 8, 15, 23, 9, 14, 7, 31, 1, 4, -33, -30, -44, -41, -14, -25, -30, -30, -14, -39, -27, -40, -28, -24, -40, -31, -25, -33, -20, -90, -55, -69, -66, -101, -66, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -67, -69, -58, -58, -65, -66, 122, -57, -55, -52, -65, 122, -50, -62, -69, -56, 122, -55, -56, -67, -65, -98, -106, -107, -102, -110, -91, -102, -96, -97, -80, -106, -93, -93, -96, -93, -46, -50, -40, -40, -50, -45, -52, -28, -55, -54, -43, -54, -45, -55, -54, -45, -56, -50, -54, -40, -28, -54, -41, -41, -44, -41, -6, 18, 17, 22, 14, 3, 22, 18, 36, -51, 19, 28, 31, -51, 22, 16, 28, 27, -51, 22, 32, -51, 26, 22, 32, 32, 22, 27, 20, -51, 22, 27, -51, -5, 14, 33, 22, 35, 18, -17, 14, 27, 27, 18, 31, -18, 17, -102, -78, -79, -74, -82, -93, -74, -78, -60, 109, -74, -64, 109, -70, -74, -64, -64, -74, -69, -76, 109, -74, -69, 109, -101, -82, -63, -74, -61, -78, -114, -79, -83, -59, -60, -55, -63, -44, -55, -49, -50, Byte.MIN_VALUE, -91, -46, -46, -49, -46, -90, -103, -84, -95, -82, -99, -73, -103, -100, -73, -95, -85, -73, -90, -89, -84, -73, -92, -89, -103, -100, -99, -100, -12, -21, -6, -3, -11, -8, -15, 5, -21, -8, -8, -11, -8, -62, -61, -45, -75, -72, -75, -60, -56, -71, -58, -45, -61, -62, -45, -64, -61, -75, -72, -75, -74, -58, -88, -85, 
        -88, -73, -69, -84, -71, -58, -74, -75, -58, -70, -69, -88, -71, -69, -49, -48, -32, -62, -59, -32, -47, -51, -62, -60, -58, -50, -58, -49, -43, -61, -60, -44, -69, -66, -63, -63, -29, -28, -12, -30, -38, -39, -34, -42, -21, -34, -38, -20, -12, -34, -29, -12, -29, -42, -23, -34, -21, -38, -42, -39, -5, -4, 12, -6, -14, -15, -10, -18, 3, -10, -14, 4, 12, -10, -5, 12, -5, -18, 1, -10, 3, -14, -17, -18, -5, -5, -14, -1, -18, -15, -30, -7, 8, 11, 3, 6, -1, -76, -39, 6, 6, 3, 6, -10, 23, -56, -18, 17, 20, 20, -109, -124, -107, -106, -120, -107, -94, -119, -124, -116, -113, -104, -107, -120, -72, -38, -51, -120, -85, -55, -53, -48, -47, -42, -49, -120, -50, -55, -47, -44, -35, -38, -51, -27, -40, -32, -30, -25, -40, -14, -44, -41, -26, -14, -26, -40, -27, -23, -36, -42, -40, -14, -40, -27, -27, -30, -27, -99, -95, -86, -116, -113, -86, -97, -108, -104, -112, -102, -96, -97, -41, -55, -42, -38, -55, -42, -29, -55, -42, -42, -45, -42, 8, 9, -10, 7, 9, 20, -9, -6, -5, 4, 7, -6, 20, -2, 3, -2, 9, -13, 5, 18, 22, 5, 18, -64, -27, 18, 18, 15, 18, 14, 35, 39, 31, 41, 47, 46, -38, 38, 41, 27, 30, 35, 40, 33, -38, 3, 40, 46, 31, 44, 45, 46, 35, 46, 35, 27, 38, -38, -5, 30, 8, 29, 33, 25, 35, 41, 40, -44, 32, 35, 21, 24, 29, 34, 27, -44, 6, 25, 43, 21, 38, 24, 25, 24, -44, 10, 29, 24, 25, 35, -44, -11, 24, -82, -89, -92, -89, -88, -80, -89, -72, -98, -85, -85, -88, -85, -26, -33, -36, -33, -32, -24, -33, -16, -29, -42, -28, -31, -32, -33, -28, -42, -93, -100, -95, -93, -98, -98, -99, -96, -94, -109, -110, -83, -113, -110, -83, -113, -95, -95, -109, -94, -83, -100, -113, -94, -105, -92, -109, -113, -110, -54, -29, -32, -29, -28, -20, -29, -107, -69, -42, -40, -38, -41, -28, -28, -32, -107, -74, -39, -24, -107, -56, -71, -64, -107, -39, -38, -31, -34, -21, -38, -25, -18, -107, -25, -38, -24, -27, -28, -29, -24, -38, -107, -23, -18, -27, -38, -85, -103, -106, -77, -86, -99, -103, -85, -77, -105, -107, -105, -100, -103, -77, -102, -99, -96, -103, -77, -85, -107, -89, -77, -104, -103, -94, -99, -103, -104, 15, -3, -6, 23, 14, 1, -3, 15, 23, -2, -7, 1, 4, -3, -4, 23, 12, 7, 23, 4, 7, -7, -4, -70, -56, -59, -71, -52, -56, -38, -125, -55, -60, -52, -49, -56, -57, -125, -41, -46, -125, -49, -46, -60, -57, -15, 7, 13, -72, -5, -7, 6, -65, 12, -72, -5, -7, 4, 4, -72, -67, 11, -72, -2, 7, 10, -72, -7, -4, -72, -67, 11, 15, 37, 43, -42, 25, 23, 36, -35, 42, -42, 25, 23, 34, 34, -42, -37, 41, -42, 28, 37, 40, -42, 23, 26, -42, 31, 36, -42, 41, 42, 23, 42, 27, -42, -37, 41, -61, -56, -61, -50, -101, -66, 122, -57, -49, -51, -50, 122, -68, -65, 122, -67, -69, -58, -58, -65, -66, 122, -68, -65, -64, -55, -52, -65, 122, -51, -50, -69, -52, -50, -101, -66, -10, -17, -20, -17, -16, -8, -17, -95, -26, -13, -13, -16, -13, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -10, -5, -14, -25, -94, -15, -24, -94, -29, -26, -94, -29, -11, -11, -25, -10, -11};
    }

    static {
        A01();
    }

    AdErrorType(int i, String str, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public static AdErrorType adErrorTypeFromCode(int i) {
        return adErrorTypeFromCode(i, UNKNOWN_ERROR);
    }

    public static AdErrorType adErrorTypeFromCode(int i, AdErrorType adErrorType) {
        AdErrorType[] valuesCustom;
        for (AdErrorType adErrorType2 : valuesCustom()) {
            if (adErrorType2.getErrorCode() == i) {
                return adErrorType2;
            }
        }
        return adErrorType;
    }

    public String getDefaultErrorMessage() {
        return this.A01;
    }

    public int getErrorCode() {
        return this.A00;
    }

    public boolean isPublicError() {
        return this.A02;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AdErrorType[] valuesCustom() {
        AdErrorType[] adErrorTypeArr = (AdErrorType[]) values().clone();
        String[] strArr = A04;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            String[] strArr2 = A04;
            strArr2[5] = "pBNFHLUpC4jWXgNLm8u027UOuLKmSmpd";
            strArr2[2] = "gG1ZcsHEHMfNZyb2FxMGGthk6GnsPN8K";
            return adErrorTypeArr;
        }
        throw new RuntimeException();
    }
}
