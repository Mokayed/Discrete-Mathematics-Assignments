import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Rationals.rationals = generateRationals(21);
        System.out.println(rational(5));
    }


    //search for rational
    static String rational(long n) {
        long s = 0;
        int counter = 1;
        int sum = 0;
        long m;
        long d;

        while (true) {
            sum += counter;
            if (sum + counter >= n) {
                s = counter * (counter + 1) / 2;
                System.out.println("the line number for " + n + " is " + s);
                break;
            } else {
                counter++;
            }
        }
        m = (n - s) + 1;
        System.out.println("you are looking for numerator: " + m);
        d = counter - (n - s) + 1;
        System.out.println("you are looking for denumenator: " + d);

        m = (n - s) + 1;
        d = counter - (n - s) + 1;
        int index = 1;
        for (Iterator i = Rationals.rationals.iterator(); i.hasNext(); ) {

            Rational rNum = (Rational) i.next();
            if (rNum.getNumerator() == m && rNum.getDenumenator() == d) {
                return "rational number found: " + rNum.getNumerator() + "/" + rNum.getDenumenator() + " at index " + index + " in list";
            }
            index++;
            if (!i.hasNext()) {
                return "ration number was " + rNum.getNumerator() + "/" + rNum.getDenumenator() + " but it could not be found in list";
            }
        }
        return "something went wrong";
    }
//create list with rationals.
    public static ArrayList<Rational> generateRationals(int size) {
        ArrayList<Rational> rationals = new ArrayList<Rational>();
        long s;
        int counter = 1;
        int sum = 0;
        long m = 1;
        long d = 1;

        while (true) {
            sum += counter;
            if (sum + counter >= size) {
                s = counter * (counter + 1) / 2;
                break;
            } else {
                counter++;
            }
        }

        while (true) {
            if (counter == 0 && d == 1) {
                break;
            }
            if (m == counter && d == 1 && counter == 0) {
                rationals.add(new Rational(m, d));
                break;
            }
            if (d == counter) {
                rationals.add(new Rational(m, d));
                d = 1;
                m++;
                counter--;
                continue;
            }
            rationals.add(new Rational(m, d));
            d++;
        }
        //if you want to see the list comment out this code
      /* for (Rational r : rationals){
           System.out.println(r.toString());
       }*/
        return rationals;
    }
}
