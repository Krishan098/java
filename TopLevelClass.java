public class TopLevelClass {
    void accessMember(OuterClass outer){
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
        // IO.println(OuterClass.outerField);
        IO.println(outer.outerField);
        IO.println(OuterClass.staticOuterField);
    }
}
