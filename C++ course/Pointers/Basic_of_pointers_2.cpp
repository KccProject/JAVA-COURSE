
#include<bits/stdc++.h>
using namespace std;
 
int main(){
    int arr[10] = {0,11,22,33,44,55,66,77,88,99};
    cout<<"address of first block of array is : "<<arr<<endl;
    cout<<arr[0]<<endl;
    cout<<"address of first block of array is : "<<&arr[0]<<endl;
    /*
    Note :- ptr represent address
           *ptr represent value present at the address store by ptr
           *ptr+1 means add 1 to the value POINTED by the pointer
           *(ptr + 1) means increment in pointer and then point the value
    */
    int *ptr = &arr[0]; 
    cout<<"ptr : "<<ptr<<endl;
    cout<<"*ptr : "<<*ptr<<endl;// first element of array
    *(ptr++);// pointer increment
    cout<<"*ptr : "<<*ptr<<endl;// second element of array
    *(ptr++);//pointer increment
    cout<<"*ptr : "<<*ptr<<endl;// third element of array
    *(ptr++);// pointer increment
    cout<<"*ptr : "<<*ptr<<endl;// fourth element of array

    // arr[i] = *(arr + 1)
    // i[arr] =  *(i + arr)

    cout<<"Size of ptr  : "<<ptr<<endl;
    cout<<"Size of *ptr : "<<*ptr<<endl;
    cout<<"Size of &ptr : "<<&ptr<<endl;
    return 0;
}