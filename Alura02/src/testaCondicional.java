public class testaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais.");

        int idade = 10;
        int quantidadePessoas= 3;

        if(idade >= 18){
            System.out.println("Voce tem mais de 18 anos");
        }else if(quantidadePessoas > 1){
            System.out.println("Voce pode entrar, pois esta acompanhado");
        }else{
            System.out.println("Voce tem menos de 18 anos.");

        }

    }
}


