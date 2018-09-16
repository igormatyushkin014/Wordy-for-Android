package com.visuality.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.visuality.wordy.bridge.Wordy;
import com.visuality.wordy.effects.CaseEffect;
import com.visuality.wordy.effects.InversionEffect;
import com.visuality.wordy.effects.RotationEffect;
import com.visuality.wordy.types.TextCase;
import com.visuality.wordy.types.TextRotation;

public class MainActivity extends Activity {

    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initializeTitleTextView();
        this.updateTitleTextView(
                this.generateTitle()
        );
    }

    private void initializeTitleTextView() {
        this.titleTextView = this.findViewById(
                R.id.title_text_view
        );
    }

    private void updateTitleTextView(String title) {
        this.titleTextView.setText(
                title
        );
    }

    private String generateTitle() {
        return Wordy.effects("WORDY demo")
                .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                .apply(new RotationEffect(TextRotation.INVERTED))
                .apply(new InversionEffect())
                .getResult();
    }
}
