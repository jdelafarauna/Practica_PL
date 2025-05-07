```markdown
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

   git clone https://github.com/jdelafarauna/Practica_PL.git

2. **Importar el proyecto en IntelliJ IDEA**:
   - Abrir IntelliJ IDEA.
   - Seleccionar "Open" y navegar hasta la carpeta del proyecto clonado.
   - Asegurarse de que el SDK de Java esté configurado correctamente.

3. **Configurar ANTLR**:
   - Instalar el plugin de ANTLR v4 para IntelliJ IDEA.
   - Verificar que las herramientas de ANTLR estén disponibles en el entorno.

## Ejemplos de uso

Para compilar y ejecutar el proyecto:

1. **Generar los analizadores**:
   - Utilizar ANTLR para generar las clases del lexer y parser a partir de las gramáticas definidas.

2. **Compilar el proyecto**:
   - Usar las herramientas de compilación de IntelliJ IDEA o ejecutar:
     ```bash
     javac -d bin src/**/*.java
     ```

3. **Ejecutar el compilador**:
   - Ejecutar la clase principal que inicia el proceso de compilación:
     ```bash
     java -cp bin MainClass inputFile
     ```

   *Nota: Reemplazar `MainClass` por el nombre de la clase principal y `inputFile` por el archivo de código fuente a compilar.*

## Estructura del proyecto

```
Practica_PL/
├── .idea/                 # Configuración del proyecto para IntelliJ IDEA
├── gen/                   # Archivos generados por ANTLR
├── src/                   # Código fuente del compilador
│   ├── lexer/             # Definiciones del lexer
│   ├── parser/            # Definiciones del parser
│   ├── semantics/         # Análisis semántico
│   └── codegen/           # Generación de código
├── .gitignore             # Archivos y carpetas ignorados por Git
└── Practica.iml           # Archivo de configuración del proyecto
```

## Cómo contribuir

1. **Fork del repositorio**: Crear una copia del repositorio en tu cuenta de GitHub.
2. **Crear una rama**: Realizar los cambios en una nueva rama descriptiva.
3. **Realizar commits**: Hacer commits claros y concisos de los cambios realizados.
4. **Pull request**: Enviar un pull request al repositorio original para revisión.

## Licencia

Este proyecto no especifica una licencia. Se recomienda contactar al autor para obtener información sobre los términos de uso y distribución.
``` 
