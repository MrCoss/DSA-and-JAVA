#include <iostream>
using namespace std;

void findMaxMinRecursive(int arr[], int idx, int size, int &maxVal, int &minVal) {
    if (idx == size) return;

    if (arr[idx] > maxVal) maxVal = arr[idx];
    if (arr[idx] < minVal) minVal = arr[idx];

    findMaxMinRecursive(arr, idx + 1, size, maxVal, minVal);
}

int main() {
    int nums[] = {7, 2, 9, 1, 6};
    int n = sizeof(nums) / sizeof(nums[0]);
    int maxVal = nums[0], minVal = nums[0];

    findMaxMinRecursive(nums, 1, n, maxVal, minVal);

    cout << "Maximum element: " << maxVal << endl;
    cout << "Minimum element: " << minVal << endl;

    return 0;
}
