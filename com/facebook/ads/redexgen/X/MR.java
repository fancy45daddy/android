package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class MR extends LinearLayout {
    public static final int A03 = (int) (Kd.A02 * 40.0f);
    public static final int A04 = (int) (Kd.A02 * 20.0f);
    public static final int A05 = (int) (Kd.A02 * 10.0f);
    public final C2H A00;
    public final C0806Wj A01;
    public final MB A02;

    public MR(C0806Wj c0806Wj, C2H c2h, MB mb, LM lm) {
        this(c0806Wj, c2h, mb, null, lm);
    }

    public MR(C0806Wj c0806Wj, C2H c2h, MB mb, @Nullable String str, LM lm) {
        super(c0806Wj);
        this.A01 = c0806Wj;
        this.A00 = c2h;
        this.A02 = mb;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            LE.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(lm, this.A00.A03());
            int i = A05;
            A00.setPadding(0, i, 0, i);
            addView(A00, layoutParams);
        }
        ViewGroup A02 = A02();
        A02.setPadding(0, A05, 0, 0);
        addView(A02, layoutParams);
    }

    private View A00(LM lm, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(LN.A01(lm));
        TextView textView = new TextView(getContext());
        LE.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(LN.A01(LM.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new MP(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        LE.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private ViewGroup A02() {
        MX mx = new MX(this.A01);
        for (C2H c2h : this.A00.A05()) {
            MD md = new MD(this.A01);
            md.setData(c2h.A04(), null);
            md.setOnClickListener(new MQ(this, md, c2h));
            mx.addView(md);
        }
        return mx;
    }
}
