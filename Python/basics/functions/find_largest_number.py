# This function loops through a list
# and returns the largest number.

def find_largest(numbers):
    largest = numbers[0]

    for number in numbers:
        if number > largest:
            largest = number

    return largest


values = [4, 9, 2, 15, 7]
print("Largest number:", find_largest(values))
