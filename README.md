# ☕ Proyecto Java 1 - Ejercicios Fundamentales y POO

## 📁 Descripción del Proyecto

Colección completa de ejercicios prácticos en Java que abarca desde conceptos fundamentales hasta **Programación Orientada a Objetos (POO) completa**. Cada componente está diseñado para un aprendizaje progresivo y estructurado.

## 🎯 Nuevo: Sistema POO Completo

### 🌟 **aguasimple/** - Sistema de Agua con POO

- **Propósito**: Demostración completa de **TODOS** los conceptos de POO
- **Conceptos**: Herencia, polimorfismo, encapsulamiento, abstracción, y más
- **Nivel**: Intermedio-Avanzado
- 📖 [Ver documentación](README_AguaSimple.md)
- 📚 [**GUÍA COMPLETA DE POO**](GUIA_POO_COMPLETA.md) ⭐

## 📚 Contenido del Proyecto

### 1. 🔰 **ejercicio3/** - Fundamentos Básicos

- **Propósito**: Introducción a tipos de datos y Scanner
- **Conceptos**: Variables, entrada/salida, tipos primitivos
- **Nivel**: Principiante

### 2. 🏬 **Almacenwc.java** - Gestión de Inventario

- **Propósito**: Sistema completo de manejo de precios
- **Conceptos**: Cálculos porcentuales, variables múltiples
- **Nivel**: Intermedio
- 📖 [Ver documentación](README_Almacenwc.md)

### 3. 💧 **ConsumoAgua.java** - Aplicación Práctica

- **Propósito**: Calculadora de consumo y facturación (versión procedural)
- **Conceptos**: Entrada de datos, cálculos reales, formato
- **Nivel**: Intermedio
- 📖 [Ver documentación](README_ConsumoAgua.md)

### 4. 🎓 **POO/** - Documentación de POO

- **Propósito**: Material de estudio sobre conceptos de POO
- **Conceptos**: Teoría y ejemplos de Programación Orientada a Objetos
- **Nivel**: Intermedio

## 🛠️ Tecnologías y Herramientas

### Librerías Java Utilizadas

- **java.util.Scanner** - Entrada de datos por consola
- **java.text.DecimalFormat** - Formateo profesional de números

### Conceptos de Programación Cubiertos

#### **📝 Fundamentos Básicos:**

- ✅ Tipos de datos primitivos (int, double, char, boolean)
- ✅ Strings y manejo de texto
- ✅ Entrada y salida por consola
- ✅ Operaciones aritméticas básicas
- ✅ Cálculos porcentuales
- ✅ Formateo de números y moneda
- ✅ Manejo de recursos (Scanner.close())
- ✅ Comentarios y documentación del código

#### **🏗️ Programación Orientada a Objetos (POO):**

- ✅ **Clases y Objetos** - Moldes y instancias
- ✅ **Encapsulamiento** - Datos privados con getters/setters
- ✅ **Constructores, this, sobrecarga** - Inicialización de objetos
- ✅ **Herencia y super** - Reutilización de código
- ✅ **Polimorfismo** - Sobrescritura y interfaces
- ✅ **Abstracción** - Clases abstractas e interfaces
- ✅ **static y final** - Miembros de clase y constantes
- ✅ **Paquetes** - Organización del código
- ✅ **toString, equals, hashCode** - Métodos fundamentales
- ✅ **Composición vs Herencia** - Mejores prácticas de diseño

## 🚀 Instrucciones de Uso

### Prerequisitos

- Java JDK 8 o superior instalado
- Editor de texto o IDE (recomendado: VS Code, IntelliJ, Eclipse)
- Terminal o línea de comandos

### Compilación y Ejecución

```bash
# Para cada archivo .java, seguir estos pasos:

# 1. Compilar
javac [NombreArchivo].java

# 2. Ejecutar
java [NombreArchivo]

# Ejemplo con Main.java:
javac Main.java
java Main
```

### Estructura de Archivos

