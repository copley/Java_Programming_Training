# 📦 My Java App

A simple Java application demonstrating project structure, manual compilation, and building with Maven.

---

## 🧠 Project Structure

```text
my-java-app/
├── pom.xml                  # Maven build configuration
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── App.java
│   │   └── resources/
│   │       └── config.properties
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── AppTest.java
│       └── resources/
└── target/                   # Compiled output (Maven build)
    ├── classes/
    │   ├── com/
    │   │   └── example/
    │   │       └── App.class
    │   └── config.properties
    ├── generated-sources/
    ├── generated-test-sources/
    ├── maven-archiver/
    │   └── pom.properties
    ├── maven-status/
    │   └── maven-compiler-plugin/
    │       ├── compile/
    │       │   └── default-compile/
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile/
    │           └── default-testCompile/
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── my-java-app-1.0.0.jar
    ├── surefire-reports/
    │   ├── com.example.AppTest.txt
    │   └── TEST-com.example.AppTest.xml
    └── test-classes/
        └── com/
            └── example/
                └── AppTest.class
```

---

## 💻 Manual Build & Run (Without Maven)

**Compile the main class:**
```bash
mkdir -p out
javac -d out src/main/java/com/example/App.java
```

**Copy resources:**
```bash
cp -r src/main/resources/* out/
```

**Run the app:**
```bash
java -cp out com.example.App
```

**(Optional) Compile & Run Tests Manually:**
```bash
javac -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:out" -d out src/test/java/com/example/AppTest.java
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:out" org.junit.runner.JUnitCore com.example.AppTest
```

---

## ⚙️ Build & Run with Maven (Recommended)

**Compile:**
```bash
mvn compile
```

**Run the App:**
```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

**Run Tests:**
```bash
mvn test
```

**Package into a JAR:**
```bash
mvn package
```

---

## ✅ TL;DR: Manual vs. Maven Comparison

| Task                   | Manual (javac)         | Maven (mvn)         |
|------------------------|------------------------|---------------------|
| Compile Java           | javac                  | mvn compile         |
| Run your app           | java -cp ...           | mvn exec:java       |
| Manage dependencies    | Manual download        | Automatic via pom.xml|
| Project structure      | Manual                 | Convention-based    |
| Build a JAR            | Complicated            | mvn package         |
| Run tests              | Complex setup          | mvn test            |

---

## 🧰 Notes
- The `config.properties` file is accessed at runtime using the classloader.
- This project uses Java 11 and JUnit 4.
- You can extend the project by adding more classes, tests, and dependencies using Maven.

---

## 📍 Create a Maven Project (from scratch)

Generate a new Maven project:

```bash
mvn archetype:generate \
  -DgroupId=com.example \
  -DartifactId=myapp \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
```

Happy coding! 🚀

