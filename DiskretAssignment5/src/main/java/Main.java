import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> z = new HashSet<Integer>();
        z.add(-5);
        z.add(3);
        z.add(2);
        z.add(-3);
        z.add(6);
        z.add(10);

        Set<Integer> y = new HashSet<Integer>();
        y.add(6);
        y.add(-3);
        y.add(10);

        Intersection i = new Intersection();
        Union u = new Union();
        Membership m = new Membership();
        Difference d = new Difference();
        Complement c = new Complement();
        Subset s = new Subset();

        System.out.println("is 6 member of z? : " + m.member(6, z));
        System.out.println("intersection: " + i.intersection(z,y));
        System.out.println("union: " + u.union(z,y));
        System.out.println("difference between x and y: " + d.difference(z,y));
        System.out.println("complement of set z : " + c.complement(z));
        System.out.println("subset is: " + s.getType(y,z));


    }

}
