# This code checks whether two lists have
# at least one common value.

list1 = [10, 20, 30]
list2 = [40, 50, 20]

shared_values = set(list1) & set(list2)

if shared_values:
    print("The lists share at least one element.")
else:
    print("The lists do not share any elements.")

