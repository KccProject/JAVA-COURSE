#include<bits/stdc++.h>
using namespace std;

// There are two type of recursion 
// 1, Tail recursion
// in this when recursive relation will appear after the processing is Tail recursion
// 2, Head recursion
// in this when recursive relation will appear before the processing is Head recursion

// Head recursion
void count1(int n){
    // base condition
    if(n==0) return;
    // reursive relation
    count1(n-1);
    // processing
    cout<<n<<" ";
}

// Tail recursion
int count(int n){
    // base condition
    if(n==1) return 1;
    // processing
    cout<<n<<" ";
    // recursive relation
    return count(n-1);
}

int main(){
    int n;
    cin>>n;
    cout<<count(n)<<endl;
    count1(n);
    return 0;
}