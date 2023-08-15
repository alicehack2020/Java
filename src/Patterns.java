public class Patterns {
    public static void main(String[] args) {
        //pattern questions 1st
        /*
        1
        2 3
        4 5 6
        7 8 9 10 */
//        int num=1;
//        for(int i=1;i<=4;i++)
//        {
//            String temp="";
//            for(int j=0;j<i;j++)
//            {
//              temp=temp+" "+Integer.toString(num++);
//            }
//            System.out.println(temp);
//            temp="";
//        }



 /*
  pattern questions 2nd
               1
             2 3
           4 5 6
        7 8 9 10
  */
       int num=1;
       int size=4;
        for(int i=1;i<=4;i++)
        {
            String temp="";
            for(int j=0;j<i;j++)
            {
              temp=temp+" "+Integer.toString(num++);
            }
           String space=" ";
            for(int k=size-1;k>0;k--)
            {
                space=">"+space;
            }
//            System.out.println("space--------"+space);
            space=space+temp;

            size--;
            temp="";
            System.out.println(space);
        }











    }
}
