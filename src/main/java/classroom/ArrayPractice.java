package classroom;

public class ArrayPractice {
    public static void main(String[] args) {

        String fruit = "apple";


        String[] fruits = {"apple", "banana", "orange", "pear", "strawberry", "melon"};

        // fruits[0] = apple
        // fruits[1] = banana

        System.out.println(fruits[1]);

        String[] fruitArray = new String[5];
        fruitArray[0] = "watermelon1";
        fruitArray[1] = "watermelon2";
        fruitArray[2] = "watermelon3";
        fruitArray[3] = "watermelon4";
        fruitArray[4] = "watermelon5";


        System.out.println(fruitArray[4]);

        int x = 0;
        if (x == 0) {
            System.out.println("Hello World");

        }

        /* if x>10
        print Current number is more than 10
        if x<10
        print Current number is less than 10
        if x=0
        print Current number is equal to 0
        */
        //int x = 5;//
        if (x > 10) {
            System.out.println("Current number is more than 10");
        } else if (x < 10) {
            System.out.println("Current number is less than 10");
        } else if (x == 0) {
            System.out.println("Current number is equal to 0");
        }

        /*
        x = 0 to 59
        if x = 0 to 14
        print "1 quarter"
        if x = 15 to 30
        print "2 quarter"
        if x = 31 to 45
        print "3 quarter"
        if x = 46 to 59
        print "4 quarter"
        */

        int minutes = 68;
        if (minutes >= 0 && minutes <= 14){
            System.out.println("1 quarter");
        } else if (minutes >= 15 && minutes <= 30){
            System.out.println("2 quarter");
        } else if (minutes >= 31 && minutes <= 45){
            System.out.println("3 quarter");
        } else if (minutes >= 46 && minutes <= 59){
            System.out.println("4 quarter");
        } else {
            System.out.println("there is no that time");
        }

    }


}
