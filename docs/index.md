<p align="center">
  <img src="assets/banner.png" alt="T-Regex" />
</p>

<img src="assets/logo.png" align="right" width="120" alt="T-Regex logo" />

# T-Regex

A fluent, type-safe Kotlin DSL for building, composing, and testing Regular Expressions.

Tame the chaos of regular expressions. Write readable Kotlin code instead of cryptic string soup. Get compile-time safety and type-safe data extraction without sacrificing the power of the underlying regex engine.

[Documentation](https://t-regex.developmentanddinosaurs.co.uk) · [GitHub Releases](https://github.com/development-and-dinosaurs/t-regex/releases)

---

## Contents

- [Quick start](#quick-start)
- [Why T-Regex?](#why-t-regex)
- [Building](#building)

---

## Quick start

### 1. Library

Add the dependency to your project:

```kotlin
dependencies {
    implementation("uk.co.developmentanddinosaurs:tregex-core:<version>")
}
```

### 2. Usage

Build regular expressions using the builder DSL.

```kotlin
import uk.co.developmentanddinosaurs.tregex.TRegex

val pattern = TRegex {
    literally("hello world")
}

// Access the compiled pattern
println(pattern.pattern) // "hello world"

// Evaluate against inputs
pattern.matches("hello world") // true
```

---

## Why T-Regex?

* **Readable:** Replace write-only syntax like `^[a-zA-Z0-9_\-\.]+$` with semantic blocks like `anyCharOf { letter() or digit() }`.
* **No boolean blindness:** Strict separation of concepts instead of parameter flags (e.g., `oneOrMoreLazily()` instead of `oneOrMore(greedy = false)`).
* **Cross-platform safe:** Emits universally compatible regex strings without relying on engine-specific hacks like `\Q...\E`.
* **Composable:** Extract common regex fragments into reusable Kotlin functions and variables.

---

## Building

```bash
# Build everything and run all verification checks
./gradlew check

# Run the test suite (Kotest BDD)
./gradlew test
```

---

## 📜 License

MIT License. Built with 🦕 by the Development and Dinosaurs community.
