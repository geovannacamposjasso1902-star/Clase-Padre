// Archivo: Dispositivo.java
public class Dispositivo {
    // Atributo protegido para demostrar encapsulamiento y acceso por herencia
    protected String marca;
    protected int anioLanzamiento;

    // Constructor de la clase paddre para inicializar los datos comunes
    public Dispositivo(String marca, int anioLanzamiento) {
        this.marca = marca;
        this.anioLanzamiento = anioLanzamiento;
    }

    // POLIMORFISMO: Este método base será reinterpretado por cada clase hija
    public void mostrarInfo() {
        System.out.println("Dispositivo genérico de la marca: " + marca);
    }

    // ENCAPSULAMIENTO: Métodos Getter y Setter para controlar el acceso a los atributos privados/protegidos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
}

