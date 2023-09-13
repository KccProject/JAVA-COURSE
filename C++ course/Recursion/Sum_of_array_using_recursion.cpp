#include<bits/stdc++.h>
using namespace std;

int sum(int arr[],int size){
    // base condition
    if(size==0) return 0;
    int badiproblem = arr[0] + sum(arr+1,size-1);
    return badiproblem;
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    cout<<sum(arr,n);
    return 0;
}