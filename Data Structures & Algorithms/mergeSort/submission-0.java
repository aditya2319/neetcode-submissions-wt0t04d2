// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergeSortHelper(pairs, 0,  pairs.size()-1);
    }
    public List<Pair> mergeSortHelper(List<Pair> pairs, int start, int end){
        if(end - start + 1 <= 1) return pairs;
        int mid = (start + end)/2;

        //Sort the left half
        mergeSortHelper(pairs, start, mid);
        //Sort the right half
        mergeSortHelper(pairs, mid+1, end);
        //merge left and right
        merge(pairs, start, mid, end);
        return pairs;
    }
    //Merge in place
    public void merge(List<Pair> arr, int start, int mid, int end){
        List<Pair> left = new ArrayList<>(arr.subList(start, mid +1 ));
        List<Pair> right = new ArrayList<>(arr.subList(mid +1, end +1));

        int i = 0; //index for left
        int j =0; //index for right
        int k = start; // index for arr

        while (i< left.size() && j < right.size()){
            if(left.get(i).key <= right.get(j).key){
                arr.set(k, left.get(i));
                i++;
            }else{
                arr.set(k, right.get(j));
                j++;
            }
            k++;
        }
        // One of the halves will have elements remaining
        while (i < left.size()) {
            arr.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            arr.set(k, right.get(j));
            j++;
            k++;
        }
    }
}
