public class Operadores {
    public static void main(String[] args) {

        String nomeUm = "Jean";
        String nomeDois = new String("Jean");

        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean simOuNao = numero1 == numero2;

        if(numero1 == numero2) { // true
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simOuNao);

        simOuNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simOuNao);

        simOuNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simOuNao);
    }
}
