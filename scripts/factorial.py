num = int(input("Enter the num: "))
res = 1
for i in range(2, num + 1):
    res *= i
print(f"Factorial of {num} is {res}")