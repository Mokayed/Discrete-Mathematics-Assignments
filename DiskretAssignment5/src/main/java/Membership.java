import java.util.Set;

public class Membership {
    public boolean member(int x, Set<Integer> z){
        if(z.contains(x)){
            return true;
        }
        return false;
    }
}
