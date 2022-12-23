package week01Adam;

public class method {
    public static void main(String[] args) {

      printHello();
      printHello(" Noor");
      printHelloFromTo(" noor "," razan");
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printHello(String name){
        System.out.println("Hello"+name);
    }
    public static void printHelloFromTo(String from,String to){
        System.out.println(" hello"+from+"to"+to);
    }
}
