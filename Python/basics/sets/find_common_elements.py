# This program finds the common values between two lists
# by converting them into sets.

list1 = [1, 2, 3, 4]
list2 = [3, 4, 5, 6]

common_values = set(list1) & set(list2)

print("Common elements:", common_values)

# we can also work without using sets by use loop
common_values = []
for lst in list1:
    if lst in list2:
        common_values.append(lst)

print("Common elements:", common_values)