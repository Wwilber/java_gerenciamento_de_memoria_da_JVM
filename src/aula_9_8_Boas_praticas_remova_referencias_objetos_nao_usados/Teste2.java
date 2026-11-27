package aula_9_8_Boas_praticas_remova_referencias_objetos_nao_usados;

import aula_9_6_Inalcancabilidade_de_objetos.Cliente;

public class Teste2 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.imprimirEstatisticas();

        pilha.adicionar(new ClienteX());
        pilha.adicionar(new ClienteX());
        pilha.adicionar(new ClienteX());
        pilha.adicionar(new ClienteX());
        pilha.adicionar(new ClienteX());
        pilha.adicionar(new ClienteX());

        ClienteX clienteRetirado = null;

        do {
            clienteRetirado = pilha.retirar();
            pilha.imprimirEstatisticas();
        } while (clienteRetirado != null);

        ClienteX c1 = new ClienteX();
        ClienteX c2 = new ClienteX();
        ClienteX c3 = new ClienteX();
    }
}
