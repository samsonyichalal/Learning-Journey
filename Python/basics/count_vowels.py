# count how many vowels are appered in the string
string = "Hello woUrld"
number_of_vowel = 0

for i in string:
    if i.lower() in "aeiou":
        number_of_vowel += 1
    
print("Number of vowel is:", number_of_vowel)