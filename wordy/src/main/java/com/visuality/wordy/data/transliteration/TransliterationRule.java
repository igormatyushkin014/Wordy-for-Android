package com.visuality.wordy.data.transliteration;

public class TransliterationRule {

    private String replaceable;

    public String getReplaceable() {
        return this.replaceable;
    }

    private String replacement;

    public String getReplacement() {
        return this.replacement;
    }

    public TransliterationRule(
            String replaceable,
            String replacement
    ) {
        super();

        this.replaceable = replaceable;
        this.replacement = replacement;
    }

    public static class Builder {

        private String replaceable;

        public Builder setReplaceable(String replaceable) {
            this.replaceable = replaceable;
            return this;
        }

        private String replacement;

        public Builder setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }

        public Builder() {
            super();
        }

        public TransliterationRule build() {
            return new TransliterationRule(
                    this.replaceable,
                    this.replacement
            );
        }
    }
}
