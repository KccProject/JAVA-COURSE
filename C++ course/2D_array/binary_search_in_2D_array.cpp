#include<bits/stdc++.h>
using namespace std;

int main(){
    // taking input from the user.
    int row,col;
    cin>>row>>col;
    int arr[row][col];
    for(int i=0;i<row;i++) for(int j=0;j<col;j++) cin>>arr[i][j];

    // target we wanna find in 2D array
    int target;
    cin>>target;
    
    // applying binary search in 2D array
    // the first assumption we are gonna suppose is to 
    // assume the 2D matrix as a linear matrix row wise 

    int s = 0;
    int e = row*col - 1;
    // now we are gonna find mid element of assumed linear 2D array
    int mid = s + (e-s)/2;
    bool present = 0; 
    while(s<=e){

        // the element which have to be compared
        // now we are finding the row number so, we are diving the mid by col
        // row of mid element is [mid/col]
        // now we are finding the col number of mid element 
        // col of mid element is [mid%col]
        int element = arr[mid/col][mid%col];

        // now rest of binary search is same
        if(element == target) present = 1;
        if(element < target) s = mid+1;
        else e = mid-1;

        mid = s + (e-s)/2;
    }

    if(present == 1) cout<<"Your element is present in 2D array";
    else cout<<" Not Found ";
    return 0;
}