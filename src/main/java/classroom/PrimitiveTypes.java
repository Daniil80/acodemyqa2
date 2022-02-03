package classroom;

import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {

//        Floating point example

        float floatExample = 999999.9999F;
        System.out.println(floatExample);
        System.out.println(999999.9999F);

        double doubleExample = 2000000.9876D;
        System.out.println(doubleExample);
        System.out.println(2000000.9876D);

//        Integral example

        byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short distanceBetvweenKievAndRiga = 1011;
        System.out.println(distanceBetvweenKievAndRiga);

        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);

        long currentWorldPopulation = 79000000000L;
        System.out.println(currentWorldPopulation);

        char ch = 'b';
        System.out.println(ch);


        int[] arrayOfPeopleAges = {21, 22, 23, 24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

        // String variables

        String myName = "Daniil";
        System.out.println(myName);

        String mySurname = "Galuza";

        String myNameAndUsername = myName + " " + mySurname;
        System.out.println(myNameAndUsername);

        System.out.printf("My name is %s. My surname is %s.\n", myName, mySurname);

        int sumOftwoNumbers = 10 + 30;
        System.out.println(sumOftwoNumbers);

        int a = 30;
        int b = 5;
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a + b);

        System.out.println(9 % 4);
        // 4 4 = 8
        // 1

        float doubleDivision = 100 / 13F;
        System.out.println(doubleDivision);






    }
}
