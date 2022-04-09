abstract class Engineering{
abstract void display();
}
interface Programming{
void coding();
}
interface Drawing{
void draw();
}
class Computer extends Engineering implements Programming{
void display()
{
System.out.println("I am Computer class");
}
public void coding(){
System.out.println("I am coding method");
}
}
class Mechanical extends Engineering implements Drawing{
void display()
{
System.out.println("I am Mechanical class");
}
public void draw(){
System.out.println("I am draw method");
}
}
public class AbstractAssignment {



public static void main(String[] args) {
Computer C = new Computer();
Mechanical M = new Mechanical();
C.display();
C.coding();
M.display();
M.draw();
}



}