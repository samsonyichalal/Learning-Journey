# This function counts the number of vowels
# in a given word.

def count_vowels(word):
    vowels = "aeiou"
    total = 0

    for letter in word.lower():
        if letter in vowels:
            total += 1

    return total


print("Vowel count:", count_vowels("Education"))
