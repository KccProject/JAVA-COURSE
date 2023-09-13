#include<bits/stdc++.h>
using namespace std;

int main(){
    // creates a jagged array.
    int row,col;
    cin>>row;
    int ** arr = new int*[row];
    for(int i=0;i<row;i++){
        cin>>col;
        arr[i] =  new int[col];
    }
    // taking input in a jagged array
    for(int i=0;i<row;i++){
        int size = arr[i].size();
        //for(int j=0;j<arr[i];j++)
    }
     for(int i=0;i<row;i++) delete [] arr[i];
    delete [] arr;
    return 0;
}