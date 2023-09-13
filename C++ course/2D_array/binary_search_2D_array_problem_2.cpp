#include<bits/stdc++.h>
using namespace std;

int main(){
    // Taking Input from user
    int row,col;
    cin>>row>>col;
    int arr[row][col];
    for(int i=0;i<row;i++) for(int j=0;j<col;j++) cin>>arr[i][j];
    int target;
    cin>>target;
    
    // search a 2D-Matrix problem 2
    bool check;
    check = false;
    int rowIndex = 0;
    int colIndex = col-1;

    while(rowIndex<row && colIndex >=0){
        int element = arr[rowIndex][colIndex];
        if(element == target) check = true;
        if(element>target) colIndex--;
        else rowIndex++;
    }

    if(check==true) cout<<"Found"<<endl;
    else cout<<"Not Found"<<endl;

    return 0;
}