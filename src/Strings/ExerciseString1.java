
package Strings;

public class ExerciseString1{
    public void run(){

        String cadena1 ="programacion";
        String cadena2 =new String("EstructuraDeDatos");

        
        System.out.println("Cadena 1: "+cadena1);
        System.out.println("Cadena 2: "+cadena2);

        
        System.out.println("Char at position 6: "+cadena1.charAt(6));

        
        System.out.println("Length cadena1: "+cadena1.length());
        System.out.println("Length cadena2: "+cadena2.length());

        
        System.out.println("First 'e' cadena1: "+cadena1.indexOf("e"));

        
        System.out.println("Last 'e' cadena2: "+cadena2.lastIndexOf("e"));

        
        System.out.println("Upper cadena1: "+cadena1.toUpperCase());

        
        System.out.println("Lower cadena2: "+cadena2.toLowerCase());

        
        System.out.println("Equals: "+cadena1.equals(cadena2));

        
        System.out.println("Equals Ignore Case: "+cadena1.equalsIgnoreCase(cadena2));

        
        System.out.println("Concat (+): "+cadena1+cadena2);
        System.out.println("Concat (method): "+cadena1.concat(cadena2));


        System.out.println("Contains 'esta': "+cadena1.contains("esta"));

     
        System.out.println("Substring (0-6): "+cadena1.substring(0,6));

    
        System.out.println("Replace a->i: "+cadena1.replace('a','i'));
        
        }
}
    
    
