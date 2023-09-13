#include<bits/stdc++.h>
using namespace std;

int getSum(int *arr,int n){
    int sum = 0;
    for(int i=0;i<n;i++) sum+=arr[i];
    return sum;
}

int main(){
    int n;
    cin>>n;

    // we are create a simple array 
    // static allocation
    // it is created ih stack memory
    int arr1[n];
 
    // variable size array
    // it is a Dynamic allocation
    // it created in heap memory
    int* arr = new int[n];
    // if we want to delete whole array
    // delete []arr;

    // Taking input in an array
    for(int i=0;i<n;i++) cin>>arr[i];

    int ans = getSum(arr,n);

    cout<<"ans is : "<<ans<<endl;
    return 0;
}