#include<bits/stdc++.h>
using namespace std;

int main(){
    int num = 5;
    cout<<num<<endl;

    // * - means the address which store by pointer will represent the value at that address
    // & - means to represent the address of a pointeer

    //address of operator - & 
    cout<<"address of num is (&num)  : "<<&num<<endl;
    int *ptr = &num;// it is a pointer which stores address of the num
    cout<<"value POINTED by ptr (*ptr): "<<*ptr<<endl;
    cout<<"address store by ptr (ptr) : "<<ptr<<endl;
    double d = 4.32;
    double *ptr2 = &d;
    cout<<"value of ptr : "<<*ptr2<<endl;
    cout<<"address of num : "<<ptr2<<endl;

    // now we gonna see the size of pointer
    cout<<"The size of integer is : "<<sizeof(num)<<endl;
    cout<<"The size of pointer is : "<<sizeof(*ptr)<<endl;
    cout<<"The size of integer is : "<<sizeof(*ptr2)<<endl;

    // another way of pointing 
    int *p = &num;
    cout<<"num : "<<num<<endl;
    cout<<"p : "<<p<<endl;
    cout<<"*p : "<<*p<<endl;
    (*p)++;
    cout<<"*p : "<<*p<<endl;
    cout<<"num : "<<num<<endl;

    // more on pointer
    int *q = p;
    cout<<"q  : "<<q<<endl;
    cout<<"*q : "<<*q<<endl;
    (*q)++;
    cout<<"*q : "<<*q<<endl;
    cout<<"num : "<<num<<endl;
    return 0;
}