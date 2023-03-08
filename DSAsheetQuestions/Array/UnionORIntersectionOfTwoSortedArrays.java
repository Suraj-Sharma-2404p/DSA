package DSAsheetQuestions.Array;

import java.util.*;

//Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
//
//Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
public class UnionORIntersectionOfTwoSortedArrays {

    //Solution 1 : Using Hashmap
    static List<Integer> solution(int[] nums1, int[] nums2, int sizeofnums1, int sizeofnums2) {
        sizeofnums1 = nums1.length;
        sizeofnums2 = nums2.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> freQuencyMap = new HashMap<>();
        for (int i = 0; i < sizeofnums1; i++) {
            freQuencyMap.put(nums1[i], freQuencyMap.getOrDefault(nums1[i], 0) + 1);
        }
        for (int j = 0; j < sizeofnums2; j++) {
            freQuencyMap.put(nums2[j], freQuencyMap.getOrDefault(nums2[j], 0) + 1);
        }
        for (int i : freQuencyMap.keySet()) {
            ans.add(i);
        }
        return ans;
    }

    // solution 2 : Using 2 pointer approach

    static ArrayList<Integer> solution2(int nums1[], int nums2[], int sizeofnums1, int sizeofnums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < sizeofnums1 && j < sizeofnums2) {
            if (nums1[i] <= nums2[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;

            } else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != nums2[j]) {
                    ans.add(nums2[j]);
                }
                j++;
            }

        }
        while (i < sizeofnums1) {
            if (ans.get(ans.size() - 1) != nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }

        while (j < sizeofnums2) {
            if (ans.get(ans.size() - 1) != nums2[j]) {
                ans.add(nums2[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int sizeofnums1 = 10, sizeofnums2 = 7;
        int nums1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nums2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = (ArrayList<Integer>) solution2(nums1, nums2, sizeofnums1, sizeofnums2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
