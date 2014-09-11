package com.example.michael.myapplication;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class OnClickListeners {
    public static View.OnClickListener getMyTextListener(final Activity activity) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView text = (TextView) view;
                text.setText(
                   text.getText().equals(activity.getString(R.string.hello_world1)) ?
                       activity.getString(R.string.hello_world2) :
                       activity.getString(R.string.hello_world1)
                );
            }
        };
    }
}
