public interface InterfaceExample 
{
default void display()
{
show();
System.out.println("Default Method");
}
private void show()
{
System.out.println("Private Method");
}
}