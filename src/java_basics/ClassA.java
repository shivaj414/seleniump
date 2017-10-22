package java_basics;

public class ClassA 
{
  protected void add(int x, int y)
  {
	  int z= x+y;
	  System.out.println("additioon:" +z);
  }
  
  public void sub(int x, int y)
  {
	  int z=x-y;
	  System.out.println("sub:" +z);

  }
  
  private void mul(int x , int y)
  {
	  int z= x*y;
	  System.out.println(" mul:" +z);
	  
  }
  
  public static void main(String[] args)
  {
	  ClassA obj= new ClassA();
	  obj.add(10, 20);
	  obj.sub(20, 30);
	  obj.mul(20, 30);
			  
  }
}

