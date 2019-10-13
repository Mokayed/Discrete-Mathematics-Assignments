import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Union {
    public Set<Integer> union(Set<Integer> a, Set<Integer> b){
        Set<Integer> intersections = new HashSet<Integer>();
        for (Iterator<Integer> it = a.iterator(); it.hasNext(); ) {
            int num = it.next();
            if(!intersections.contains(num)){
                intersections.add(num);
            }
        }
        for (Iterator<Integer> it = b.iterator(); it.hasNext(); ) {
            int num = it.next();
            if(!intersections.contains(num)){
                intersections.add(num);
            }
        }
        return intersections;
    }
}
