package edu.psu.jjb24.callbackexamplebutton;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class DoubleTapButton extends AppCompatButton {
    private long mLastClickTime = 0;
    private static final long DOUBLE_TAP_MAX_INTERVAL = 1000;

    public DoubleTapButton(@NonNull Context context) {
        super(context);
    }

    public DoubleTapButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DoubleTapButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean callOnClick() {
        if (SystemClock.elapsedRealtime() - mLastClickTime > DOUBLE_TAP_MAX_INTERVAL) {
            mLastClickTime = SystemClock.elapsedRealtime();
            return super.callOnClick();
        }
        else {
            mLastClickTime = 0;
            Toast.makeText(getContext(), "Double click detected in callOnClick", Toast.LENGTH_LONG).show();
            return true;
        }
    }

    @Override
    public boolean performClick() {
        if (SystemClock.elapsedRealtime() - mLastClickTime > DOUBLE_TAP_MAX_INTERVAL) {
            mLastClickTime = SystemClock.elapsedRealtime();
            return super.performClick();
        }
        else {
            mLastClickTime = 0;
            Toast.makeText(getContext(), "Double click detected in performClick", Toast.LENGTH_LONG).show();
            return true;
        }
    }


}
