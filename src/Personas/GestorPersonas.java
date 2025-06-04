package Personas;

import Animales.Animal;

import java.util.*;
import java.util.stream.*;

public class GestorPersonas {
/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        String continuar;
        // Sección personas
        System.out.println("=== Registro de Personas ===");
        do {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            System.out.print("Género (masculino/femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Sueldo por hora: ");
            double sueldoHora = Double.parseDouble(scanner.nextLine());
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            personas.add(new Persona(nombre, apellido, edad, genero, sueldoHora, cargo));

            System.out.print("¿Desea agregar otra persona? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        // Operaciones con lambdas para personas
        System.out.println("\n=== Estadísticas de Personas ===");
        System.out.println("Total personas: " + personas.size());

        double promedio = personas.stream().mapToInt(Persona::getEdad).average().orElse(0);
        System.out.println("Promedio de edad: " + promedio);

        long mayores = personas.stream().filter(p -> p.getEdad() >= 18).count();
        System.out.println("Mayores de edad: " + mayores);

        System.out.println("Nombres que comienzan con 'A':");
        personas.stream().filter(p -> p.getNombre().startsWith("A")).forEach(System.out::println);

        System.out.println("Apellidos con 'M':");
        personas.stream().filter(p -> p.getApellido().toLowerCase().contains("m")).forEach(System.out::println);

        personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("director") && p.getGenero().equalsIgnoreCase("masculino"))
                .peek(p -> System.out.println("Nombre: " + p.getNombre() + " " + p.getApellido() +
                        " Sueldo por 8 horas: $" + (p.getSueldoHora() * 8)))
                .collect(Collectors.toList());

        personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador") && p.getGenero().equalsIgnoreCase("femenino"))
                .findFirst()
                .ifPresent(p -> System.out.println("Primera desarrolladora: " + p));

        Optional<Persona> masGana = personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador"))
                .max(Comparator.comparing(Persona::getSueldoHora));
        masGana.ifPresent(persona -> System.out.println("Desarrollador que más gana: " + persona));

        System.out.println("Mujeres ordenadas por nombre:");
        personas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("femenino"))
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(System.out::println);

        // Sección animales
        List<Animal> animales = new ArrayList<>();
        Map<String, List<Animal>> clasificacion = new TreeMap<>();

        System.out.println("\n=== Registro de Animales ===");
        do {
            System.out.print("Nombre del animal: ");
            String nombre = scanner.nextLine();
            System.out.print("Tipo (terrestre/aéreo/acuático): ");
            String tipo = scanner.nextLine().toLowerCase();
            System.out.print("Género (masculino/femenino): ");
            String genero = scanner.nextLine().toLowerCase();

            Animal animal = new Animal(nombre, tipo, genero);
            animales.add(animal);
            clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(animal);

            System.out.print("¿Desea agregar otro animal? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        System.out.println("\n=== Clasificación de Animales ===");
        clasificacion.forEach((tipo, lista) -> {
            System.out.println(tipo.toUpperCase() + ": " + lista);
        });
    }
}
