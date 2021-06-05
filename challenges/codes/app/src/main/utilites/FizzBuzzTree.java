package codes.app.src.main.utilites;

public class FizzBuzzTree {
  public TreeNode root;
  public FizzBuzzTree(){
    root = null;
  }

  public void fizzBuzzTree(TreeNode root){
    if(root == null)
      return;
    if(((Integer) root.value) % 5 == 0 && ((Integer) root.value) % 3 == 0 )
      root.value = "FizzBuzz";
    else if(((Integer) root.value) % 3 == 0)
      root.value = "Fizz";
    else if(((Integer) root.value) % 5 == 0)
      root.value = "Buzz";
    else
      root.value = root.value+"";

    if(root.left != null)
      fizzBuzzTree(root.left);

    if(root.right != null)
      fizzBuzzTree(root.right);
  }

  private String result = "root ➔ ";
  public void getTree(TreeNode root){
    if(root == null)
      return;
    result+= root.value + " ➔ ";
    if(root.left != null)
      getTree(root.left);

    if(root.right != null)
      getTree(root.right);
  }

  @Override
  public String toString() {
    getTree(root);
    return result.substring(0, result.length()-3);
  }

}
