public class pro13{
    public static void main(String[] args) {
        String s1="java";
        String s3= "Java";
        String s2=null;
        // Find the number of characters in the given string
        System.out.println(s1.length());
        // Check whether the string is null or not
         if(s2 == null){
            System.out.println("null");
         }
        //  compare two strings ingonre case 
System.out.println(s1.compareToIgnoreCase(s3));

// Join the three strings
System.out.println(s1+s3);
// Convert the uppercase/lowercase of the given string
System.out.println(s1.toUpperCase());

// Convert the lowercase/uppercase of the given string
System.out.println(s3.toLowerCase());
// Replace all occurrences of the specified CharSequence;

System.out.println(s1.replaceAll("a","A"));
// Remove beginning and ending spaces of this string.

System.out.println(s1.trim());
// Split the given string

String []s = s1.split("a");

for(String s4:s){
    System.out.println(s4);

    
    }
}
}
