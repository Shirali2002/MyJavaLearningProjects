package myPatterns.creationalPatterns.builderPattern;

// Builder tasarım deseni
public class BuilderClass { //BesinDegeri

    private final int kalori;
    private final int kolesterol;
    private final int protein;
    private final int yag;
    private final int karbonhidrat;
    private final int demir;

    public static class Builder {

        // Zorunlu parametreler, yapıcı metota geçilmeleri lazım
        private final int kalori;
        private final int kolesterol;

        // Opsiyonel parametreler, varsayılan değerler atıyoruz
        private int protein = 0;
        private int yag = 0;
        private int karbonhidrat = 0;
        private int demir = 0;

        public Builder(int kalori, int kolesterol) {
            this.kalori = kalori;
            this.kolesterol = kolesterol;
        }
        public Builder protein(int deger) {
            protein = deger;
            return this;
        }
        public Builder yag(int deger) {
            yag = deger;
            return this;
        }
        public Builder karbonhidrat(int deger) {
            karbonhidrat = deger;
            return this;
        }
        public Builder demir(int deger) {
            demir = deger;
            return this;
        }
        public BuilderClass build() {
            return new BuilderClass(this);
        }
    }

    private BuilderClass(Builder builder) {
        kalori = builder.kalori;
        kolesterol = builder.kolesterol;
        protein = builder.protein;
        yag = builder.yag;
        karbonhidrat = builder.karbonhidrat;
        demir = builder.demir;
    }
}