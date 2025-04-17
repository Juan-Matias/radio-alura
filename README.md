# Radio Alura - Proyecto de Gestión de Canciones y Podcasts

Este proyecto simula una plataforma para gestionar canciones y podcasts, permitiendo mostrar su información y agregar elementos a una lista de favoritos. El proyecto está desarrollado en Java y utiliza el patrón de diseño **Builder** para la creación de objetos complejos.

![Diagrama de Clases](https://github.com/Juan-Matias/radio-alura/blob/9d0948c4a88522ea7b6c44baaab10f6807117c94/diagramaDeClases.png)

## Características

- **Canción**: Permite almacenar información sobre canciones, como el título, cantante, álbum y género.
- **Podcast**: Permite almacenar información sobre podcasts, como el título, presentador y descripción.
- **Me gusta y Reproducciones**: Tanto canciones como podcasts tienen contadores de "me gusta" y reproducciones.
- **Clasificación**: Se calcula una clasificación en función de los "me gusta" y las reproducciones.
- **Favoritos**: Los usuarios pueden agregar canciones y podcasts a su lista de favoritos.

## Estructura del Proyecto

### Clases principales:

- **Audio**: Clase base para `Cancion` y `Podcast` con atributos y métodos comunes.
- **Cancion**: Representa una canción, extendiendo `Audio` y usando el patrón Builder para su creación.
- **Podcast**: Representa un podcast, también extendiendo `Audio` y utilizando el patrón Builder.
- **MisFavoritos**: Clase que maneja los elementos favoritos del usuario.
- **Principal**: Clase principal que simula el uso del sistema, mostrando cómo agregar canciones y podcasts, y agregarlos a favoritos.

### Flujo de trabajo:

1. **Crear objetos**:
   - Usa el patrón Builder para crear instancias de `Cancion` y `Podcast`.
   - Los atributos opcionales, como el álbum para canciones o la descripción para podcasts, se pueden establecer durante la construcción.
   
2. **Interacción con el objeto**:
   - Una vez creada la instancia, se pueden incrementar los contadores de "me gusta" y reproducciones utilizando los métodos correspondientes.

3. **Favoritos**:
   - Las canciones y podcasts pueden ser agregados a una lista de favoritos que los muestra en consola.

## Ejemplo de uso

```java
public class Principal {
    public static void main(String[] args) {
        // Crear la Canción usando el Builder
        Cancion miCancion = new Cancion.Builder("Forever", "Kiss")
                .album("Forever Hits")
                .genero("Rock")
                .build();

        // Incrementar "me gusta" y reproducciones
        aumentarMeGustaYReproducciones(miCancion, 100, 2000);

        // Crear el Podcast usando el Builder
        Podcast miPodcast = new Podcast.Builder("Cafe.Tech", "Gabriela Aguiar")
                .descripcion("Tecnología explicada de forma simple")
                .build();

        // Incrementar "me gusta" y reproducciones
        aumentarMeGustaYReproducciones(miPodcast, 100, 8000);

        // Resultados
        System.out.println("\n🎵 Información de la Canción:");
        System.out.println(miCancion);

        System.out.println("\n🎧 Información del Podcast:");
        System.out.println(miPodcast);

        // Favoritos
        System.out.println("\n💖 Favoritos:");
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);
    }
}
