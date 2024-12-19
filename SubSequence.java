public class SubSequence {
    public static void printSub(String s,int i,String out){
        if(i>=s.length()){
            System.out.print(out);
            return ;
      }
      printSub(s,i+1,out+s.charAt(i));
      printSub(s,i+1,out);
    }
    public static void main(String[] args){
        String value="abc";
        printSub(value, 0, " ");
    }
}
