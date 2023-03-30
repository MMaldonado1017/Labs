package lab3;

public class Calculator {
    public int variableOne;
   public int variableTwo;

public Calculator(int variableOne,int variableTwo){
    this.variableOne= variableOne;
    this.variableTwo= variableTwo;

}
public int addVariable(int variableOne, int variableTwo ){
       return variableOne+variableTwo;


}
public int multiplyVariables(int variableOne,int variableTwo){
    return variableOne* variableTwo;
}
public int subtractVariables(int variableOne,int variableTwo){
    return variableOne - variableTwo;
}
public int divideVariables(int variableOne, int variableTwo){
    return variableOne/variableTwo;
}



}
