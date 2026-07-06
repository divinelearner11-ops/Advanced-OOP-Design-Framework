# Multi-Paradigm OOP Design Framework & Core Engine

A production-grade, enterprise-ready engineering framework showcasing advanced Object-Oriented Programming (OOP) paradigms across **C++** and **Java**. This repository is strictly structured using multi-file separate compilation patterns, decoupled interface-implementation designs, automated build maps via Makefiles, and custom error boundaries[cite: 6, 7, 8, 10].

---

## 🏗️ Repository Architecture & Subsystems

### 📂 1. C++ Core Engine (`/cpp-core-engine`)
This subsystem focuses on low-level resource safety, compile-time and runtime polymorphism, and structural memory layout management in C++17[cite: 7, 8, 10, 9].

*   **`01-state-management-and-encapsulation/`**[cite: 9]
    *   **Focus:** Data encapsulation, state boundaries, constructor overloading, and structural constructor chaining blueprints[cite: 9].
    *   **Key Highlights:** Implements robust parameter verification (e.g., balance validation limits) and automated lifecycle indicators via explicit object destructors[cite: 9].
*   **`02-memory-architecture-and-inheritance/`**[cite: 7]
    *   **Focus:** Multi-level and multiple inheritance hierarchies coupled with raw dynamic memory allocations[cite: 7].
    *   **Key Highlights:** Explores systemic deep copy vs shallow copy behaviors across object boundaries to maintain total independence of dynamically allocated heap arrays[cite: 7].
*   **`03-virtual-inheritance-payroll-system/`**[cite: 8]
    *   **Focus:** Advanced runtime polymorphism, pure virtual methods, abstract interfaces, and resolving structural execution ambiguities[cite: 8].
    *   **Key Highlights:** Resolves the notorious **Diamond Problem** using **Virtual Inheritance** layouts within a heterogeneous Employee Payment System framework[cite: 8].
*   **`04-operator-overloading-and-smart-pointers/`**[cite: 10]
    *   **Focus:** Memory interception, resource management wrappers, and native syntax extensions[cite: 10].
    *   **Key Highlights:** Overloads global memory allocators (`new`/`delete` operators) to track lifecycle boundaries, overrides spatial access operators (`[]` and `()`), and designs custom `SmartPtr` mechanics for automatic cleanup scopes[cite: 10].

### 📂 2. Java Enterprise Framework (`/java-enterprise-framework`)
This subsystem targets higher-level enterprise abstractions, reflective runtime metadata manipulation, structural serialization graphs, and exception pipelines in modern Java[cite: 6, 11].

*   **`01-abstract-banking-and-exception-pipelines/`**[cite: 11]
    *   **Focus:** Interface contracts, logical package boundaries, static telemetry counters, and standard checked exception routing hierarchies[cite: 11].
    *   **Key Highlights:** Implements production-level transactional verification systems wrapped around fine-grained custom exception rules (e.g., `DatabaseFullException`)[cite: 11].
*   **`02-reflective-inspection-and-cyclic-serialization/`**[cite: 6]
    *   **Focus:** Metaprogramming runtime inspection, structural object graphing, and customized serialization configurations[cite: 6].
    *   **Key Highlights:** Implements an algorithm for tracking **Cyclic References** within complex object graphs during custom serialization routines (`writeObject`/`readObject`)[cite: 6]. Utilizes **Java Reflection APIs** to map generic collection metadata (Maps, Lists, Sets) dynamically at runtime and processes runtime active filters using custom annotations (`@Important`)[cite: 6].

---

## 🛠️ Core Competencies Demonstrated
*   **Languages:** C++ (Standard C++17), Java (JDK 17)
*   **Advanced Paradigms:** Virtual Multi-Inheritance, Runtime Metaprogramming, Operator Interception, Dynamic Class Inspection[cite: 6, 8, 10].
*   **Memory Management:** Heap Architecture tracking, Custom Deep Cloning via Reflection, Explicit Pointer Scope Enforcement[cite: 6, 7, 10].
*   **Resiliency:** Custom Checked/Unchecked Exception Trees, Deep Fault Isolation Pipelines[cite: 6, 11].
*   **Automation:** Standalone automated build layouts controlled via customized cross-compilation **Makefiles**[cite: 6, 7, 8, 10].

---

## 💻 Build and Execution Standards

Every sub-module follows standard multi-file enterprise compilation architectures (`.h`/`.cpp` separations)[cite: 6, 7, 8, 10]. Do not combine definitions inside a single driver boundary[cite: 6, 7, 8, 10]

### Building a C++ Subsystem Module:
```bash
cd cpp-core-engine/03-virtual-inheritance-payroll-system
make
./payroll_engine
