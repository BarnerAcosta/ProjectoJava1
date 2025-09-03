# Sistema Simple de Agua - POO en Java

## Descripción

Sistema **SENCILLO** de gestión de agua basado en el proyecto `ConsumoAgua.java` original, que demuestra **TODOS** los conceptos de POO de manera simple y fácil de entender.

## ¿Qué hace el sistema?

- Gestiona usuarios de agua (casas, negocios, fábricas)
- Registra consumos mensuales
- Calcula costos automáticamente
- Genera reportes sencillos
- Permite ingresar información fácilmente

## Estructura Simple del Proyecto

```
aguasimple/
├── Calculable.java         # Interface simple
├── TipoUsuario.java        # Enum con tarifas
├── Persona.java            # Clase abstracta base
├── Usuario.java            # Usuario que hereda de Persona
├── ConsumoMes.java         # Consumo mensual
└── SistemaAguaSimple.java  # Programa principal
```

## ✅ Conceptos POO Incluidos

### 1. **Clases y Objetos**

- `Persona`, `Usuario`, `ConsumoMes` = Clases
- Cada usuario registrado = Objeto

### 2. **Encapsulamiento**

- Atributos `private` con getters/setters
- Validación en setters (nombre no vacío)
- Listas protegidas

### 3. **Constructores, this, Sobrecarga**

- `Usuario` tiene 2 constructores
- `this()` para llamar entre constructores
- Validación en constructores

### 4. **Herencia y super**

- `Usuario extends Persona`
- `super()` en constructores
- Métodos protegidos

### 5. **Polimorfismo**

- Interface `Calculable` implementada
- `toString()` sobrescrito
- Método abstracto `getTipo()`

### 6. **Abstracción**

- `Persona` es clase abstracta
- `Calculable` es interface
- Métodos default en interface

### 7. **static y final**

- Contador static de personas
- Atributos `final` inmutables
- Factory methods estáticos

### 8. **Paquetes**

- Todo en package `aguasimple`
- Organización simple

### 9. **toString, equals, hashCode**

- Sobrescritos en todas las clases
- Para usar en colecciones correctamente

### 10. **Composición vs Herencia**

- Usuario **TIENE** ConsumoMes (composición)
- Usuario **ES UNA** Persona (herencia)

## Funcionalidades del Menú

1. **Ver usuarios**: Lista todos los usuarios
2. **Agregar usuario**: Crea nuevo usuario con tipo de tarifa
3. **Registrar consumo**: Agrega consumo mensual
4. **Ver reporte**: Muestra detalle completo de un usuario
5. **Estadísticas**: Totales del sistema
6. **Demo POO**: Explica cada concepto implementado

## Cómo Usar

```bash
# Compilar
javac aguasimple\*.java

# Ejecutar
java aguasimple.SistemaAguaSimple
```

## Características Simples

- ✅ **Fácil de entender**: Código claro y comentado
- ✅ **Datos de ejemplo**: Incluye usuarios pre-cargados
- ✅ **Menú intuitivo**: Opciones numeradas simples
- ✅ **Validación básica**: Evita errores comunes
- ✅ **Conceptos integrados**: Todos los temas de POO funcionando

## Diferencias con el Sistema Complejo Anterior

| Aspecto           | Sistema Anterior | Sistema Simple |
| ----------------- | ---------------- | -------------- |
| Clases            | 10+ clases       | 6 clases       |
| Paquetes          | 3 paquetes       | 1 paquete      |
| Complejidad       | Alta             | Baja           |
| Funciones         | Muchas           | Esenciales     |
| Código            | Extenso          | Conciso        |
| **Conceptos POO** | ✅ Todos         | ✅ Todos       |

¡Este sistema es **MUCHO MÁS SIMPLE** pero demuestra **EXACTAMENTE LOS MISMOS** conceptos de POO!

## Ejemplo de Uso

```
=== MENÚ PRINCIPAL ===
1. Ver todos los usuarios      👥
2. Agregar nuevo usuario       ➕
3. Registrar consumo          📊
4. Ver reporte de usuario     📋
5. Ver estadísticas generales 📈
6. Demostrar conceptos POO    🎓
0. Salir                      🚪
```

**¡Perfecto para aprender POO de manera sencilla!** 🎯
