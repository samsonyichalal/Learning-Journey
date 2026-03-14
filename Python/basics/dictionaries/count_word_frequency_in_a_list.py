# Count word frequency in a list
words = ["apple", "banana", "apple"]

frequency = {}

for word in words:
    if word in frequency:
        frequency[word] += 1
    else:
        frequency[word] = 1

print("Word frequency:", frequency)

