
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final Integer[] data ;

    public Histogram(Integer[] data) {
        this.data = data;
    }

    public Integer[] getData() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map<Integer, Integer> histogram = new HashMap();
        for (Integer key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
    
}
