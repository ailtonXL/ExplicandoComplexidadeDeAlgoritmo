import java.util.Arrays;

public class OlogN_Exemplo {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};

        int alvo = 10;
        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numeros[meio] == alvo) {
                System.out.println("Encontrado: " + numeros[meio]);
                break;
            } 
            else if (numeros[meio] < alvo) {
                inicio = meio + 1;
            } 
            else {
                fim = meio - 1;
            }
        }
    }
}
