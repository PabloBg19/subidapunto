# 📱 Cunning --- Aplicación Multiplataforma de Gestión de Información

![Java](https://img.shields.io/badge/Java-17-blue)
![Android](https://img.shields.io/badge/Android-Studio-green)
![JavaFX](https://img.shields.io/badge/JavaFX-GUI-orange)
![Swing](https://img.shields.io/badge/Swing-GUI-lightgrey)
![JUnit](https://img.shields.io/badge/Tests-JUnit-red)

## 📚 Proyecto académico

**Módulo:** Desarrollo de Interfaces\
**Curso:** 2º DAM\
**Tipo:** Actividad voluntaria de subida de nota (+1 punto)

**Autores** - Pablo - Agustín - Adán

------------------------------------------------------------------------

# 📖 Descripción del proyecto

Este proyecto consiste en el **desarrollo de una misma aplicación
gráfica completa implementada en tres tecnologías distintas de
interfaces**:

-   Java Swing
-   JavaFX
-   Android

El objetivo es **comparar enfoques reales de desarrollo de interfaces
gráficas**, aplicando criterios profesionales de:

-   Diseño GUI
-   Arquitectura de software
-   Experiencia de usuario
-   Pruebas unitarias
-   Distribución de aplicaciones

La lógica funcional es común para las tres versiones, pero cada una
respeta **las convenciones propias de su tecnología**.

------------------------------------------------------------------------

# ⚙️ Funcionalidades principales

La aplicación permite gestionar un conjunto de elementos informativos.

Funciones implementadas:

-   Visualización de un listado de **mínimo 15 elementos**
-   Vista de **detalle completo**
-   **Alta, baja y modificación** de elementos
-   **Validaciones de datos**
-   **Búsqueda por texto**
-   **Filtrado por categoría**
-   **Persistencia local mediante fichero**
-   **Mensajes de error y confirmación claros**

------------------------------------------------------------------------

# 🖥️ Pantallas de la aplicación

Cada versión incluye:

-   🏠 Pantalla principal
-   🔎 Vista de detalle
-   ✏️ Pantalla de edición / alta
-   ⚠️ Diálogos de confirmación
-   ❓ Sistema de ayuda integrado

------------------------------------------------------------------------

# 🎨 Requisitos de diseño GUI aplicados

El diseño sigue las buenas prácticas estudiadas en el **Manual de Diseño
de Interfaces**:

-   Principios de usabilidad
-   Coherencia visual entre pantallas
-   Jerarquía visual clara
-   Uso adecuado de color y tipografía
-   Espaciado y alineación consistentes
-   Retroalimentación visual ante acciones del usuario

------------------------------------------------------------------------

# 🧩 Implementación por tecnología

## Java Swing

Características principales:

-   Uso de `JFrame`, `JPanel` y `JDialog`
-   Layout managers (sin posicionamiento absoluto)
-   Separación entre lógica y vista
-   Gestión de eventos mediante listeners
-   Sistema de ayuda accesible desde menú

------------------------------------------------------------------------

## JavaFX

Implementación moderna con:

-   FXML para definición de interfaces
-   Controladores separados
-   Estilos mediante **CSS**
-   Navegación entre escenas
-   Sistema de ayuda contextual

------------------------------------------------------------------------

## Android

Aplicación móvil desarrollada con:

-   Activities / Fragments
-   Layouts definidos en **XML**
-   Uso correcto de recursos (strings, colores, estilos)
-   Adaptación básica a distintos tamaños de pantalla
-   Sistema de ayuda integrado

------------------------------------------------------------------------

# 🧪 Pruebas unitarias

Para asegurar la calidad del software se han implementado:

-   **15+ pruebas unitarias**
-   Framework **JUnit**

Las pruebas validan:

-   Validaciones de datos
-   Búsquedas
-   Filtrado por categoría
-   Carga y guardado de datos
-   Lógica de negocio

La lógica crítica está separada de la interfaz para permitir su testeo.

------------------------------------------------------------------------

# ❓ Sistema de ayuda (HelpDoc)

Cada versión incluye un sistema de ayuda accesible desde:

-   Menú principal
-   Botones contextuales

Contenido:

-   Descripción general
-   Guía rápida de uso
-   Gestión de registros
-   Uso de búsqueda y filtros
-   Resolución de errores comunes

------------------------------------------------------------------------

# 🧱 Arquitectura del proyecto

Todos los proyectos siguen una estructura similar:

    src/
     ├── model
     ├── view
     ├── controller
     ├── util
     └── test

Separando:

-   Lógica de negocio
-   Interfaz gráfica
-   Persistencia de datos
-   Utilidades

------------------------------------------------------------------------

# 📦 Distribución

Cada versión incluye:

-   Ejecutable o paquete instalable
-   Launcher para iniciar la aplicación
-   Evidencias de ejecución correcta

Versiones incluidas:

-   📱 Android APK
-   💻 JavaFX ejecutable
-   💻 Java Swing ejecutable

------------------------------------------------------------------------

# 📑 Documentación entregada

El proyecto incluye:

### Manual de usuario

-   Descripción funcional
-   Capturas de pantalla
-   Flujo de navegación
-   Experiencia de usuario

### Documentación técnica

-   Estructura del proyecto
-   Decisiones de diseño GUI
-   Comparativa Swing vs JavaFX vs Android
-   Pruebas unitarias
-   Sistema de ayuda

------------------------------------------------------------------------

# 🏫 Defensa del proyecto

Durante la defensa se demuestra:

-   Funcionamiento de las **tres versiones**
-   Coherencia funcional
-   Diseño GUI aplicado
-   Estructura del código
-   Sistema de ayuda
-   Ejecución de pruebas unitarias

------------------------------------------------------------------------

# 📜 Licencia

Proyecto desarrollado con fines **educativos y académicos**.
