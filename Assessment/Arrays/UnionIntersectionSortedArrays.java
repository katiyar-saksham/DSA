package Arrays;
import java.util.*;

public class UnionIntersectionSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { 3, 4, 5, 6 };

        System.out.println("Nums1: " + Arrays.toString(nums1));
        System.out.println("Nums2: " + Arrays.toString(nums2));

        // Union
        union(nums1, nums2);

        // Intersection
        intersection(nums1, nums2);
    }

    public static void union(int[] nums1, int[] nums2) {
        System.out.print("Union is: ");
        Set<Integer> st1 = new HashSet<>();
        for (int num : nums1) {
            st1.add(num);
        }
        for (int num : nums2) {
            st1.add(num);
        }
        for (int num : st1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void intersection(int[] nums1, int[] nums2) {
        System.out.print("Intersection is: ");
        Set<Integer> st2 = new HashSet<>();
        for (int num : nums1) {
            st2.add(num);
        }

        Set<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (st2.contains(num)) {
                res.add(num);
            }
        }

        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
