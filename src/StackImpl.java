public class StackImpl {
    private int [] array;
    private int top; // top pointer index
    private int capacity;

    public StackImpl(int capacity) {
        this.array = new int [capacity];
        this.capacity = capacity;
        this.top=-1; //-1 represents empty stack
    }

    public int pop (){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty!");
        }
        return array[top--];
    }

    public void push (int item){
        if (isFull()){
            throw new RuntimeException("Stack is Full!");
        }
        array[++top]=item; //we have to pre increment post because it is initialized at -1
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is Empty!");
        }
        return array[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capacity;
    }
}
