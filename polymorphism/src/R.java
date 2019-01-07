class R
{
public static void main(String[]args)
{
System.out.println("R-main");
}
static
{
System.out.println("R-SIB");
}
}
class S extends R
{
public static void main(String[]args)
{
System.out.println("S-main");
}
static
{
System.out.println("S-SIB");
}
}
class T extends S
{
public static void main(String[]args)
{
System.out.println("T-main");
}
static
{
System.out.println("T-SIB");
}
}
class U
{
public static void main(String[]args)
{
System.out.println("U-main-b");
T.main(args);
System.out.println("U-main-e");
}
static
{
System.out.println("U-SIB");
}
}