numbers = list(input("Enter a sequence of comma separated values: ").split(",3"))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)