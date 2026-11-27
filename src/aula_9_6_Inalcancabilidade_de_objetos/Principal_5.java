package aula_9_6_Inalcancabilidade_de_objetos;

public class Principal_5 {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        // Cliente c = new Cliente();
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();

        cliente.endereco = endereco;
        endereco.cliente = cliente;

        cliente = null;
        endereco = null;

        imprimirUsoMemoria();

        System.gc();

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        // MEMÓRIA TOTAL LIMITE PARA JVM:
        System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));

        // MEMÓRIA RESERVADA PELA JVM:
        System.out.printf("TOTAL EMPENHADO: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));

        // MEMÓRIA RESERVADA PELA JVM - QUANTO TÁ DISPONIVEL :
        System.out.printf("DISPONÍVEL: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Disponível: %s%n", emMegabytes(memoriaUsada));

        System.out.println("-------");
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
