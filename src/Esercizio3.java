public class Esercizio3 {

        public static void main(String[] args) {

            System.out.println(perimetro(10.5, 12.5));
            System.out.println(pariDispari(9));
            System.out.println(area(3.5, 7.2, 4.6));
        }

        public static double perimetro(double l1, double l2) {
            return l1 + l2 + l1 + l2;
        }

        public static int pariDispari(int input) {
            return input % 2 == 0 ? 0 : 1;
        }

        public static double area(double l1, double l2, double l3) {
            double semiPerimetro = (l1 + l2 + l3) / 2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - l1) * (semiPerimetro - l2) * (semiPerimetro - l3));
        }
    }

