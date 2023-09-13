// Recursion
#include<bits/stdc++.h>
using namespace std;

// factorial of a number
int fac(int n){
    // base case
    if(n==0) return 1;
    // recursion
    int chotiproblem = fac(n-1);
    int badiproblem = n*chotiproblem;
    return badiproblem;
    // we can use it this is same as these two lines written above
    // return n*fac(n-1);
}

int main(){
    // for factorial
    int n;
    cin>>n;
    int ans=fac(n);
    cout<<ans<<endl;
    return 0;
}
