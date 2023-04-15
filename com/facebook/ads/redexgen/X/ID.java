package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class ID {
    public static ID A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0Q(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
            i4++;
        }
    }

    public static void A0b() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, Byte.MAX_VALUE, 101, 120, Byte.MAX_VALUE, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, Byte.MAX_VALUE, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, 29, 6, 17, 25, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, 12, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, Byte.MAX_VALUE, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, 28, 32, 47, 42, 32, 40, 48, 28, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, 28, 48, 55, 38, 51, 28, 32, 34, 45, 32, 38, 47, 28, 33, 54, 55, 55, 44, 45, 28, 55, 38, 59, 55, 25, 27, 27, 17, 28, 29, 22, 12, 25, 20, 39, 27, 20, 17, 27, 19, 11, 39, 27, 23, 22, 30, 17, 31, 86, 12, 15, 23, 39, 11, 12, 29, 8, 39, 27, 23, 22, 30, 17, 10, 21, 39, 26, 13, 12, 12, 23, 22, 39, 12, 29, 0, 12, 3, 1, 1, 11, 6, 7, 12, 22, 3, 14, 61, 1, 14, 11, 1, 9, 17, 61, 1, 13, 12, 4, 11, 5, 76, 22, 21, 13, 61, 17, 22, 7, 18, 61, 1, 13, 12, 4, 11, 16, 15, 3, 22, 11, 13, 12, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, 11, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, 30, 28, 28, 22, 27, 26, 17, 11, 30, 19, 32, 28, 19, 22, 28, 20, 12, 32, 28, 16, 17, 25, 22, 24, 81, 11, 8, 16, 32, 12, 11, 26, 15, 32, 28, 16, 17, 25, 22, 13, 18, 30, 11, 22, 16, 17, 32, 11, 22, 11, 19, 26, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, Byte.MAX_VALUE, 96, 23, 18, 24, 1, 41, 23, 21, 21, 19, 6, 2, 23, 20, 26, 19, 41, 5, 2, 23, 21, 29, 2, 4, 23, 21, 19, 41, 26, 19, 24, 17, 2, 30, 63, 58, 48, 41, 1, 63, 48, 58, 44, 49, 55, 58, 1, 63, 50, 50, 49, 41, 1, 50, 49, 63, 58, 1, 58, 43, 44, 55, 48, 57, 1, 45, 54, 49, 41, 55, 48, 57, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 121, 118, 106, 71, 124, 125, 108, 125, 123, 108, 119, 106, 71, 125, 118, 121, 122, 116, 125, 31, 26, 16, 9, 33, 31, 16, 26, 12, 17, 23, 26, 33, 31, 16, 12, 33, 26, 27, 10, 27, 29, 10, 17, 12, 33, 10, 23, 19, 27, 17, 11, 10, 33, 19, 13, 46, 43, 33, 56, 16, 46, 33, 43, 61, 32, 38, 43, 16, 45, 46, 33, 33, 42, 61, 16, 42, 55, 59, 61, 46, 16, 39, 38, 33, 59, 60, 16, 41, 38, 55, 16, 42, 33, 46, 45, 35, 42, 43, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 61, 51, 62, 60, 52, 51, 54, 44, 43, 58, 59, 0, 54, 49, 43, 58, 49, 43, 0, 42, 45, 51, 0, 47, 45, 58, 57, 54, 39, 58, 44, 112, 117, Byte.MAX_VALUE, 102, 78, 112, Byte.MAX_VALUE, 117, 99, 126, 120, 117, 78, 115, 125, 126, 114, 122, 78, 100, Byte.MAX_VALUE, 98, 112, 119, 116, 78, 97, 125, 112, 104, 112, 115, 125, 116, 78, 118, 112, 124, 116, 98, 78, 114, 112, 114, 121, 116, 33, 36, 46, 55, 31, 33, 46, 36, 50, 47, 41, 36, 31, 34, 57, 48, 33, 51, 51, 31, 48, 33, 35, 43, 33, 39, 37, 31, 36, 37, 52, 37, 35, 52, 41, 47, 46, 31, 38, 47, 50, 31, 36, 37, 37, 48, 44, 41, 46, 43, 51, 5, 0, 10, 19, 59, 5, 10, 0, 22, 11, 13, 0, 59, 7, 5, 7, 12, 1, 59, 9, 11, 0, 17, 8, 1, 59, 9, 5, 28, 59, 23, 13, 30, 1, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 113, 115, 113, 122, 119, 77, Byte.MAX_VALUE, 125, 118, 103, 126, 119, 77, 96, 119, 102, 96, 107, 77, 126, 123, Byte.MAX_VALUE, 123, 102, 28, 25, 19, 10, 34, 28, 19, 25, 15, 18, 20, 25, 34, 30, 28, 15, 18, 8, 14, 24, 17, 34, 10, 21, 20, 9, 24, 34, 20, 19, 9, 24, 15, 14, 9, 20, 9, 20, 28, 17, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 71, 75, 73, 84, 86, 65, 87, 87, 123, 77, 73, 69, 67, 65, 87, 123, 64, 81, 86, 77, 74, 67, 123, 64, 75, 83, 74, 72, 75, 69, 64, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 100, 101, 102, 97, 117, 108, 116, 95, 97, 115, 115, 101, 116, 95, 112, 114, 101, 108, 111, 97, 100, 95, 115, 105, 122, 101, 95, 98, 121, 116, 101, 115, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 66, 79, 85, 71, 68, 74, 67, 121, 86, 74, 71, 95, 71, 68, 74, 67, 121, 86, 84, 67, 69, 71, 69, 78, 67, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 123, 112, 64, 113, 112, 107, 64, 106, 108, 
        122, 64, 108, 107, 126, 107, 122, 64, 119, 126, 113, 123, 115, 122, 109, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 121, 114, 125, 126, 112, 121, 67, 114, 125, 104, 117, 106, 121, 67, 122, 105, 114, 114, 121, 112, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 51, 46, 57, 9, 38, 58, 55, 47, 51, 36, 9, 53, 55, 53, 62, 51, 9, 59, 55, 46, 9, 37, 63, 44, 51, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 87, 80, 88, 93, 110, 80, 85, 110, 93, 94, 80, 85, 110, 94, 95, 110, 85, 88, 66, 90, 110, 84, 67, 67, 94, 67, 66, 12, 9, 3, 26, 50, 12, 3, 9, 31, 2, 4, 9, 50, 11, 12, 4, 1, 50, 2, 3, 50, 26, 8, 15, 27, 4, 8, 26, 50, 8, 31, 31, 2, 31, 30, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, Byte.MAX_VALUE, 118, 107, 122, 124, 70, 113, 120, 107, 125, 110, 120, 107, 124, 70, 120, 122, 122, 124, 117, 124, 107, 120, 109, 112, 118, 119, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 99, 98, 111, 110, 84, 125, 98, 111, 110, 100, 123, 121, 100, 108, 121, 110, 120, 120, 84, 106, 101, 98, 102, 106, Byte.MAX_VALUE, 98, 100, 101, 10, 15, 5, 28, 52, 10, 5, 15, 25, 4, 2, 15, 52, 2, 6, 10, 12, 14, 52, 8, 10, 8, 3, 14, 52, 24, 31, 4, 25, 14, 52, 9, 18, 31, 14, 52, 8, 4, 30, 5, 31, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 25, 17, 25, 27, 6, 13, 43, 27, 4, 0, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 102, 121, 104, 84, 98, 102, 123, 121, 110, 120, 120, 98, 100, 101, 84, 109, 100, 121, 84, 101, 106, Byte.MAX_VALUE, 98, 125, 110, 84, 125, 98, 111, 110, 100, 84, 106, 111, 120, 84, 125, 57, 43, 46, 36, 61, 21, 43, 36, 46, 56, 37, 35, 46, 21, 36, 43, 62, 35, 60, 47, 21, 41, 43, 56, 37, 63, 57, 47, 38, 21, 47, 50, 62, 47, 36, 57, 35, 37, 36, 21, 60, 43, 56, 35, 43, 36, 62, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 72, 71, 82, 79, 80, 67, 121, 72, 67, 81, 121, 69, 71, 84, 73, 83, 85, 67, 74, 121, 66, 67, 85, 79, 65, 72, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 118, 125, 108, 111, 119, 106, 115, 71, 124, 125, 126, 121, 109, 116, 108, 71, 123, 119, 118, 118, 125, 123, 108, 113, 119, 118, 71, 108, 113, 117, 125, 119, 109, 108, 71, 117, 107, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 99, 114, 113, 105, 116, 109, 89, 98, 99, 96, 103, 115, 106, 114, 89, 116, 99, 103, 98, 89, 114, 111, 107, 99, 105, 115, 114, 89, 107, 117, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 115, 120, 105, 106, 114, 111, 118, 66, 121, 120, 123, 124, 104, 113, 105, 66, 111, 120, 105, 111, 116, 120, 110, 66, 115, 104, 112, 56, 61, 55, 46, 6, 56, 55, 61, 43, 54, 48, 61, 6, 55, 60, 45, 46, 54, 43, 50, 6, 61, 60, 63, 56, 44, 53, 45, 6, 45, 49, 43, 54, 45, 45, 53, 60, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, 64, 104, 86, 89, 83, 69, 88, 94, 83, 104, 89, 82, 67, 64, 88, 69, 92, 104, 83, 82, 81, 86, 66, 91, 67, 104, 67, 94, 90, 82, 88, 66, 67, 104, 90, 68, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 85, 78, 73, 86, 101, 95, 84, 91, 88, 86, 95, 94, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 39, 48, 56, 58, 35, 48, 10, 36, 32, 48, 39, 44, 10, 37, 52, 39, 33, 10, 51, 39, 58, 56, 10, 54, 52, 54, 61, 48, 10, 62, 48, 44, 14, 11, 1, 24, 48, 14, 1, 11, 29, 0, 6, 11, 48, 29, 10, 31, 0, 29, 27, 48, 31, 29, 10, 28, 10, 1, 27, 14, 27, 6, 0, 1, 48, 10, 29, 29, 0, 29, 48, 24, 7, 10, 1, 48, 1, 0, 48, 6, 2, 31, 29, 10, 28, 28, 6, 0, 1, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, 126, 105, 124, 99, 126, 120, 83, 124, 126, 105, Byte.MAX_VALUE, 105, 98, 120, 109, 120, 101, 99, 98, 83, 105, 126, 126, 99, 126, Byte.MAX_VALUE, 83, 101, 98, Byte.MAX_VALUE, 120, 105, 109, 104, 83, 99, 106, 83, 101, 98, 120, 105, 126, 98, 109, 96, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 40, 51, 52, 46, 55, 63, 4, 57, 55, 52, 56, 48, 4, 40, 34, 53, 56, 4, 52, 53, 4, 57, 58, 56, 48, 60, 41, 52, 46, 53, 63, 35, 38, 44, 53, 29, 35, 44, 38, 48, 45, 43, 38, 29, 49, 42, 45, 55, 46, 38, 29, 42, 43, 38, 39, 29, 46, 45, 35, 38, 39, 48, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 73, 82, 85, 79, 86, 94, 101, 83, 84, 83, 78, 101, 79, 84, 73, 81, 83, 74, 74, 91, 88, 86, 95, 101, 73, 95, 89, 85, 84, 94, 73, 101, 89, 85, 87, 74, 86, 95, 78, 95, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 63, 36, 35, 57, 32, 40, 19, 32, 45, 57, 
        34, 47, 36, 19, 60, 32, 45, 53, 19, 63, 56, 35, 62, 41, 19, 37, 34, 19, 35, 58, 41, 62, 32, 45, 53, 7, 2, 8, 17, 57, 7, 8, 2, 20, 9, 15, 2, 57, 21, 14, 9, 19, 10, 2, 57, 20, 3, 21, 3, 18, 57, 0, 9, 5, 19, 21, 57, 9, 8, 57, 8, 7, 18, 15, 16, 3, 57, 20, 3, 22, 9, 20, 18, 15, 8, 1, 41, 44, 38, 63, 23, 41, 38, 44, 58, 39, 33, 44, 23, 61, 42, 62, 58, 43, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, 102, 96, 118, 76, 112, 114, 112, 123, 118, 76, 126, 124, 119, 102, Byte.MAX_VALUE, 118, 76, 117, 124, 97, 76, 122, 126, 114, 116, 118, 96, 122, Byte.MAX_VALUE, 117, 108, 68, 122, 117, Byte.MAX_VALUE, 105, 116, 114, Byte.MAX_VALUE, 68, 110, 104, 126, 68, 104, 111, 126, 122, 118, 114, 117, 124, 68, 114, 118, 122, 124, 126, 68, Byte.MAX_VALUE, 126, 120, 116, Byte.MAX_VALUE, 114, 117, 124, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 3, 28, 29, 0, 17, 24, 29, 7, 0, 17, 16, 43, 29, 26, 0, 17, 26, 0, 43, 1, 6, 24, 43, 4, 6, 17, 18, 29, 12, 17, 7, 91, 94, 84, 77, 101, 91, 73, 73, 95, 78, 101, 92, 95, 78, 89, 82, 83, 84, 93, 101, 79, 84, 83, 92, 83, 95, 94, 51, 54, 60, 37, 13, 48, 51, 60, 60, 55, 32, 13, 60, 61, 38, 59, 52, 43, 13, 51, 54, 13, 62, 61, 51, 54, 55, 54, 13, 61, 60, 13, 51, 33, 33, 55, 38, 33, 13, 62, 61, 51, 54, 55, 54, 35, 38, 44, 53, 29, 32, 39, 44, 33, 42, 47, 35, 48, 41, 29, 48, 39, 50, 45, 48, 54, 29, 43, 44, 54, 39, 48, 52, 35, 46, 29, 47, 49, 26, 31, 21, 12, 36, 25, 23, 20, 24, 16, 36, 23, 20, 24, 16, 8, 24, 9, 30, 30, 21, 66, 71, 77, 84, 124, 64, 79, 74, 64, 72, 80, 124, 80, 70, 64, 76, 77, 71, 124, 64, 75, 66, 77, 77, 70, 79, 124, 70, 77, 66, 65, 79, 70, 71, 52, 49, 59, 34, 10, 54, 39, 52, 38, 61, 10, 38, 61, 60, 48, 57, 49, 10, 48, 59, 52, 55, 57, 48, 49, 37, 32, 42, 51, 27, 39, 48, 37, 27, 37, 42, 45, 41, 37, 48, 45, 43, 42, 27, 32, 33, 40, 37, 61, 27, 41, 55, 89, 92, 86, 79, 103, 91, 76, 89, 103, 85, 81, 86, 103, 75, 91, 89, 84, 93, 103, 89, 86, 81, 85, 89, 76, 81, 87, 86, 103, 72, 93, 74, 91, 93, 86, 76, 89, 95, 93, 87, 82, 88, 65, 105, 82, 89, 105, 90, 83, 69, 69, 105, 69, 66, 68, 95, 85, 66, 105, 69, 83, 85, 89, 88, 82, 105, 85, 94, 87, 88, 88, 83, 90, 105, 95, 91, 70, 58, 63, 53, 44, 4, 62, 53, 58, 57, 55, 62, 4, 58, 46, 47, 52, 4, 63, 62, 40, 47, 41, 52, 34, 4, 55, 62, 58, 48, 40, 47, 42, 32, 57, 17, 43, 32, 47, 44, 34, 43, 17, 44, 39, 42, 42, 43, 60, 17, 58, 33, 37, 43, 32, 17, 39, 32, 40, 33, 10, 15, 5, 28, 52, 14, 5, 10, 9, 7, 14, 52, 15, 14, 9, 30, 12, 52, 4, 29, 14, 25, 7, 10, 18, 65, 68, 78, 87, Byte.MAX_VALUE, 69, 78, 65, 66, 76, 69, Byte.MAX_VALUE, 69, 88, 79, 80, 76, 65, 89, 69, 82, Byte.MAX_VALUE, 67, 65, 67, 72, 69, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 90, 71, 80, 79, 83, 94, 70, 90, 77, 96, 92, 94, 92, 87, 90, 96, 89, 80, 77, 96, 91, 76, 83, 24, 29, 23, 14, 38, 28, 23, 24, 27, 21, 28, 38, 28, 1, 22, 9, 21, 24, 0, 28, 11, 38, 15, 75, 13, 8, 2, 27, 51, 9, 2, 13, 14, 0, 9, 51, 10, 25, 2, 2, 9, 0, 77, 72, 66, 91, 115, 73, 66, 77, 78, 64, 73, 115, 69, 66, 64, 69, 66, 73, 115, 84, 115, 67, 89, 88, 115, 66, 67, 66, 115, 74, 89, 64, 64, 95, 79, 94, 73, 73, 66, 115, 67, 66, 115, 95, 72, 71, 27, 30, 20, 13, 37, 31, 20, 27, 24, 22, 31, 37, 20, 31, 14, 13, 21, 8, 17, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 117, 119, 96, 105, 106, 100, 97, 79, 74, 64, 89, 113, 75, 64, 79, 76, 66, 75, 113, 92, 79, 73, 75, 113, 93, 70, 79, 69, 75, 96, 101, 111, 118, 94, 100, 111, 96, 99, 109, 100, 94, 114, 120, 111, 98, 15, 10, 0, 25, 49, 11, 22, 30, 1, 29, 11, 49, 24, 7, 10, 11, 1, 49, 25, 15, 26, 13, 6, 49, 26, 7, 3, 11, 20, 17, 27, 2, 42, 19, 28, 25, 1, 16, 7, 42, 23, 28, 17, 17, 28, 27, 18, 42, 1, 26, 30, 16, 27, 117, 112, 122, 99, 75, 114, 123, 102, 119, 113, 75, 112, 113, 98, 125, 119, 113, 75, 103, 119, 102, 113, 113, 122, 75, 117, 120, 99, 117, 109, 103, 75, 123, 122, 121, 124, 118, 111, 71, 113, 121, 122, 71, 123, 109, 107, 108, 119, 117, 71, 107, 123, 112, 125, 117, 121, 107, 71, 126, 113, 96, 71, 125, 118, 121, 122, 116, 125, 124, 123, 126, 116, 109, 69, 115, 119, 106, 105, 69, 105, Byte.MAX_VALUE, 121, 117, 116, 126, 69, 121, 114, 123, 116, 116, Byte.MAX_VALUE, 118, 69, Byte.MAX_VALUE, 116, 123, 120, 118, Byte.MAX_VALUE, 126, 43, 46, 36, 61, 21, 35, 36, 62, 47, 56, 57, 62, 35, 62, 35, 43, 38, 21, 36, 47, 61, 21, 35, 39, 43, 45, 47, 21, 46, 
        47, 57, 35, 45, 36, 56, 61, 55, 46, 6, 53, 54, 62, 6, 58, 42, 6, 58, 52, 41, 109, 104, 98, 123, 83, 96, 99, 107, 107, 101, 98, 107, 83, 105, 98, 104, 124, 99, 101, 98, 120, 83, 124, 126, 105, 106, 101, 116, 10, 15, 5, 28, 52, 5, 10, 31, 2, 29, 14, 52, 8, 10, 25, 4, 30, 24, 14, 7, 52, 8, 4, 6, 27, 10, 8, 31, 52, 31, 3, 25, 14, 24, 3, 4, 7, 15, 100, 97, 107, 114, 90, 107, 100, 113, 108, 115, 96, 90, 115, 108, 96, 114, 90, 118, 107, 100, 117, 118, 109, 106, 113, 90, 105, 106, 98, 98, 108, 107, 98, 90, 96, 107, 100, 103, 105, 96, 97, 0, 5, 15, 22, 62, 14, 15, 5, 4, 23, 8, 2, 4, 62, 9, 8, 18, 21, 14, 19, 24, 62, 5, 0, 21, 0, 62, 4, 15, 0, 3, 13, 4, 5, 23, 18, 24, 1, 41, 25, 6, 19, 24, 41, 16, 20, 41, 23, 6, 6, 41, 23, 26, 1, 23, 15, 5, 52, 49, 59, 34, 10, 37, 57, 52, 44, 52, 55, 57, 48, 10, 54, 57, 60, 54, 62, 10, 56, 52, 45, 10, 49, 48, 57, 52, 44, 10, 56, 38, 81, 84, 94, 71, 111, 64, 92, 81, 73, 81, 82, 92, 85, 111, 84, 89, 67, 81, 82, 92, 85, 111, 66, 85, 93, 95, 68, 85, 111, 95, 94, 111, 94, 85, 68, 71, 95, 66, 91, 111, 92, 95, 67, 67, 115, 118, 124, 101, 77, 98, 126, 115, 107, 115, 112, 126, 119, 97, 77, 126, 125, 117, 117, 123, 124, 117, 77, 119, 124, 115, 112, 126, 119, 118, 61, 56, 50, 43, 3, 44, 48, 61, 37, 61, 62, 48, 57, 47, 3, 50, 57, 43, 3, 56, 57, 47, 53, 59, 50, 71, 66, 72, 81, 121, 86, 74, 71, 95, 71, 68, 74, 67, 85, 121, 85, 78, 73, 81, 121, 67, 72, 66, 69, 71, 84, 66, 99, 102, 108, 117, 93, 114, 112, 103, 110, 109, 99, 102, 93, 107, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 93, 102, 123, 108, 99, 111, 107, 97, 93, 117, 103, 96, 116, 107, 103, 117, 58, 63, 53, 44, 4, 43, 41, 62, 55, 52, 58, 63, 4, 53, 58, 47, 50, 45, 62, 4, 63, 34, 53, 58, 54, 50, 56, 4, 44, 62, 57, 45, 50, 62, 44, 121, 124, 118, 111, 71, 104, 106, 125, 116, 119, 121, 124, 71, 106, 110, 71, 124, 97, 118, 121, 117, 113, 123, 71, 111, 125, 122, 110, 113, 125, 111, 34, 39, 45, 52, 28, 51, 49, 38, 53, 38, 45, 55, 28, 51, 47, 34, 58, 34, 33, 47, 38, 28, 34, 54, 55, 44, 28, 32, 47, 42, 32, 40, 25, 28, 22, 15, 39, 8, 13, 10, 31, 29, 39, 23, 22, 39, 76, 73, 75, 39, 10, 29, 11, 8, 23, 22, 11, 29, 94, 91, 81, 72, 96, 77, 90, 92, 80, 82, 79, 74, 75, 90, 96, 93, 75, 96, 94, 89, 75, 90, 77, 96, 90, 71, 75, 77, 94, 76, 96, 92, 87, 94, 81, 88, 90, 44, 41, 35, 58, 18, 63, 59, 18, 47, 56, 43, 43, 40, 63, 18, 46, 37, 40, 46, 38, 18, 40, 35, 44, 47, 33, 40, 41, 32, 37, 47, 54, 30, 51, 55, 30, 49, 45, 32, 56, 35, 32, 34, 42, 30, 34, 51, 32, 50, 41, 30, 39, 32, 45, 45, 35, 32, 34, 42, 125, 120, 114, 107, 67, 111, 121, 114, 120, 117, 114, 123, 67, 122, 110, 121, 109, 105, 121, 114, Byte.MAX_VALUE, 101, 67, Byte.MAX_VALUE, 125, 108, 108, 117, 114, 123, 67, 125, 112, 112, 115, 107, 121, 120, 68, 65, 75, 82, 122, 86, 64, 81, 122, 81, 64, 93, 81, 122, 70, 74, 73, 74, 87, 122, 65, 92, 75, 68, 72, 76, 70, 68, 73, 73, 92, 34, 39, 45, 52, 28, 48, 43, 44, 54, 47, 39, 28, 34, 39, 39, 28, 38, 59, 55, 38, 45, 48, 42, 44, 45, 28, 55, 44, 28, 51, 47, 34, 58, 34, 33, 47, 38, 48, 10, 15, 5, 28, 52, 24, 3, 4, 30, 7, 15, 52, 8, 7, 14, 10, 25, 52, 13, 14, 10, 31, 30, 25, 14, 52, 8, 4, 5, 13, 2, 12, 52, 4, 5, 52, 8, 25, 10, 24, 3, 14, 24, 46, 43, 33, 56, 16, 60, 39, 32, 58, 35, 43, 16, 38, 40, 33, 32, 61, 42, 16, 43, 42, 60, 59, 61, 32, 54, 16, 44, 46, 35, 35, 1, 4, 14, 23, 63, 19, 8, 15, 21, 12, 4, 63, 9, 14, 3, 18, 5, 13, 5, 14, 20, 63, 18, 5, 20, 18, 25, 63, 3, 15, 21, 14, 20, 5, 18, 63, 15, 14, 63, 5, 13, 16, 20, 25, 63, 18, 5, 19, 16, 15, 14, 19, 5, 52, 49, 59, 34, 10, 38, 61, 58, 32, 57, 49, 10, 60, 59, 60, 33, 10, 51, 39, 58, 56, 10, 54, 58, 59, 33, 48, 59, 33, 10, 37, 39, 58, 35, 60, 49, 48, 39, 76, 73, 67, 90, 114, 94, 69, 66, 88, 65, 73, 114, 68, 67, 68, 89, 114, 66, 67, 114, 78, 65, 76, 94, 94, 114, 65, 66, 76, 73, 68, 67, 74, 12, 9, 3, 26, 50, 30, 5, 2, 24, 1, 9, 50, 1, 2, 10, 50, 12, 30, 30, 8, 25, 50, 24, 31, 1, 79, 74, 64, 89, 113, 93, 70, 65, 91, 66, 74, 113, 94, 92, 75, 77, 65, 67, 94, 91, 90, 75, 113, 76, 71, 74, 74, 75, 92, 113, 90, 65, 69, 75, 64, 55, 50, 56, 33, 9, 37, 61, 63, 38, 9, 32, 63, 50, 51, 57, 9, 56, 57, 56, 9, 62, 55, 36, 50, 33, 55, 36, 51, 9, 55, 53, 53, 
        51, 58, 51, 36, 55, 34, 51, 50, 126, 123, 113, 104, 64, 108, 107, 126, 124, 116, 107, 109, 126, 124, 122, 64, 120, 109, 112, 106, 111, 118, 113, 120, 64, 122, 113, 126, 125, 115, 122, 123, 3, 6, 12, 21, 61, 17, 27, 12, 1, 61, 3, 4, 22, 7, 16, 61, 3, 6, 61, 14, 13, 3, 6, 121, 124, 118, 111, 71, 107, 97, 118, 123, 71, 125, 118, 124, 104, 119, 113, 118, 108, 71, 104, 106, 125, 126, 113, 96, 33, 36, 46, 55, 31, 52, 41, 45, 37, 31, 52, 47, 31, 55, 33, 41, 52, 31, 38, 47, 50, 31, 54, 41, 36, 37, 47, 31, 48, 44, 33, 57, 31, 45, 51, 104, 109, 103, 126, 86, 125, 96, 100, 108, 86, 125, 102, 86, 126, 104, 96, 125, 86, 111, 102, 123, 86, Byte.MAX_VALUE, 96, 109, 108, 102, 86, 121, 123, 108, 121, 104, 123, 108, 109, 86, 100, 122, 7, 2, 8, 17, 57, 18, 15, 11, 3, 9, 19, 18, 57, 20, 3, 17, 7, 20, 2, 3, 2, 57, 16, 15, 2, 3, 9, 98, 103, 109, 116, 92, 119, 113, 106, 100, 100, 102, 113, 92, 109, 98, 119, 106, 117, 102, 92, 113, 102, 100, 106, 112, 119, 102, 113, 92, 117, 106, 102, 116, 92, 102, 113, 113, 108, 113, 92, 96, 98, 111, 111, 97, 98, 96, 104, 123, 126, 116, 109, 69, 111, 116, 115, 107, 111, Byte.MAX_VALUE, 69, 126, 120, 69, 116, 123, 119, Byte.MAX_VALUE, 69, 106, Byte.MAX_VALUE, 104, 69, 106, 104, 117, 121, Byte.MAX_VALUE, 105, 105, 35, 38, 44, 53, 29, 55, 50, 38, 35, 54, 39, 29, 39, 58, 54, 48, 35, 29, 42, 43, 44, 54, 49, 29, 36, 45, 48, 29, 33, 42, 35, 43, 44, 43, 44, 37, 96, 101, 111, 118, 94, 116, 114, 100, 94, 96, 113, 113, 94, 101, 104, 102, 100, 114, 117, 94, 96, 113, 104, 106, 111, 101, 124, 84, 126, 120, 110, 84, 104, 106, 104, 99, 110, 111, 84, 110, 115, 110, 104, 126, Byte.MAX_VALUE, 100, 121, 84, 109, 100, 121, 84, 101, 110, Byte.MAX_VALUE, 124, 100, 121, 96, 69, 64, 74, 83, 123, 81, 87, 65, 123, 71, 69, 71, 76, 65, 64, 123, 65, 92, 65, 71, 81, 80, 75, 86, 123, 77, 74, 123, 71, 69, 71, 76, 65, 123, 73, 69, 74, 69, 67, 65, 86, 83, 86, 92, 69, 109, 71, 65, 87, 109, 64, 91, 66, 66, 94, 87, 109, 83, 92, 91, 95, 83, 70, 91, 93, 92, 115, 118, 124, 101, 77, 103, 97, 119, 77, 97, 119, 113, 103, 96, 119, 77, 103, 96, 123, 77, 98, 115, 96, 97, 119, 96, 125, 120, 114, 107, 67, 106, 117, 120, 121, 115, 67, 111, 121, Byte.MAX_VALUE, 115, 114, 120, 67, Byte.MAX_VALUE, 116, 125, 114, 114, 121, 112, 67, 121, 114, 125, 126, 112, 121, 120, 54, 34, 35, 56, 37, 56, 35, 54, 35, 50, 8, 51, 62, 36, 54, 53, 59, 50, 51, 72, 92, 93, 70, 91, 70, 93, 72, 93, 76, 118, 76, 71, 72, 75, 69, 76, 77, 48, 63, 58, 48, 56, 52, 38, 50, 33, 55, 12, 39, 58, 62, 54, 12, 62, 32, 55, 59, 57, 122, 50, 53, 55, 49, 54, 59, 59, 63, 122, 53, 48, 39, 122, 18, 17, 21, 0, 1, 6, 17, 11, 23, 27, 26, 18, 29, 19, 125, 121, 126, 121, 125, 101, 125, 79, 117, 124, 113, 96, 99, 117, 116, 79, 100, 121, 125, 117, 79, 113, 118, 100, 117, 98, 79, 121, 125, 96, 98, 117, 99, 99, 121, Byte.MAX_VALUE, 126, 17, 10, 19, 19, 49, 38, 48, 55, 49, 42, 32, 55, 38, 39, 28, 39, 34, 55, 34, 28, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, 28, 32, 44, 46, 33, 42, 45, 34, 55, 42, 44, 45, 48, 13, 10, 31, 29, 21, 33, 10, 12, 31, 29, 27, 33, 13, 31, 19, 14, 18, 27, 33, 12, 31, 10, 27, 14, 17, 28, 29, 23, 39, 25, 22, 28, 39, 29, 22, 28, 27, 25, 10, 28, 39, 25, 13, 12, 23, 10, 23, 12, 25, 12, 29, 93, 93, 93};
    }

    static {
        A0b();
        A04 = new String[0];
        A05 = new String[]{A0Q(86, 5, 14), A0Q(65, 9, j.AppCompatTheme_windowFixedHeightMinor), A0Q(74, 12, 88)};
    }

    public ID(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0Q(4543, 31, 122), context), 0);
    }

    public static float A00(Context context) {
        return A0P(context).A01(A0Q(2430, 39, 22), 0.98f);
    }

    private final float A01(String str, float f) {
        String string = this.A00.getString(str, String.valueOf(f));
        if (string != null) {
            try {
                String value = A0Q(4611, 4, 81);
                if (string.equals(value)) {
                    return f;
                }
                f = Float.parseFloat(string);
                return f;
            } catch (NumberFormatException unused) {
                return f;
            }
        }
        return f;
    }

    public static int A02(Context context) {
        return A0P(context).A2B(A0Q(417, 33, 88), 100);
    }

    public static int A03(Context context) {
        return A0P(context).A2B(A0Q(2290, 33, j.AppCompatTheme_tooltipForegroundColor), 0);
    }

    public static int A04(Context context) {
        return A0P(context).A2B(A0Q(2403, 27, j.AppCompatTheme_toolbarNavigationButtonStyle), -1);
    }

    public static int A05(Context context) {
        return A0P(context).A2B(A0Q(774, 37, 60), 3);
    }

    public static int A06(Context context) {
        return A0P(context).A2B(A0Q(4525, 18, 125), 0);
    }

    public static int A07(Context context) {
        return A0P(context).A2B(A0Q(520, 36, 80), 3000);
    }

    public static int A08(Context context) {
        return A0P(context).A2B(A0Q(1442, 50, 54), 30000);
    }

    public static int A09(Context context) {
        return A0P(context).A2B(A0Q(1536, 40, 51), 3);
    }

    public static int A0A(Context context) {
        return A0P(context).A2B(A0Q(1492, 44, 40), 8000);
    }

    public static int A0B(Context context) {
        return A0P(context).A2B(A0Q(1576, 48, j.AppCompatTheme_windowMinWidthMinor), 100);
    }

    public static int A0C(Context context) {
        return A0P(context).A2B(A0Q(1624, 39, 25), 60000);
    }

    public static int A0D(Context context) {
        return A0P(context).A2B(A0Q(3048, 38, 69), 225);
    }

    public static int A0E(Context context) {
        return A0P(context).A2B(A0Q(1242, 41, 69), 3145728);
    }

    public static int A0F(Context context) {
        return A0P(context).A2B(A0Q(4574, 37, 62), -1);
    }

    public static int A0G(Context context) {
        return A0P(context).A2B(A0Q(3184, 32, 123), 2000);
    }

    public static int A0H(Context context) {
        return A0P(context).A2B(A0Q(371, 46, 43), -1);
    }

    public static int A0I(Context context) {
        return A0P(context).A2B(A0Q(4654, 23, 80), 0);
    }

    public static int A0J(Context context) {
        return A0P(context).A2B(A0Q(4088, 35, j.AppCompatTheme_viewInflaterClass), 3000);
    }

    public static int A0K(Context context) {
        return A0P(context).A2B(A0Q(4123, 39, 39), 3000);
    }

    public static int A0L(Context context) {
        return A0P(context).A2B(A0Q(1357, 46, 100), 0);
    }

    public static long A0M(Context context) {
        return A0P(context).A2C(A0Q(740, 34, 74), 67108864L);
    }

    public static long A0N(Context context) {
        return A0P(context).A2C(A0Q(895, 45, 46), 1048576L);
    }

    public static long A0O(Context context) {
        return A0P(context).A2C(A0Q(1048, 38, j.AppCompatTheme_windowNoTitle), 33554432L);
    }

    public static synchronized ID A0P(Context context) {
        ID id;
        synchronized (ID.class) {
            if (A01 == null) {
                A01 = new ID(context);
            }
            id = A01;
        }
        return id;
    }

    public static String A0R(Context context) {
        return A0P(context).A2D(A0Q(3020, 28, 34), A0Q(4705, 3, 4));
    }

    public static String A0S(Context context) {
        return A0P(context).A2D(A0Q(4063, 25, 54), A0Q(4705, 3, 4));
    }

    public static String A0T(Context context) {
        return A0P(context).A2D(A0Q(j.AppCompatTheme_windowFixedWidthMinor, 52, j.AppCompatTheme_tooltipFrameBackground), A0Q(1, 6, 36));
    }

    public static String A0U(Context context) {
        return A0P(context).A2D(A0Q(268, 51, 11), A0Q(24, 41, 29));
    }

    public static String A0V(Context context) {
        return A0P(context).A2D(A0Q(169, 53, 86), A0Q(7, 8, 63));
    }

    public static String A0W(Context context) {
        return A0P(context).A2D(A0Q(319, 52, 81), A0Q(15, 9, j.AppCompatTheme_viewInflaterClass));
    }

    public static Set<String> A0X(Context context) {
        return A0P(context).A0a(A0Q(599, 44, j.AppCompatTheme_windowActionModeOverlay), A04);
    }

    public static Set<String> A0Y(Context context) {
        return A0P(context).A0a(A0Q(4615, 39, j.AppCompatTheme_tooltipFrameBackground), A05);
    }

    public static Set<String> A0Z(Context context) {
        return A0P(context).A0a(A0Q(2174, 44, 90), A04);
    }

    private Set<String> A0a(String str, String[] strArr) {
        JSONArray jSONArray;
        String jsonArrayString = A2D(str, null);
        try {
            if (jsonArrayString != null) {
                jSONArray = new JSONArray(jsonArrayString);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i = 0; i < length; i++) {
                linkedHashSet.add(jSONArray.getString(i));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void A0c(Context context) {
        A0P(context).A00.edit().clear().commit();
    }

    private void A0d(@Nullable String str, @Nullable String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0Q(91, 2, 121))) {
            return;
        }
        JSONObject json = new JSONObject(str);
        A0e(json, str2);
    }

    private void A0e(JSONObject jSONObject, @Nullable String str) throws JSONException {
        SharedPreferences.Editor edit = this.A00.edit();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(A0Q(93, 24, 54))) {
                A0d(jSONObject.getString(next), next);
            } else {
                String str2 = next;
                if (str != null) {
                    str2 = str + A0Q(0, 1, j.AppCompatTheme_tooltipForegroundColor) + str2;
                }
                edit.putString(str2, jSONObject.getString(next));
            }
        }
        edit.apply();
    }

    public static boolean A0f(Context context) {
        return A0P(context).A2D(A0Q(4677, 28, 86), A0Q(4488, 19, 121)).equals(A0Q(4507, 18, 7));
    }

    public static boolean A0g(Context context) {
        return A0P(context).A2G(A0Q(450, 38, j.AppCompatTheme_windowActionBarOverlay), false);
    }

    public static boolean A0h(Context context) {
        return A0P(context).A2G(A0Q(3507, 37, 17), false);
    }

    public static boolean A0i(Context context) {
        return A0P(context).A2G(A0Q(556, 43, 97), true);
    }

    public static boolean A0j(Context context) {
        return A0P(context).A2G(A0Q(2537, 29, 96), true);
    }

    public static boolean A0k(Context context) {
        return A0P(context).A2G(A0Q(3315, 27, 8), false);
    }

    public static boolean A0l(Context context) {
        return A0P(context).A2G(A0Q(851, 44, 10), true);
    }

    public static boolean A0m(Context context) {
        return A0P(context).A2G(A0Q(2378, 25, 123), true);
    }

    public static boolean A0n(Context context) {
        return A0P(context).A2G(A0Q(3216, 44, 30), true);
    }

    public static boolean A0o(Context context) {
        return A0P(context).A2G(A0Q(978, 37, 49), true);
    }

    public static boolean A0p(Context context) {
        return A0P(context).A2G(A0Q(2507, 30, j.AppCompatTheme_windowFixedWidthMinor), false);
    }

    public static boolean A0q(Context context) {
        return A0P(context).A2G(A0Q(1015, 33, 50), true);
    }

    public static boolean A0r(Context context) {
        return A0P(context).A2G(A0Q(2817, 28, 64), false);
    }

    public static boolean A0s(Context context) {
        return A0P(context).A2G(A0Q(1086, 40, 31), true);
    }

    public static boolean A0t(Context context) {
        return A0P(context).A2G(A0Q(1126, 35, 67), false);
    }

    public static boolean A0u(Context context) {
        return A0P(context).A2G(A0Q(2677, 18, 66), false);
    }

    public static boolean A0v(Context context) {
        return A0P(context).A2G(A0Q(2904, 35, 54), true);
    }

    public static boolean A0w(Context context) {
        return A0P(context).A2G(A0Q(488, 32, 54), false);
    }

    public static boolean A0x(Context context) {
        return A0P(context).A2G(A0Q(2845, 25, 91), false);
    }

    public static boolean A0y(Context context) {
        if (Build.VERSION.SDK_INT >= 18) {
            ID A0P = A0P(context);
            String A0Q = A0Q(2566, 25, 69);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
            strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
            return A0P.A2G(A0Q, false);
        }
        return false;
    }

    public static boolean A0z(Context context) {
        return A0P(context).A2G(A0Q(3127, 34, 79), false);
    }

    public static boolean A10(Context context) {
        return A0P(context).A2G(A0Q(1283, 23, 90), false);
    }

    public static boolean A11(Context context) {
        return A0P(context).A2G(A0Q(3086, 41, 43), false);
    }

    public static boolean A12(Context context) {
        return A0P(context).A2G(A0Q(2779, 22, 0), false);
    }

    public static boolean A13(Context context) {
        return A0P(context).A2G(A0Q(3544, 28, 99), true);
    }

    public static boolean A14(Context context) {
        return A0P(context).A2G(A0Q(3572, 31, j.AppCompatTheme_windowActionBar), true);
    }

    public static boolean A15(Context context) {
        return A0P(context).A2G(A0Q(4008, 32, 49), false);
    }

    public static boolean A16(Context context) {
        return A0P(context).A2G(A0Q(222, 46, 76), false);
    }

    public static boolean A17(Context context) {
        return A0P(context).A2G(A0Q(3005, 15, j.AppCompatTheme_windowMinWidthMinor), false);
    }

    public static boolean A18(Context context) {
        return A0P(context).A2G(A0Q(2469, 38, 24), false);
    }

    public static boolean A19(Context context) {
        return A0P(context).A2G(A0Q(2741, 19, 84), true);
    }

    public static boolean A1A(Context context) {
        return A0P(context).A2G(A0Q(2245, 45, 124), false);
    }

    public static boolean A1B(Context context) {
        return A0P(context).A2G(A0Q(1663, 25, 20), true);
    }

    public static boolean A1C(Context context) {
        return A0P(context).A2G(A0Q(3342, 41, 44), true);
    }

    public static boolean A1D(Context context) {
        return A0P(context).A2G(A0Q(2760, 19, 43), true);
    }

    public static boolean A1E(Context context) {
        return A0P(context).A2G(A0Q(3383, 35, j.AppCompatTheme_windowFixedWidthMinor), true);
    }

    public static boolean A1F(Context context) {
        return A0P(context).A2G(A0Q(3418, 31, 54), true);
    }

    public static boolean A1G(Context context) {
        return A0P(context).A2G(A0Q(3449, 32, j.AppCompatTheme_tooltipFrameBackground), true);
    }

    public static boolean A1H(Context context) {
        return A0P(context).A2G(A0Q(1688, 45, 123), true);
    }

    public static boolean A1I(Context context) {
        return A0P(context).A2G(A0Q(1733, 57, 65), false);
    }

    public static boolean A1J(Context context) {
        return A0P(context).A2G(A0Q(1790, 59, 34), true);
    }

    public static boolean A1K(Context context) {
        return A0P(context).A2G(A0Q(2939, 32, 52), false);
    }

    public static boolean A1L(Context context) {
        return A0P(context).A2G(A0Q(4455, 33, 50), false);
    }

    public static boolean A1M(Context context) {
        return A0P(context).A2G(A0Q(3603, 38, 50), true);
    }

    public static boolean A1N(Context context) {
        return A0P(context).A2G(A0Q(3672, 38, j.AppCompatTheme_tooltipFrameBackground), true);
    }

    public static boolean A1O(Context context) {
        return A0P(context).A2G(A0Q(3161, 23, 88), true);
    }

    public static boolean A1P(Context context) {
        return A0P(context).A2G(A0Q(2323, 21, 85), false);
    }

    public static boolean A1Q(Context context) {
        return A0P(context).A2G(A0Q(1849, 44, j.AppCompatTheme_windowFixedWidthMinor), true);
    }

    public static boolean A1R(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0P(context).A2G(A0Q(643, 46, 63), false);
    }

    public static boolean A1S(Context context) {
        return A0P(context).A2G(A0Q(689, 51, j.AppCompatTheme_viewInflaterClass), true);
    }

    public static boolean A1T(Context context) {
        return A0P(context).A2G(A0Q(3710, 43, 69), true);
    }

    public static boolean A1U(Context context) {
        return A0P(context).A2G(A0Q(940, 38, 8), false);
    }

    public static boolean A1V(Context context) {
        return A0P(context).A2G(A0Q(3260, 30, 60), true);
    }

    public static boolean A1W(Context context) {
        return A0P(context).A2G(A0Q(2218, 27, 20), false);
    }

    public static boolean A1X(Context context) {
        return A0P(context).A2G(A0Q(1306, 51, 37), false);
    }

    public static boolean A1Y(Context context) {
        return A0P(context).A2G(A0Q(1161, 40, 55), true);
    }

    public static boolean A1Z(Context context) {
        return A0P(context).A2G(A0Q(1893, 31, j.AppCompatTheme_tooltipForegroundColor), false);
    }

    public static boolean A1a(Context context) {
        return A0P(context).A2G(A0Q(1201, 41, 37), false);
    }

    public static boolean A1b(Context context) {
        return A0P(context).A2G(A0Q(3753, 31, 97), false);
    }

    public static boolean A1c(Context context) {
        return A0P(context).A2G(A0Q(3784, 53, 78), false);
    }

    public static boolean A1d(Context context) {
        return A0P(context).A2G(A0Q(3837, 38, 123), true);
    }

    public static boolean A1e(Context context) {
        return A0P(context).A2G(A0Q(3875, 33, 3), false);
    }

    public static boolean A1f(Context context) {
        return A0P(context).A2G(A0Q(1924, 53, 20), false);
    }

    public static boolean A1g(Context context) {
        return A0P(context).A2G(A0Q(2870, 34, 58), false);
    }

    public static boolean A1h(Context context) {
        return A0P(context).A2G(A0Q(1977, 48, 98), false);
    }

    public static boolean A1i(Context context) {
        return A0P(context).A2G(A0Q(3908, 25, 67), false);
    }

    public static boolean A1j(Context context) {
        return A0P(context).A2G(A0Q(2344, 34, 13), false);
    }

    public static boolean A1k(Context context) {
        return A0P(context).A2G(A0Q(3933, 35, 0), false);
    }

    public static boolean A1l(Context context) {
        return A0P(context).A2G(A0Q(3481, 26, 86), false);
    }

    public static boolean A1m(Context context) {
        return A0P(context).A2G(A0Q(2025, 51, 72), true);
    }

    public static boolean A1n(Context context) {
        return A0P(context).A2G(A0Q(3641, 31, 11), false);
    }

    public static boolean A1o(Context context) {
        return A0P(context).A2G(A0Q(4040, 23, 76), true);
    }

    public static boolean A1p(Context context) {
        return A0P(context).A2G(A0Q(4162, 27, 72), false);
    }

    public static boolean A1q(Context context) {
        return A0P(context).A2G(A0Q(4268, 36, j.AppCompatTheme_tooltipForegroundColor), false);
    }

    public static boolean A1r(Context context) {
        return A0P(context).A2G(A0Q(2695, 46, 2), true);
    }

    public static boolean A1s(Context context) {
        return A0P(context).A2G(A0Q(2971, 34, 100), false);
    }

    public static boolean A1t(Context context) {
        return A0P(context).A2G(A0Q(4404, 25, 28), false);
    }

    public static boolean A1u(Context context) {
        return A0P(context).A2G(A0Q(4237, 31, 52), false);
    }

    public static boolean A1v(Context context) {
        return A0P(context).A2G(A0Q(3968, 40, j.AppCompatTheme_windowNoTitle), true);
    }

    public static boolean A1w(Context context) {
        return A0P(context).A2G(A0Q(2801, 16, 47), true);
    }

    public static boolean A1x(Context context) {
        return A0P(context).A2G(A0Q(4189, 48, 45), false);
    }

    public static boolean A1y(Context context) {
        return A0P(context).A2G(A0Q(4304, 23, 47), true);
    }

    public static boolean A1z(Context context) {
        return A0P(context).A2G(A0Q(2076, 18, j.AppCompatTheme_textAppearanceSearchResultTitle), false);
    }

    public static boolean A20(Context context) {
        return A0P(context).A2G(A0Q(2094, 40, 61), false);
    }

    public static boolean A21(Context context) {
        return A0P(context).A2G(A0Q(4327, 36, 37), false);
    }

    public static boolean A22(Context context) {
        return A0P(context).A2G(A0Q(4363, 41, 10), true);
    }

    public static boolean A23(Context context) {
        return A0P(context).A2G(A0Q(811, 40, 83), false);
    }

    public static boolean A24(Context context) {
        return A0P(context).A2G(A0Q(1403, 39, 8), false);
    }

    public static boolean A25(Context context) {
        return A0P(context).A2G(A0Q(3290, 25, j.AppCompatTheme_windowFixedHeightMajor), false);
    }

    public static boolean A26(Context context) {
        return A0P(context).A2G(A0Q(4429, 26, 60), true);
    }

    public static boolean A27(Context context) {
        return A0P(context).A2G(A0Q(2134, 40, 53), true);
    }

    public static boolean A28(Context context, boolean z) {
        return A2A(context, z) && A0P(context).A2G(A0Q(2591, 27, 14), false);
    }

    public static boolean A29(Context context, boolean z) {
        return Build.VERSION.SDK_INT >= 21 && A28(context, z) && A0P(context).A2G(A0Q(2618, 35, 17), true);
    }

    public static boolean A2A(Context context, boolean z) {
        return z && Build.VERSION.SDK_INT >= 19 && A0P(context).A2G(A0Q(2653, 24, 87), false);
    }

    public final int A2B(String str, int i) {
        String string = this.A00.getString(str, String.valueOf(i));
        if (string != null) {
            try {
                String value = A0Q(4611, 4, 81);
                if (string.equals(value)) {
                    return i;
                }
                i = Integer.parseInt(string);
                return i;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final long A2C(String str, long j) {
        String string = this.A00.getString(str, String.valueOf(j));
        if (string != null) {
            try {
                String value = A0Q(4611, 4, 81);
                if (string.equals(value)) {
                    return j;
                }
                j = Long.parseLong(string);
                return j;
            } catch (NumberFormatException unused) {
                return j;
            }
        }
        return j;
    }

    public final String A2D(String str, String str2) {
        String string = this.A00.getString(str, str2);
        if (string != null) {
            String value = A0Q(4611, 4, 81);
            return string.equals(value) ? str2 : string;
        }
        return str2;
    }

    public final void A2E(@Nullable String str) throws JSONException {
        A0d(str, null);
    }

    public final void A2F(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0e(jSONObject, null);
    }

    public final boolean A2G(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            String value = A0Q(4611, 4, 81);
            boolean equals = string.equals(value);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return equals ? z : Boolean.parseBoolean(string);
        }
        return z;
    }
}
