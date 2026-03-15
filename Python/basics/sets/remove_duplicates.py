# This program removes duplicate values
# from a list by converting it to a set.

numbers = [1, 2, 2, 3, 4, 4, 5]

unique_numbers = set(numbers)

print("Unique values:", unique_numbers)

# or we can remove duplicate value 
# from a list by using a loop

unique_numbers = []

for number in numbers:
    if number not in unique_numbers:
        unique_numbers.append(number)

print("Unique values:", unique_numbers)
