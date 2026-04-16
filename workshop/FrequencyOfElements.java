import java.util.*;
public class FrequencyOfElements{
public static void main (String[]args){
int [] arr ={ 1,2,2,3,4,2,9,4};
HashMap<Integer,Integer>map = new HashMap<>();
for(int num: arr ){
map.put( num,map.getOrDefault9num,0)+1);
}
for ( Map.Entry,Integer,Integer>entry: map.entrySet()){
System.out.println(entry.getKey()+"->"+entry.getValue());
}
}
}