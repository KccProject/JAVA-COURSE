#include<bits/stdc++.h>
using namespace std;

// find power of a given number
int powofnum(int num,int pow){
    // base case
    if(pow==0) return 1;
    // aproach
    int chotiproblem = powofnum(num,pow-1);
    int badiproblem = chotiproblem*num;
    return badiproblem;
    // return num*powofnum(num,pow-1);
}

int main(){
    // for power
    int num,pow;
    cin>>num>>pow;
    int ans1=powofnum(num,pow);
    cout<<ans1;
    return 0;
}