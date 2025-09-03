# 🏬 Almacén WC - Sistema de Gestión de Inventario

## 📝 Descripción
Programa completo en Java que implementa un sistema de gestión de precios para el "Almacén WC". Maneja el inventario de 4 productos principales con cálculos automáticos de totales, promedios y aplicación de políticas de precios.

## 🎯 Objetivos del Sistema
- Mostrar catálogo actual de productos y precios
- Calcular métricas financieras (total, promedio)
- Aplicar políticas de ajuste de precios
- Generar reportes de precios finales

## 🛍️ Catálogo de Productos
```
=== ALMACEN WC ===
┌─────────────┬──────────────┐
│ Producto    │ Precio Base  │
├─────────────┼──────────────┤
│ Zapatos     │ $350,000     │
│ Tenis       │ $280,000     │
│ Camisetas   │ $175,000     │
│ Jeans       │ $200,000     │
└─────────────┴──────────────┘
```

## ⚙️ Políticas de Precios
- **Jeans**: Aumento del 6.2% (estrategia de revalorización)
- **Zapatos**: Descuento del 0.8% (promoción especial)
- **Tenis y Camisetas**: Precios estables

## 🔢 Cálculos Implementados
1. **Total inicial**: Suma de todos los precios
2. **Promedio inicial**: Total ÷ 4 productos
3. **Aplicación de porcentajes**:
   - Aumento: `precio = precio + (precio × 0.062)`
   - Descuento: `precio = precio - (precio × 0.008)`
4. **Nuevo total y promedio**: Recálculo tras ajustes

## 🚀 Instrucciones de Uso
```bash
# Compilación
javac Almacenwc.java

# Ejecución
java Almacenwc
```

## 📊 Resultados Esperados
```
Total inicial: $1,005,000
Promedio inicial: $251,250

Después de ajustes:
Total final: $1,014,600
Promedio final: $253,650
Incremento total: $9,600 (+0.95%)
```

## 🧠 Conceptos de Programación
- Variables tipo `double`
- Operaciones aritméticas básicas
- Formateo de salida con `System.out.println()`
- Cálculos porcentuales
- Estructura secuencial de programa

## 📁 Archivos Relacionados
- `Almacenwc.java` - Código fuente principal
- `AlmacenSimple.java` - Versión simplificada del mismo ejercicio

## 💻 Explicación Detallada del Código

### 📦 **Importación (aunque no se usa)**
```java
import java.util.Scanner;
```
- **Nota**: Este import está presente pero no se utiliza en el código actual
- Probablemente quedó de una versión anterior que incluía entrada de datos

### 🏗️ **Estructura de la Clase**
```java
public class Almacenwc {
    public static void main(String[] args) {
```
- **public class Almacenwc**: Define la clase principal
- **main**: Punto de entrada del programa

### 💰 **Inicialización de Precios**
```java
double zapatos = 350000;
double tenis = 280000;
double camisetas = 175000;
double jeans = 200000;
```
- **double**: Tipo de dato para números con decimales
- Cada variable representa el precio base de un producto

### 📊 **Presentación de Datos Iniciales**
```java
System.out.println("=== ALMACEN WC ===");
System.out.println("Zapatos: $" + zapatos);
```
- **System.out.println()**: Imprime texto con salto de línea al final
- **"$" + zapatos**: Concatena símbolo de pesos con el valor de la variable

### 🧮 **Cálculos Estadísticos Básicos**
```java
double total = zapatos + tenis + camisetas + jeans;
double promedio = total / 4;
```
- **total**: Suma aritmética de todos los precios
- **promedio**: División del total entre el número de productos (4)

### 📈 **Aplicación de Políticas de Precios**
```java
// Aumentar Jeans 6.2%
jeans = jeans + (jeans * 0.062);
```
**Explicación paso a paso:**
1. `jeans * 0.062` → Calcula el 6.2% del precio actual
2. `jeans + (resultado)` → Suma el porcentaje al precio original
3. `jeans = (nuevo valor)` → Asigna el nuevo precio a la variable

```java
// Disminuir Zapatos 0.8%
zapatos = zapatos - (zapatos * 0.008);
```
**Explicación paso a paso:**
1. `zapatos * 0.008` → Calcula el 0.8% del precio actual
2. `zapatos - (resultado)` → Resta el porcentaje al precio original
3. `zapatos = (nuevo valor)` → Asigna el nuevo precio

### 🔄 **Recálculo de Métricas**
```java
double nuevoTotal = zapatos + tenis + camisetas + jeans;
double nuevoPromedio = nuevoTotal / 4;
```
- Recalcula estadísticas después de los cambios de precios
- Permite comparar métricas antes y después de ajustes

### 📋 **Estructura de Salida Organizada**
```java
System.out.println();
System.out.println("=== PRECIOS FINALES ===");
```
- **System.out.println()** sin parámetros → Imprime línea vacía
- Uso de separadores visuales para organizar información

### 💡 **Conceptos Matemáticos Aplicados**
- **Porcentajes**: Conversión de % a decimal (6.2% = 0.062)
- **Aumentos**: `precio_nuevo = precio_original × (1 + porcentaje)`
- **Descuentos**: `precio_nuevo = precio_original × (1 - porcentaje)`

### 🔍 **Análisis del Flujo de Datos**
```
Precios Base → Cálculos Iniciales → Aplicar Políticas → Recalcular → Mostrar Resultados
    ↓              ↓                     ↓               ↓            ↓
  Variables     total/promedio        modificar       nuevo total   presentar
```

### 🎯 **Ventajas de Esta Implementación**
- **Claridad**: Cada paso está bien comentado
- **Trazabilidad**: Muestra valores antes y después de cambios
- **Escalabilidad**: Fácil agregar más productos o políticas
- **Mantenibilidad**: Código organizado en secciones lógicas

### 📚 **Conceptos Java Demostrados**
- **Variables**: Declaración y reasignación
- **Tipos de datos**: `double` para precisión decimal
- **Operadores aritméticos**: `+`, `-`, `*`, `/`
- **Concatenación de strings**: Operador `+`
- **Estructura secuencial**: Ejecución línea por línea
- **Comentarios**: Documentación del código

---
*Desarrollado como ejercicio práctico de Java - Gestión de inventarios*
