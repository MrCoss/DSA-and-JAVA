#include <iostream>
using namespace std;

// Node structure for linked list stack
struct Node {
    int data;
    Node* next;

    Node(int val) : data(val), next(nullptr) {}
};

// Stack implementation using linked list
class Stack {
private:
    Node* top;

public:
    Stack() : top(nullptr) {}

    void push(int val) {
        Node* newNode = new Node(val);
        newNode->next = top;
        top = newNode;
    }

    void pop() {
        if (top == nullptr) {
            cout << "Stack Underflow" << endl;
            return;
        }
        Node* temp = top;
        top = top->next;
        delete temp;
    }

    int peek() const {
        if (top == nullptr) {
            cout << "Stack is empty" << endl;
            return -1;
        }
        return top->data;
    }

    bool isEmpty() const {
        return top == nullptr;
    }

    void displayAndClear() {
        while (!isEmpty()) {
            cout << peek() << " ";
            pop();
        }
        cout << endl;
    }

    ~Stack() {
        while (!isEmpty()) {
            pop();
        }
    }
};

int main() {
    int values[] = {10, 20, 30, 40};
    int n = sizeof(values) / sizeof(values[0]);

    Stack s;
    for (int i = 0; i < n; ++i) {
        s.push(values[i]);
    }

    s.displayAndClear();

    return 0;
}
