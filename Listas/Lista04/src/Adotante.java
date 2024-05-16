public class Adotante {
    String nome;
    int idade;
    String genero;

    public void chegada() {
        System.out.println(String.format(
            """
            Olá, eu me chamo %s e gostaria de adotar um animal!!  
            """, nome
        ));
    }

    public void saberSeEhDeMaior() {
        if(idade >= 18){
            System.out.println("Que bom, você pode adotar!!");
        } else {
            System.out.println("Poxa, infelizmente você não pode adotar, só quem é de maior");
        }
    }

    public void assinarInformacoes() {
        System.out.println(String.format(
        """
        
        Nesse caso, preciso que assine esse papel com suas informações:
              
        Seu nome: %s
        Sua idade: %s
        Seu gênero: %s
        """, nome, idade, genero
        ));
    }
}
