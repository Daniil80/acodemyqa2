package homeWorkJava3;

public class LoopsOperHomeWork {
    public static void main(String[] args) {

        System.out.println("1 exercise:");
        int x = 10;
        if (x == 10){
            System.out.println("Integer value is 10");
        }
        System.out.println(" ");


        System.out.println("2 exercise:");
        int age = 35;
        if (age >= 18 && age <= 21) {
            System.out.println("your age is 18-21, your discount is 10%");
        } else if (age >= 22 && age <= 65) {
            System.out.println("your age is 22-65, your discount is 15%");
        } else if (age >= 66) {
            System.out.println("your age is 65+, your discount is 20%");
        }
        System.out.println(" ");


        System.out.println("3 exercise");
//      3 Создать массив String и добавить в него 10 наименований животных.
//      a Пройтись циклом по массиву, найти и распечатать любого животного.
        String[] animals = {"horse", "cat", "dog", "mouse", "fox", "wolf", "bear", "squirrel", "pig", "rat"};
        {
            System.out.println(animals[5]);
        }
        System.out.println(" ");


        System.out.println("4 exercise");
//      4 Создать массив с числами от 0 до 10 и распечатать только те четные числа.
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int arrayInt : numbers) {
            if (arrayInt % 2 == 0) {
                System.out.print(arrayInt + " ");
            }
        }
        System.out.println("\n" + "short method");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\n");

        System.out.println("5 exercise");
//      5 Предположим что мы хотим выбрать транспортное средство на котором
//      сегодня поедем в офис. Транспортом может быть (машина, автобус, такси и т.д)
//      Относительно значения, которое храниться в переменной используя оператор switch
//      научить программу выводить на экран то, каким образом планируете добраться до работы.

        int TransportToWork = 4;
        switch (TransportToWork) {
            case 1:
                System.out.println("Today by Bus!");
                break;
            case 2:
                System.out.println("Today by bicycle! =)))");
                break;
            case 3:
                System.out.println("Yeeah, today by taxi!");
                break;
            case 4:
                System.out.println("Today by car");
                break;
            case 5:
                System.out.println("Today walking!");
                break;
            case 6:
                System.out.println("Today by plane");
                break;
            case 7:
                System.out.println("Today by helicopter!");
                break;
            default:
                System.out.println("Stay at home, no: " + TransportToWork);
        }

        System.out.println(" ");

        System.out.println("6 exercise");
//      6 Распечатать на экране числа от 1 до 100.
        int[] numb100 = new int[100];
        for (int i = 0; i < numb100.length; i++) {
            numb100[i] = i + 1;
            System.out.print(numb100[i] + " ");
        }

        System.out.println( );

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + 1 + " ");
        }

        System.out.println("\n");

        System.out.println("7 exercise");
//      7 Распечатать на экране числа от 50 до 1.
        for (int i = 50; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("8 exercise");
//      8 Распечатайте на экране таблицу умножения (от 1 до 10)

        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(i * a + "\t");
            }
            System.out.println();
        }
    }
}
