package com.visuality.wordy.tools;

import com.visuality.wordy.effects.Effect;
import com.visuality.wordy.types.TextChange;
import com.visuality.wordy.types.TextSegment;

import java.util.ArrayList;

public class EffectManager {

    private String sourceText;

    private ArrayList<TextChange> changes;

    public EffectManager(
            String sourceText
    ) {
        super();

        this.sourceText = sourceText;
        this.changes = new ArrayList<>();
    }

    public EffectManager apply(Effect effect) {
        TextSegment segment = new TextSegment(
                0,
                this.sourceText.length() - 1
        );
        TextChange change = new TextChange(
                effect,
                segment
        );
        this.changes.add(
                change
        );
        return this;
    }

    public EffectManager apply(
            Effect effect,
            int startIndex,
            int endIndex
    ) {
        TextSegment segment = new TextSegment(
                startIndex,
                endIndex
        );
        TextChange change = new TextChange(
                effect,
                segment
        );
        this.changes.add(
                change
        );
        return this;
    }

    public String getResult() {
        String resultText = new String(this.sourceText);

        for (TextChange change : this.changes) {
            SegmentFinder segmentFinder = new SegmentFinder(
                    resultText
            );

            String substringBeforeSegment = segmentFinder.getSubstringBeforeSegment(
                    change.getSegment()
            );
            String substringFromSegment = segmentFinder.getSubstringFromSegment(
                    change.getSegment()
            );
            String substringAfterSegment = segmentFinder.getSubstringAfterSegment(
                    change.getSegment()
            );

            String filteredSubstringFromSegment = change.getEffect().getFilteredText(
                    substringFromSegment
            );

            resultText = substringBeforeSegment
                    + filteredSubstringFromSegment
                    + substringAfterSegment;
        }

        return resultText;
    }
}
