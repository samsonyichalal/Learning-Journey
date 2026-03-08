# Convert a sentence to title case (first letter capital)
sentence = "hello world python"
converted_sentence = sentence.title()

print(converted_sentence)

# alternativly we can use another method (by using comprehension)
sentence = "hello world python"

result = " ".join(word.capitalize() for word in sentence.split())
print((result))
