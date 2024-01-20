class Solution {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        double percentage = 0.25; //to calculate 25% occupancy of an element
        int size = (int)(length * percentage); //minimum number of occurrences to pass the test

        for (int i = 0; i < arr.length - size; i++) { //check each block of "size" elements
            if (arr[i] == arr[i + size]) { //if the elements at the ends are equal
                return arr[i]; // return the array element
            }
        }

        return -1; // suitable element is non-existent
    }
}