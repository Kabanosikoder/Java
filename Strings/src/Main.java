public class Main {
    public static void main(String[] args){

    String sentence = "Goob is such a Java language, goober Goober pumpkin eater";
    System.out.println(sentence);
    System.out.println("length is: "+sentence.length());

    /* returns a copy of the variable but either upper or lower */
        System.out.println("Shouting: " + sentence.toUpperCase());
        System.out.println("Whispering: " + sentence.toLowerCase());


    //indexOf
        System.out.println("The word 'Java' is found at the position: " + sentence.indexOf("Java"));

    //Replace
        System.out.println(sentence.replace("Java","C#"));

    String s = "";
    boolean empty = s.isEmpty();
    System.out.println(empty);

    // startsWith and endsWith
        System.out.println(sentence.startsWith("I"));
        System.out.println(sentence.endsWith("r"));

    // contains
        System.out.println(sentence.contains("Goob"));
    // charAt
        System.out.println(sentence.charAt(56));
    //substring
    s = sentence.substring(30);
    System.out.println(s);
    }
}