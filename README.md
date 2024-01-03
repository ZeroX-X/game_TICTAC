
# TICTACTOEGAME
A simple console-based Tic Tac Toe game with user authentication.
## Table of Contents

 - [Overview]()
 - [Features]()
 - [Classes and objects]()
   - [Inheritance]()
   - [Polymophism]()
   - [Inheritance]()
   - [Polymorphism]()
   - [Encapsulation]()
   - [Abstraction]()
   - [Exception Handling]()
   - [File I/O]()
   - [Anonymous Inner Class / Functional Interface / Lambda Expression]()
   - [Static Method]()

## I. Overview
This is a simple console-based Tic Tac Toe game implemented in Java. The game supports two players who can either register or log in to play. Player information is stored in a text file, and the game history is recorded after each match.

## II. Features
- UserAuthentication :
   - Register as a new player with a unique username and password.
   - Log in with existing username and password to continue playing.

- GameBoard :
   - A 3x3 grid is displayed after each move, showing the current state of the game
- PlayerMoves: 
   - Take turns making moves by entering a number corresponding to an empty position on the board.
   - The game prevents players from making moves in already occupied positions.
- GameLogic :
   - Check for a winner after each move based on horizontal, vertical, or diagonal alignments.
   - Detect a draw when the board is full and no winner is found.
    - Ensuring the game is going smoothly between players
- PlayerRecord :
   - Track wins and losses for each player.
   - Display player statistics after each game.
- PlayerHistory :
   - Save player history, including timestamps, game results, usernames, symbols, wins, and losses.
- RegisteredPlayer:
   - Support for registered players with usernames and passwords.






## 1. Classes and objectives

This project demonstrates the use of several classes and objects:

- **Login**: Manages user authentication, reads user information from a file, and verifies user registration.
- **Register**: Handles user registration, writing new user information to a file.
- **User**: Represents a user with a username and password. Implements the `equals` method and provides a `toString` method for object representation.
- **Board**: Represents the Tic Tac Toe game board, manages player positions, and checks for a winner.
- **Game**: Orchestrates the gameplay, takes player moves, and checks for a winner or a draw.
- **Player**: An abstract class representing a player, with common attributes and methods for registered and unregistered players.
- **RegisteredPlayer**: Extends the Player class, representing a player with registration details.

## 2. Inheritance
- Inheritance is utilized in the `Player` class, where `RegisteredPlayer` extends the `Player` class. The superclass includes a constructor, overloading and overriding methods, as well as other features used by its subclasses.

# Getting Started

## Project Structure

The project is organized into several packages:

### Authentication Package

#### `Login.java`
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
```
#### `Register.java`
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
```
### TicTacToeGame Package
#### `Board.java`
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
```
#### `Game.java`
```java
import java.util.Arrays;
import java.util.List;
```
#### `Player.java`
```java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

```
### Main Package
#### `Main.java`
```java
import java.util.Scanner;
import TicTacToeGame.Authentication.Login;
import TicTacToeGame.Authentication.Register;
import TicTacToeGame.Authentication.User;
import TicTacToeGame.*;


```
## 1. Classes and objectives

This project demonstrates the use of several classes and objects:

- **Login**: Manages user authentication, reads user information from a file, and verifies user registration.
- **Register**: Handles user registration, writing new user information to a file.
- **User**: Represents a user with a username and password. Implements the `equals` method and provides a `toString` method for object representation.
- **Board**: Represents the Tic Tac Toe game board, manages player positions, and checks for a winner.
- **Game**: Orchestrates the gameplay, takes player moves, and checks for a winner or a draw.
- **Player**: An abstract class representing a player, with common attributes and methods for registered and unregistered players.
- **RegisteredPlayer**: Extends the Player class, representing a player with registration details.

## 2. Inheritance
- Inheritance is utilized in the `Player` class, where `RegisteredPlayer` extends the `Player` class. The superclass includes a constructor, overloading and overriding methods, as well as other features used by its subclasses.
### Superclass
#### `Player.java`
```java
public abstract class Player {
    protected char symbol;
    protected String playerName;
    {
'''
#### `RegisteredPlayer.java`
```java
public class RegisteredPlayer extends Player {
    private String password;
    private String username;
    public RegisteredPlayer(char symbol, String playerName, String username, String password) {
        super(symbol, playerName);
        this.username = username;
        this.password = password;
    }
'''
#### `GuestPlayer.java`
```java
public class GuestPlayer extends Player {
    public GuestPlayer(char symbol, String playerName) {
        super(symbol, playerName);
    }
'''
### Overriding method

#### `RegisteredPlayer.java`
```java
@Override
    public int makeMove(List<Integer> positions) {
        return super.makeMove(positions);
    }
```
```java
    @Override
    public void savePlayerHistory(String result) {
        super.savePlayerHistory(result);
    }





