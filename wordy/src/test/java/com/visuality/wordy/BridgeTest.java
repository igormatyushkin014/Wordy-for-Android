package com.visuality.wordy;

import com.visuality.wordy.bridge.Wordy;
import com.visuality.wordy.customization.Plugin;
import com.visuality.wordy.tools.EffectManager;
import com.visuality.wordy.tools.TransliterationManager;
import com.visuality.wordy.types.Language;

import org.junit.Assert;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void effects_createsInstanceCorrectly() {
        String sourceText = "Test";
        EffectManager effectManager = Wordy.effects(
                sourceText
        );
        Assert.assertTrue(
                effectManager != null
        );
    }

    @Test
    public void transliterate_createsInstanceCorrectly() {
        String sourceText = "Test";
        TransliterationManager transliterationManager = Wordy.transliterate(
                Language.ENGLISH,
                Language.RUSSIAN
        );
        Assert.assertTrue(
                transliterationManager != null
        );
    }

    @Test
    public void plugin_createsInstanceCorrectly() {
        String sourceText = "Test";
        Repeat plugin = Wordy.plugin(
                Repeat.class,
                sourceText
        );
        Assert.assertTrue(
                plugin != null
        );
        Assert.assertTrue(
                plugin.getSourceText().equals(sourceText)
        );
    }

    private class Repeat extends Plugin {

        public Repeat(
                String sourceText
        ) {
            super(sourceText);
        }

        @Override
        public String getResult() {
            return this.getSourceText()
                    + this.getSourceText();
        }
    }
}
