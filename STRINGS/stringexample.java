public class stringexample{
    public static void main(String[] args) {
        String s="boji";
        String s1="Lucky is my name";
        String s2="Boji";
        String s3="";
        System.out.println(s1.charAt(3));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains("luc"));
        System.out.println(s1.contentEquals("lucky "));
        System.out.println(s1.length());
        System.out.println(s1.endsWith("ks"));
        System.out.println(s2.startsWith(" boji"));
        System.out.println(s2.compareToIgnoreCase(s1));
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s1.codePoints());
        System.out.println(s1.indexOf("is"));
        System.out.println(s3.isEmpty());
        System.out.println(s1.isBlank());
        

        
    }
}