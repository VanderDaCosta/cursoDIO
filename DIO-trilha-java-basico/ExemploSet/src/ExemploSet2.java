import java.util.*;

public class ExemploSet2 {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("vikings", "ação", 60));
            add(new Serie("How i meet your mother", "besteirol", 30));
            add(new Serie("suits", "ação", 110));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " -- " +
                serie.getGenero() + " -- " + serie.getTempoEpisodio());
            
        }

        System.out.println("\n--\tOrdem inserção\t--");
        Set<Serie>minhasSeries1 = new LinkedHashSet<Serie>(){{
            add(new Serie("vikings", "ação", 60));
            add(new Serie("How i meet your mother", "besteirol", 30));
            add(new Serie("suits", "ação", 110));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " -- " +
                serie.getGenero() + " -- " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem natural (Tempo do episodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " -- " +
                    serie.getGenero() + " -- " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem nome/ gênero/ Tempo de episodio\t--");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhaSeries3.addAll(minhasSeries);
        for (Serie serie: minhaSeries3) {
            System.out.println(serie.getNome() + " -- " +
                    serie.getGenero() + " -- " + serie.getTempoEpisodio());
        }
    }
}