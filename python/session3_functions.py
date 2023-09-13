#!/usr/bin/env python
# coding: utf-8

# In[34]:


def dummyFunc():
    print("This is just a test statement, print is an inbuilt function")
    print("This is line 2")

def add_it(a,b):
    '''
    The function takes two numbers as input and adds the two numbers
    a: input number 1 that must be added
    b: input number 2 that must be added
    returns the addition of a and b
    '''
    if (type(a) is not int)  or (type(b) is not int):
        print("Only integer input is allowed")
        return 0
    print("a ---> ",a)
    print("b ---> ",b)
    addition = a+b
    print("sum of ",a," and ",b," is : ", addition)
    return addition

def multiply_it(a,b):
    print("a ---> ",a)
    print("b ---> ",b)
    product = a*b
    print("product of ",a," and ",b," is : ", product)


# In[35]:


add_it("2","3")


# In[30]:


def sum(a,b):
    print("value of input parameter a is : ",a)
    print("value of input parameter b is : ",b)
    s=a+b
    return s

print(sum("a","b"))



# In[32]:


type("2") is int


# In[29]:



dummyFunc()
#multiply_it("the","tree")


# In[1]:


#Creating and using a function

def hello():
    print("This is my first python function")
    print("Hello World")


# In[2]:


#accessing functions
hello()


# In[3]:


#Sending information to functions
# name ---> the input "parameter" for the function called "hello". The value that you pass for this parameter
#while invoking the function is called "argument"

def hello(name):
    print("Hello World")
    print("This is ",name)


# In[4]:


#pass your name as argument to the "hello" function

hello("Groot")


# In[ ]:


#Using return statement in a function. Writing complex logic using decision making and invoking functions
#TODO
'''Write a function named "findCircleArea" that has a single parameter named 'radius'. 
Write another function named "findRectangleArea", that has two parameters 'length','breadth'.
Take input from user, first for a choice between circle and rectangle, then another input for radius, length and breadth,
based on whether they chose circle or rectangle. If they chose circle, then you need only radius.
Invoke the appropriate function to find the area

'''


# In[5]:


def findSquareArea(side):
    area = side*side
    return area

square_area = findSquareArea(4)
print("Area of the square = ",square_area)


# In[ ]:


#TODO
#Try invoking the findSquareArea with a string value as argument


# In[7]:


#Giving function parameters a default value

def hello2(greeting = "No Value Supplied"):
    print(greeting)


# In[9]:


hello2("Hello there!, How are you")


# In[ ]:


hello2()


# In[13]:


#Creating functions with a variable number of arguments.
#To Be discussed in a later session, after loops and datastructures are discussed

def hello4(ArgCount, *VarArgs):
    print("You passed ", ArgCount, " arguments.")
    print(" VarArgs data type = ",type(VarArgs))
    for Arg in VarArgs:
        print(Arg)
hello4(1, "A Test String.")
hello4(3, "One", "Two","Three")


# In[14]:


#Scope of Variables

# Global scope
X = 99 # X and func assigned in file: global
def func(Y): # Y and Z assigned in function: locals
    # Local scope
    Z = X + Y # X is a global
    return Z
func(1) #  result=100


# In[ ]:


'''
Global names: X, func
X is global because it’s assigned at the top level of the  file; it can be referenced
inside the function without being declared global. func is global for the same
reason.

Local names: Y, Z
Y and Z are local to the function (and exist only while the function runs) because
they are both assigned values in the function definition: Z by virtue of the = statement,
and Y because arguments are always passed by assignment.

The whole point behind this name-segregation scheme is that local variables serve as
temporary names that you need only while a function is running. 
'''


# In[ ]:


#TODO
#Try to print the value of the varaible Y or Z outside the function called "func" above


# In[ ]:


#1. What is the output of the following code, and why?
def func(a, b=4, c=5):
     print(a, b, c)

func(1, 2)

#2. What is the output of this code, and why?
def func(a, b, c=5):
    print(a, b, c)

func(1, c=3, b=2)


#3. what is the output of this code, and why? Will revisit this question again in a later session
def func(a, b, c=3, d=4):
    print(a, b, c, d)

func(1, *(5,6))


# In[ ]:


'''
1. The output here is '1 2 5', because 1 and 2 are passed to a and b by position, and c is omitted in the call and 
defaults to 5.
2. The output this time is '1 2 3': 1 is passed to a by position, and b and c are passed 2 and 3 by name 
(the left to-right order doesn’t matter when keyword arguments are used like this).

3. The output here is '1 5 6 4': 1 matches a by position, 5 and 6 match b and c by
*name positionals (6 overrides c’s default), and d defaults to 4 because it was not
passed a value.

Rules for argument passing:

Positionals: matched from left to right
    The normal case, which we’ve mostly been using so far, is to match passed argument values to argument
    names in a function header by position, from left to right.
    
Keywords: matched by argument name
    Alternatively, callers can specify which argument in the function is to receive a value by using the argument’s name 
in the call, with the name=value syntax.

Defaults: specify values for arguments that aren’t passed
    Functions themselves can specify default values for arguments to receive if the callpasses too few values, 
    again using the name=value syntax.

'''


# In[ ]:


#TODO

'''
Improvise the code to compare 3 numbers and finding the greatest, second and least number, by using functions. 
'''

