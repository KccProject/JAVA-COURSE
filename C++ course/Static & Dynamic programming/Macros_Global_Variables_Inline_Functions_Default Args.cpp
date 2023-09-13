#include<bits/stdc++.h>
using namespace std;
// Macro
#define PI 3.14 // it is immutable

int score = 15; // it is a Global Variable
// Global variable is mutable
void b(int& i){
    cout<<i<<endl;
    cout<<"score in b "<<score<<endl;
}

void a(int& i){
    cout<<i<<endl;
    cout<<"score in a "<<score<<endl;
    score++;
    b(i);
}

void func(int& a,int& b){
    ans = (a>b) ? a /*this part shows the if condition*/: b/*hence this part shows else condition*/;

}

void prints(int arr[],int n,int start=0 /*this is a default argument*/){
    
}

int main(){
    int r = 5;
    double area = (PI)*(r)*(r);
    cout<<"score in main "<<score<<endl;
    score++;
    cout<<"Area is "<<area<<endl;
    int ia =5;// local   variable
    a(ia);

    // inlined function
    // are used to reduce the function calls
    // inline function ham more than 2 line se zada nhi bana sakte
    int a = 1,b = 2;
    func(a,b);

    // Now we gona learn Default Arguments
    int arr[5] = {1,4,7,8,9};
    int size = 5;

    
    return 0;
}