# MusicNote App

A simple Java application that models musical notes, allowing users to set and retrieve note properties like length, pitch, and frequency. This project demonstrates object-oriented programming principles, including encapsulation, constructors, and method creation.

## Features

- **Retrieve Note Information**: Get the letter name (e.g., C, D#, G) and whether the note is natural or sharp.
- **Calculate Frequency**: Calculate the frequency of the note in Hertz based on its distance from A440 (440Hz).
- **Set Note Properties**: Customize the note's length (e.g., quarter, half) and value (distance from middle C).

## Class Overview

### `Note.java`
- Defines a `Note` class with properties:
  - `length`: Represents the length of the note (e.g., sixteenth, quarter).
  - `value`: Represents the distance from middle C.
  - Methods to:
    - Retrieve the letter name and type (natural/sharp).
    - Calculate the frequency using the standard musical formula based on A440.
    - Get and set note properties.

### `NoteTest.java`
- A test class that demonstrates the functionality of the `Note` class.
- Creates default and custom `Note` instances, and prints properties like letter name, type, frequency, length, and value.

## Getting Started

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/MusicNoteApp.git
