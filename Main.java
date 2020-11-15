class Main {
//1. 0/1 Knapsack: Given a list of items with values and weights, as well as a max weight, find the maximum value you can generate from items, where the sum of the weights is less than or equal to the max. eg.
//if it helps, w = [2, 2, 3] , v = [6, 10, 12]
//items = {(w:2, v:6), (w:2, v:10), (w:3, v:12)}
//max weight = 5
//knapsack(items, max weight) = 22
//       0  1  2   3   4   5
//(0)0   0  0  0   0   0   0
//(6)2   0  0  6   6   6   6 
//(10)2  0  0 10  10  16  16 
//(12)3  0  0 10  12  16  22
public static int knapsack(int[] w, int[] v, int maxWeight){
  int[][] array = new int[w.length+1][maxWeight+1];
  for (int i = 1; i < w.length + 1; i++) {
    for (int j = 1; j < maxWeight + 1; j++) {
      if (w[i-1] > j){
        array[i][j] = array[i-1][j];
      } else {
        array[i][j] = Math.max(array[i-1][j], v[i-1] + array[i-1][j-w[i-1]]);
      }
    }
  }
  for (int k = 0; k < w.length + 1; k++) {
    for (int l = 0; l < maxWeight + 1; l++) {
      System.out.print(array[k][l]);
      System.out.print("  ");
    }
    System.out.println();
  }
  return array[w.length][maxWeight];
}

//2. LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
//abcdefg
//deofpgs
//-->"defg"

public static String longestSubseq(String strOne, String strTwo){
  HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
  int number = 1;
  for (int i = 0; i < strOne.length(); i++) {
    for (int j = 0; j < strTwo.length(); j++) {
      if (strOne.charAt(i) == strTwo.charAt(j)) {
        hm.put(strOne.charAt(i), number);
        number++;
      }
    }
  }

}




  public static void main(String[] args) {
    longestSubseq("abcdefg", ")
    //int[] weights = {2,2,3};
    //int[] values = {6,10,12};
    //System.out.println(knapsack(weights, values, 5));
  }
}