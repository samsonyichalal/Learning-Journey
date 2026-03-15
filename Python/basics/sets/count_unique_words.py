# This program counts how many unique words
# exist in a list.

words = ["apple", "banana", "apple", "orange", "banana", "grape"]

unique_words = set(words)

print("Unique words:", unique_words)
print("Number of unique words:", len(unique_words))

# or we can use loop
unique_words = []

for word in words:
    if word not in unique_words:
        unique_words.append(word)

print("Unique words:", unique_words)
print("Number of unique words:", len(unique_words))
