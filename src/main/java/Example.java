public class Example {
    public static byte sum (byte first, short second) {
        return (byte) (first + second);
         }

public static int multi (int first, long second) {
    return (int) (first * second);
    }

public static int getMaxNumber (int first, int second) {
    return first > second ? first : second;
    }

public static boolean isCharA(char value) {
    return value == 'A';
    }

public static boolean isCharNumber(char value) {
        return Character.isDigit(value);
    }

    public static void printBinary () {
        for (int a = 0; a <= 30; a ++) {
            System.out.println(Integer.toBinaryString(a));
        }
    }

public static void minMaxBinary() {
    System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    System.out.println(Integer.MAX_VALUE + 1);
    }

    public static int convectorCharToInt (char a) {
        return (int) a;
    }

    public static int convectorIntToChar (int a) {
        return (char) a;
    }

    public static void main(String[] args) {
        byte y = 10;
        short z = 15;
        byte t = Example.sum(y,z);
        System.out.println(t);
        int a1 = 6;
        long a2 = 6;
        int test = Example.multi(a1,a2);
        System.out.println(test);
        int first = 5;
        int second = 10;
        int test2 = Example.getMaxNumber(first, second);
        System.out.println(test2);
    }
}