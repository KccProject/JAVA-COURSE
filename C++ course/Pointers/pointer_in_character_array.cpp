#include<bits/stdc++.h>
using namespace std;

int main(){
    int arr[5] = {1,2,3,4,5};
    char ch[6] = "umair";
    // pointer thoda different h array m aur character array m
    // agr mujhe y cout<<arr<<endl; likhu to mujhe first element k address mil jayga
    // agr mujhe y cout<<ch<<endl; likhu to mujhe pura characteer array hi print hua milega
    cout<<arr<<endl;
    cout<<ch<<endl;
    // 
    char *c = &ch[0];
    cout<<c<<endl;
    //
    char temp = 'a';
    char *p = &temp; 
    // ya ha pr hamara output a rha h :- aumair
    // kyuki hamne char temp = 'z' kara h jisme 
    // pointer 
    cout<<p<<endl;
    return 0;
}