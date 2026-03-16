# This program counts how many times
# a specific value appears in a tuple.
numbers = (1, 2, 3, 2, 4, 2, 5)

count = 0

for number in numbers:
    if number == 2:
        count += 1

print("2 appears", count, "times")


# or in short we can use .count() methodes 
numbers = (1, 2, 3, 2, 4, 2, 5)

count_of_two = numbers.count(2)

print("2 appears", count_of_two, "times")