# HeroesDB App

HeroesDB App es una aplicación Android que permite a los usuarios visualizar un listado de héroes de Marvel y DC. La aplicación está estructurada utilizando Clean Architecture y utiliza Dagger Hilt para la inyección de dependencias. Además, emplea Room para gestionar la persistencia de datos en una base de datos local.

## Arquitectura

La arquitectura de la aplicación sigue los principios de Clean Architecture, lo que proporciona una separación clara de responsabilidades y una estructura modular. Las capas principales incluyen:

- **Capa de Presentación:** Contiene las actividades, fragmentos y adaptadores de RecyclerView para la interfaz de usuario. Los ViewModels se utilizan para manejar la lógica de presentación y la interacción con la capa de dominio.

- **Capa de Dominio:** Contiene los casos de uso y las entidades del dominio. Los casos de uso definen las operaciones que la aplicación puede realizar y se comunican con la capa de datos a través de repositorios.

- **Capa de Datos:** Contiene los repositorios, DAOs y la implementación de Room para la persistencia de datos. Esta capa es responsable de recuperar y almacenar datos en la base de datos local.

## Dependencias

La aplicación utiliza las siguientes dependencias principales:

- Dagger Hilt: Para la inyección de dependencias.
- Room: Para la gestión de la base de datos local.
- Kotlin Coroutines: Para la programación asincrónica y el manejo de flujos de datos reactivos.


# Inicio de la Aplicación
Al iniciar la aplicación, se insertan datos de ejemplo en la base de datos desde una clase estática. Esto garantiza que la aplicación tenga datos para mostrar al usuario desde el principio.

# Interfaz de Usuario
La interfaz de usuario utiliza un RecyclerView para mostrar la lista de héroes. Cada elemento de la lista muestra el nombre del héroe y su imagen. Al hacer clic en un héroe, se muestra más información sobre él.
