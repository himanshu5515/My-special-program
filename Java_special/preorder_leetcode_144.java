/*public class preorder_leetcode_144 {

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list= new ArrayList<Integer>();
            dfs(root,list);
            return list;
        }
        private void dfs(TreeNode node, List<Integer> list){
            if(node == null){
                return;
            }
            list.add(node.val);
            dfs(node.left,list);
            dfs(node.right,list);
        }
    }*/

//itetratvely
/*
if(root ==null){
return;}
Stack<TreeNode> stack=new Stack<>();
 stack.push(root);
 while(!stack.isEmpty()){
 TreeNode temp=stack.pop();
 System.out.print(temp.data+"");
 if(temp.right!=null){
 stack.push(temp.right);
 }
 if(temp.left!=null){
 stack.push(temp.left);
 }
 */