package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public double answerPlus(double num1, double num2) {
        return num1 + num2;
    }

    public double answerMinus(double num1, double num2) {
        return num1 - num2;
    }

    public double answerMultiply(double num1, double num2) {
        return num1 * num2;
    }

    public double answerDivide(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}
