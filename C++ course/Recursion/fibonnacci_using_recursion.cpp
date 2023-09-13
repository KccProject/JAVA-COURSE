#include<bits/stdc++.h>
using namespace std;

// Fibonacci using recursion
int fibonacci(int n){
    // base case
    if(n==0) return 0;
    if(n==1) return 1;
    //recursive relation
    return fibonacci(n-2)+fibonacci(n-1);
}

int main(){
    int n;
    cin>>n;
    for(int i=0;i<=n;i++) cout<<fibonacci(i)<<" ";
    return 0;
}