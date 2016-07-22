/**
 * Created by exite on 19.07.16.
 */
public class Validator {

    public static void chackName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Wrong name!");}
    }

}
