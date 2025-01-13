public class Queue_using_array{
    public static class Queue{

        static  int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isempty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("ques is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isempty()){
                System.out.println("empty quese");
                return -1;
            }
            int front=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue hs=new Queue(5);
        hs.add(1);
        hs.add(2);
        hs.add(3);

        while(!hs.isempty()){
            System.out.print(hs.peek()+"\n");
            hs.remove();
        }
    }
}
