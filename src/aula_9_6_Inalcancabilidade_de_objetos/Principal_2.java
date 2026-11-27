package aula_9_6_Inalcancabilidade_de_objetos;

public class Principal_2 {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024];
        byte[] y = new byte[500 * 1024 * 1024];

        imprimirUsoMemoria();

        x = y;

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
