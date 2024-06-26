import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import aulageneric.Garrafa;
import aulageneric.Refrigerante;
import aulageneric.Suco;
import exerciciogeneric.Bombom;
import exerciciogeneric.Caixa;

public class App {
    public static void main(String[] args) throws Exception {
        // List<List<List<String>>> listaDeLista = new ArrayList<>();

        //entre <> é um tipo (String, Integer) de objeto
        // que manipula/assume um generico
        Garrafa<Suco> garrafa = new Garrafa<Suco>(new Suco());
        Garrafa<Refrigerante> garrafa2 = new Garrafa<Refrigerante>(new Refrigerante());

        System.out.println(garrafa.getConteudo().getSabor());
        System.out.println(garrafa2.getConteudo().getSabor());

        garrafa.exibirInfo();
        garrafa2.exibirInfo();


        //exerciciogeneric:
        Caixa<String> caixa = new Caixa<>(List.of("Sapato", "Sapato"));
        Caixa<Integer> caixa2 = new Caixa<>(List.of(10, 0, 42));

        System.out.println(caixa.getConteudo());
        System.out.println(caixa2.getConteudo());

        Caixa<Bombom> caixa3 = new Caixa<>(List.of(
            new Bombom("Sonho de Valsa"),
            new Bombom("Lollo"),
            new Bombom("Batom"))
        );

        //Collection:
        List<Bombom> bomboms = new ArrayList<>();

        //add adiciona ao final
        bomboms.add(new Bombom("Diamante Negro"));
        bomboms.add(new Bombom("Choquito"));
        bomboms.add(new Bombom("Morango"));
        bomboms.add(new Bombom("Doce de Leite"));

        for (Bombom bombom : bomboms) {
            System.out.println(bombom.getNome());
        }

        //get traz um item de determinado index (0, 1, 2...)
        System.out.println(bomboms.get(2));

        bomboms.remove(1);

        //retorna true/false
        System.out.println(bomboms.isEmpty());

        //contains retorna true/false
        //metodo de Object
        //false pq hashcode é diferente (outra regiao de memoria)
        //true após subescrever equals
        System.out.println(bomboms.contains(new Bombom("Lollo")));

        //retorna hashcode
        //retorna nome após subescricao de toString
        System.out.println(new Bombom("Sonho de null"));

        //agora é possivel imprimir lista assim:
        for (Bombom bombom : bomboms) {
            System.out.println(bombom);
        }

        //indexOf primeiro elemento identico
        System.out.println(bomboms.indexOf(new Bombom("Lollo")));

        //indexOf retorna -1 se n encontrar elemento
        if (bomboms.indexOf(new Bombom("Lollo")) == -1) {
            System.out.println("Não achou");
        } else {
            System.out.println("Achou");
        }

        //limpa toda a lista:
        //bomboms.clear();

        //set substitui um elemento por outro
        bomboms.set(1, new Bombom("Pimenta"));



        //addAll pega todos itens de uma lista
        // e adiciona ao final da lista
        ArrayList<Bombom> bombons2 = new ArrayList<>();
        LinkedList<Bombom> outraLista = new LinkedList<>();
        Vector<Bombom> vector = new Vector<>();
        vector.addAll(bomboms);
        vector.addAll(outraLista);

        //LinkedList é uma lista circular


        //List.of pra adicionar valores:
        List<Bombom> bomboms3 = new ArrayList<>(List.of(
            new Bombom(null),
            new Bombom(null),
            new Bombom(null),
            new Bombom(null)
        ));

        List<Bombom> bomboms4 = new LinkedList<>(List.of(
            new Bombom(null),
            new Bombom(null),
            new Bombom(null),
            new Bombom(null)
        ));

        //gabarito exercicio:
        //p tipos primitivos ao adicionar, n precisa de new Integer
        List<String> numeros = new ArrayList<>(List.of("10", "20", "30"));

        numeros.add(("15"));
        numeros.add(("25"));
        numeros.add(("35"));

        //posso passar indice do objeto a remover, ou diretamente o objeto
        numeros.remove("15");

        numeros.set(0, "100");

        for (String numero : numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros.contains("100"));




        // //revisaoheranca:
        // Raposa raposa = new Raposa();
        // //metodo de Canino
        // raposa.getCor();
        // //metodo herdado de Animal
        // raposa.setEspecie(null);
        // raposa.setNomeCientifico("a");
    }
}
