# 📚 Guía Completa de Programación Orientada a Objetos (POO) en Java

## 🎯 Proyecto: Sistema Simple de Agua

Este proyecto demuestra **TODOS** los conceptos fundamentales de POO en Java de manera práctica y sencilla, usando un sistema de gestión de consumo de agua.

---

## 📖 Tabla de Contenidos

1. [¿Qué es la POO?](#qué-es-la-poo)
2. [1. Clases y Objetos](#1-clases-y-objetos)
3. [2. Encapsulamiento](#2-encapsulamiento)
4. [3. Constructores, this y Sobrecarga](#3-constructores-this-y-sobrecarga)
5. [4. Herencia y super](#4-herencia-y-super)
6. [5. Polimorfismo](#5-polimorfismo)
7. [6. Abstracción](#6-abstracción)
8. [7. static y final](#7-static-y-final)
9. [8. Paquetes y Organización](#8-paquetes-y-organización)
10. [9. toString, equals y hashCode](#9-tostring-equals-y-hashcode)
11. [10. Composición vs Herencia](#10-composición-vs-herencia)

---

## ¿Qué es la POO?

**Programación Orientada a Objetos (POO)** es un paradigma de programación que organiza el código en **clases** y **objetos**, imitando cómo pensamos sobre el mundo real.

### 🌟 Beneficios principales:

- **Reutilización**: Código que se puede usar múltiples veces
- **Mantenibilidad**: Fácil de modificar y actualizar
- **Escalabilidad**: Fácil de expandir con nuevas funcionalidades
- **Organización**: Código estructurado y fácil de entender

---

## 1. Clases y Objetos

### 🧠 **¿Qué es?**

- **Clase**: Es como un "molde" o "plano" que define cómo debe ser algo
- **Objeto**: Es una "instancia" específica creada a partir de una clase

### 🏠 **Analogía del mundo real:**

- **Clase**: Plano de una casa
- **Objeto**: Una casa real construida con ese plano

### 💻 **En nuestro proyecto:**

```java
// CLASE - Define cómo debe ser un Usuario
public class Usuario extends Persona {
    private String nombre;
    private TipoUsuario tipo;
    // ... métodos
}

// OBJETOS - Instancias específicas de Usuario
Usuario juan = new Usuario("Juan Pérez", "Calle 123");     // ← Objeto 1
Usuario maria = new Usuario("María García", "Avenida 45"); // ← Objeto 2
```

### ✅ **¿Cómo funciona?**

1. **Defines una clase** con atributos y métodos
2. **Creas objetos** usando `new`
3. **Cada objeto** tiene sus propios valores únicos

---

## 2. Encapsulamiento

### 🧠 **¿Qué es?**

**Encapsulamiento** significa "ocultar" los detalles internos de una clase y controlar el acceso a ellos.

### 🔒 **Principio fundamental:**

> "Los datos privados solo pueden ser accedidos a través de métodos públicos controlados"

### 💻 **En nuestro proyecto:**

```java
public class Persona {
    // PRIVADO - Solo la clase puede acceder directamente
    private String nombre;
    private String direccion;

    // PÚBLICO - Cualquiera puede usar estos métodos
    public String getNombre() {
        return nombre;
    }

    // VALIDACIÓN - Control de lo que se puede asignar
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }
}
```

### 🛡️ **Modificadores de acceso:**

| Modificador | Acceso desde                     |
| ----------- | -------------------------------- |
| `private`   | Solo la misma clase              |
| `protected` | Clase, subclases y mismo paquete |
| `public`    | Desde cualquier lugar            |
| _(default)_ | Solo el mismo paquete            |

### ✅ **Beneficios:**

- **Seguridad**: Los datos no pueden ser modificados incorrectamente
- **Validación**: Puedes verificar que los valores sean correctos
- **Flexibilidad**: Puedes cambiar la implementación sin afectar otros códigos

---

## 3. Constructores, this y Sobrecarga

### 🧠 **¿Qué son los Constructores?**

**Constructores** son métodos especiales que se ejecutan cuando creas un objeto. Su trabajo es "inicializar" el objeto.

### 💻 **En nuestro proyecto:**

```java
public class Usuario extends Persona {

    // CONSTRUCTOR PRINCIPAL
    public Usuario(String nombre, String direccion, TipoUsuario tipo) {
        super(nombre, direccion); // ← Llamar constructor del padre
        this.tipo = tipo;         // ← "this" se refiere al objeto actual
        this.activo = true;
        this.consumos = new ArrayList<>();
    }

    // CONSTRUCTOR SOBRECARGADO (más simple)
    public Usuario(String nombre, String direccion) {
        this(nombre, direccion, TipoUsuario.CASA); // ← Llamar otro constructor
    }
}
```

### 🔄 **Sobrecarga de Constructores:**

**Sobrecarga** = Tener múltiples constructores con diferentes parámetros

```java
// Diferentes formas de crear usuarios:
Usuario usuario1 = new Usuario("Ana", "Calle 1");                    // Constructor simple
Usuario usuario2 = new Usuario("Luis", "Calle 2", TipoUsuario.NEGOCIO); // Constructor completo
```

### 🎯 **Palabra clave `this`:**

- `this.nombre` = "Este objeto, su atributo nombre"
- `this(...)` = "Llamar otro constructor de esta misma clase"

### ✅ **Beneficios:**

- **Flexibilidad**: Múltiples formas de crear objetos
- **Conveniencia**: Constructores simples para casos comunes
- **Reutilización**: Un constructor puede usar otro

---

## 4. Herencia y super

### 🧠 **¿Qué es la Herencia?**

**Herencia** permite que una clase "herede" características de otra clase, como los hijos heredan características de sus padres.

### 👨‍👩‍👧‍👦 **Analogía familiar:**

- **Padre**: `Persona` (tiene nombre, dirección, ID)
- **Hijo**: `Usuario` (hereda todo de Persona + tiene tipo de tarifa, consumos)

### 💻 **En nuestro proyecto:**

```java
// CLASE PADRE (Superclase)
public abstract class Persona {
    private String nombre;      // ← Usuario heredará esto
    private String direccion;   // ← Usuario heredará esto
    private final int id;       // ← Usuario heredará esto

    protected Persona(String nombre, String direccion) {
        // Lógica de inicialización común
    }

    public abstract String getTipo(); // ← Usuario DEBE implementar esto
}

// CLASE HIJA (Subclase)
public class Usuario extends Persona { // ← "extends" significa herencia
    private TipoUsuario tipo;          // ← Nuevo atributo específico

    public Usuario(String nombre, String direccion) {
        super(nombre, direccion); // ← "super" llama al constructor del padre
    }

    @Override
    public String getTipo() { // ← Implementa método abstracto del padre
        return "Usuario";
    }
}
```

### 🔗 **Palabra clave `super`:**

- `super(...)` = "Llamar constructor del padre"
- `super.metodo()` = "Llamar método del padre"

### ✅ **Beneficios:**

- **Reutilización**: No repites código común
- **Organización**: Jerarquía lógica de clases
- **Extensibilidad**: Fácil agregar nuevos tipos

---

## 5. Polimorfismo

### 🧠 **¿Qué es el Polimorfismo?**

**Polimorfismo** significa "muchas formas". Un mismo método puede comportarse de manera diferente según el objeto que lo use.

### 🎭 **Analogía de actores:**

Diferentes actores pueden interpretar el mismo personaje de maneras distintas.

### 💻 **En nuestro proyecto:**

#### **5.1 Sobrescritura de métodos (@Override):**

```java
// CLASE PADRE
public abstract class Persona {
    @Override
    public String toString() {
        return String.format("Persona{id=%d, nombre='%s'}", id, nombre);
    }
}

// CLASE HIJA - Misma "función" pero comportamiento diferente
public class Usuario extends Persona {
    @Override  // ← Sobrescribe el método del padre
    public String toString() {
        return String.format("Usuario{id=%d, nombre='%s', tipo=%s}",
                getId(), getNombre(), tipo.getDescripcion());
    }
}
```

#### **5.2 Interfaces (Contratos):**

```java
// INTERFACE - Define QUÉ debe hacer
public interface Calculable {
    double calcularCosto();                    // ← Método obligatorio

    default String mostrarCosto() {            // ← Método con implementación default
        return String.format("Costo: $%.2f", calcularCosto());
    }
}

// IMPLEMENTACIÓN - Define CÓMO lo hace
public class ConsumoMes implements Calculable {
    @Override
    public double calcularCosto() {
        return tipoUsuario.calcular(litros);   // ← Su propia manera de calcularlo
    }
}
```

#### **5.3 Despacho Dinámico:**

```java
// El MISMO código funciona con diferentes tipos de objetos
List<Calculable> elementos = new ArrayList<>();
elementos.add(new ConsumoMes("Enero", 100, 200, TipoUsuario.CASA));
elementos.add(new ConsumoMes("Febrero", 200, 350, TipoUsuario.NEGOCIO));

// Polimorfismo en acción - cada objeto usa SU versión de calcularCosto()
for (Calculable elemento : elementos) {
    System.out.println(elemento.mostrarCosto()); // ← Comportamiento dinámico
}
```

### ✅ **Beneficios:**

- **Flexibilidad**: El mismo código funciona con diferentes objetos
- **Extensibilidad**: Puedes agregar nuevos tipos sin cambiar código existente
- **Mantenibilidad**: Cambios locales no afectan el resto del sistema

---

## 6. Abstracción

### 🧠 **¿Qué es la Abstracción?**

**Abstracción** significa enfocarse en lo esencial y ocultar los detalles complicados.

### 🚗 **Analogía del automóvil:**

Cuando manejas, solo usas volante, pedales, palanca. No necesitas saber cómo funciona el motor internamente.

### 💻 **En nuestro proyecto:**

#### **6.1 Clases Abstractas:**

```java
// CLASE ABSTRACTA - NO puedes crear objetos directamente de ella
public abstract class Persona {
    private String nombre;     // ← Implementación concreta

    // MÉTODO ABSTRACTO - Las subclases DEBEN implementarlo
    public abstract String getTipo();

    // MÉTODO CONCRETO - Implementación compartida
    public String getNombre() {
        return nombre;
    }
}

// NO PUEDES HACER ESTO:
// Persona p = new Persona(); // ← ERROR: Persona es abstracta

// PERO SÍ PUEDES:
Usuario u = new Usuario("Juan", "Calle 123"); // ← OK: Usuario implementa todo
```

#### **6.2 Interfaces:**

```java
// INTERFACE - Define un "contrato"
public interface Calculable {
    // MÉTODO ABSTRACTO - OBLIGATORIO implementar
    double calcularCosto();

    // MÉTODO DEFAULT - Implementación opcional (Java 8+)
    default String mostrarCosto() {
        return String.format("Costo: $%.2f", calcularCosto());
    }
}
```

### ✅ **Diferencias clave:**

| Concepto              | Clases Abstractas | Interfaces         |
| --------------------- | ----------------- | ------------------ |
| **Métodos concretos** | ✅ Sí             | ✅ Sí (default)    |
| **Atributos**         | ✅ Sí             | ❌ Solo constantes |
| **Herencia múltiple** | ❌ Solo una       | ✅ Múltiples       |
| **Constructor**       | ✅ Sí             | ❌ No              |

### ✅ **Beneficios:**

- **Simplicidad**: Ocultas complejidad innecesaria
- **Consistencia**: Garantizas que ciertas funciones estén implementadas
- **Flexibilidad**: Defines "contratos" sin implementación específica

---

## 7. static y final

### 🧠 **¿Qué significan `static` y `final`?**

### 📊 **`static` = "Pertenece a la CLASE, no a objetos individuales"**

```java
public abstract class Persona {
    private static int totalPersonas = 0;  // ← UNA variable para TODA la clase

    protected Persona(String nombre, String direccion) {
        totalPersonas++;  // ← Se incrementa para cada objeto creado
    }

    public static int getTotalPersonas() { // ← Método static
        return totalPersonas;
    }
}

// USO:
Usuario u1 = new Usuario("Ana", "Calle 1");
Usuario u2 = new Usuario("Luis", "Calle 2");

// Acceso SIN crear objetos:
System.out.println(Persona.getTotalPersonas()); // ← Resultado: 2
```

### 🔒 **`final` = "No puede cambiar"**

```java
public class ConsumoMes {
    private final String mes;          // ← No puede cambiar después del constructor
    private final double litros;       // ← Inmutable

    public static final String VERSION = "1.0"; // ← Constante de clase

    public ConsumoMes(String mes, double litros) {
        this.mes = mes;      // ← ÚNICA vez que se puede asignar
        this.litros = litros;
        // mes = "Otro valor"; // ← ERROR: ya no se puede cambiar
    }
}
```

#### **Tipos de `final`:**

| Tipo         | Ejemplo                      | Significado                     |
| ------------ | ---------------------------- | ------------------------------- |
| **Variable** | `final int x = 5;`           | Variable no puede cambiar       |
| **Método**   | `public final void metodo()` | Método no puede ser sobrescrito |
| **Clase**    | `public final class Util`    | Clase no puede ser heredada     |

### 🏭 **Factory Methods (Métodos estáticos de creación):**

```java
public class ConsumoMes {
    // Constructor normal
    public ConsumoMes(String mes, int año, double anterior, double actual, TipoUsuario tipo) {
        // ... lógica compleja
    }

    // FACTORY METHOD - Forma más simple de crear objetos
    public static ConsumoMes crear(String mes, double anterior, double actual, TipoUsuario tipo) {
        return new ConsumoMes(mes, 2025, anterior, actual, tipo); // ← Año por defecto
    }
}

// USO - Más fácil y claro:
ConsumoMes consumo = ConsumoMes.crear("Enero", 100, 250, TipoUsuario.CASA);
```

### ✅ **Beneficios:**

- **`static`**: Datos compartidos, utilidades sin objetos
- **`final`**: Inmutabilidad, constantes, prevenir cambios accidentales
- **Factory methods**: Creación de objetos más conveniente

---

## 8. Paquetes y Organización

### 🧠 **¿Qué son los Paquetes?**

**Paquetes** son como "carpetas" que organizan las clases relacionadas.

### 📁 **Estructura de nuestro proyecto:**

```
aguasimple/                    ← Paquete principal
├── Calculable.java           ← Interface para cálculos
├── TipoUsuario.java          ← Enum de tipos de tarifa
├── Persona.java              ← Clase abstracta base
├── Usuario.java              ← Usuario del sistema
├── ConsumoMes.java           ← Consumo mensual
└── SistemaAguaSimple.java    ← Programa principal
```

### 💻 **Declaración de paquetes:**

```java
package aguasimple;  // ← Todas las clases pertenecen a este paquete

public class Usuario {
    // ... código
}
```

### 🔍 **Niveles de visibilidad:**

```java
public class Persona {
    private String nombre;              // ← Solo esta clase
    protected static final String PREFIJO_ID = "P-"; // ← Esta clase + subclases + paquete
    String telefono;                    // ← Package-private (solo el paquete)
    public int getId() { return id; }   // ← Desde cualquier lugar
}
```

| Modificador | Misma Clase | Mismo Paquete | Subclase | Cualquier lugar |
| ----------- | ----------- | ------------- | -------- | --------------- |
| `private`   | ✅          | ❌            | ❌       | ❌              |
| _(default)_ | ✅          | ✅            | ❌       | ❌              |
| `protected` | ✅          | ✅            | ✅       | ❌              |
| `public`    | ✅          | ✅            | ✅       | ✅              |

### ✅ **Beneficios:**

- **Organización**: Código agrupado lógicamente
- **Encapsulamiento**: Control de acceso entre módulos
- **Evitar conflictos**: Dos clases pueden tener el mismo nombre en paquetes diferentes

---

## 9. toString, equals y hashCode

### 🧠 **¿Por qué son importantes estos métodos?**

Estos métodos vienen de la clase `Object` (padre de todas las clases en Java) y definen cómo se comportan los objetos en operaciones básicas.

### 📝 **9.1 toString() - "Representación legible"**

```java
// SIN sobrescribir toString()
Usuario usuario = new Usuario("Ana", "Calle 123");
System.out.println(usuario); // ← Imprime: aguasimple.Usuario@1a2b3c4d (feo!)

// CON toString() sobrescrito
@Override
public String toString() {
    return String.format("Usuario{id=P-%d, nombre='%s', tipo=%s}",
        getId(), getNombre(), tipo.getDescripcion());
}

System.out.println(usuario); // ← Imprime: Usuario{id=P-1, nombre='Ana', tipo=Residencial} (¡útil!)
```

### ⚖️ **9.2 equals() - "Comparación lógica"**

```java
// SIN sobrescribir equals()
Usuario u1 = new Usuario("Juan", "Calle 1");
Usuario u2 = new Usuario("Juan", "Calle 1");
System.out.println(u1 == u2);     // ← false (diferentes objetos en memoria)
System.out.println(u1.equals(u2)); // ← false (compara referencias, no contenido)

// CON equals() sobrescrito
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Persona persona = (Persona) obj;
    return id == persona.id; // ← Compara por ID
}

System.out.println(u1.equals(u2)); // ← true si tienen el mismo ID
```

### #️⃣ **9.3 hashCode() - "Para colecciones HashMap/HashSet"**

```java
@Override
public int hashCode() {
    return Integer.hashCode(id); // ← Debe ser consistente con equals()
}

// IMPORTANTE: Si equals() es true, hashCode() debe ser igual
// Si dos objetos son "equals", deben tener el mismo hashCode
```

### 📚 **¿Por qué importan en colecciones?**

```java
Set<Usuario> usuarios = new HashSet<>();
Usuario u1 = new Usuario("Ana", "Calle 1");
Usuario u2 = new Usuario("Ana", "Calle 1"); // ← Mismo contenido

usuarios.add(u1);
usuarios.add(u2);

// SIN equals/hashCode sobrescritos: 2 elementos (duplicados!)
// CON equals/hashCode sobrescritos: 1 elemento (como debe ser!)
System.out.println(usuarios.size()); // ← 1 (correcto)
```

### ✅ **Reglas importantes:**

1. Si sobrescribes `equals()`, DEBES sobrescribir `hashCode()`
2. Si dos objetos son `equals()`, deben tener el mismo `hashCode()`
3. Si dos objetos tienen el mismo `hashCode()`, NO necesariamente son `equals()`

---

## 10. Composición vs Herencia

### 🧠 **¿Cuál es la diferencia?**

### 👨‍👩‍👧‍👦 **HERENCIA = "ES UN/UNA"**

Un objeto "ES UN" tipo de otro objeto.

```java
public class Usuario extends Persona {
    // Usuario ES UNA Persona
    // Usuario hereda todo de Persona: nombre, dirección, ID, métodos...
}

Usuario juan = new Usuario("Juan", "Calle 123");
// juan ES UNA Persona ✅
// juan TIENE todos los métodos de Persona ✅
```

### 🧩 **COMPOSICIÓN = "TIENE UN/UNA"**

Un objeto "TIENE" otros objetos dentro de él.

```java
public class Usuario extends Persona {
    private List<ConsumoMes> consumos; // ← Usuario TIENE Consumos
    private TipoUsuario tipo;          // ← Usuario TIENE un TipoUsuario

    public Usuario(String nombre, String direccion) {
        super(nombre, direccion);
        this.consumos = new ArrayList<>(); // ← Crear lista de consumos
    }

    public void agregarConsumo(ConsumoMes consumo) {
        consumos.add(consumo); // ← Agregar consumo a SU lista
    }
}
```

### 🎯 **¿Cuándo usar cada uno?**

#### **Usa HERENCIA cuando:**

- ✅ Hay una relación "ES UN/UNA"
- ✅ Quieres reutilizar código común
- ✅ Tiene sentido polimorfismo

```java
// Usuario ES UNA Persona ✅
public class Usuario extends Persona {
    // Hereda: nombre, dirección, ID, métodos básicos
    // Agrega: tipo de tarifa, consumos específicos
}
```

#### **Usa COMPOSICIÓN cuando:**

- ✅ Hay una relación "TIENE UN/UNA"
- ✅ Quieres más flexibilidad
- ✅ Evitas jerarquías complejas

```java
public class SistemaAguaSimple {
    private List<Usuario> usuarios;    // ← TIENE usuarios
    private Scanner scanner;           // ← TIENE scanner
    private String nombreEmpresa;      // ← TIENE nombre

    // NO hereda de ninguna clase - usa composición para todo
}
```

### 🏆 **Principio: "Prefiere Composición sobre Herencia"**

#### **¿Por qué?**

| Herencia                       | Composición                   |
| ------------------------------ | ----------------------------- |
| ❌ Rígida (difícil cambiar)    | ✅ Flexible (fácil cambiar)   |
| ❌ Acoplamiento fuerte         | ✅ Acoplamiento débil         |
| ❌ Solo una clase padre        | ✅ Múltiples objetos internos |
| ❌ Expone métodos innecesarios | ✅ Solo expone lo necesario   |

### 💻 **Ejemplo en nuestro proyecto:**

```java
// HERENCIA - Usuario ES UNA Persona
public class Usuario extends Persona {
    // Tiene sentido: Usuario necesita nombre, dirección, ID como Persona
}

// COMPOSICIÓN - Usuario TIENE ConsumoMes
public class Usuario {
    private List<ConsumoMes> consumos; // ← No hereda de ConsumoMes

    public void agregarConsumo(ConsumoMes consumo) {
        consumos.add(consumo); // ← Delega al objeto interno
    }
}

// COMPOSICIÓN - Sistema TIENE Usuarios
public class SistemaAguaSimple {
    private List<Usuario> usuarios; // ← No hereda de Usuario o List

    // Delega operaciones a los objetos internos
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
```

### ✅ **Beneficios de cada enfoque:**

**Herencia:**

- Reutilización natural de código
- Polimorfismo automático
- Jerarquía clara y lógica

**Composición:**

- Mayor flexibilidad
- Fácil testing y mantenimiento
- Evita problemas de herencia múltiple

---

## 🎉 ¡Felicidades!

Has aprendido **TODOS** los conceptos fundamentales de POO:

✅ **Clases y Objetos** - Moldes y instancias  
✅ **Encapsulamiento** - Datos privados con acceso controlado  
✅ **Constructores** - Inicialización de objetos  
✅ **Herencia** - Reutilización "ES UN/UNA"  
✅ **Polimorfismo** - "Muchas formas" del mismo comportamiento  
✅ **Abstracción** - Ocultar complejidad innecesaria  
✅ **static/final** - Miembros de clase y inmutabilidad  
✅ **Paquetes** - Organización y encapsulamiento  
✅ **toString/equals/hashCode** - Comportamiento en colecciones  
✅ **Composición vs Herencia** - "TIENE" vs "ES UN/UNA"

## 🚀 ¿Qué sigue?

1. **Practica**: Modifica el código, agrega nuevas funcionalidades
2. **Experimenta**: Crea tus propias clases usando estos conceptos
3. **Profundiza**: Aprende patrones de diseño, frameworks
4. **Construye**: Desarrolla proyectos más complejos

**¡Ya tienes las bases sólidas de POO en Java!** 🎯
