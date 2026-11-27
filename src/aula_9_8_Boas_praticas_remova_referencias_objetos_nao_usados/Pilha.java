package aula_9_8_Boas_praticas_remova_referencias_objetos_nao_usados;

import java.util.Arrays;

public class Pilha {

    static final int CAPACIDADE_INICIAL_PADRAO = 4;

    ClienteX[] elementos = new ClienteX[CAPACIDADE_INICIAL_PADRAO];
    int tamanho = 0;

    void adicionar(ClienteX elemento) {
        garantirCapacidade();
        elementos[tamanho++] = elemento;
    }

    ClienteX retirar() {
        if (tamanho == 0) {
            // seria melhor lançar exception (mas ainda não aprendemos isso)
            return null;
        }
        ClienteX elemento = elementos[--tamanho];
        elementos[tamanho] = null;
        return elemento;
        // return elementos[--tamanho];
    }

    void imprimirEstatisticas() {
        System.out.printf("Tamanho Atual: %d%n", tamanho);
        System.out.printf("Capacidade: %d%n%n", elementos.length);
    }
    private void garantirCapacidade() {
        if (elementos.length == tamanho) {
            elementos = Arrays.copyOf(elementos, tamanho+10);
        }
    }
}
