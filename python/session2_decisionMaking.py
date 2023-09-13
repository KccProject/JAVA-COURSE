#!/usr/bin/env python
# coding: utf-8

# In[23]:


(2+3)/(3-2)


# In[22]:


2+3/3-2


# In[24]:


test = 6
if test == 6:
    print("test does equal 6!")
print("I am outside if construct")


# In[26]:


test = 6
if test == 5:
    print("test does equal 6!")
    print("All done!")


# In[ ]:


Value = int(input("Type a number between 1 and 10: "))
if (Value > 0) and (Value <= 10):
    print("You typed: ", Value)


# In[2]:


Value = int(input("Type a number between 1 and 10: "))
if (Value > 0) and (Value <= 10):
    print("You typed: ", Value)
else:
    print("The value you typed is incorrect!")


# In[1]:


print("1. Red")
print("2. Orange")
print("3. Yellow")
print("4. Green")
print("5. Blue")
print("6. Purple")
Choice = int(input("Select your favorite color: "))
if (Choice == 1):
    print("You chose Red!")
elif (Choice == 2):
    print("You chose Orange!")
elif (Choice == 3):
    print("You chose Yellow!")
elif (Choice == 4):
    print("You chose Green!")
elif (Choice == 5):
    print("You chose Blue!")
elif (Choice == 6):
    print("You chose Purple!")
else:
    print("You made an invalid choice!")


# In[ ]:


One = int(input("Type a number between 1 and 10: "))
Two = int(input("Type a number between 1 and 10: "))
if (One >= 1) and (One <= 10):
    if (Two >= 1) and (Two <= 10):
        print("Your secret number is: ", One * Two)
    else:
        print("Incorrect second value!")
else:
    print("Incorrect first value!")


# In[29]:


#Creating a Breakfast Menu
print("1. Eggs")
print("2. Pancakes")
print("3. Waffles")
print("4. Oatmeal")
mainChoice = int(input("Choose a breakfast item: "))
if (mainChoice == 2):
    meal = "Pancakes"
elif (mainChoice == 3):
    meal = "Waffles"
if (mainChoice == 1):
    print("1. Wheat Toast")
    print("2. Sour Dough")
    print("3. Rye Toast")
    print("4. Pancakes")
    bread = int(input("Choose a type of bread: "))
    if (bread == 1):
        print("You chose eggs with wheat toast.")
    elif (bread == 2):
        print("You chose eggs with sour dough.")
    elif (bread == 3):
        print("You chose eggs with rye toast.")
    elif (bread == 4):
        print("You chose eggs with pancakes.")
    else:
        print("We have eggs, but not that kind of bread.")
elif (mainChoice == 2) or (mainChoice == 3):
    print("1. Syrup")
    print("2. Strawberries")
    print("3. Powdered Sugar")
    topping = int(input("Choose a topping: "))
    if (topping == 1):
        print ("You chose " + meal + " with syrup.")
    elif (topping == 2):
        print ("You chose " + meal + " with strawberries.")
    elif (topping == 3):
        print ("You chose " + meal + " with powdered sugar.")
    else:
        print ("We have " + meal + ", but not that topping.")
elif (mainChoice == 4):
    print("You chose oatmeal.")
else:
    print("We don't serve that breakfast item!")


# In[18]:


isInputValid = True
try:
    num1 = int(input("Enter an integer : "))
    num2 = int(input("Enter an integer : "))
    num3 = int(input("Enter an integer : "))
    #print(num4)
    #"groot"/2
except ValueError:
    print("Encountered a valueError, the input provided could not be converted to integer")
    isInputValid = False
    print("Invalid input")
except NameError:
    print("Encountered a NameError, did you use a variable that was not defined?")
except:
    print("some error we did not account for in our design")
    
    
if isInputValid:
    print("valid input")
    


# In[32]:


isInputValid = True
try:
    num1 = int(input("Enter an integer : "))
    
except:
    print("Invalid input")
print("outside except block")


# In[30]:


num1 = int(input("Enter an integer : "))


# In[2]:


isInputValid = False
while not isInputValid:
    try:
        num1 = int(input("Enter an integer : "))
        isInputValid = True
    except:
        print("Invalid input")


# In[ ]:


a = 23
b= 34
c = 45

if 

