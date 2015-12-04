import java.util.Hashtable;     //java hash table class
import java.util.Scanner;       //scanner to input usernames

class UIMS{
  public static void main(String[] args){
    Hashtable<String, Integer> numeros = new Hashtable<String, Integer>();  //new hashtable
    
    System.out.println(numeros.size());
    
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
    int test = bs.size() % k;                               //check if there are enough digits 
    if(test == 0) int[] bins = bs[];                        //if there are, then put bs into bins and continur
    else{
      int[] bins = new int[bs.size()+test];                 //if not, then make new array with however many extra digits we need
      for(int i = 0; i < test; i++) bins[i] = 0;            //make the added extra digits 0
      for(i = 0; i < bs.size(); i++) bins[test+i] = bs[i];  //and add in the rest of bs array
    }
    
    int digit = bs.size()/k;                                //get the number of digits for digit array
    int[] ds = new int[digit];                              //make the digit array
    int m = 1;                                              
    i = 0;                                                  //set i back to 0
    
    while(m < digit){
      int[] temp = new int[k];                              //create a temp array to hold each digit in binary
      int q = 0;
      for(i; i < m*k; i++){                                 //store each set of k digits in temp, moving to the 
        temp[q] = bins[i];                                  //next set of k digits in each iteration of the while
        q++;
      }
      for(int j = 0; j < k; j++){                           //then go through the temp array
        ds[m-1] = ds[m-1] + temp[j]*2^(k-(j+1));            //convert from binary and store in the digit sequence array
      }
      m++                                                   //iterate m to get the next set of k digits in the bins array
    }
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
