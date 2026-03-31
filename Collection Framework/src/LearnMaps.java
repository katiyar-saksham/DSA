import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
//        List<Integer> lst = new ArrayList<>();

        Map<String,String> mpp = new HashMap<>();

        mpp.put("US","United States");
        mpp.put("IND","INDIA");
        mpp.put("NY","New York");

        System.out.println(mpp);
        System.out.println(mpp.getOrDefault("NYK", "Not Found"));


    }
}