# 🏧 Cajero Automático en Kotlin

## 📌 Descripción

Este proyecto consiste en una aplicación de consola desarrollada en **Kotlin** que simula el funcionamiento básico de un cajero automático.

El programa permite consultar el saldo disponible, ingresar dinero y realizar retiradas, comprobando que las operaciones sean válidas.

## 🎯 Objetivos

- Practicar la programación en Kotlin.
- Utilizar variables y funciones.
- Trabajar con estructuras condicionales (`if`, `else` y `when`).
- Implementar bucles mediante `do...while`.
- Validar los datos introducidos por el usuario.
- Organizar el código utilizando diferentes clases.

## ⚙️ Funcionalidades

El cajero dispone de cuatro opciones:

1. **Consultar saldo:** muestra el dinero disponible.
2. **Ingresar dinero:** permite añadir una cantidad positiva al saldo.
3. **Retirar dinero:** permite retirar dinero siempre que haya saldo suficiente.
4. **Salir:** finaliza la ejecución del programa.

El saldo inicial es de **500 €**.

## 📂 Estructura del proyecto

El proyecto está organizado en tres archivos principales:

```text
UD01_Actividad05_CajeroAutomatico/
│
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt
            ├── Cajero.kt
            └── Funciones.kt
```

**Main.kt:** contiene la función principal y controla las opciones seleccionadas por el usuario.

**Cajero.kt:** contiene las funciones para consultar el saldo, ingresar y retirar dinero.

**Funciones.kt:** contiene la función encargada de mostrar el menú principal.

## 💻 Tecnologías utilizadas

- Kotlin
- IntelliJ IDEA
- Maven
- Git y GitHub

## ▶️ Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Localizar el archivo `Main.kt`.
3. Ejecutar la función `main()`.
4. Seleccionar una opción del menú.
5. Seguir las instrucciones que aparecen en la consola.

## 🛡️ Validaciones

El programa controla
