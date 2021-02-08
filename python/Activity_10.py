###Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5###
num_tuple = (3, 5, 33, 46, 4)
print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)