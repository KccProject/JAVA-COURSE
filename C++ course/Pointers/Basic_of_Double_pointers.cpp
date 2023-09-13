#include<bits/stdc++.h>
using namespace std;

void update(int **ptr2){
    //ptr2 = ptr2 + 1; // doesnot work because it is call by value
    //*ptr2 = *ptr2 + 1; // it works because it is call by reference
    **ptr2 = **ptr2 + 1;
}

void mcq1(){
    // SOME QUESTION ON POINTERS
    int first = 9;
    int second = 10;
    int *ptr = &second;
    *ptr = 9;
    cout<<" question 1 "<<endl;
    cout<<first<<" "<<second<<endl;
}

void mcq2(){
    int first = 6;
    int *p = &first;
    int *q = p;
    (*q)++;
    cout<<" question 2 "<<endl;
    cout<<first<<endl;
}

void mcq3(){
    int first = 8;
    int *p = &first;
    cout<<" question 3 "<<endl;
    cout<<(*p)++<<" ";
    cout<<first<<endl;
}

void mcq4(){
    int *p = 0;
    int first = 110;
    *p = first;// this line have a fault(segmentation fault)
    // if we initialize the null pointer then we will point to any number
    // so we have to write it like this
    // int *p = 0;
    // int first = 1;
    // *p = &first --> this is correct.
    cout<<" question 4 "<<endl;
    cout<<*p<<endl;
}

void mcq5(){
    int first = 8;
    int second = 11;
    int *third = &second;
    first = *third;
    *third = *third + 2;
    cout<<first<<" "<<second<<endl;
}

void mcq6(){
    float f = 12.5;
    float p = 21.5;
    float* ptr = &f;
    (*ptr)++;
    *ptr = p;
    cout<<*ptr<<" "<<f<<" "<<p<<endl;
}

void mcq7(){
    int arr[5];
    int *ptr;
    cout<<sizeof(arr)<<" "<<sizeof(ptr)<<endl; 
}

void mcq8(){
    int arr[]={11,21,13,14};
    cout<<*(arr)<<" "<<*(arr+1)<<endl;
}

void mcq9(){
    int arr[6] = {11,12,31};
    // arr = &arr = &arr[0] gives address
    cout<<arr<<" "<<&arr<<endl;
}

void mcq10(){
    int arr[6] = {11,21,13};
    // it gives address of second element
    // address of 21
    cout<<(arr+1)<<endl;
}

void mcq11(){
    int arr[6] = {11,21,31};
    int* p = arr;
    // *(p+2) is equals to p[2]
    // it return vlaue not an address
    cout<<p[2]<<endl;
}

void mcq12(){
    int arr[] = {11,12,13,14,15};
    cout<<*(arr)<<" "<<*(arr+3);
}

void mcq13(){
    int arr[]={11,21,31,41};
    //int *ptr=arr++; --> it throws error because you increment in symbol table which is not possible
    //cout<<*ptr<<endl;
}

void mcq14(){
    char ch = 'a';
    char* ptr = &ch;
    ch++;
    cout<<*ptr<<endl;
}

void mcq15(){
    char arr[] = "abcde";
    char *p = &arr[0];
    cout<<p<<endl;
}

void mcq16(){
    char arr[] = "abcde";
    char *p = &arr[0];
    p++;
    cout<<p<<endl;
}

void mcq17(){
    char str[] = "babber";
    char *p = str;
    // in character *p = str is valid.
    // but *p = &str is not valid.
    cout<<str[0]<<" "<<p[0]<<endl;
}

void updte(int* p){
    *p = (*p) * 2;
}

void mcq18(){
    int i = 10;
    updte(&i);
    cout<<i<<endl;
}

void mcq19(){
    int first = 110;
    int *p = &first;
    int **q = &p;
    int second = (**q)++ + 9;
    cout<<first<<" "<<second<<endl;
}

void mcq20(){
    int first = 100;
    int *p = &first;
    int **q = &p;
    int second = ++(**q);
    int *r = *q;
    ++(*r);
    cout<<first<<" "<<second<<endl;
}

void inc(int **p){
    ++(**p);
}

void mcq21(){
    int num = 110;
    int* ptr = &num;
    inc(&ptr);
    cout<<num<<endl;
}

int main(){
    int n=5;
    // Single Pointers
    int* ptr1 = &n;
    // Double pointers
    int** ptr2 = &ptr1;

    // n stores 
    cout<<"n stores : "<<n<<endl;
    // prt1 stores
    cout<<"ptr1 stores : "<<ptr1<<endl;
    // ptr2 stores
    cout<<"ptr2 stores : "<<ptr2<<endl;

    // ptr points to n
    cout<<"*ptr1 points to : "<<*ptr1<<endl;
    // ptr2 points to ptr1
    cout<<"*ptr2 points to : "<<*ptr2<<endl;
    // ptr2 points to n
    cout<<"**ptr2 points to : "<<**ptr2<<endl;

    update(ptr2);
    cout<<**ptr2<<endl; 
    mcq1();
    mcq2();
    mcq3();
    mcq4();
    mcq5();
    mcq6();
    mcq7();
    mcq8();
    mcq9();
    mcq10();
    mcq11();
    mcq12();
    mcq13();
    mcq14();
    mcq15();
    mcq16();
    mcq17();
    mcq18();
    mcq19();
    mcq20();
    mcq21();
    return 0;
}