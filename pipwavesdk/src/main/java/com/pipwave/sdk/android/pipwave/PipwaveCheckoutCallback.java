package com.pipwave.sdk.android.pipwave;

public interface PipwaveCheckoutCallback {

    void onCheckoutSuccess();
    void onCheckoutCanceled();
    void onCheckoutFailure(String message);
}
