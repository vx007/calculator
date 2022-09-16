package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public double answerPlus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.answerPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public double answerMinus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.answerMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public double answerMultiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.answerMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public double answerDivide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.answerDivide(num1, num2);
    }
}
