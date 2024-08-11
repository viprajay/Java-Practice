public class LengthTrimEmpty {
    public static void main(String[] args) {

        String name = " viprajay ";
        String name2 = "lavi";
        String name3 = "Viprajay";
        String s1 = "a"; // 97
        String s2 = "A"; // 65
        // if 0 number return s1 = s2
        // if + positive number return s1 > s2
        // if - negative number return s1 < s2

        System.out.println(name.trim());
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.trim());
        System.out.println(name.trim().length());
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));
        System.out.println(name.equals(""));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(name + name2);
        System.out.println(name3 + 10 + 20); // output-> viprajay1020
        System.out.println(10 + 20 + name3); // output-> 30viprajay
        System.out.println(name3 + 20 / 10); // output-> viprajay2
        // System.out.println(name3+10-5); // output-> error
        System.out.println(name3.concat(name2));
        System.out.println(String.join(",", name3, name2)); // cannot use null in delimiter
        System.out.println(name.replace("a", "b"));
        System.out.println(name.replaceFirst("a", "b"));
        System.out.println(name.replaceAll("a", "b"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.charAt(4));
        System.out.println(name.contains("vip"));
        System.out.println(name.startsWith("vip"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s);
        char[] b = name.toCharArray();
        System.out.println(b);

    }
}
