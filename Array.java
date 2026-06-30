import java.util.Arrays;

public class Array {
 
    public static void main(String[] args) {
    int[] anArray;
    anArray=new int[10];
    anArray[0]=100;
    anArray[1]=200;
    for(int i=2;i<10;i++){
        anArray[i]=anArray[i-1]+100;
    }
    for(int i=0;i<10;i++){
    System.out.println("Element at index "+i+" : "+anArray[i]);
    }
    String[][] names = {
    {"Mr. ", "Mrs. ", "Ms. "},
    {"Smith", "Jones"}
};
// Mr. Smith
IO.println(names[0][0] + names[1][0]);
// Ms. Jones
IO.println(names[0][2] + names[1][1]);
IO.println(names[0].length);
String[] copyFrom={ "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
   "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
   "Marocchino", "Ristretto"};
String[] copyTo;
copyTo=new String[7];
System.arraycopy(copyFrom, 5,copyTo , 0, 7);
for(String coffee: copyTo ){
    IO.print(coffee+" ");
}
IO.println();
String[] copyTo2=Arrays.copyOfRange(copyFrom, 2, 9);
for(String coffee:copyTo2){

IO.print(coffee+" ");
}

String[] coffees = {
    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
    "Marocchino", "Ristretto" };

Arrays.stream(coffees)
      .map(coffee -> coffee + " ")
      .forEach(IO::print);


var coffeesAsString = Arrays.toString(coffees);
IO.println(coffeesAsString);

String[][] schedule = {
    {"Math", "Science", "English"},
    {"History", "Art", "PE"},
    {"Music", "Computer", "Study Hall"}
};

IO.println("");
IO.println("Class Schedule:");
String[] periods = {"Period 1", "Period 2", "Period 3"};
for (int day = 0; day < schedule.length; day++) {
   IO.println("Day " + (day + 1) + ":");
   for (int period = 0; period < schedule[day].length; period++) {
      IO.println("  " + periods[period] + ": " + schedule[day][period]);
   }
}
int[] values = {12, 8, 15, 3, 9, 21};
int sum = 0;
int max = values[0];
int min = values[0];

// Calculate sum, max, and min
for (int value : values) {
   sum += value;
   if (value > max) max = value;
   if (value < min) min = value;
}

double average = (double) sum / values.length;

IO.println("Array: " + Arrays.toString(values));
IO.println("Sum: " + sum);
IO.println("Average: " + average);
IO.println("Maximum: " + max);
IO.println("Minimum: " + min);

int[] original = {1, 2, 3, 4, 5};
int[] copy = new int[original.length];

// Manual copy
    for(int i = 0; i < original.length; i++) {
   copy[i] = original[i];
}

IO.println("Original: " + Arrays.toString(original));
IO.println("Copy: " + Arrays.toString(copy));

// Modifying the copy does not modify the original
copy[0] = 999;
copy[4] = 777;

IO.println("");
IO.println("After modifying the copy:");
IO.println("Original: " + Arrays.toString(original));
IO.println("Copy: " + Arrays.toString(copy));
    }
}



