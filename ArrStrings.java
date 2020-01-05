public class ArrStrings{

  static boolean isUnique(String str){
    for(int i = 0; i<str.length(); i++){
      for(int j = 0; j<str.length(); j++){
        if(str.charAt(i) == str.charAt(j) && i != j){
          return false;
        }
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    String test = "helo";
    Boolean test1 = isUnique(test);
    System.out.println(test1);
  }
}
