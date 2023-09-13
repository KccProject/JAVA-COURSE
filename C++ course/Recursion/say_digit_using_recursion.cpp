#include<bits/stdc++.h>
using namespace std;

string digitAlpha(int num){
    string Alpha[10]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    return Alpha[num];
}

string sayDigit(int n){
    // base case
    // isme hamara null string return ho jayga 
    // jab hamare pass n ki value zero hogi
    if(n==0) return "";
    // processing
    // yaha pr vo hi basic si digit access kr rhe h
    int ans = n%10;
    n = n / 10;
    // ye h hamara main recursive relation
    // yaha pr ham do function call kr rhe h
    // sayDigit ko isliye kyuki hame baki ki digit chahiye
    // digitAlpha isliye kyuki jo hame alredy pata h usse uska word access krne k liye
    return sayDigit(n) + digitAlpha(ans) + " ";
}

int main(){
    int n;
    cin>>n;
    cout<<sayDigit(n);
    return 0;
}