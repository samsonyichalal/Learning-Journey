# Find the student with highest score from the dictionary

students = {"Ali": 85, "Omar": 92, "Sara": 88}

top_student = None
highest_score = 0

for name, score in students.items():
    if score > highest_score:
        highest_score = score
        top_student = name

print("Top student:", top_student)
print("Score:", highest_score)

# alternatively by using max() built in function 

students = {"Ali": 85, "Omar": 92, "Sara": 88}

top_student = max(students, key=students.get)

print("Top student:", top_student)
print("Score:", students[top_student])