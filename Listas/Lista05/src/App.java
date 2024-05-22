import Loja.LOJA;

public class App {
    public static void main(String[] args) throws Exception {
        LOJA loja = new LOJA("Outlet Premium", 5);

        System.out.println(String.format(
        """
          %s a melhor loja do momento!!
          Melhor avaliação de todas: %s estrelas      
        """, loja.getNome(), loja.getAvaliacao()
        ));

        loja.adicionarProdutos("Baby Tee", 120, "Nike");
        loja.adicionarProdutos("Cropped", 72, "Zara");
        loja.adicionarProdutos("Leggin", 146, "Nike");
        loja.visualizacaoLista();
    }
}
