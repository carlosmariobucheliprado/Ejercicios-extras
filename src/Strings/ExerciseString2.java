
package Strings;

import java.util.Scanner;


public class ExerciseString2{
    public void run(){
        Scanner scan =new Scanner(System.in);

     
        String s1="Estructuras de datos";              
        String s2=new String("Estructuras de datos");  

        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);

       
        
        if(s1 == s2){
            System.out.println("Same object (==)");
        } else{
            System.out.println("Different objects (==)");
        }

       
        if (s1.equals(s2)){
            System.out.println("Same content (equals)");
        } else{
            System.out.println("Different content (equals)");
        }

      
        s2 = s1; 
        System.out.println("After assign s2=s1→ "+(s1 == s2));

       
        System.out.print("Enter a word: ");
        String word =scan.nextLine();

        String reversedWord =reverse(word);

        System.out.println("Original: "+word);
        System.out.println("Reversed: "+reversedWord);

     
        System.out.print("Enter a phrase: ");
        String phrase =scan.nextLine();

        String noSpaces =phrase.replace(" ","");
        String reversedPhrase =reverse(noSpaces);

        System.out.println("Without spaces: "+noSpaces);
        System.out.println("Reversed: "+reversedPhrase);

 
        
        System.out.print("Enter another phrase: ");
        String text=scan.nextLine();

        int vowels=countVowels(text);

        System.out.println("Number of vowels: "+vowels);
    }

 
    private String reverse(String text){
        String result="";

        for (int i=text.length()-1; i>=0; i--) {
            result+=text.charAt(i);
        }
        return result;
    }

 
    
    private int countVowels(String text){
        int count=0;
        text=text.toLowerCase();

        
        for (int i=0; i<text.length(); i++){

            char c=text.charAt(i);

            if (c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        return count;
    }
   
    
}
