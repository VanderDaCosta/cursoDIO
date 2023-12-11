import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresArco = new HashSet<>();
        coresArco.add("violeta");
        coresArco.add("anil");
        coresArco.add("azul");
        coresArco.add("verde");
        coresArco.add("amarelo");
        coresArco.add("laranja");
        coresArco.add("vermelho");
        System.out.println(coresArco);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArco) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArco.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArco);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArco) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArco.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArco);

        System.out.println("Limpe o conjunto: ");
        coresArco.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArco.isEmpty());
    }
}
class ComparatorIde1 implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome1 implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde1 implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}