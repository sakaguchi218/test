
public class Test {
public static void main(String[]args){

Person jiro=new Person();
jiro.name="木村次郎";
jiro.age=18;

Person hanako=new Person();
hanako.name="鈴木花子";
hanako.age=16;

Person masa=new Person();
masa.name="坂口昌弘";
masa.age=23;

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(masa.name);
System.out.println(masa.age);
System.out.println(masa.phoneNumber);
System.out.println(masa.address);
jiro.talk();
jiro.walk();

}
}