public class BuildBST {
    public static class Node{
        int data;
        Node letf;
        Node right;
        public Node(int data){
            this.data = data;
            this.letf = null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            // left subtree
            root.letf=insert(root.letf,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
       if(root==null){
           return  ;
       }
        inorder(root.letf);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[]={5,1,3,3,2,7};
        Node root=null;

        for(int i=0; i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

    }
}
