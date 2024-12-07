class Solution {
     static List<Integer> findMajority(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Integer> candidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > n / 3) {
                candidates.add(entry.getKey());
            }
        }

        return candidates;
    }
}
