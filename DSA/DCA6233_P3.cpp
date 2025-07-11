#include <iostream>
using namespace std;

int recursiveSearch(int arr[], int size, int target, int index = 0) {
    if (index == size) return -1;
    if (arr[index] == target) return index;
    return recursiveSearch(arr, size, target, index + 1);
}

int main() {
    int arr[] = {3, 8, 12, 5, 6, 9};
    int target = 5;
    int size = sizeof(arr) / sizeof(arr[0]);

    int result = recursiveSearch(arr, size, target);
    cout << result << endl;
    return 0;
}
