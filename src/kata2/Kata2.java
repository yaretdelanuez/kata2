
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        //Integer[] data = {1,8,5,4,9,7,88,8,5,4,22,6,8,2,4};
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        /*
        for (Integer key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        /*
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
            
        }
        */
        
        Iterator<Map.Entry<String,Integer>> entries = histogr.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
        }
    }

   
    
}
