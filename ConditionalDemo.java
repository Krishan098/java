class ConditionalDemo {
public static void main(String[] args) {
    int value1=1;
    int value2=2;
    if((value1==1)&&(value2==2)){
        IO.println("value1 is 1 and value2 is 2");
    }
    if((value1==1)||(value2==2)) IO.println("Value1 is 1 or Value2 is 2");

    int result;
    boolean someCondition=true;
    result= someCondition?value1:value2;
    IO.println(result);
}    


}
