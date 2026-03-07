# reverse a word
name = "samson"
reversed_word = name[::-1]

print(reversed_word)

# Alternative by using loop
name = "samson"
reversed_name = ''

for char in name:
    reversed_name = char + reversed_name

print(reversed_name)