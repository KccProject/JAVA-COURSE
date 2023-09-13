#include<bits/stdc++.h>
using namespace std;

int main(){
    //Takig Input from User
    int rows,cols;
    cin>>rows>>cols;
    int arr[rows][cols];  
    for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) cin>>arr[i][j];

    // Rotate 2D array by 90 degree
    for(int j=0;j<cols;j++){
        for(int i=rows-1;i>=0;i--) cout<<arr[i][j]<<" ";
    }
    return 0;
}
//for(int i=rows-1;i>=0;i--)