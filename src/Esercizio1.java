import java.util.Arrays;

public class Esercizio1 {
            public static void main(String[] args){
                int a = 60;
                int b =70;
                int result = multiply(a, b);
                System.out.println(result);

                System.out.println(concat("bla", 6));

                String[] arr = insertIntoArray(new String[]{"l", "m", "b", "d", "o"}, "abcdefg");

                System.out.println(Arrays.toString(arr));
            }
            public static int multiply(int a, int b) {
                return a * b;
            }
            public static String concat(String str, int num) {
                return str + num;
            }

            public static String[] insertIntoArray(String[] stringArray, String str) {
                String[] array = new String[stringArray.length + 1];
                for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = stringArray[i];
            } else if (i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }
}