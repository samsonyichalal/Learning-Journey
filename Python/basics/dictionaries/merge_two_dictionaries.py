# Merge two dictionaries and add values if keys match

dict1 = {"a": 1, "b": 2}
dict2 = {"b": 3, "c": 4}

merged = dict1.copy()

for key, value in dict2.items():
    if key in merged:
        merged[key] += value
    else:
        merged[key] = value

print("Merged dictionary:", merged)