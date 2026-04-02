public class WrapperUtilityDemo {
    public static void main(String[] args) {

        
        int intVal = Integer.parseInt("123");
        double doubleVal = Double.parseDouble("3.14");
        boolean boolVal = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        
        System.out.println("Integer.parseInt(\"123\") = " + intVal);
        System.out.println("Double.parseDouble(\"3.14\") = " + doubleVal);
        System.out.println("Boolean.parseBoolean(\"true\") = " + boolVal);
        System.out.println("Integer.toBinaryString(10) = " + binary);
        System.out.println("Character.isDigit('5') = " + isDigit);
        System.out.println("Character.toUpperCase('a') = " + upper);
    }
}