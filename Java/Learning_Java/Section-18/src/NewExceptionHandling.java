class StackOverflow extends Exception{
    @Override
    public String toString(){
        return "Stack Over flow";
    }
}

class StackUnderFlow extends Exception{
    @Override
    public String toString(){
        return "Stack Under flow";
    }
}


class Stack {

    public int size = 4;

    int[] arr = new int[5];
    int index = 0;


    public void push(int value) throws StackOverflow {

        if(index >4){
            throw new StackOverflow();
        }
        else{
            arr[index] = value;
            index++;
        }

    }

    public void pop(int value) throws Exception{
        if(size < 0){
            throw new Exception();
        }
        else{
            arr[size] = 0;
            size--;
        }

    }

}

public class NewExceptionHandling {

    public static void main(String[] args) {
        Stack s = new Stack();
        try{
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
        }catch (StackOverflow e){
            System.out.println(e);
        }

    }
}

