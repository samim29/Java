public class StringTutorial{
    public static void main(String [] args){
        //String Concatenate
        String name1="Sadik";
        String name2= "Samim";
        String name3= name1 + " and " + name2;
        System.out.println(name3);

        // charAt
        System.out.println(name3.charAt(0));
        //length
        System.out.println(name3.length());
        //replace
        System.out.println(name3.replace('S','A'));//does not chage the original string , as stringa are immutable in java
        //substring
        System.out.println(name3.substring(0,6));
    }
}