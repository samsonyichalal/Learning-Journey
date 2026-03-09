# Find the largest number in a list.
numbers = [3, 7, 2, 9, 5, 4]
largest_number = 0

for num in numbers:
    if num > largest_number:
        largest_number = num

print(f"Max: {largest_number}")

# or in short we can use max() built in function 
largest_number = max(numbers)
print(f"Max: {largest_number}")
