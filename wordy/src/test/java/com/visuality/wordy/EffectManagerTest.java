package com.visuality.wordy;

import com.visuality.wordy.effects.CaseEffect;
import com.visuality.wordy.effects.InversionEffect;
import com.visuality.wordy.effects.RotationEffect;
import com.visuality.wordy.tools.EffectManager;
import com.visuality.wordy.types.TextCase;
import com.visuality.wordy.types.TextRotation;

import org.junit.Assert;
import org.junit.Test;

public class EffectManagerTest {

    @Test
    public void caseEffect_allUpper_isCorrect() {
        String sourceText = "Test";
        String assertion = "TEST";
        String result = new EffectManager(sourceText)
                .apply(new CaseEffect(TextCase.ALL_UPPER))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void caseEffect_allLower_isCorrect() {
        String sourceText = "Test";
        String assertion = "test";
        String result = new EffectManager(sourceText)
                .apply(new CaseEffect(TextCase.ALL_LOWER))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void caseEffect_firstUpperNextLower_isCorrect() {
        String sourceText = "test";
        String assertion = "Test";
        String result = new EffectManager(sourceText)
                .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void caseEffect_firstLowerNextUpper_isCorrect() {
        String sourceText = "test";
        String assertion = "tEST";
        String result = new EffectManager(sourceText)
                .apply(new CaseEffect(TextCase.FIRST_LOWER_NEXT_UPPER))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void caseEffect_alternatingFirstUpperCase_isCorrect() {
        String sourceText = "test";
        String assertion = "TeSt";
        String result = new EffectManager(sourceText)
                .apply(new CaseEffect(TextCase.ALTERNATING_FIRST_UPPER_CASE))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void caseEffect_alternatingFirstLowerCase_isCorrect() {
        String sourceText = "test";
        String assertion = "tEsT";
        String result = new EffectManager(sourceText)
                .apply(new CaseEffect(TextCase.ALTERNATING_FIRST_LOWER_CASE))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void rotationEffect_normal_caseSensitive_isCorrect() {
        String sourceText = "This is a ʇǝsʇ";
        String assertion = "This is a test";
        String result = new EffectManager(sourceText)
                .apply(new RotationEffect(TextRotation.NORMAL, true))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void rotationEffect_normal_caseInsensitive_isCorrect() {
        String sourceText = "This is a ʇǝsʇ";
        String assertion = "This is a test";
        String result = new EffectManager(sourceText)
                .apply(new RotationEffect(TextRotation.NORMAL, false))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void rotationEffect_upsideDown_caseSensitive_isCorrect() {
        String sourceText = "This is a ʇǝsʇ";
        String assertion = "ʇɥıs ıs ɐ ʇǝsʇ";
        String result = new EffectManager(sourceText)
                .apply(new RotationEffect(TextRotation.UPSIDE_DOWN, true))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void rotationEffect_upsideDown_caseInsensitive_isCorrect() {
        String sourceText = "This is a ʇǝsʇ";
        String assertion = "ʇɥıs ıs ɐ ʇǝsʇ";
        String result = new EffectManager(sourceText)
                .apply(new RotationEffect(TextRotation.UPSIDE_DOWN, false))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void rotationEffect_inverted_caseSensitive_isCorrect() {
        String sourceText = "This is a ʇǝsʇ";
        String assertion = "ʇɥıs ıs ɐ test";
        String result = new EffectManager(sourceText)
                .apply(new RotationEffect(TextRotation.INVERTED, true))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void rotationEffect_inteverted_caseInsensitive_isCorrect() {
        String sourceText = "This is a ʇǝsʇ";
        String assertion = "ʇɥıs ıs ɐ test";
        String result = new EffectManager(sourceText)
                .apply(new RotationEffect(TextRotation.INVERTED, false))
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void inversionEffect_isCorrect() {
        String sourceText = "This is a test";
        String assertion = "tset a si sihT";
        String result = new EffectManager(sourceText)
                .apply(new InversionEffect())
                .getResult();
        Assert.assertTrue(
                result.equals(assertion)
        );
    }
}
