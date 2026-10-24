# spring-boot-multi-module-gradle-example

[![Java CI with Gradle](https://github.com/hendisantika/spring-boot-multi-module-gradle-example/actions/workflows/gradle.yml/badge.svg)](https://github.com/hendisantika/spring-boot-multi-module-gradle-example/actions/workflows/gradle.yml)

A minimal Spring Boot multi-module project written in Kotlin and built with Gradle.
The `api` module is a runnable Spring Boot application that depends on a plain
`library` module.

## Tech stack

| Tool        | Version |
|-------------|---------|
| Java (JDK)  | 25      |
| Kotlin      | 2.4.21  |
| Spring Boot | 4.1.1   |
| Gradle      | 9.8.2 (wrapper) |

## Project structure

```
.
├── api/                  # Spring Boot application (bootJar)
│   └── src/main/kotlin/Main.kt
├── library/              # Shared library (plain jar, bootJar disabled)
│   └── src/main/kotlin/LibraryUtility.kt
├── build.gradle          # Shared config for all subprojects
└── settings.gradle       # Module includes + Foojay toolchain resolver
```

## Requirements

- JDK 25 — or no local JDK 25 at all: the build uses a
  [Gradle Java toolchain](https://docs.gradle.org/current/userguide/toolchains.html),
  and the Foojay resolver downloads JDK 25 automatically if it is missing.

## Build & run

```bash
# Build all modules
./gradlew build

# Run the API application
./gradlew :api:bootRun

# Or run the packaged jar
java -jar api/build/libs/api.jar
```

## CI/CD

- **GitHub Actions** (`.github/workflows/gradle.yml`) builds the project on JDK 25
  (Temurin) on every push and pull request to `main`, and submits the dependency
  graph on pushes so Dependabot alerts cover every Gradle dependency.
- **Dependabot** (`.github/dependabot.yml`) checks Gradle and GitHub Actions
  dependencies daily at 05:00 (Asia/Jakarta). Updates are grouped (Spring Boot,
  Kotlin, Gradle plugins, minor/patch, GitHub Actions) to reduce PR noise and use
  Conventional Commit prefixes (`build:` / `ci:`).

## Author

[Hendi Santika](https://s.id/hendisantika)
