# This program finds values that are in the first list
# but not in the second list.

list1 = [1, 2, 3, 4, 5]
list2 = [3, 4, 6]

difference = set(list1) - set(list2)

print("Elements only in list1:", list(difference))

# or we can use loop
difference = []
for lst in list1:
    if lst not in list2:
        difference.append(lst)

print("Elements only in list1:", difference)
