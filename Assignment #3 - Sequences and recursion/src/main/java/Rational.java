public class Rational {
    /*
    *
    * The class must implement a method String rational(long n) that returns
       the rational number on the nth place in the sequence.
    *
    * */
    private long numerator;
    private long denumenator;

    public Rational(long numerator, long denumenator) {
        this.numerator = numerator;
        this.denumenator = denumenator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenumenator() {
        return denumenator;
    }

    public void setDenumenator(long denumenator) {
        this.denumenator = denumenator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denumenator=" + denumenator +
                '}';
    }
}