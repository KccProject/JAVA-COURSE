#include<bits/stdc++.h>
using namespace std;

void update(int& n){
    n++;
}

int fun(int n){
    int num = n;
    int& ans = num;
    return ans;
}

int main(){
    int i = 5;
    // Creating a Reference Variable
    int &j = i;
    cout<<i<<endl;
    j++;
    cout<<i<<endl;
    j++;
    cout<<i<<endl;
    // 
    update(i);
    cout<<i<<endl;
    cout<<i<<endl;

    cout<<fun(56);
    return 0;
}