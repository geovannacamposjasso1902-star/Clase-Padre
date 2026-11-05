// Archivo: Tablet.java
// HERENCIA: La clase Tablet hereda de la clase padre Dispositivo
public class Tablet extends Dispositivo {
    private boolean tienePen_primitivo;
    private Boolean tienePen_objeto;

    // Constructor que usa super() para inicializar los atributos heredados
    public Tablet(String marca, int anioLanzamiento, boolean tienePen) {
        super(marca, anioLanzamiento);
        this.tienePen_primitivo = tienePen;
        this.tienePen_objeto = tienePen;
    }

    // POLIMORFISMO: Sobrescribimos el método del padre para mostrar información propia de la tablet
    @Override
    public void mostrarInfo() {
        System.out.println("[Tablet] Marca: " + marca + ", Año: " + anioLanzamiento + ", ¿Incluye lápiz?: " + tienePen_primitivo);
    }
}
