public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 3;
        int i2 = 6;
        float f1 = 54f;
        float f2 = 5f;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);

        System.out.println(b2 || b3);
        System.out.println(b2 || b4);

        System.out.println(b1 ^ b3); // com o SHOR so é verdade quando eles são opostos
        System.out.println(b4 ^ b1);

        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println((i1 > i2) || (f2 < f1));
        System.out.println((i1 + i2) < (f2 - f1) && true);

    }
}
