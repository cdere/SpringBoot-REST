import java.util.Arrays;
import java.util.Optional;

/*
interface TestInterface1 {
    */
/*default void hello (){
        //return "default";
        System.out.println  ("default 1");
    }

    default void hello1 (){
        //return "default";
        System.out.println  ("default 2");
    }

    static void helloStatic (){
        //return "static";
        System.out.println  ("static");
    }*//*


    String test(String str);

    TestInterface1 t1 = (str) -> "Test";
}

interface TestInterface2 {
    String processName(String str);
}



interface TestInterface {
    String hello(String str);
}
*/
class Practice  {

    /*public String hello() {
        return "Hello World";
    }*/

   /* public static void pr (final Practice practice) {
        System.out.println  ("pr " + practice.toString());
    }*/


    public static void main(String args[]) {
        //TestInterface2 morningGreeting = (str) -> "Good Morning " + str + "!";
        //TestInterface2 eveningGreeting = (str) -> "Good Evening " + str + "!";

        TestInterface testInterface = () -> System.out.println("hi");

        testInterface.hello();

        // Output: Good Morning Luis!
        //System.out.println(morningGreeting.processName("Luis"));

        // Output: Good Evening Jessica!
        //System.out.println(eveningGreeting.processName("Jessica"));
    }


    //public static void main (String args []) {

        //Practice p1 = new Practice();
       /* p1.hello();
        p1.hello1();
        TestInterface1.helloStatic();

        Optional<String> firstName = Optional.ofNullable(null);
        System.out.println  ("First Name is set ? : " + firstName.isPresent());
        System.out.println  ("First Name is : " + firstName.orElseGet(() -> "[none]"));
        System.out.println  (firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger"));*/



        //p1.helloStatic();
        //final String separator = ",";
        //Arrays.asList("a", "b", "c", "d").forEach(e->System.out.print(e + separator));
        //Arrays.asList("a", "b", "c", "d").forEach(e->{System.out.println(e);System.out.println(e);});
        //System.out.println  ("Hello World");


        //() -> System.out.println("Hello World");

    //}


}