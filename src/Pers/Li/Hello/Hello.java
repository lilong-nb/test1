package Pers.Li.Hello;

public class Hello {
    public static void main (String arges[]) {
        System.out.println("这是一个简单的Java应用程序");
        Stdents stu =new Stdents() ;
        stu.speak("We are students");
    }
}
class Stdents {
    public  void speak(String s){
        System.out.println(s);
    }
}