public class OuterClass {
    String outerField="Outer field";
    static String staticOuterField="Static outer field";
    class InnerClass{
        void accessMember(){
            IO.println(outerField);
            IO.println(staticOuterField);
        }
    }
    static class StaticNestedClass{
        void accessMember(OuterClass outer){

            //Compiler error: cannot make a static reference to the non-static
            // field outerField
            // Io.println(outerField)
            IO.println(outer.outerField);
            IO.println(staticOuterField);
        }
    }
    public static void main(String[] args) {
        IO.println("Inner class:");
        IO.println("-------------");
        OuterClass outerObject=new OuterClass();
        OuterClass.InnerClass innerObject=outerObject.new InnerClass();
        innerObject.accessMember();
        IO.println("\n Static nested class:");
        IO.println("-------------------------");
        StaticNestedClass staticNestedObject=new StaticNestedClass();
        staticNestedObject.accessMember(outerObject);
        IO.println("\n Top-level class:");
        IO.println("---------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMember(outerObject);
    }
}
