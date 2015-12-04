import java.util.Hashtable;     //java hash table class
import java.util.Scanner;       //scanner to input usernames

class UIMS{
  public static void main(String[] args){
    Hashtable<String, Integer> numeros = new Hashtable<String, Integer>();  //new hashtable
    
    System.out.println(numeros.size());
    
  }
  public boolean isAvailable(String uid){  //go through hash table and check if uid available
    if() return true
    else System.out.println("user name already taken.");
   }
   
   public void add(String uid){
     if( isAvailable == true ){}
   }
   
  }

class Conversion{
  public int[] stringToBitSeq(String s){
    char[] order=['0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l',
                   'm','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G',
                   'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
    String uid= s;
    array=new int[uid.size()];             //array for positions
    for(int i=0; i<uid.size();i++){       //go through each character of userId  
      char temp=uid.charAt(i);            //store character into temp
       for(int j=0;j<order.size();j++){   //go through order array
         if(temp == order[j]){            //compare userId char with the chars in order array
           array[i]=j;                    //if its a match store its position in array
           break;                         //break out of smaller for loop
         }
       }
    }
    int[] bs = new int[6*uid.size()];       //create the binary sequence array
    int index = 0;                        //make an index to go through the bs array
    for(int m = 0; m <array.size(); m++){ //for each number stored in the array array
      while(array[m]>0){                  //convert it to binary
        bs[index++] = array[m]%2;         //and store each 0 and 1 in the bs array
        array[m] = aray[m]/2;             
      }
    }
    return bs[];                          //finally return the bs array
  }
  
  public int[] bitseqToDigiteq(int[] bs, int k){
    
  }
  
  public int[] bitseqToBigNum(int[] bs, int k){     //need to find out what k is for here
    int bn = 0; 
    for(int i = 0; i < bs.size(); i++){
      bn = bs[i]*2^i +bn
    }
    return bn;
  }
  
  public int[] numToDigitseq(int n){    //need to find out size to make bs
    int i = 0;
    while(n>1){                   //change n into a binary number
      int n2 = n/2;
      bs[i] = n - 2*n2;
      n = n2;
    }
    return bs[];
  }
  
}
