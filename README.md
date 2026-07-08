# Multi-Paradigm OOP Design Framework & Core Engine

A production-grade, enterprise-ready engineering framework showcasing advanced Object-Oriented Programming (OOP) paradigms across **C++** and **Java**. This repository is strictly structured using multi-file separate compilation patterns, decoupled interface-implementation designs, automated build maps via Makefiles, and custom error boundaries.

---

## 🏗️ Repository Architecture & Subsystems

### 📂 1. C++ Core Engine (`/cpp-core-engine`)
This subsystem focuses on low-level resource safety, compile-time and runtime polymorphism, and structural memory layout management in C++17.

*   **`01-state-management-and-encapsulation/`**
    *   **Focus:** Data encapsulation, state boundaries, constructor overloading, and structural constructor chaining blueprints.
    *   **Key Highlights:** Implements robust parameter verification (e.g., balance validation limits) and automated lifecycle indicators via explicit object destructors.
*   **`02-memory-architecture-and-inheritance/`**
    *   **Focus:** Multi-level and multiple inheritance hierarchies coupled with raw dynamic memory allocations.
    *   **Key Highlights:** Explores systemic deep copy vs shallow copy behaviors across object boundaries to maintain total independence of dynamically allocated heap arrays.
*   **`03-virtual-inheritance-payroll-system/`**
    *   **Focus:** Advanced runtime polymorphism, pure virtual methods, abstract interfaces, and resolving structural execution ambiguities.
    *   **Key Highlights:** Resolves the notorious **Diamond Problem** using **Virtual Inheritance** layouts within a heterogeneous Employee Payment System framework.
*   **`04-operator-overloading-and-smart-pointers/`**
    *   **Focus:** Memory interception, resource management wrappers, and native syntax extensions.
    *   **Key Highlights:** Overloads global memory allocators (`new`/`delete` operators) to track lifecycle boundaries, overrides spatial access operators (`[]` and `()`), and designs custom `SmartPtr` mechanics for automatic cleanup scopes.

### 📂 2. Java Enterprise Framework (`/java-enterprise-framework`)
This subsystem targets higher-level enterprise abstractions, reflective runtime metadata manipulation, structural serialization graphs, and exception pipelines in modern Java.

*   **`01-abstract-banking-and-exception-pipelines/`**
    *   **Focus:** Interface contracts, logical package boundaries, static telemetry counters, and standard checked exception routing hierarchies.
    *   **Key Highlights:** Implements production-level transactional verification systems wrapped around fine-grained custom exception rules (e.g., `DatabaseFullException`).
*   **`02-reflective-inspection-and-cyclic-serialization/`**
    *   **Focus:** Metaprogramming runtime inspection, structural object graphing, and customized serialization configurations.
    *   **Key Highlights:** Implements an algorithm for tracking **Cyclic References** within complex object graphs during custom serialization routines (`writeObject`/`readObject`). Utilizes **Java Reflection APIs** to map generic collection metadata (Maps, Lists, Sets) dynamically at runtime and processes runtime active filters using custom annotations (`@Important`).

---

## 🛠️ Core Competencies Demonstrated
*   **Languages:** C++ (Standard C++17), Java (JDK 17)
*   **Advanced Paradigms:** Virtual Multi-Inheritance, Runtime Metaprogramming, Operator Interception, Dynamic Class Inspection.
*   **Memory Management:** Heap Architecture tracking, Custom Deep Cloning via Reflection, Explicit Pointer Scope Enforcement.
*   **Resiliency:** Custom Checked/Unchecked Exception Trees, Deep Fault Isolation Pipelines.
*   **Automation:** Standalone automated build layouts controlled via customized cross-compilation **Makefiles**.

---

## 💻 Build and Execution Standards

Every sub-module follows standard multi-file enterprise compilation architectures (`.h`/`.cpp` separations). Do not combine definitions inside a single driver boundary.
