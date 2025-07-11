#include <iostream>
#include <stack>
using namespace std;

class StackHandler {
public:
    stack<int> s;

    void load(int arr[], int n) {
        for (int i = 0; i < n; ++i)
            s.push(arr[i]);
    }

    void display() {
        while (!s.empty()) {
            cout << s.top() << " ";
            s.pop();
        }
        cout << endl;
    }
};

int main() {
    StackHandler sh;
    int values[] = {10, 20, 30, 40};
    sh.load(values, 4);
    sh.display();
    return 0;
}