```
ProjectoJava1/
├── aguasimple/              # 🎓 Sistema POO completo
│   ├── Calculable.java      # Interface para cálculos
│   ├── TipoUsuario.java     # Enum con tarifas
│   ├── Persona.java         # Clase abstracta base
│   ├── Usuario.java         # Usuario (herencia)
│   ├── ConsumoMes.java      # Consumo mensual
│   └── SistemaAguaSimple.java # Programa principal
├── ejercicio3/              # 🔰 Ejercicios básicos
│   ├── Main.java           # Fundamentos
│   ├── OperacionesArimetricas.java
│   └── Persona.java
├── POO/                     # 📚 Documentación POO
│   └── README.md
├── Almacenwc.java          # 🏬 Sistema de inventario
├── ConsumoAgua.java        # 💧 Calculadora (procedural)
├── README.md               # Este archivo
├── README_AguaSimple.md    # Documentación del sistema POO
├── README_Almacenwc.md     # Documentación de inventario
├── README_ConsumoAgua.md   # Documentación de consumo
├── GUIA_POO_COMPLETA.md    # 📚 GUÍA COMPLETA DE POO ⭐
└── .gitignore              # Archivos a ignorar en Git
```

## 📈 Progresión de Aprendizaje Recomendada

### 🎯 **Ruta de Aprendizaje:**

1. **Paso 1**: Estudiar y ejecutar `ejercicio3/Main.java`

   - Entender tipos de datos básicos
   - Practicar entrada y salida de datos

2. **Paso 2**: Revisar `Almacenwc.java`

   - Profundizar en cálculos complejos
   - Entender estructura de programas más grandes

3. **Paso 3**: Implementar `ConsumoAgua.java`

   - Combinar todos los conceptos anteriores
   - Desarrollar aplicación práctica completa

4. **🌟 Paso 4**: **ESTUDIAR EL SISTEMA POO** (`aguasimple/`)
   - Leer la [**GUÍA COMPLETA DE POO**](GUIA_POO_COMPLETA.md)
   - Ejecutar y modificar el sistema
   - Entender TODOS los conceptos de POO en acción

### 📚 **Recursos de Estudio:**

- 📖 [**GUÍA POO COMPLETA**](GUIA_POO_COMPLETA.md) - **Explicación detallada de cada concepto**
- 📋 [Sistema Agua Simple](README_AguaSimple.md) - Documentación técnica
- 💻 Código fuente comentado en `aguasimple/`

## 🎯 Objetivos de Aprendizaje

### **Al completar los ejercicios básicos, deberías ser capaz de:**

- Crear programas básicos en Java
- Manejar diferentes tipos de datos
- Implementar entrada y salida de datos
- Realizar cálculos matemáticos y porcentuales
- Formatear salidas de manera profesional
- Estructurar código de manera clara y legible

### **🌟 Al completar el sistema POO, dominarás:**

- **Todos los pilares de POO**: Encapsulamiento, herencia, polimorfismo, abstracción
- **Diseño de software**: Cuándo usar composición vs herencia
- **Mejores prácticas**: static, final, paquetes, equals/hashCode
- **Desarrollo real**: Crear sistemas modulares y mantenibles

## 📖 Explicaciones de Código Incluidas

Cada README contiene explicaciones detalladas línea por línea del código Java:

### 🔍 **Qué encontrarás en cada explicación:**

- **Importaciones**: Por qué y cómo usar librerías
- **Estructura de clases**: Anatomía de una clase Java
- **Variables**: Declaración, tipos de datos y uso
- **Métodos**: Funcionamiento de Scanner, System.out, etc.
- **Operadores**: Aritméticos, de concatenación y asignación
- **Flujo del programa**: Cómo se ejecuta paso a paso
- **Buenas prácticas**: Manejo de recursos y comentarios
- **Problemas comunes**: Errores típicos y cómo evitarlos

### 💡 **Nivel de Detalle:**

- **Principiantes**: Explicación de cada concepto básico
- **Código comentado**: Análisis línea por línea
- **Ejemplos prácticos**: Casos de uso reales
- **Conceptos progresivos**: De básico a intermedio

### 🎓 **Ideal para:**

- Estudiantes que inician en Java
- Revisión de conceptos fundamentales
- Entender buenas prácticas de programación
- Preparación para proyectos más complejos

## 🤝 Contribuciones

Este proyecto es con fines educativos. Si encuentras mejoras o errores, siéntete libre de sugerir cambios.

## 📄 Licencia

Proyecto educativo de uso libre para aprendizaje de Java.

---

_Desarrollado como material de estudio para fundamentos de programación en Java_
