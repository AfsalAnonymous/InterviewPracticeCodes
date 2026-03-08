package ArrayPractice;
public class SecondLargestNum {
  
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
      SecondLargestNum sec = new SecondLargestNum();
      int secondLargest = sec.Second(arr);
      System.out.println(secondLargest + " : Second Largest");
    }
    
    public int Second (int[] array){
      int largest = 0;
      int secondLargest = 0;
      
      for(int a : array){
        if (a > largest){
          secondLargest = largest;
          largest = a;
        }
        else if(secondLargest != largest && secondLargest > a){
          secondLargest = a;
        }
      }
      
      return secondLargest;
      
    }
}
