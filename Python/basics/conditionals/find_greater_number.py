# This program compares two numbers
# and prints the greater one.

first_number = int(input("Enter first number: "))
second_number = int(input("Enter second number: "))

if first_number > second_number:
    print("Greater number is:", first_number)
elif second_number > first_number:
    print("Greater number is:", second_number)
else:
    print("Both numbers are equal.")