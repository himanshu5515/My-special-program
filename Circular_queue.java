public class Circular_queue {

        public static class Queue{

            static  int arr[];
            static int size;
            static int rear;
             static int front=-1;

            Queue(int n){
                arr=new int[n];
                size=n;
                rear=-1;
                front=-1;
            }
            public static boolean isempty(){
                return rear==-1 && front==-1;
            }
            public static boolean isfull(){
                return (rear+1)%size==front;
            }
            public static void add(int data){
                if(isfull()){
                    System.out.println("ques is full");
                    return;
                }
                if(front==-1){
                    front=0;
                }
                rear=(rear+1 )%size;
                arr[rear]=data;
            }
            public static int remove(){
                if(isempty()){
                    System.out.println("empty quese");
                    return -1;
                }
                int result=arr[front];

                if(rear==front){
                    rear=front=-1;
                }
                else{
                    front=(front+1)%size;
                }
                return result;
            }
            public static int peek(){
                if(isempty()){
                    System.out.println("empty");
                    return -1;
                }
                return arr[front ];
            }
        }

        public static void main(String[] args) {
            Queue hs=new Queue(3);
            hs.add(1);
            hs.add(2);
            hs.add(3);
            System.out.println(hs.remove()+"l");
            hs.add(4);
            System.out.println(hs.remove()+" l");
            hs.add(5);

            while(!hs.isempty()){
                System.out.print(hs.peek()+"\n");
                hs.remove();
            }
        }
    }


