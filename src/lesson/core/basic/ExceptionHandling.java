package lesson.core.basic;

public class ExceptionHandling {


    public static void main(String[] args) {

        try{

            int a  = 10;
            throw new ArithmeticException("This is Manual Exception");

        }catch (Exception arithmeticException){

            arithmeticException.printStackTrace();
            System.out.println("ArithmeticException Occurred");

        }finally {
            System.out.println("Finally Block Executed");
        }


    }



}
