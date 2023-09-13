#include<bits/stdc++.h>
using namespace std;


bool binary_search(int arr[], int start, int end, int target) {
    // base case: if the start index is greater than the end index, target is not present
    if (start > end) {
        return false;
    }
    /*
    if (start > end) {
        return -1;  // return -1 to indicate that the target is not found
    }
    */

    // calculate the middle index
    int mid = start + (end - start) / 2;

    // base case: if the middle element is equal to the target, it is found
    if (arr[mid] == target) {
        return true;
    }

    // recursive relation: if the middle element is greater than the target, search the left half
    if (arr[mid] > target) {
        return binary_search(arr, start, mid - 1, target);
    }
    // recursive relation: if the middle element is less than the target, search the right half
    else {
        return binary_search(arr, mid + 1, end, target);
    }
}

int main() {
    int size, target;
    cin >> size >> target;
    int arr[size];
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    // call the binary_search function with initial start and end indices
    bool ans = binary_search(arr, 0, size - 1, target);

    if (ans) {
        cout << "Present" << endl;
    }
    else {
        cout << "Absent" << endl;
    }

    return 0;
}
