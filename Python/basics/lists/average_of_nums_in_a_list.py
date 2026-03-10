# Calculate the average of numbers in a list.

my_list = [1, 2, 3, 4, 5, 6, 7]
total = sum(my_list)

# or we can use for loop to calculate loop
total = 0
for num in my_list:
    total += num

average = total / len(my_list)

print(f"Average: {average}")
