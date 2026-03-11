package JavaLogic;

public class ConditionalStructure {
    public static void main (String[] args) {

        int age = 21;
        boolean adult = true;

        if (age >= 21){
            System.out.println("You are a adult!");
        }
        else {
            System.out.println("You are a kid!");
        }

        String message = (adult) ? "You are a adult" : "You are a kid";


//        boolean raining = true;
//
//        if (!raining) {
//            System.out.println("We don´t need to take umbrella");
//        }
//
//        else {
//            System.out.println("We need to take umbrella");
//        }


//        boolean haveMoney = false;
//        boolean haveCard = true;
//
//        if (haveMoney && haveCard){
//            System.out.println("We can go to a restaurant");
//        } else if (haveMoney || haveCard) {
//            System.out.println("We can order a delivery");
//        }
//        else {
//            System.out.println("We can't do anything");
//        }
    }
}
