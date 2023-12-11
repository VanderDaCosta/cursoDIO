package one.digitalinnovation.basecamp;
public class Main {
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.60;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Vander";
        String s2 = "Pedro";
        String s3 = "Valter";
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 < f2 " + (f1 < f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 < c2 " + (c1 < c2));
        System.out.println("c1 >= c2 " + (c1 >= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));
        //System.out.println("s1 < s2 " + (s1 < s2)); Não usamos Comparações de grandezas com strigns

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println("b1 < b2 " + (b1 < b2)); Não usamos Comparações de grandezas com valores booleanos
      
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
        /*
            =======================================================
            Exemplificanddo como o sistema fica com
            o metodo de criação de variaveis cada vez mais complexas
         */

        double salarioMensal = 1370.63;
        double mediaSalario = 1274.30;
        int quantidadsDependentes = 4;
        int mediaDependentes = 2;
        System.out.println((salarioMensal < mediaSalario) && (quantidadsDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadsDependentes >= mediaDependentes;
        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebe o auxilio? " + recebeAuxilio);

    }

}

