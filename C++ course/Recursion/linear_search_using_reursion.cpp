#include<bits/stdc++.h>
using namespace std;

bool find(int arr[],int size,int target){
    // Base Condition
    if(size==0) return false;
    // Recursive relation
    if(arr[0]==target) return true;
    else{
        return find(arr+1,size-1,target);
    }
}

int main(){
    int num,size;
    cin>>num>>size;
    int arr[size];
    for(int i=0;i<size;i++) cin>>arr[i];
    int ans = find(arr,size,num);
    if(ans==1) cout<<"Present"<<endl;
    else cout<<"Absent"<<endl;
    return 0;
}
