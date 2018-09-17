package com.visuality.wordy;

import com.visuality.wordy.tools.TransliterationManager;
import com.visuality.wordy.types.Language;

import org.junit.Assert;
import org.junit.Test;

public class TransliterationManagerTest {

    @Test
    public void transliterationManager_fromEnglishToRussian_isCorrect() {
        String sourceText = "Actually, it Was really hard to implement such a thing like this Library, BUT finally it got implemented.";
        String assertion = "Эктаоли, ит Вос рилли хэрд то имплэмэнт сач э тинг ликэ тис Либрэри, БАТ финоли ит гот имплэмэнтэд.";
        String result = new TransliterationManager(Language.ENGLISH, Language.RUSSIAN)
                .getText(sourceText);
        Assert.assertTrue(
                result.equals(assertion)
        );
    }

    @Test
    public void transliterationManager_fromRussianToEnglish_isCorrect() {
        String sourceText = "На самом деле, реализация данной библиотеки была, всё же, довольно трудным делом, но, в результате приложения серьёзных усилий, она была реализована.";
        String assertion = "Na samom dele, realizatsiya dannoy biblioteki byla, vsyo zhe, dovol'no trudnym delom, no, v rezul'tate prilozheniya ser'yoznykh usiliy, ona byla realizovana.";
        String result = new TransliterationManager(Language.RUSSIAN, Language.ENGLISH)
                .getText(sourceText);
        Assert.assertTrue(
                result.equals(assertion)
        );
    }
}
