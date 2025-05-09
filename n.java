import java.util.*;

public class n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//object

        String day ;
        System.out.println(" enter a day:");
        day = sc.nextLine();

        switch(day){
            case "monday" ->  System.out.println("The worst day 😫😫😫😫😫"); // enhanced switch

            case "tuesday" -> System.out.println("The day is boooring 😪😪😪😪😪");

            case "wednesday" -> System.out.println("The day is ok 😮😮😮😮😮");

            case "thursday" -> System.out.println("The day good 🙄🙄🙄🙄🙄🙄");

            case "friday" -> System.out.println("The day is feel better 🙂🙂🙂🙂");

            case "saturday" -> System.out.println("Today i feel the weakend vibe 😚😚😚😚😚😚");

            case "sunday" -> System.out.println("The enjoyable day 😎😎😎😎😎😎😎😎😎🥰🥰🥰👀👀👀👀");

            default -> System.out.println("Enter the valid day !!!!!!!");

        }
    }
}
