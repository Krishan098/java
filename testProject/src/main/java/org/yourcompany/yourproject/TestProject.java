/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
// public class TestProject {

//     public static void main(String[] args) {
//         if (args.length<2){
//             IO.println("You need to provide 2 lists as arguments. You provided"+ args.length);
//             throw new UnsupportedOperationException("You need to provide 2 lists as arguments");
//         }
//         List<Integer> firstSeries= List.of(args[0].split(",")).stream().map(Integer::valueOf).collect(Collectors.toList());



//         List<Integer> secondSeries=List.of(args[1].split(",")).stream().map(Integer::valueOf).collect(Collectors.toList());
//         List<Integer> elements= extractCommonElements(firstSeries,secondSeries);
//         IO.println(elements);
//     }
//     public static List<Integer> extractCommonElements(List<Integer> list1, List<Integer> list2){
//         Set<Integer> intersection=new HashSet<>(list1);
//         intersection.retainAll(list2);
//         if (list1.get(0).equals(list2.get(0))){
//             intersection.add(list1.get(0));
//         }
//         if (list1.get(list1.size()-1).equals(list2.get(list2.size()-1))){
//             intersection.add(list1.get(list1.size()-1));
//         }
//         return intersection.stream().toList();
//     }
// }

public class TestProject {
    public static void main(String[] args) {

        if (args.length < 2) {
            IO.println("You need to provide 2 lists as arguments. You provided " + args.length);
            throw new UnsupportedOperationException("You need to provide 2 lists as arguments");
        }

        List<Integer> firstSeries = List.of(args[0].split(",")).stream()
                .map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> secondSeries = List.of(args[1].split(",")).stream()
                .map(Integer::valueOf).collect(Collectors.toList());


        List<Integer> elements = extractCommonElements(firstSeries, secondSeries);
        IO.println(elements);

    }
    /**
     * 
     * @param list1
     * @param list2
     * @return
     */
    public static List<Integer> extractCommonElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> intersection = new HashSet<>(list1);

        intersection.retainAll(list2);
        if (list1.get(0).equals(list2.get(0))) {
            intersection.add(list1.get(0));
        }
        if (list1.get(list1.size() - 1).equals(list2.get(list2.size() - 1))) {
            intersection.add(list1.get(list1.size() - 1));
        }

        return intersection.stream().toList();
    }
}