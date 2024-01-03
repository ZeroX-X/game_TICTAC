# Tic Tac Toe Game

A simple console-based Tic Tac Toe game with user authentication.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Classes and Objects](#classes-and-objects)
  - [Inheritance](#inheritance)
  - [Polymorphism](#polymorphism)
  - [Encapsulation](#encapsulation)
  - [Abstraction](#abstraction)
  - [Exception Handling](#exception-handling)
  - [File I/O](#file-io)
  - [Anonymous Inner Class / Functional Interface / Lambda Expression](#anonymous-inner-class--functional-interface--lambda-expression)
  - [Static Method](#static-method)
- [Usage](#usage)
- [User Records](#user-records)

## Overview

 This project implements a console-based Tic Tac Toe game with user authentication features. The primary components include an authentication system and the Tic Tac Toe game logic. Users can register, login, and play the game against each other. The project utilizes concepts such as inheritance, polymorphism, encapsulation, abstraction, exception handling, file I/O, anonymous inner classes, functional interfaces, lambda expressions, and static methods.

## Features

- **User Authentication:**
  - Register as a new user with a unique username and password.
  - Login with existing credentials to access the game.
  
- **Gameplay:**
  - Two players take turns making moves on a 3x3 board.
  - The game checks for a winner or a draw after each move.

- **Player Statistics:**
  - Records user statistics, including wins and losses.
  - Player history is saved in the "userRecord.txt" file with timestamps.

## Classes and Objects

- **Player:**
  - Represents a player in the game with attributes such as symbol, name, wins, and losses.
  - Contains methods for making moves, saving player history, and incrementing wins/losses.

- **RegisteredPlayer:**
  - Extends the Player class and represents a registered player with additional features.
  - Overrides methods for making moves and saving player history.

- **GuestPlayer:**
  - Extends the Player class and represents a guest player with basic features.
  - Implements the `makeMove` method with placeholder logic.

- **User:**
  - Represents a user with attributes for name and password.
  - Contains methods for getting name and password, along with a custom `toString` method.

- **Login:**
  - Manages user authentication, reading user data from the "Userinfo.txt" file.

- **Register:**
  - Handles user registration, writing new user data to the "Userinfo.txt" file.

### Inheritance

- **Player:**
  - Abstract class representing common attributes and methods for players.
  - Inherited by GuestPlayer and RegisteredPlayer.

### Polymorphism

- **Player:**
  - Implements the `makeMove` method using a functional interface for move validation.

### Encapsulation

- **User:**
  - Encapsulates user data (name, password) with getters.

### Abstraction

- **Player:**
  - Abstracts common methods for making moves and saving player history.

### Exception Handling

- **Main:**
  - Handles exceptions during user input for move validation.

### File I/O

- **Login:**
  - Reads user data from the "Userinfo.txt" file for authentication.

- **Register:**
  - Writes new user data to the "Userinfo.txt" file during registration.

- **Player:**
  - Saves player history to the "userRecord.txt" file.

### Anonymous Inner Class / Functional Interface / Lambda Expression

- **Player:**
  - Uses a functional interface (`MoveValidator`) for move validation in the `makeMove` method.

### Static Method

- **Login and Register:**
  - `getUserList` method is static, retrieving user data for authentication.

## Usage

1. Run the `Main.java` file located in the `TicTacToeGame` package.
2. Follow the on-screen instructions to register or login as Player 1 and Player 2.
3. Make moves by entering the desired placement (1-9) when prompted.

## User Records

User records are stored in the "Userinfo.txt" file, containing username/password pairs.

Player history records are stored in the "userRecord.txt" file, including timestamps, results, usernames, symbols, wins, and losses.

Feel free to customize this README further or let me know if there are specific points you'd like to emphasize!
