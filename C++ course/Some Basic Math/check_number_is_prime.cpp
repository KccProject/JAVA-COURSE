#include<bits/stdc++.h>
using namespace std;

int main(){
    int num;
    cin>>num;
    bool check = true;

    for(int i=2;i<num;i++) if(num%i==0) check = false;

    if(check == true) cout<<"The number is prime number"<<endl;
    else cout<<"The number is not prime number"<<endl;
    return 0;
}