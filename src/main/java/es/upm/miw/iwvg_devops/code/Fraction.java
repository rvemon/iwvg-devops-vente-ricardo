package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper(){
        return this.decimal() < 1;
    }

    public boolean isImproper(){
        return !isProper();
    }

    public boolean isEquivalent(Fraction fraction){
        return this.decimal() == fraction.decimal();
    }

    public void multiply(Fraction fraction){
            this.setNumerator(this.getNumerator() * fraction.getNumerator());
            this.setDenominator(this.getDenominator() * fraction.getDenominator());
    }

    public void divide(Fraction fraction){
        this.setNumerator(this.getNumerator() * fraction.getDenominator());
        this.setDenominator(this.getDenominator() * fraction.getNumerator());
    }

    public void add(Fraction fraction){
        this.setNumerator((this.getNumerator() * fraction.getDenominator())+
                (this.getDenominator() * fraction.getNumerator()));
        this.setDenominator(this.getDenominator() * fraction.getDenominator());
    }

    public void subtract(Fraction fraction){
        this.setNumerator((this.getNumerator() * fraction.getDenominator())-
                (this.getDenominator() * fraction.getNumerator()));
        this.setDenominator(this.getDenominator() * fraction.getDenominator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
