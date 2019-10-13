import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {
    public Set<Integer> intersection(Set<Integer> a, Set<Integer> b){
        Set<Integer> intersections = new HashSet<Integer>();
        for (Iterator<Integer> it = b.iterator(); it.hasNext(); ) {
            int f = it.next();
            if (a.contains(f)){
                intersections.add(f);
            }
        }
        return intersections;
    }
}
