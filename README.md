# Sistema de Gestión de Dispositivos - POO en Java

Proyecto desarrollado para demostrar los principios fundamentales de la Programación Orientada a Objetos (POO), herencia, polimorfismo y el manejo de estructuras de datos en Java.

## 🏛️ Arquitectura del Proyecto

El sistema se compone de una jerarquía de clases ubicada en la carpeta `src`:

- **Clase Padre (`Dispositivo.java`):** Define los atributos base protegidos y el encapsulamiento (Getters y Setters).
- **Clases Hijas (`Smartphone.java`, `Laptop.java`, `Tablet.java`):** Extienden de `Dispositivo` aplicando herencia e implementando polimorfismo mediante el método sobrescrito `@Override mostrarInfo()`.
- **Clase Principal (`Main.java`):** Ejecuta la lógica del programa, el arreglo polimórfico y la demostración de colecciones.

## 📦 Colecciones y Tipos de Datos Implementados
- **`ArrayList` y `LinkedList`:** Para el almacenamiento dinámico de elementos.
- **`HashSet`:** Para evitar elementos duplicados (como años de lanzamiento o identificadores únicos).
- **`HashMap`:** Para el manejo de estructuras clave-valor.

## 🛠️ Herramientas Utilizadas
- **Lenguaje:** Java
- **Entorno de Desarrollo:** IntelliJ IDEA
- **Control de Versiones:** Git y GitHub
