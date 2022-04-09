interface Grandparent{
void G();
}
interface Parent1 extends Grandparent{
void p1();
}
interface Parent2 extends Grandparent{
void p2();
}
interface child extends Parent1,Parent2{
void c();
}
class Family implements child {
public void G()
{
System.out.println("I am Grandparent");
}
public void p1()
{
System.out.println("I am Parent1");
}
public void p2()
{
System.out.println("I am Parent2");
}
public void c()
{
System.out.println("I am Child");
}
}
public class InterfaceInherit {



public static void main(String[] args) {
Family f = new Family();
f.G();
f.p1();
f.p2();
f.c();



}



}