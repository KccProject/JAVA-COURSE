#include <bits/stdc++.h>
using namespace std;

string reverse(string& name, int s, int e) {
    // Base condition: if the start index is greater than or equal to the end index,
    // return the reversed string
    if (s >= e) {
        return name;
    }

    // Processing: swap the characters at indices s and e
    char temp = name[s];
    name[s] = name[e];
    name[e] = temp;

    // Recursive relation: call reverse function recursively with updated start and end indexes
    return reverse(name, s + 1, e - 1);
}

int main() {
    string name = "umair saifi";
    int start = 0, end = name.size() - 1;

    // Call the reverse function to reverse the string
    cout << reverse(name, start, end);

    return 0;
}
