package Practise;

public class String_Methods {
    static String c = "    ManZar   ";

    public static void main(String[] args) {
        String_Methods obj = new String_Methods();
        System.out.println(c.toLowerCase());
        //Sir This method will convert our string to all alphabets lowercase...

        System.out.println(c.toUpperCase());
        //Sir this method will convert our string to all alphabets uppercase....

        System.out.println(c.trim());
        //Sir this method will escape all the spaces in our string...

        System.out.println(c.startsWith("Ma"));
        //Sir this method will tell us true if our words passed in argumemt are true and false if not....

        System.out.println(c.endsWith("ar"));
        //this will check last letter ends with.....

        System.out.println(c.charAt(8));
        //value passed in argument this will return index value in letter

        System.out.println(c.length());
        //sir hee method asan khe "c" me jeke ba letter aahin hunhan ji length show kanda....

        String s1 = "Java is programing landuege. Java is easy to learn.";
        System.out.println(s1.replace("Java","Kava"));
        //sir hee pahanja value replace kando jeako parn karn chyon......

        String input = "My name is manzar";
        System.out.println(input.codePointAt(8));
        //sir mukhe  samj me na aayo

        System.out.println(c.isEmpty());
        //sir hee check kando ta empty aahe ya na ......

        System.out.println(c.concat(c));
        //sir he string khe 2 dafa print kare dendo... mtlb concat

        String S1 = "Clock";
        System.out.println(S1.intern());
        //hee asan khe same value print kre dendo....

        String S9 = "Manzar";
        System.out.println(S9.indexOf('a'));
        //sir hee asan khe char jo index budhyendo...

        System.out.println(c.contains(c));
        //Question ?


























    }
}
