# Number Guessing Game (Java)

A console game where the program picks a random number between 1 and 100 and the player keeps guessing until they get it right.

## Features
- Random number generator using `java.util.Random`
- Guessing mechanism using a loop that runs until the correct number is guessed
- Higher/lower hints after every wrong guess
- Attempt counter
- Input validation (non-numeric and out-of-range guesses are rejected)
- Play-again option with best score tracking

## Concepts Practiced
Random number generation, loops, conditional statements, methods, user interaction with `Scanner`.

## How to Run
```bash
javac NumberGuessingGame.java
java NumberGuessingGame
```

## Sample Output
```
===== Number Guessing Game =====

I have picked a number between 1 and 100. Can you guess it?
Enter your guess (1-100): 50
  Too high! Try a lower number.
Enter your guess (1-100): 25
  Too low! Try a higher number.
Enter your guess (1-100): abc
  Invalid input! Please enter a whole number.
Enter your guess (1-100): 37
Correct! You guessed the number 37 in 3 attempt(s).
Best score so far: 3 attempt(s)

Play again? (y/n): n

Thanks for playing!
```

## Approach
`generateNumber()` creates the secret number with `Random.nextInt`. `readGuess()` validates input. `playRound()` loops with a `while` until the guess equals the secret, giving hints and counting attempts. `playAgain()` and `main()` handle repeat rounds and the best score.

## Tools
Java, Random, Scanner
