## Problematica

Ante el nuevo aire que parece estar tomando el formato físico de la música en discos de vinilo, aumentan también los coleccionistas del formato.
Suponga que debe crear un mantenedor para un coleccionista de vinilos, para lo cual debe como mínimo considerar que:

- se tiene una colección de máximo 100 vinilos

- deben poder agregarse vinilos (nombre del artista, nombre del disco, año de lanzamiento)

- debe poder buscarse un vinilo y saber si está o no en la colección

- saber cuantos vinilos tiene la colección

- saber cuantos espacios disponibles hay en la colección

## Objetivos

Presentado el esquema guia de como deberia quedar su codigo para responder a las funcionalidades esperadas para la coleccion de vinilos, debera construir e implementar la logica de cada funcion presentada. **OJO**, como lo dice su nombre el esquema guia, sirve simplemente como orientacion de como deberia quedar su codigo, pueden cambiar la estructura y los nombres de las funciones por ejemplo, mientras se mantengan las buenas practicas y sea con motivos de optimizar la base propuesta por el esquema guia presentado por el profesor. 

## Esquema guia
![Ejemplo](https://user-images.githubusercontent.com/68707840/226139131-0cf90afb-1896-4e7b-b0ca-129aacc47e3f.png)

## Analisis de mi solución

**totalVinilos**: Le entregamos un Array de 2 dimensiones de tipo String a nuestra funcion, el cual representa la coleccion de vinilos, y procedemos a recorrer cada elemento de la coleccion, sabemos que cada vinilo contiene 3 datos, el nombre del artista, el nombre del album, y el año de lanzamiento, por lo cual podemos comparar si estos datos son distintos de null, para saber si existe un vinilo en esta posicion o no, en caso de ser distinto, incrementamos el contador, y al terminar el ciclo devolvemos este contador como representante de la cantidad de vinilos en nuestra coleccion.
```
    public static int totalVinilos(String[][] vinilos) {

        int contador = 0;

        for (int i = 0; i < vinilos.length; i++) {
            if(vinilos[i][0] != null){contador++;}
        }

        return contador;

    }
```

