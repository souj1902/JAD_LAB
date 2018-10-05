interface sturoll
 { 
  void rollno();
  }
interface stuname extends sturoll
  {
   void name();
  }
interface stubranch extends sturoll
  {
   void branch();
  }
class student implements stuname
  {
   public void rollno()
    {
     System.out.println("1234");
    }
   public void name()
   {
    System.out.println("abc");
   }
   public void branch()
   {
    System.out.println("CSE");
   }
   public static void main(String[] args)
   {
    student S=new student();
    System.out.println("rollno:");
    S.rollno();
    System.out.println("name:");
    S.name();
    System.out.println("branch:");
    S.branch();
   }
 }




