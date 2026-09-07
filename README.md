# Collections


En este proyecto se trabajan los conceptos fundamentales de las colecciones en Java, utilizando principalmente clases de la librería `java.util` como `ArrayList`, `HashSet`, `HashMap`, `Iterator` y `ListIterator`.

## Estructura de carpetas

El proyecto está organizado por niveles. Dentro de cada nivel hay una carpeta para cada ejercicio.

src
│   README.md
│
├───level_1
│   ├───CapitalGame
│   │       classificacio.txt
│   │       countries.txt
│   │       Game.java
│   │       Main.java
│   │       Player.java
│   │
│   ├───Duplicates
│   │       Main.java
│   │       Month.java
│   │
│   └───ListIterator
│           Main.java
│
└───level_2
├───HashSetNoDuplicates
│       Main.java
│       Restaurant.java
│
└───MultipleSorting
Main.java
Restaurant.java
RestaurantComparator.java

## Tecnologías:

* Java 21
* IntelliJ IDEA Ultimate
* Git y GitHub

## 🚀 Instalación y Ejecución:
* Clonar el repositorio.
* Abrir en IntelliJ o Eclipse.
* Ejecutar Main.java.

En el ejercicio `CapitalGame` es necesario tener el archivo `countries.txt` en la ubicación correspondiente para poder cargar los países y sus capitales

# Nivel 1

## Ejercicio 1 - Duplicates

En este ejercicio se trabaja con `ArrayList` y `HashSet` utilizando una clase `Month`.


Se crea una lista con los meses del año utilizando objetos `Month`. Primero se añaden 11 meses dejando fuera agosto y después se inserta agosto en su posición correspondiente.

Una vez que la lista está completa, se convierte en un `HashSet` para comprobar cómo funciona esta colección cuando existen elementos duplicados.

### Funcionalidades

* Crear objetos `Month`.
* Añadir elementos a un `ArrayList`.
* Insertar un elemento en una posición concreta.
* Mantener el orden de los meses.
* Convertir un `ArrayList` en un `HashSet`.
* Comprobar el comportamiento de un `HashSet` con elementos duplicados.
* Recorrer la colección utilizando un `for`.
* Recorrer la colección utilizando un `Iterator`.


## Ejercicio 2 - ListIterator

En este ejercicio se practica el uso de `ListIterator` para recorrer una lista y trabajar con sus elementos en diferentes direcciones.


Se crea una lista de números enteros y una segunda lista. Los elementos de la primera lista se añaden a la segunda en orden inverso utilizando un `ListIterator`.

### Funcionalidades

* Crear y rellenar una `List<Integer>`.
* Crear una segunda lista.
* Recorrer una lista utilizando `ListIterator`.
* Obtener los elementos en orden inverso.
* Añadir los elementos a otra lista.

## Ejercicio 3 - Capital Game

En este ejercicio se combinan varias funcionalidades: lectura de archivos, `HashMap`, selección aleatoria de elementos, interacción con el usuario y escritura de resultados en un archivo.

El programa lee el archivo `countries.txt`, que contiene países y sus capitales, y guarda la información en un `HashMap<String, String>`.

Después se solicita el nombre del usuario y comienza un pequeño juego de preguntas. Se seleccionan 10 países diferentes de forma aleatoria y, en cada ronda, el usuario tiene que introducir la capital correspondiente.

Por cada respuesta correcta se suma un punto. Al terminar las 10 preguntas se muestra la puntuación y se guarda el nombre del usuario junto con su puntuación en `classificacio.txt`.

### Funcionalidades

* Leer información desde un archivo.
* Guardar países y capitales en un `HashMap`.
* Obtener una capital a partir de su país.
* Seleccionar países de forma aleatoria.
* Evitar repetir países durante el juego.
* Pedir información al usuario mediante `Scanner`.
* Comprobar las respuestas introducidas.
* Llevar el control de la puntuación.
* Mostrar la puntuación final.
* Guardar los resultados en un archivo.

# Nivel 2

En este nivel se trabaja con objetos y colecciones, centrándose principalmente en el control de duplicados y en la ordenación de objetos.

También se practica la sobrescritura de `equals()` y `hashCode()`, y el uso de `Comparator` para definir diferentes criterios de ordenación.

## Ejercicio 1 - HashSet No Duplicates

En este ejercicio se crea una clase `Restaurant` con los atributos `name` y `score`.

El objetivo es utilizar un `HashSet` evitando que se puedan añadir restaurantes que tengan exactamente el mismo nombre y la misma puntuación.

### Funcionalidades

* Crear objetos `Restaurant`.
* Guardar objetos `Restaurant` en un `HashSet`.
* Sobrescribir `equals()`.
* Sobrescribir `hashCode()`.
* Evitar restaurantes duplicados.
* Permitir restaurantes con el mismo nombre cuando tienen una puntuación diferente.

Por ejemplo, estos dos restaurantes pueden existir porque tienen diferente puntuación:

```
Restaurant A - 8
Restaurant A - 9
```

Pero este restaurante se considera duplicado:

```
Restaurant A - 8
Restaurant A - 8
```
## Ejercicio 2 - Multiple Sorting

En este ejercicio se utiliza la clase `Restaurant` del ejercicio anterior para ordenar los restaurantes siguiendo más de un criterio.

La ordenación se realiza primero por nombre de forma alfabética y, cuando dos restaurantes tienen el mismo nombre, se utiliza la puntuación como segundo criterio en orden descendente.

Para definir esta ordenación se utiliza un `Comparator`.

### Funcionalidades

* Comparar objetos `Restaurant`.
* Ordenar restaurantes por nombre.
* Ordenar por puntuación cuando los nombres coinciden.
* Utilizar más de un criterio de ordenación.
* Utilizar `Comparator` para definir la forma en la que se ordenan los objetos.

Por ejemplo:

```
name: Restaurant A, score: 9
name: Restaurant A, score: 7
name: Restaurant B, score: 8
```

