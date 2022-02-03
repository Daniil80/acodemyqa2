package classroom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
public class Calculator {

    private String modelName;

//    public Calculator(String modelName) {
//        this.modelName = modelName;
//    }

    public Calculator() {}

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int squared(int x) {
        return x * x;
    }
}
//    public int sum(int x, int y) {
//        return x + y;
//    }
//
//    public int subtract(int x, int y) {
//        return x - y;
//    }
//
//    public int divide(int x, int y) {
//        return x / y;
//    }
//
//    public int multiply(int x, int y) {
//        return x * y;
//    }
//
//    public void printResult(double number) {
//        System.out.println(number);
//    }




