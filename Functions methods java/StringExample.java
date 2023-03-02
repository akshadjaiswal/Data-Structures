public class StringExample {
    public static void main(String[] args) {
        // String ans = greet();
        // System.out.println(ans);
        
        String personalized=mygreet("Akshad Jaiswal");
        System.out.println(personalized);
    }
    //passing parameter function
     static String mygreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    //return value
    static String greet() {
        String greet = "Happy Birthday";
        return greet;
    }
}
