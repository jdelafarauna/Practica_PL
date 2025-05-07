# Práctica de Procesadores de Lenguaje (Practica_PL)

## Descripción general

Este proyecto es una práctica académica centrada en la construcción de un compilador utilizando herramientas como ANTLR y Java. El objetivo principal es analizar y traducir un lenguaje de programación específico, abarcando desde el análisis léxico y sintáctico hasta la generación de código intermedio o final.

## Funcionamiento del programa

El flujo principal de ejecución del compilador es el siguiente:

1. **Análisis léxico**: Utilizando ANTLR, se define un lexer que tokeniza el código fuente de entrada.
2. **Análisis sintáctico**: Se emplea un parser generado por ANTLR que construye un árbol de sintaxis abstracta (AST) a partir de los tokens.
3. **Análisis semántico**: Se realizan comprobaciones semánticas sobre el AST, como la verificación de tipos y la resolución de identificadores.
4. **Generación de código**: A partir del AST validado, se genera código intermedio o final, dependiendo de los objetivos de la práctica.

## Casos de uso / Aplicaciones prácticas

- **Educación**: Sirve como material didáctico para cursos de compiladores o procesadores de lenguajes.
- **Desarrollo de compiladores**: Proporciona una base para desarrollar compiladores de lenguajes personalizados.
- **Análisis de lenguajes**: Facilita el estudio y análisis de las estructuras y semánticas de lenguajes de programación.

## Tecnologías y dependencias

- **Java**: Lenguaje principal de implementación.
- **ANTLR**: Herramienta para generar analizadores léxicos y sintácticos.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (opcional, pero recomendado).

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/jdelafarauna/Practica_PL.git
