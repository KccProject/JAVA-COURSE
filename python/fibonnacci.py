
def fibo(num):
    first = 1
    second = 1
    print(0)
    print(1)
    print(1)
    for i in range(2,num):
        third = first + second
        print(third)
        first = second
        second = third


num = int(input("Enter your number : "))
fibo(num)
