import java.util.Hashtable;     //java hash table class
import java.util.Scanner;       //scanner to input usernames

class UIMS{
  public static void main(String[] args){
    Hashtable<String, Integer> numeros = new Hashtable<String, Integer>();  //new hashtable
    
    System.out.println(numeros.size());
    
  }
}

class Conversion{
  public String[] stringtoBitSeq(String s){
    char[] order=['0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l',
                   'm','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G',
                   'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
    String uid= s;
    array=new int[uid.size()];     //array for positions
    for(int i=0; i<uid.size();i++){
      char temp=uid.charAt(i);
       for(int j=0;j<order.size();j++){
         if(temp == order[j]){
           array[i]=j;
           break;
         }
       }
    }
    /*tmp[]=new int[7];
    for(int m=0;m<array.size();m++){
      while (array[m] > 0) {
        tmp[m++] = array[m] % 2;
        array[m] /= 2;
    }
    binary = new int[6*uid.size()];
    int k = 0;
    for (int j = m - 1; j >= 0; j--) {
        binary[k++] = tmp[j];*/
    }

  }
}
