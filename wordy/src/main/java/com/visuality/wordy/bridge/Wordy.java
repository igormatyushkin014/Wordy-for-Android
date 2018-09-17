package com.visuality.wordy.bridge;

import com.visuality.wordy.customization.Plugin;
import com.visuality.wordy.tools.EffectManager;
import com.visuality.wordy.tools.TransliterationManager;
import com.visuality.wordy.types.Language;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Wordy {

    public static EffectManager effects(
            String sourceText
    ) {
        return new EffectManager(
                sourceText
        );
    }

    public static TransliterationManager transliterate(
            Language from,
            Language to
    ) {
        return new TransliterationManager(
                from,
                to
        );
    }

    public static <T extends Plugin> T plugin(
            Class<T> type,
            String sourceText
    ) {
        try {
            return type.getConstructor().newInstance(
                    sourceText
            );
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
