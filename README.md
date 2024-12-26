### Project Title: Card Game Simulation

---

## Overview
This repository contains the source code for a card game simulation developed as part of the TCP1201 Object-Oriented Programming and Data Structures course assignment. The project involves implementing a game with specific rules and features as described in the assignment brief. The main focus is on applying object-oriented programming principles and utilizing appropriate data structures.

---

## Features
- **Game Phases:**
  - 3-Player Phase: Play 3 rounds to determine top 2 players.
  - 2-Player Phase: Play 4 rounds to determine the overall winner.
- **Deck Management:**
  - Shuffle and distribute a 52-card deck.
  - Sort player cards by suit and face.
  - Remove played cards from the deck.
- **Score Tracking:**
  - Calculate points based on card values.
  - Determine winners for each round.
  - Track and display scores for all players.
- **Data Structures:**
  - Utilize appropriate structures such as stacks, queues, sets, and/or maps.

---

## Class Design
### 1. Main
- Entry point for the application.
- Calls the `Game` class to start and manage the game flow.

### 2. Game
- Manages the overall flow of the game.
- Shuffles and distributes cards.
- Tracks scores and identifies winners.

### 3. Player
- Represents individual players.
- Holds and sorts cards.
- Calculates points based on rules.

### 4. Card
- Represents individual cards in the deck.
- Includes attributes for suit and face value.

### 5. DeckManagers
- Handles deck creation, shuffling, and management.
- Uses `HashMap` to store card data.
- Provides a method (`DeckShuffleFun`) to shuffle and organize the deck.

### 6. SortBySuitFace
- A comparator class used for sorting cards by suit and face value.
- Implements `Comparator` interface.

---

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Ensure JDK 8 or later is installed.
- **IDE (Optional)**: Recommended IDEs include IntelliJ IDEA, Eclipse, or NetBeans.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/KishenKumar27/BlackJava.git
   ```
2. Navigate to the project directory:
   ```bash
   cd BlackJavaGame/src/BlackJavaGame/com
   ```
3. Open the project in your preferred IDE or compile manually using the command line.

### Compilation and Execution
To compile and run the program:
```bash
javac *.java
java BlackJavaGame.com.Main
```

---

## Usage
1. Run the program.
2. Enter player names when prompted.
3. Follow the on-screen instructions to proceed through rounds.
4. View results after each round and the final winner.

---

## File Structure
BlackJava/
│
├── Assignment2.pdf                  # Assignment documentation
│
├── CardFX/                           # Folder for any related CardFX resources
│
├── BlackJavaGame/                    # Main game directory
│   └── com/                          # Package containing game logic
│       ├── Main.java                 # Entry point of the application
│       ├── Game.java                 # Main game logic and flow
│       ├── Player.java               # Represents individual players
│       ├── Card.java                 # Represents individual cards
│       ├── DeckManagers.java         # Handles deck creation, shuffling, and management
│       └── SortBySuitFace.java       # Comparator for sorting cards by suit and face value
│
├── README.md                         # Documentation for the project
└── Group11.txt                       # Group members and contributions

---

## License
This project is developed as part of an academic assignment. Distribution or reproduction without permission may result in academic penalties.

---

## Notes
- Ensure the program is runnable before submission.
- Do not share the code with other groups.
- Prepare for the interview to explain and defend your implementation.
