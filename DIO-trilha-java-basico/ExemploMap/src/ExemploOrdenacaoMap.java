/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionario e ordene-o:
exibindo (Nome Autor = Nome Livro)

Autor = Hawking, Stephen - Livro = Uma breve historia do tempo - Paginas = 256
Autor = Duhigg, Charles - Livro = O poder do habito - Paginas = 408
Autor = Harari, yuval Noah - Livro = 21 lições para o século 21 - Paginas = 432
*/
import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--->\t Ordem aleatória \t<---");
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21",432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--->\t Ordem inserção \t<---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--->\t Ordem alfabética autores \t<---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " = " + livro.getValue().getNome());
        }

        System.out.println("--->\t Ordem alfabética nomes dos livros \t<---");
        Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros : meusLivros3){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }
    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPaginas(){
        return paginas;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    public int hasCode(){
        return Objects.hash(nome, paginas);
    }
    public String toString(){
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas + '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}