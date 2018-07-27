package com.pipwave.sdk.android.pipwave;

public final class PipwaveCheckoutException extends Exception {

    public PipwaveCheckoutException(String message){
        super(message, null);
    }

    public PipwaveCheckoutException(String message, Throwable e){
        super(message, e);
    }
}
