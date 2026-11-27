package aula_9_8_Boas_praticas_remova_referencias_objetos_nao_usados;

public class Teste1 {
    public static void main(String[] args) {
        ClienteX cliente1 = new ClienteX();
        ClienteX cliente2 = new ClienteX();

        cliente1.nome = "João";
        cliente2.nome = "Maria";

        Pilha pilha = new Pilha();
        pilha.adicionar(cliente1);
        pilha.adicionar(cliente2);
        pilha.imprimirEstatisticas();



    }

}
