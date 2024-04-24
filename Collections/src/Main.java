import java.util.*;

public class Main {
    public static void main(String[] args) {
    /* Arraylist, map and sets (these are collections */

        // Lists --> you can add entries to lists

        String[] questions = new String[2];
        questions[0] = "What is the capital of France";
        questions[1] = "What is the chemical symbol for carbon";

        List<String> questionsList = new ArrayList<>(); // no need to define length, pretty cool :D
        questionsList.add("What lang is spoken in Germany?");
        questionsList.add("What is the capital of Canada?");
        questionsList.add("Burger or Cheeseburger?");



        // Removing is ez
        questionsList.remove(1);

        System.out.println(questionsList.size());

        // size() instead of length

        System.out.println(questionsList.get(0));

        // get(0) instead of [0] to get a certain item

        // List<int> numbers = new ArrayList<int>();
        // Generics don't work with primitive data types
        // Wrapper classes are to be used instead

        List<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(420);


        // MAPS
        // maps a key to a certain value, called key-value pairs

        Map<String, String> CountryToCapital = new HashMap<>();
        // does not have to match, ex: Map<Integer, Float>
        CountryToCapital.put("Germany","Berlin");
        CountryToCapital.put("Canada","Ottawa");
        CountryToCapital.put("France","Paris");
        CountryToCapital.put("Spain","Madrid");
        //for MAPS use .put instead of .add

        // to get a Value of a Map you have to supply it a Key. In this case "Germany" is the key...
        System.out.println(CountryToCapital.get("Germany"));

        System.out.println("Contains Key 'Germany'? "+ CountryToCapital.containsKey("Germany"));
        System.out.println("Contains Key 'London'? "+ CountryToCapital.containsKey("London"));

        System.out.println(CountryToCapital.remove("France"));

        //SETS
        // Used a lot in Minecraft Modding
        // A Set is collection that contains no duplicates

        Set<String> usernames = new HashSet<>();
        usernames.add("Hampter");
        usernames.add("Pampter");
        // boolean return

        System.out.println(usernames.add("Goober")); //returns true
        System.out.println(usernames.add("Goober")); //returns false


        /* COMMON ERRORS YOU MIGHT RUN INTO */
        //Uncomment to see errors//

        // IndexOutOfBoundException
        // If you try and  pass in an Index that does not exist for a list
        // System.out.println(questionsList.get(2));

        // Not an Exception, but "null"
        // If you pass a Key into a Map that does not exist
        // Return value will be null (might lead to other errors down the line)
        // System.out.println(CountryToCapital.get("Malta"))


    }
}