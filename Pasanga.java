package trichy;

public class Pasanga extends AmmaAppa
{
public Pasanga()
{
this(10);
System.out.println("Pasanga - const");
}

public Pasanga(int no)
{

System.out.println("Pasanga - oneArg - const");
}



public static void main(String[]args)
{

  Pasanga pp = new Pasanga(10);
  pp.meetRelatives();
}
}
