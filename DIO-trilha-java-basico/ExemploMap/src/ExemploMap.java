import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
Dado os modelos dos carros e seus respectivos consumo na estrada, faça:
modelo = gol - consumo = 14,4km/L
modelo = uno - consumo = 15,6km/L
modelo = mobi - consumo = 16,1km/L
modelo = hb20 - consumo = 14,5km/L
modelo = kwid - consumo = 15,6km/L
*/
        Map<String , Double> carrosPopulares = new HashMap<String, Double>(){{
            put("gol" , 14.4);
            put("uno" , 15.6);
            put("mobi" , 16.1);
            put("hb20" , 14.5);
            put("kwid" , 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do GOL para 15,2km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo TUCSON está no dicionário: " +
                carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do UNO: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais ecoômico e seu comsumo: ");
        Double maisEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";

        for (Map.Entry<String, Double> entry:entries) {
            if(entry.getValue().equals(maisEconomico)) {
                modeloEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente é o " + modeloEficiente + " - " + maisEconomico);
            }
        }

        System.out.println("Exiba o modelo menos ecoômico e seu comsumo: ");
        Double menosEconomico = Collections.min(carrosPopulares.values());
        String modeloMenosEconomico = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menosEconomico)){
                modeloMenosEconomico = entry.getKey();
                System.out.println( "Modelo menos eficiente: "+ modeloMenosEconomico + " - " + menosEconomico);
            }
        }

/*Exiba a soma dos consumos*/
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = (double) 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6km/L: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String , Double> carrosPopulares1 = new LinkedHashMap<String, Double>(){{
            put("gol" , 14.4);
            put("uno" , 15.6);
            put("mobi" , 16.1);
            put("hb20" , 14.5);
            put("kwid" , 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String , Double> carrosPopulares2 = new TreeMap<String, Double>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o conjunto de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o conjunto está vazio: " + carrosPopulares.isEmpty());
    }
}
