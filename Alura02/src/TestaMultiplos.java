public class TestaMultiplos {
    public static void main(String[] args) {
        System.out.print("Multiplos de 3 sao: ");
        for (int numero = 1; numero <= 100 ; numero++) {

            if((numero % 3) == 0){
                System.out.print(" "+ numero + " ");
            }

        }
        System.out.print(".");
    }
}
