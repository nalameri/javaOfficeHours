package evening;

public class T5_Animals {
    public static void main(String[] args) {

        String animal="CAT";

        switch(animal){

            case "DOG":
            case "CAT":
                System.out.println(animal +"is domestic animal");
            break;
            case"TIGER":
                System.out.println(animal +"is a wild animal");
            break;
            default:
                System.out.println(animal+"Unknown");

        }








    }
}
