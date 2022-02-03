package classroom;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        If operator
        if(expression) {
        // something to do
        }
         */

        double a = 10;
        double b = 5;

        boolean c = b > a;

        // if a > b is TRUE
        if (a > b) {
            System.out.println("Yes, 10 > 5");
        }

        boolean isStudent = true;

        if (isStudent) {
            System.out.println("Yes, he is a student");
        }

        /*
        if else operator
        if(condition) {
        // do something
        } else {
        // do something
        }
         */


        if (isStudent) {
            System.out.println("He is a student");
        } else {
            System.out.println("He is NOT a student");
        }

        int nikitaYearsOld = 27;
        boolean isEmployee = true;

        if(nikitaYearsOld > 18 && !isEmployee) {
            System.out.println("Nikita is Mamkyn Nahlebnyk");
        } else {
            System.out.println("Everything is good! Good boy!");
        }

        String myName = "Nikita";

        // equals 1:1 (nikita = nikita)
        // equalsIgnoreCase (nikita = NiKiTA ; nikita = NIKITA);


        /*
        if(statement) {
        // code execution
        } else if (statement) {
        // code execution
        } else {
        // code execution
        }
         */


        String carBrand = "TESLA";

        if(carBrand.equals("AUDI")) {
            System.out.println("Nice, you can buy Quattro");
        } else if (carBrand.equals("MAZDA")) {
            System.out.println("Uuuuuu, rust will be your main problem");
        } else if (carBrand.equals("BMW")) {
            System.out.println("You can be a drifter");
        }

        int x = 10;
        int y = 15;

        System.out.println(x > y ? "X is greater than Y" : "Y is greater than X");
        System.out.println(isStudent ? "He is a student" : "He is not a student");

        if (isStudent) {
            System.out.println("He is a student");
        } else {
            System.out.println("He is not a student");
        }


        int num1 = 5;
        num1 = 10;
        System.out.println(num1);
        num1 = 15;
        System.out.println(num1);
        num1 = 5;
        System.out.println(num1);


        // > , < ; <= ; =>; == ; !=


        String currentMonth = "September";

        switch (currentMonth) {
            case "December":
                System.out.println("This is winter!");
                break;
            case "January":
                System.out.println("This is winter and is " + currentMonth);
                break;
            case "June":
                System.out.println("This is summer and is " + currentMonth);
                break;
            default:
                System.out.println("Current month is not supported: " + currentMonth);
        }

        int dayOfWeek = 5;

        switch (dayOfWeek) {
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("This is Saturday");
                break;
            case 7:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("Incorrect day: " + dayOfWeek);
        }

        switch (4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("This is working day");
                break;
            case 6:
            case 7:
                System.out.println("This is holiday");
                break;
            default:
                System.out.println("Incorrect day: " + dayOfWeek);
        }

        if(!isStudent) {
            for (int i = 0; i < 10; i++) {
                System.out.println("He is not a student");
            }

        }



    }


}
