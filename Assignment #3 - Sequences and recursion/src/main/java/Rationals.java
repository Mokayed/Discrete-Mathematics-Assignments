
import java.util.ArrayList;
import java.util.Iterator;

public class Rationals implements Iterable {
    public static ArrayList<Rational> rationals = new ArrayList<Rational>();

    public ArrayList<Rational> getRationals() {
        return rationals;
    }

    public void setRationals(ArrayList<Rational> rationals) {
        this.rationals = rationals;
    }

    public Iterator<Rational> iterator() {
        return this.rationals.iterator();
    }
}
