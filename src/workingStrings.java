public class workingStrings {
    public static void main (String[] args) {

        String name = "Leonardo";
        String surname = " Schimock";
        String nameTwo = "Camila";


        int lengthString = name.length();
        boolean areEquals = name.equals(nameTwo);
        String completeName = name.concat(surname);


        System.out.println ("Hello " + name.toUpperCase() + ", your name have " + lengthString + " 'char'");
        System.out.println ("The names are equals: " + areEquals);
        System.out.println ("My complete name is: " + completeName);
    }
}
