#a = 20
#b = 23
#a = input("Enter the number a : ")
#b = input("Enter the number b : ")
#if ((a%2)==0):
#    print("a is even")
#else:
#    print("a is odd")

a = int(input("enter a : "))
b = int(input("enter b : "))
c = int(input("enter c : "))
# if three of them are same
if(a==b==c):
    print("a,b,c are equal")
# if two of them are same
elif(a==b):
    if(c>a):
        print("c>(a=b)")
    elif(a>c):
        print("(a=b)>c")
elif(b==c):
    if(a>b):
         print("a>(c=b)")
    elif(b>a):
        print("(b=c)>a")
# it is only when a,b,c is different from each other
elif (a>b):
    if (a>c):
        print("a is first")
        if(b>c):
            print("b is second")
            print("c is third")
        elif(c>b):
            print("c is second")
            print("b is third")
    elif(c>a):
        print("c is first")
        print("a is second")
        print("b is third")
elif(b>a):
    if(a>c):
        print("b is first")
        print("a is second")
        print("c is third")
    elif(c>a):
        if(b>c):
            print("b is first")
            print("c is second")
        elif(c>b):
            print("c is first")
            print("b is second")
        print("a is third")
