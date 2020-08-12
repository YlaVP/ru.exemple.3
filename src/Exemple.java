public class Exemple {
    private static char A;

    public static byte add (byte first, short second) {

        return (byte) (first + second);
         }




public static int main (int first, long second) {

    return (int) (first * second);

    }


public static int getMaxNumber (int first, int second){

    return first > second ? first: second;

    }
public static boolean isCharA(char value) {

    return value == A;
}


public static boolean isCharNumber(char value){
        return Character.isDigit(value);

    }

    public static void printBinary (){
        for (int a = 0; a < 30; a ++){
            System.out.println(Integer.toBinaryString(a));

        }
    }
public static void minMaxBinary(){
    System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    System.out.println(Integer.MAX_VALUE + 1);


    }
}