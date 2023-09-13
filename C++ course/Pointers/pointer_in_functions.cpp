#include<bits/stdc++.h>
using namespace std;

void fun(int *p){
    //cout<<*p<<endl;
    p=p+1;
}

void update(int *p){
    // for changing the value of *p 
    *p=*p+1;
}

// void getsum(int arr[],int n)
void getsum(int *arr,int n){
    cout<<sizeof(arr)<<endl;h
    int sum=0;
    for(int i=0;i<n;i++) sum+=*(arr+i);
    cout<<sum<<endl;
}

int main(){
    int n=5;
    int *p = &n;
    cout<<"Before : "<<*p<<endl;
    fun(p);
    cout<<*p<<endl;
    update(p);
    cout<<"After  : "<<*p<<endl;
    int arr[5]={1,2,3,4,5};
    getsum(arr,5);
    return 0;
}