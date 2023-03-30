package lab3;

public class Formulas {
    public static void main(String[] args) {
        Calculator calculator1 =  new Calculator(8,4);
        System.out.println("The sum is " + calculator1.addVariable(8,4));
        System.out.println("The answer is "+ calculator1.multiplyVariables(8,4) );
        System.out.println("The difference is "+ calculator1.subtractVariables(8,4));
        System.out.println("The answer is " +calculator1.divideVariables(8,4));


    }


}
