import random

print("Number Guessing Game")
print("Guess a number between 1 and 10")

number = random.randint(1, 10)

while True:
    try:
        guess = int(input("Enter your guess: "))

        if guess < 1 or guess > 10:
            print("Please enter a number between 1 and 10")
            continue

        if guess == number:
            print("🎉Correct! You guessed the number.")
            break
        elif guess < number:
            print("low value")
        else:
            print("high value")

    except ValueError:
        print(" Invalid input! Please enter a number only.")
