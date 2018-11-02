package chaptereight;
import java.util.*;

class EightTenOne{

Thread t;
EightTenOne(String name){
  t = new Thread(new EightTen(), name);
  t.start();
}
public static void main(String[] args) {
  EightTenOne d = new EightTenOne("Digital clock");
}
}
