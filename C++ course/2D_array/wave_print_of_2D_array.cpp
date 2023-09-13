#include<bits/stdc++.h>
using namespace std;

int main(){
    int nRows,mCols;
    cin>>nRows>>mCols;
    int arr[nRows][mCols];
    for(int i=0;i<nRows;i++) for(int j=0;j<mCols;j++) cin>>arr[i][j];
    // Wave print of 2D array
    for(int j=0;j<mCols;j++){
        if(j%2 != 0) for(int i=nRows-1;i>=0;i--) cout<<arr[i][j]<<" ";
        else for(int i=0;i<nRows;i++) cout<<arr[i][j]<<" ";
    }
    return 0;
}