import java.util.*;
class Q29{
 public static void main(String[] args){
  Map<Integer,String> m=new HashMap<>();
  m.put(1,"A");
  for(Map.Entry<Integer,String> e:m.entrySet())
   System.out.println(e.getKey()+""+e.getValue());
 }
}
