public class testaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais.");

        int idade = 16;
        int quantidadePessoas= 3;

        //boolean acomapanhado = quantidadePessoas >= 2;

        boolean acomapanhado;

        if(quantidadePessoas >=2 ){
            acomapanhado = true;
        }else{
            acomapanhado = false;
        }

        System.out.println("Valor de acompanhado = " + acomapanhado);

        if(idade >= 18 || acomapanhado){
            System.out.println("Seja bem vindo");
        }else{
            System.out.println("Nao entra.");

        }

    }
}
