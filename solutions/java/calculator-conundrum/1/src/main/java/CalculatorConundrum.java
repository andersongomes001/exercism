import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        List<String> operations = List.of(new String[]{"+", "*", "/"});
        String result = null;

        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty() || operation.isBlank()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if(!operations.contains(operation)){
            throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }

        try{
            switch (operation){
                case "+":
                    result = String.valueOf( operand1 + operand2);
                    break;
                case "*":
                    result = String.valueOf(operand1 * operand2);
                    break;
                case "/":
                    result = String.valueOf(operand1 / operand2);
                    break;
            }
        }catch (Exception e){
            if(e.getClass().equals(ArithmeticException.class)){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        }
        return String.format("%s %s %s = %s",operand1,operation,operand2,result);
    }
}
