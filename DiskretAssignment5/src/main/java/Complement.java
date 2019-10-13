import java.util.Iterator;
import java.util.Set;

public class Complement {
    public String complement(Set<Integer> a){
        String message = "every other values than: ";
        for (Iterator<Integer> it = a.iterator(); it.hasNext(); ) {
            int f = it.next();
            if(!it.hasNext()){
                message += f;
                return message;
            }
            message += f + ",";
        }
        return message;
    }
}
