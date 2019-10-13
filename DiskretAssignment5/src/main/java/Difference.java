import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Difference {
    public Set<Integer> difference(Set<Integer> a, Set<Integer> b){
        Set<Integer> differences = new HashSet<Integer>();

        for (Iterator<Integer> it = a.iterator(); it.hasNext(); ) {
            int f = it.next();
            if(!b.contains(f)){
                differences.add(f);
            }
        }

        for (Iterator<Integer> it = b.iterator(); it.hasNext(); ) {
            int f = it.next();
            if(!a.contains(f)){
                differences.add(f);
            }
        }
        return differences;
    }
}
