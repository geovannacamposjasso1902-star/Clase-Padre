// Archivo: Smartphone.java
//HERENCIA: La clase Smartphone hereda de la clase padre Dispositivo
public class Smartphone extends Dispositivo {
    // Variables con tipos primitivos y objetos intercalados (cumpliendo con 7 tipos distintos)
    private int idModelo_primitivo;         // 1. int
    private Integer idModelo_objeto;          // 2. Integer
    private double precio_primitivo;        // 3. double
    private Double precio_objeto;           // 4. Double
    private boolean esInteligente_primitivo;// 5. boolean
    private Boolean esInteligente_objeto;   // 6. Boolean
    private char gama_primitivo;            // 7. char
    private Character gama_objeto;          // (Extra) Character

    // Constructor que llama al padre usando super()
    public Smartphone(String marca, int anioLanzamiento, double precio) {
        super(marca, anioLanzamiento);
        this.precio_primitivo = precio;
        this.precio_objeto = precio;
        this.esInteligente_primitivo = true;
        this.esInteligente_objeto = true;
        this.gama_primitivo = 'G';
        this.gama_objeto = 'G';
    }

    // POLIMORFISMO: Sobrescribimos el método del padre para personalizarlo
    @Override
    public void mostrarInfo() {
        System.out.println("[Smartphone] Marca: " + marca + ", Año: " + anioLanzamiento + ", Precio: $" + precio_primitivo);
    }
}
