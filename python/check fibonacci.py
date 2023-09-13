# checking the number is fibonacci number or not ?
def check(num):
    if (num==0 or num==1):
        return True
    first,second = 0,1
    while (num>second):
        third = first+second
        first = second
        second = third
        if(num==third): 
            return True
    return False
    
# Driver Code 
num = int(input("Enter Your Number : "))
print(check(num))