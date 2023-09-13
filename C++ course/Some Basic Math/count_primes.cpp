#include<bits/stdc++.h>
using namespace std;

// there is an algorithm
// optimised algo named Sieve of Eratosthenes
// it helps us to find prime count upto a given number

int SOE(int n){
    vector<bool> a(n,true);
    // we know that 0 & 1 is not a prime number
    a[0] = a[1] = false;
    int count=0;
    for(int i=2;i<n;i++){
        // if a number is prime increment count
        if(a[i]==true){
            count++;
            // check by the loop that the present number is divisible by i
            // if it is. change it to false.
            for(int j=2*i;j<n;j=j+i) a[j] = false;
        }
    }
    return count;
}

int main(){
    int num,count=0;
    cin>>num;
    // for(int i=num-1;i>=2;i--){
    //     bool check = true;
    //     for(int j=2;j<i;j++) if(i%j == 0) check = false;
    //     if(check == true) count++;
    // }
    // cout<<count; 
    cout<<SOE(num);
    return 0;
}
