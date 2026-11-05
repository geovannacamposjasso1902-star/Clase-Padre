// Archivo: Laptop.java
// HERENCIA: La clase Laptop hereda de la clase padre Dispositivo
public class Laptop extends Dispositivo {
    // Variables primitivas y de tipo objeto
    private long capacidadRam_primitivo;    // long
    private Long capacidadRam_objeto;       // Long
    private float peso_primitivo;           // float
    private Float peso_objeto;              // Float
    private byte puertosUSB_primitivo;      // byte
    private Byte puertosUSB_objeto;         // Byte
    private short almacenamiento_primitivo; // short
    private Short almacenamiento_objeto;    // Short

    // Constructor que usa super() para enviar los datos a la clase padre
    public Laptop(String marca, int anioLanzamiento, float peso) {
        super(marca, anioLanzamiento);
        this.peso_primitivo = peso;
        this.peso_objeto = peso;
        this.capacidadRam_primitivo = 16L;
        this.capacidadRam_objeto = 16L;
    }

    // POLIMORFISMO: Sobrescribimos el método del padre para personalizarlo
    @Override
    public void mostrarInfo() {
        System.out.println("[Laptop] Marca: " + marca + ", Año: " + anioLanzamiento + ", Peso: " + peso_primitivo + "kg");
    }
}
