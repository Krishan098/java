public class ArithmeticDemo {
    public static void main(String[] args) {
        int result= 4+3;
        System.out.println("4+3 ="+result);
        int original_result=result;
        result-=1;
        System.out.println(original_result+"- 1 = "+result);
        original_result=result;
        result*=2;
        System.out.println(original_result+"*2 = "+result);
        original_result=result;
        result/=2;
        System.out.println(original_result+"/ 2 = "+result);
        original_result=result;
        result+=8;
        System.out.println(original_result+"+ 8 = "+result);
        original_result=result;
        result%=7;
        System.out.println(original_result+"%7 = "+result);
        String firstString="Hello wo";
        String secondString="rld";
        String thirdString= firstString+secondString;
        System.out.println(thirdString);
    }
}
