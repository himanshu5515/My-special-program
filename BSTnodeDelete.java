public class BSTnodeDelete {

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
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
            root.letf=delete(root.letf,val);
        }
        else{// case 1 leaf node
            if(root.letf==null && root.right==null){
                return null;
            }
            //case 2- singe child
            if(root.letf==null){
                return root.right;
            } else if (root.right==null) {
                return root.letf;
            }
            // case 3- both children
            Node IS=findInordersuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
public static Node findInordersuccessor(Node root){
        while(root.letf==null){
            root=root.letf;
        }
        return root;
}

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
       delete(root,1 );
        System.out.println( );
        inorder(root);
    }
}
