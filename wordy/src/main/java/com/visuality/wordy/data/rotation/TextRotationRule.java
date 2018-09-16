package com.visuality.wordy.data.rotation;

public class TextRotationRule {

    private String normal;

    public String getNormal() {
        return this.normal;
    }

    private String rotated;

    public String getRotated() {
        return this.rotated;
    }

    private TextRotationRule(
            String normal,
            String rotated
    ) {
        super();

        this.normal = normal;
        this.rotated = rotated;
    }

    public static class Builder {

        private String normal;

        public Builder setNormal(String normal) {
            this.normal = normal;
            return this;
        }

        private String rotated;

        public Builder setRotated(String rotated) {
            this.rotated = rotated;
            return this;
        }

        public Builder() {
            super();
        }

        public TextRotationRule build() {
            return new TextRotationRule(
                    this.normal,
                    this.rotated
            );
        }
    }
}
