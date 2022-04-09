abstract class Vegetable{
public abstract String toString();
String color;



Vegetable(String col)
{
color=col;
}

}
class Potato extends Vegetable{
Potato(String col)
{
super(col);
}
public String toString() {
return "vegetable name is Potato"+"vegetable color is "+color;
}
}
class Brinjal extends Vegetable{
Brinjal(String col)
{
super(col);
}
public String toString() {
return "vegetable name is Brinjal"+"vegetable color is "+color;
}
}
class Tomato extends Vegetable{
Tomato(String col)
{
super(col);
}
public String toString() {
return "vegetable name is Tomato"+"vegetable color is "+color;
}
}
public class vegassig {



public static void main(String[] args) {
Potato p = new Potato("Yellow");
Brinjal b = new Brinjal("Purple");
Tomato t = new Tomato("Red");
System.out.println(p.toString());
System.out.println(b.toString());
System.out.println(t.toString());
}



}