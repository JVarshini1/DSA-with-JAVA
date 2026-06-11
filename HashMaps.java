import java.util.*;
public class HashMaps {
    public static void main(String[] args){
        // Added standard diamond operator <> for initialization
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rahul",90);
        map.put("Siraj",80);
        map.put("Rajesh",87);
        map.put("Ramya",76);
        map.put("Rithvik",56);
        map.put("Renu",67);

        System.out.println(map);

        map.put("Rahul",80);
        
        System.out.println(map);

        System.out.println(map.get("Reena"));
        System.out.println(map.get("Rajesh"));

        System.out.println(map.getOrDefault("Rajesh", 0));

        System.out.println(map.containsKey("Rahul"));

        
        System.out.println(map.containsValue(80));

        map.remove("Rahul");
        System.out.println(map);

        for(String key: map.keySet()){
            System.out.println(key);
        }
        for(Integer val: map.values()){
            System.out.println(val);
        }

    }
}