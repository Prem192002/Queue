import java.util.ArrayList;

public class usingArray {
    static class Queue{
        int[] arr = new int[5];
        int insert=0;
        int access=0;
        void add(int num){
            if(insert<arr.length){
            arr[insert]=num;
            insert++;
            }
            else{
                System.out.println("Error:QueueOverfow");
            }
        }
    
        int remove(){
            if(access<arr.length){
            int temp=arr[access];
            arr[access]=0;
            access++;
            return temp;
            }
            else{
                return -1;
            }
        }
    
        int peek(){
            return arr[access];
        }

        void display(){
            for(int i=access;i<insert;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        

        Queue q = new Queue();
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        q.add(30);
        
        q.display();

        System.out.println();

        q.remove();
        
        System.out.println(q.peek());

    }
}


