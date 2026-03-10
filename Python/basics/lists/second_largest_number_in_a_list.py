# Find the second largest number in a list.
numbers = [3, 7, 2, 9, 5, 4]

# Sort the list in ascending order
sorted_list = sorted(numbers) # [2, 3, 4, 5, 7, 9]

# The second largest element is at the second-to-last position (index -2)
second_largest_number = sorted_list[-2]

print(f"Second Max: {second_largest_number}")
