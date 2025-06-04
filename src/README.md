# 🧠 Proyecto: Clasificador de Personas y Animales en Java

Este proyecto es una aplicación de consola escrita en Java, desarrollada en IntelliJ IDEA. Permite capturar, clasificar y analizar datos de personas y animales, utilizando colecciones, expresiones lambda y `Stream API`.

## 🚀 Funcionalidades

### 👤 Módulo de Personas
- Captura de datos desde consola: nombre, apellido, edad, género, sueldo por hora y cargo.
- Análisis de datos con Java Streams:
    - Promedio de edad.
    - Cantidad de mayores de edad.
    - Filtro por nombres que inicien con “A” y apellidos que contengan “M”.
    - Director masculino con sueldo por 8 horas.
    - Primer desarrollador femenino encontrado.
    - Desarrollador que más gana por hora.
    - Mujeres ordenadas alfabéticamente por nombre.

### 🐾 Módulo de Animales
- Captura de animales por consola con nombre, tipo (terrestre, aéreo, acuático) y género.
- Clasificación automática en un `Map<String, List<Animal>>` por tipo.
- Muestra organizada de los animales por categoría.

## 🛠️ Tecnologías utilizadas
- Java 17+
- IntelliJ IDEA
- Programación orientada a objetos
- Lambda expressions
- API de Streams
- Colecciones: List, Map, Optional

## 📂 Estructura del proyecto

src/
├── Animales/
├── ├── Animal.java
│ ├── Personas.java
│ ├── ├── GestorPersona.java
│ ├── ├── Persona.java
│

Hola, en este video te presento un programa de consola en Java desarrollado en IntelliJ, que permite capturar, clasificar y analizar datos de personas y animales.
El objetivo es mostrar el uso de colecciones, expresiones lambda y estructuras de control en un solo proyecto modular.

🔹 [Menú principal del programa]
El sistema inicia con un menú interactivo, donde el usuario puede elegir entre ingresar datos de personas, de animales o salir del programa.
Esto permite que el mismo sistema maneje distintos tipos de entidades de forma ordenada.

🔹 [Ingreso de Personas]
Cuando elegimos ingresar personas, el sistema solicita datos como nombre, apellido, edad, género, sueldo por hora y cargo.
Los datos se almacenan en una lista de objetos Persona.

🔹 [Análisis con Lambdas y Streams]
Después de ingresar las personas, el sistema muestra un análisis automático con expresiones lambda, como:

Promedio de edad.

Conteo de mayores de edad.

Filtrado por nombres que comienzan con “A” o apellidos con “M”.

Búsqueda del desarrollador con mayor sueldo.

Ordenamiento de mujeres por nombre.

Esto demuestra el uso eficiente de Stream API y operaciones funcionales.

🔹 [Ingreso de Animales y Clasificación]
Si elegimos capturar animales, el sistema solicita el nombre, tipo (terrestre, aéreo o acuático) y género.
Cada animal se clasifica automáticamente en un mapa (Map<String, List<Animal>>) según su tipo.
Al finalizar, se muestra la clasificación organizada.

🔹 [Conclusión]
Este proyecto demuestra cómo integrar múltiples funcionalidades en una sola aplicación de consola usando:

Herencia y clases personalizadas.

Colecciones (List, Map).

Lambda expressions y Streams.

Estructura modular para mantener el código limpio y organizado.

Es una base sólida para proyectos más complejos en Java orientados a la clasificación y análisis de datos.

