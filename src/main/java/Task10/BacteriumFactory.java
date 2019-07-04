package Task10;

import java.util.HashMap;
import java.util.Map;

public class BacteriumFactory {

    static Map<String, Bacterium> bacteriumMap = new HashMap<>();

    public static Bacterium getBacterium(String name) {
        Bacterium result = bacteriumMap.get(name);
        if (result == null) {
            result = new Bacterium(name);
            bacteriumMap.put(name, result);
        }
        return result;
    }
}

