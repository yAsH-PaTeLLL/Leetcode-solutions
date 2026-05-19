/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndex(mountainArr);

        // Search in ascending part
        int firstTry = binarySearch(
                mountainArr,
                target,
                0,
                peak,
                true
        );

        if(firstTry != -1) {
            return firstTry;
        }

        // Search in descending part
        return binarySearch(
                mountainArr,
                target,
                peak + 1,
                mountainArr.length() - 1,
                false
        );
    }

    static int peakIndex(MountainArray mountainArr) {

        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end) {

            int mid = start + (end - start) / 2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(
            MountainArray mountainArr,
            int target,
            int start,
            int end,
            boolean isAscending
    ) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            int value = mountainArr.get(mid);

            if(value == target) {
                return mid;
            }

            // Ascending Binary Search
            if(isAscending) {

                if(target < value) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // Descending Binary Search
            else {

                if(target < value) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
