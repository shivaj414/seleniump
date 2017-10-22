package java_basics;

public class Revstring
{

	 public static void Main(Revstring[] args)
	    {

	        string name = "Hello World"

	        StringBuilder builder = new StringBuilder();
	        for (int i = name.Length - 1; i >= 0; i--)
	        {
	            builder.Append(name[i]);
	        }
	        Revstring newName =builder.ToString();

	        System.out.print(newName);

	    }
}
