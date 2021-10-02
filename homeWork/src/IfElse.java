public class IfElse {
    public static void main(String[] args) {
        String firstName = "Alex";

        if(firstName == "Bob" || firstName == "John"){

            System.out.println("Bob or John is your name");
        }else {
            if (firstName.toLowerCase().contains("a") || firstName.contains("A")){
                System.out.println("Your name contains letter 'a'");
            }
        }
    }
}
