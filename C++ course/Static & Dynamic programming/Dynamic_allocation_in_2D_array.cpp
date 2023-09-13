#include<bits/stdc++.h>
using namespace std;

int main(){
    // here we going to creat 2D array Dynamatically
    int n,m;
    cin>>n>>m;       
    int ** arr = new int*[n];
    for(int i=0;i<n;i++)  arr[i] =  new int[m];

    // here we are taking input for 2D array
    for(int i=0;i<n;i++) for(int j=0;j<m;j++) cin>>arr[i][j];

    // here we are printting output
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }

    // heap memory ko hame manualy released krna padta h 
    for(int i=0;i<n;i++) delete [] arr[i];
    delete [] arr;
    return 0;
}