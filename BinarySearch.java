class BinarySearch{
  public static void main(String[] args){
    int[] test = {0,1,2,3,4,5,6,7,8};
    int target = 8;

    int ans = BinarySearch(test, target, 0, test.length-1);
    System.out.println(ans);
  }

  static int BinarySearch(int[] arr, int target, int left, int right){
    int middle = left + (right-left)/2;
    if(arr[middle] == target){
      return arr[middle];
    }else {
      if(target < middle){
        return BinarySearch(arr, target, left, middle-1);
      }else{
        return BinarySearch(arr, target, middle+1, right);
      }
    }

  }
}
