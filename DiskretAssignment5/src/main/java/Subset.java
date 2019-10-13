import java.util.Set;

public class Subset {
    public int getType(Set<Integer> a, Set<Integer> b) {
        if(a.equals(b)){
            return 0;
        }
        if (a.size() > b.size()) {
            if(a.containsAll(b)){
                return 1;
            }
            return -2;
        }

        if (b.size() > a.size()) {
            if(b.containsAll(a)){
                return -1;
            }
            return -2;
        }
      return 2;
    }
}
