package aula_9_7_Quando_esgota_a_Memoria_heap_OutOfMemoryError;

import aula_9_6_Inalcancabilidade_de_objetos.Cliente;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        while (true) {
            imprimirUsoMemoria();
            clientes.add(new Cliente());
        }
    }
    static void imprimirUsoMemoria() {
        // MEMÓRIA TOTAL LIMITE PARA JVM:
        System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));

        // MEMÓRIA RESERVADA PELA JVM:
        System.out.printf("TOTAL EMPENHADO: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));

        // MEMÓRIA RESERVADA PELA JVM - QUANTO TÁ DISPONIVEL :
        System.out.printf("DISPONÍVEL: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Usada: %s%n", emMegabytes(memoriaUsada));

        System.out.println("-------");
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
