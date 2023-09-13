#include<bits/stdc++.h>
using namespace std;

// Now we gonna find that given array is sorted or not
// using recursion
bool isSorted(int arr[],int size){
    // Base Condition
    if(size==0||size==1) return true;
    // processing
    if(arr[0]>arr[1]) return false;
    // Recursive Relation
    else return isSorted(arr+1,size-1);
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    bool ans = isSorted(arr,n);
    if(ans==1) cout<<" Your array is Sorted !!! "<<endl;
    else cout<<" Your array is not Sorted !!! "<<endl;
    return 0;
}