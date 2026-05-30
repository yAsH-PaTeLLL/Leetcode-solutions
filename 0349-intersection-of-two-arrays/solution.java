import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Bubble Sort nums1
        for (int i = 0; i < nums1.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < nums1.length - i; j++) {
                if (nums1[j] < nums1[j - 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        // Bubble Sort nums2
        for (int i = 0; i < nums2.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < nums2.length - i; j++) {
                if (nums2[j] < nums2[j - 1]) {
                    int temp = nums2[j];
                    nums2[j] = nums2[j - 1];
                    nums2[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {

                if (list.isEmpty() ||
                    list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }

                i++;
                j++;
            }

            else if (nums1[i] < nums2[j]) {
                i++;
            }

            else {
                j++;
            }
        }

        int[] arr = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }

        return arr;
    }
}
