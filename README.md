# Proyecto: Ejemplo de Clases Genéricas en Java

## **¿Qué son las Clases Genéricas?**
Imagina una caja adaptable donde puedes guardar cualquier cosa como: zapatos, libros o frutas. Así funcionan las clases genéricas en Java: una estructura única que se ajusta a diferentes tipos de datos.

En este proyecto, usamos una clase genérica llamada `Par` para almacenar pares de datos, como:
- Una clave, que identifica algo (por ejemplo, el ID de un estudiante).
- Un valor, que representa información asociada a esa clave (por ejemplo, la calificación de ese estudiante).

Esto es útil porque no necesitamos crear una nueva clase para cada tipo de datos que queramos usar. En lugar de eso, podemos usar `Par` con los tipos de datos que elijamos, como números, texto, o ambos.

## **Ejemplo Práctico**
Supongamos que estamos manejando la lista de calificaciones de estudiantes. Cada estudiante tiene un ID único y una calificación. Con nuestra clase genérica `Par`, podemos almacenar estos pares de datos (ID, calificación) de una manera sencilla y organizada.

Por ejemplo:
- El estudiante con ID `101` tiene una calificación de `9.5`.
- El estudiante con ID `102` tiene una calificación de `8.7`.

Nuestra clase `Par` nos ayuda a manejar esta información sin preocuparnos por el tipo de datos, ya que puede adaptarse a cualquier combinación (como números, texto, etc.).

## **¿Por qué usar Clases Genéricas?**
1. **Flexibilidad**: Puedes trabajar con cualquier tipo de datos sin escribir una nueva clase.
2. **Reutilización de código**: Escribes una vez la estructura y puedes usarla para diferentes tipos de datos.
3. **Seguridad**: Al definir el tipo de datos en tiempo de compilación, se evitan errores comunes al combinar tipos incompatibles.

Por ejemplo, en lugar de crear clases como:
- `ParEnteros` para pares de números.
- `ParTexto` para pares de texto.

Simplemente usamos **`Par<K, V>`**, donde `K` es el tipo de la clave y `V` el tipo del valor. Esto ahorra tiempo y esfuerzo.

## **¿Cómo Funciona Este Proyecto?**
1. Creamos una lista para almacenar pares de datos, donde cada par contiene:
   - Un **ID** del estudiante (número).
   - Su **calificación** (número decimal).
   
2. Mostramos los datos en pantalla para verificar que todo está funcionando correctamente.

3. También podemos actualizar los valores fácilmente, como cambiar la calificación de un estudiante.

### **Ejemplo de Salida**
Cuando ejecutamos el programa, obtenemos algo como esto:

Lista de estudiantes y calificaciones:
ID: 101 - Calificación: 9.5
ID: 102 - Calificación: 8.7
ID: 103 - Calificación: 7.8

Datos actualizados:
Par [clave=101, valor=9.8]
Par [clave=102, valor=8.7]
Par [clave=103, valor=7.8]

En este caso:
- El ID `101` tenía inicialmente una calificación de `9.5`, pero después se actualizó a `9.8`.

## **Conclusión**
Las clases genéricas son una herramienta poderosa para manejar datos de forma flexible y eficiente. Este proyecto muestra cómo pueden ser utilizadas en situaciones prácticas, como manejar listas de estudiantes y sus calificaciones, haciendo que el código sea más limpio y reutilizable.