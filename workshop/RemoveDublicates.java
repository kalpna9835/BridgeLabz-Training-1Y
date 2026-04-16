import java.util.ArrayList;
public class RemoveDuplicates{
public static void main(String[]args){
ArrayList<Integer> list = new ArrayList<>();
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(30);
Set<Integer> set=  new HashSet<>(list);
ArrayList <Integer>uniqueList = new ArrayList<>(set);
System.out.println("Original List :"+ list);
System.out.println("After Removing Duplicates:"+ uniqueList);
}
}