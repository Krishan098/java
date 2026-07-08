public class ShadowTest {
    public int x=0;
    class FirstLevel{
        public int x=1;
        void methodInFirstLevel(int x){
            IO.println("x = "+x);
            IO.println("this.x = "+ this.x);
            IO.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }
    public static void main(String[] args) {
        ShadowTest st=new ShadowTest();
        ShadowTest.FirstLevel f1=st.new FirstLevel();
        f1.methodInFirstLevel(23);
    }
}
/**This example defines three variables named x: the member variable of the class ShadowTest, the member variable of the inner class FirstLevel, and the parameter in the method methodInFirstLevel(). The variable x defined as a parameter of the method methodInFirstLevel() shadows the variable of the inner class FirstLevel. Consequently, when you use the variable x in the method methodInFirstLevel(), it refers to the method parameter. To refer to the member variable of the inner class FirstLevel, use the keyword this to represent the enclosing scope */