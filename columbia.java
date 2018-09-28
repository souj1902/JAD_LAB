class hospital
{ 
 void patients()
  {
   System.out.println("number of patients ");
  }
}

class manipal extends hospital 
{
 void patients()
  {
   System.out.println("number of patients in manipal are 62");
  }
}

class fortis extends hospital
{
 void patients()
  {
   System.out.println("number of patients in fortis are 42");
  }
}

class columbia extends hospital 
{
 void patients()
  {
   System.out.println("number of patients in columbia are 12");
  }
public static void main(String[] args)
    {
     manipal obj1=new manipal();
     fortis obj2=new fortis();
     columbia obj3=new columbia();
     obj1.patients();
     obj2.patients();
     obj3.patients();
   }  
}  
