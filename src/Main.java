// Archivo: Main.java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // --- 1. POLIMORFISMO Y ARREGLO DE OBJETOS ---
        // Creamos objetos usando la clase padre (Dispositivo) pero con los constructores de las hijas
        Dispositivo d1 = new Smartphone("Apple", 2024, 1200.50);
        Dispositivo d2 = new Laptop("Dell", 2023, 1.8f);
        Dispositivo d3 = new Tablet("Samsung", 2025, true);

        // Arreglo de dispositivos para aplicar el ciclo for requerido
        Dispositivo[] listaDispositivos = {d1, d2, d3};

        System.out.println("--- EJECUTANDO POLIMORFISMO EN CICLO FOR ---");
        // Ciclo for que ejecuta el método redefinido en cada clase hija de forma dinámica
        for (int i = 0; i < listaDispositivos.length; i++) {
            listaDispositivos[i].mostrarInfo();
        }

        System.out.println("\n--- DEMOSTRACIÓN DE COLECCIONES ---");

        // --- 2. ArrayList ---
        ArrayList<String> listaMarcas = new ArrayList<>();
        listaMarcas.add("Apple");
        listaMarcas.add("Dell");
        listaMarcas.add("Samsung");
        System.out.println("ArrayList de marcas: " + listaMarcas);

        // --- 3. LinkedList ---
        LinkedList<Dispositivo> colaDispositivos = new LinkedList<>();
        colaDispositivos.add(d1);
        colaDispositivos.add(d2);
        System.out.println("LinkedList tamaño: " + colaDispositivos.size());

        // --- 4. HashSet ---
        HashSet<Integer> aniosUnicos = new HashSet<>();
        aniosUnicos.add(2023);
        aniosUnicos.add(2024);
        aniosUnicos.add(2024); // Elemento duplicado (no se repetirá)
        System.out.println("HashSet de años únicos: " + aniosUnicos);

        // --- 5. HashMap ---
        HashMap<String, Double> mapaPrecios = new HashMap<>();
        mapaPrecios.put("Smartphone", 1200.50);
        mapaPrecios.put("Laptop", 950.00);
        System.out.println("HashMap de precios por tipo: " + mapaPrecios);
    }
}
