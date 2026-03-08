# Check if a string is a palindrome
# palindrome means when the reverse of the word is the same as the original 
# madam = madam so we can say 'madam' is palindrome
string = "Madam"
reversed_string = string[::-1]

if string.lower() == reversed_string.lower():
    print(f"'{string}' is palindrome.")
else:
    print(f"'{string}' is not palindrome.")