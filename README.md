# Java Swing Calculator

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![GUI](https://img.shields.io/badge/GUI-Swing-blue.svg)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

A lightweight desktop calculator built with Java Swing. The project demonstrates graphical user-interface construction, event-driven programming, input parsing, and basic error handling in a compact Java application.

## Features

- Addition, subtraction, multiplication, and division
- Button-based input for digits and operators
- Clear (`C`) and calculate (`=`) actions
- Support for multi-digit values
- Decimal results through `double` arithmetic
- Validation for malformed expressions
- Explicit handling of division by zero
- Swing event handling through a shared `ActionListener`

## Technologies

- Java
- Java Swing
- AWT event handling

No third-party dependencies are required.

## Requirements

- JDK 8 or newer
- A desktop environment capable of displaying Swing applications

## Run locally

Clone the repository:

```bash
git clone https://github.com/andreiboscu/java-swing-calculator.git
cd java-swing-calculator
```

Compile the application:

```bash
javac -d out Calculator.java
```

Run it:

```bash
java -cp out lab7.Calculator
```

You can also import `Calculator.java` into IntelliJ IDEA, Eclipse, or another Java IDE and run the `main` method.

## Usage

Enter an expression using the calculator buttons, then press `=`.

Example:

```text
123 + 7
```

The calculator expects one operation at a time in the form:

```text
number operator number
```

Press `C` to clear the display. Invalid input produces an error message, while division by zero is reported separately.

## Project structure

```text
.
├── Calculator.java
├── LICENSE
├── README.md
└── .gitignore
```

## Concepts demonstrated

`Java` · `Swing` · `GUI Development` · `ActionListener` · `Event-Driven Programming` · `Input Validation` · `Exception Handling`

## Possible future improvements

- Add decimal-point and backspace buttons
- Support chained calculations
- Improve keyboard input
- Use layout managers for responsive resizing
- Separate calculation logic from the graphical interface
- Add automated unit tests
- Package the application as an executable JAR

## License

This project is available under the [MIT License](LICENSE).
