interface Transport
{
void deliver();
}



abstract class Animal
{



protected abstract void deliver();

}



class Tiger extends Animal
{



protected void deliver() {
}

}



class Camel extends Animal implements Transport
{
public void deliver() {
System.out.println("This is deliver method of camel");
}

}



class Deer extends Animal
{



protected void deliver() {

}

}



class Donkey extends Animal implements Transport
{



public void deliver() {
System.out.println("This is deliver method of Donkey");
}

}



public class Main {



public static void main(String[] args) {
Animal a[] = new Animal[4];
a[0] = new Tiger();
a[1] = new Camel();
a[2] = new Deer();
a[3] = new Donkey();

a[0].deliver();
a[1].deliver();
a[2].deliver();
a[3].deliver();
}



}