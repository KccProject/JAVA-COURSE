#include<bits/stdc++.h>
using namespace std;

int main(){
    //Takig Input from User
    int rows,cols;
    cin>>rows>>cols;
    int arr[rows][cols];  
    for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) cin>>arr[i][j];
    
    //Logic for Spiral Print of an 2-D array
    int count = 0;
    int total = rows*cols;

    int sr=0,sc=0,er=rows-1,ec=cols-1;
    
    while(count<total){
        //print starting row
        for(int i=sc;i<=ec;i++){ 
            cout<<arr[sr][i]<<" ";
            count++;
        }
        sr++;
        cout<<endl;
        //print ending coloumn
        for(int i=sr;i<=er;i++){ 
            cout<<arr[i][ec]<<" ";
            count++;
        }
        ec--;
        cout<<endl;
        //print ending row
        for(int i=ec;i>=sc;i--){ 
            cout<<arr[er][i]<<" ";
            count++;
        }
        er--;
        cout<<endl;
        //print staring coloumn
        for(int i=er;i>=sr;i--){ 
            cout<<arr[i][sc]<<" ";
            count++;
        }
        sc++;
        cout<<endl;
    }
    return 0;
}