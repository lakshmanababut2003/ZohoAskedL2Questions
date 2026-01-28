// leetcode 20

// time - o(n)
// space - o(n)


public class ValidParathess {

    public static void main(String[] args) {

        String s = "()}";

        int len = s.length();
        
        MyStackI st = new MyStackI(len);

        for(int i=0;i<len;i++){

            char curr = s.charAt(i);

            if(curr == '(' || curr == '{' || curr == '['){
                st.push(curr);
            }
            else if( curr == ')'){

                if(st.isEmpty() || st.pop() != '('){
                    System.out.println(false);
                    return;
                }

            }
            else if(curr == '}'){
                if(st.isEmpty() || st.pop() != '{'){
                    System.out.println(false);
                    return;
                }

            }
            else if(curr == ']'){
                if(st.isEmpty() || st.pop() != '['){
                    System.out.println(false);
                    return;
                }

            }
        }

        System.out.println(st.isEmpty());

    }
    
}

class MyStackI{

    private final char[] arr;
    private int top;

    public MyStackI(int len){

        this.arr = new char[len];
        this.top = -1;
    }

    public void push(char val){

        top++;
        arr[top] = val;

    }

    public char pop(){
        
        return arr[top--];

    }

    public char peek(){

        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

}
