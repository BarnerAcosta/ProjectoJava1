# 💧 Calculadora de Consumo de Agua

## 📝 Descripción
Aplicación de consola en Java que calcula el consumo mensual de agua de un hogar y su costo estimado. Permite ingresar lecturas del medidor y calcula automáticamente el consumo y facturación.

## 🎯 Caso de Uso
**Problema**: Calcular el consumo mensual de agua en un hogar
**Solución**: Aplicación que procesa lecturas del medidor y calcula costos

## ⚡ Funcionalidades Principales
1. **Captura de datos del usuario**:
   - Nombre del usuario o vivienda
   - Lectura inicial del medidor (litros)
   - Lectura final del medidor (litros)

2. **Cálculos automáticos**:
   - Consumo total en litros
   - Costo total basado en tarifa

3. **Generación de reportes**:
   - Resumen del consumo
   - Detalles del cálculo

## 💰 Configuración de Tarifas
- **Tarifa por litro**: $0.15
- **Moneda**: Pesos colombianos
- **Período**: Mensual

## 🛠️ Tecnologías Implementadas
- **Scanner**: Entrada de datos por consola
- **DecimalFormat**: Formato profesional de números
- **String**: Manejo de texto para nombres
- **double**: Precisión decimal para cálculos

## 📋 Requisitos Funcionales
✅ Capturar nombre del usuario o vivienda  
✅ Capturar lectura inicial y final del medidor  
✅ Calcular consumo total en litros  
✅ Calcular costo total con tarifa fija  
✅ Mostrar resumen del consumo y costo  

## 🚀 Instrucciones de Ejecución
```bash
# Compilar el programa
javac ConsumoAgua.java

# Ejecutar la aplicación
java ConsumoAgua
```

## 📊 Ejemplo de Ejecución
```
=== CALCULADORA DE CONSUMO DE AGUA ===

Ingrese el nombre del usuario o vivienda: Familia Rodríguez
Ingrese la lectura inicial del mes (en litros): 12850
Ingrese la lectura final del mes (en litros): 14025

--- Resumen del consumo ---
Usuario: Familia Rodríguez
Consumo: 1,175 litros
Costo total: $176.25

Detalles del cálculo:
Lectura inicial: 12,850 litros
Lectura final: 14,025 litros
Tarifa por litro: $0.15
```

## 🧮 Fórmulas Utilizadas
- **Consumo Total**: `Lectura Final - Lectura Inicial`
- **Costo Total**: `Consumo Total × Tarifa por Litro`

## 📚 Conceptos de Java Practicados
- Entrada de datos con Scanner
- Declaración de variables (String, double)
- Operaciones aritméticas básicas
- Formateo de números con DecimalFormat
- Estructuras de salida con System.out
- Manejo de recursos (sc.close())

## 🔧 Posibles Mejoras
- Validación de datos de entrada
- Tarifas escalonadas por consumo
- Histórico de consumos
- Comparación con meses anteriores

## 💻 Explicación Detallada del Código

### 📦 **Importación de Librerías**
```java
import java.util.Scanner;
import java.text.DecimalFormat;
```
- **Scanner**: Necesaria para capturar datos del usuario por consola
- **DecimalFormat**: Para formatear números con separadores de miles y decimales

### 🏗️ **Estructura de la Clase**
```java
public class ConsumoAgua {
    public static void main(String[] args) {
```
- **public class ConsumoAgua**: Define la clase principal del programa
- **public static void main**: Método principal donde se ejecuta el programa

### ⚙️ **Configuración Inicial**
```java
Scanner sc = new Scanner(System.in);
DecimalFormat formato = new DecimalFormat("###,###.##");
double tarifaPorLitro = 0.15;
```
- **Scanner sc**: Crea objeto para leer datos del teclado
- **DecimalFormat formato**: Configura formato con separadores de miles y 2 decimales
- **double tarifaPorLitro**: Define precio por litro como constante

### 📝 **Captura de Datos del Usuario**
```java
System.out.print("Ingrese el nombre del usuario o vivienda: ");
String nombre = sc.nextLine();
```
- **System.out.print()**: Muestra mensaje sin salto de línea
- **sc.nextLine()**: Lee línea completa de texto (permite espacios)
- **String nombre**: Variable que almacena el nombre capturado

```java
System.out.print("Ingrese la lectura inicial del mes (en litros): ");
double lecturaInicial = sc.nextDouble();
```
- **sc.nextDouble()**: Lee número decimal del teclado
- **double lecturaInicial**: Variable para almacenar lectura del medidor

### 🧮 **Cálculos Principales**
```java
double consumoTotal = lecturaFinal - lecturaInicial;
double costoTotal = consumoTotal * tarifaPorLitro;
```
- **Línea 1**: Calcula litros consumidos restando lecturas
- **Línea 2**: Multiplica consumo por tarifa para obtener costo

### 📊 **Mostrar Resultados**
```java
System.out.println("Usuario: " + nombre);
System.out.println("Consumo: " + formato.format(consumoTotal) + " litros");
System.out.println("Costo total: $" + formato.format(costoTotal));
```
- **+**: Operador de concatenación para unir texto y variables
- **formato.format()**: Aplica formato profesional a números
- **System.out.println()**: Muestra texto con salto de línea

### 🧹 **Limpieza de Recursos**
```java
sc.close();
```
- **sc.close()**: Cierra el Scanner para liberar memoria y evitar warnings

### 🔄 **Flujo del Programa**
1. **Inicialización**: Se crean objetos Scanner y DecimalFormat
2. **Entrada**: Se capturan datos del usuario (nombre, lecturas)
3. **Procesamiento**: Se calculan consumo y costo
4. **Salida**: Se muestran resultados formateados
5. **Finalización**: Se libera memoria del Scanner

### 💡 **Conceptos Java Aplicados**
- **Variables**: `String nombre`, `double lecturaInicial`, etc.
- **Métodos**: `sc.nextLine()`, `sc.nextDouble()`, `formato.format()`
- **Operadores**: `+` (suma y concatenación), `-` (resta), `*` (multiplicación)
- **Objetos**: `Scanner sc`, `DecimalFormat formato`
- **Tipos de datos**: `String` para texto, `double` para números decimales

---
*Ejercicio desarrollado para práctica de entrada de datos y cálculos en Java*
