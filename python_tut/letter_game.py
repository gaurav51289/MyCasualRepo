import random

words = ['apple', 'banana', 'melon', 'lemon', 'strawberry', 'mango', 'pineapple']


while True:
  start = input("Press enter to start or 'Q' to quit")
  
  if start.lower() == 'q':
    break
  
  secret_word = random.choice(words)
  bad_guesses = []
  good_guesses= []
  
  while len(bad_guesses) < 7 and len(good_guesses) != len(secret_word):
    for letter in secret_word:
      if letter in good_guesses:
        print(letter, end='')
      else:
        print('_', end='')
    
    print('')
    print("Number of Strikes: {}/7".format(len(bad_guesses)))
  
  
    guess = input("Guess a letter : ")
  
    if len(guess) != 1:
      print("You can guess only 1 letter.")
      continue
    elif guess in good_guesses or guess in bad_guesses:
      print("You have already guessed that letter.")
      continue
    elif not guess.isalpha():
      print("You can guess only letters.")
      continue
  
  
    if guess in secret_word:
      good_guesses.append(guess)
      if len(good_guesses) == len(list(secret_word)):
        print("You win..!! {} was the word.".format(secret_word))
        break
    else:
      bad_guesses.append(guess)
else:
  print("You didn't guess that..!! The secret word was {}.".format(secret_word))