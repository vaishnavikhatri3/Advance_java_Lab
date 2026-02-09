import java.util.*;
class Q18{
 public static void main(String[] args){
  List<Integer> list=new ArrayList<>();
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(10);
  Set<Integer> s=new HashSet<>(list);
  System.out.println(s);
 }
}
