public class Calculator {
    public void add(float firstNumber, float secondNumber){
        float total = firstNumber + secondNumber;
        this.displayMessage(firstNumber,secondNumber, total, " + ");
    }
    public void subtract(float firstNumber, float secondNumber){
        float total = firstNumber - secondNumber;
        this.displayMessage(firstNumber,secondNumber, total, " - ");
    }
    public void multiply(float firstNumber, float secondNumber){
        float total = firstNumber * secondNumber;
        this.displayMessage(firstNumber,secondNumber, total, " * ");
    }
    public void divide(float firstNumber, float secondNumber){
        float total = firstNumber / secondNumber;
        this.displayMessage(firstNumber,secondNumber, total, " / ");
    }

    private void displayMessage(float firstNumber, float secondNumber, float total, String sign){
        System.out.println(firstNumber + sign + secondNumber + " = " + total);
    }

}
