package Java8Feature;

interface AddNumbers{
    int addition(int n1,int n2);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15;
        int num2 = 25;
        
        // Implementation without using Lambda expression
//        AddNumbers result = new AddNumbers(){
//            public int addition(int n1,int n2){
//                System.out.println("num1 : " + num1 + ", num2 : " + num2);
//                return (n1 + n2);
//            }
//        };
//        
        // Implementation using lambda expression
         AddNumbers result = (n1, n2) -> {
             System.out.println("num1 : " + num1 + ", num2 : " + num2);
             return (n1 + n2);
         };
        int output = result.addition(num1, num2);
        System.out.println("Result : " + output);
        
	}

}
