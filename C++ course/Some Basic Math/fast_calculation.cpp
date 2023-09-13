#include<bits/stdc++.h>
using namespace std;

int main(){
    int num,pow;
    cin>>num>>pow;
    int result;
    while(pow>0){
        // check pow is odd
        if(pow&1) result = result * num;
        num*=num;
        pow = pow>>1;
    }
    cout<<num; 
    return 0;
}