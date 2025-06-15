class MyQueue {
public:
    stack<int>s1;
    stack<int>s2;              // we will take 2 stacks and make enqueue operation costly

    MyQueue() {
        
    }
    
    void push(int x) {
        while(!s1.empty()){          // 1.first we will push s1 to s2
                                     // 2.then push x to s1
            s2.push(s1.top());       // 3. then again push s2 to s1.
            s1.pop();
        }

        s1.push(x);

        while(!s2.empty()){
            s1.push(s2.top());
            s2.pop();

        }
    }
    
    int pop() {
       
        

        int result= s1.top();            // we will return s1 top and pop it.
        s1.pop();
        return result;
    }
    
    int peek() {
     return s1.top();
    }
    
    bool empty() {
        return s1.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */
