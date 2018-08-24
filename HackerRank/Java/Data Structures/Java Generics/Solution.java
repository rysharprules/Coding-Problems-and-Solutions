class Printer {

    // this can be solved using an Object array
    public void printArray(Object[] array) {
        for(Object part : array) {
            System.out.println(part);
        }
    }

    // I presume the author of the Problem wanted a solution using generics
    public <T> void printArray(T[] array) {
        for (T part : array) {
            System.out.println(part);
        }
    }

}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}