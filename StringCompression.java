// leetcode 443

public class StringCompression {

    public static void main(String[] args) {
        
        char[] arr = new char[] { 'a' , 'a' , 'b' , 'b' , 'c' , 'c' , 'c'};

        StringBuilder sb = new StringBuilder();
        int count =1;

        int len = arr.length;

        for(int i=0;i<arr.length;i++){

            if(i+1 < len && arr[i] == arr[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    sb.append(arr[i]);
                }
                else{
                    sb.append(arr[i]).append(count);
                }
            }

        }

        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
