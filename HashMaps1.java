import java.util.*;

public class HashMaps1 {
    public static void main(String[] args){
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Delhi",42);
        map.put("Mumbai",32);
        map.put("Bangalore",28);
        map.put("Chennai",35);
        map.put("Kolkata",38);
        map.put("Hyderabad",36);

        System.out.println(map);

        
        map.put("Delhi",39);
        
        System.out.println(map);

        
        System.out.println(map.get("Shimla"));
        System.out.println(map.get("Bangalore"));

        
        System.out.println(map.getOrDefault("Bangalore", 0));

        
        System.out.println(map.containsKey("Delhi"));

        
        System.out.println(map.containsValue(32));

        
        map.remove("Delhi");
        System.out.println(map);

       
        for(String key: map.keySet()){
            System.out.println(key);
        }
        
        
        for(Integer val: map.values()){
            System.out.println(val);
        }
    }
}