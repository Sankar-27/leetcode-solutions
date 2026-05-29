// Last updated: 29/05/2026, 11:56:15
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // frequency map: stores (word, frequency)
        final Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        // use bucket sort
        // store into bucket as <frequency, element(s)> format
        final List<String>[] bucket = new List[words.length + 1];
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(word);
            Collections.sort(bucket[frequency]);
        }
        final List<String> result = new ArrayList<>();
        int remainingWordsToBeAddedToResult = k;
        for (int i = bucket.length - 1; i >= 0 && remainingWordsToBeAddedToResult > 0; --i) {
            if (bucket[i] != null) {
                int size = bucket[i].size();
                if (size <= remainingWordsToBeAddedToResult) {
                    remainingWordsToBeAddedToResult -= size;
                    result.addAll(bucket[i]);
                } else {
                    for (int j = 0; j < remainingWordsToBeAddedToResult; ++j) {
                        result.add(bucket[i].get(j));
                    }
                    remainingWordsToBeAddedToResult = 0;
                }
            }
        }
        return result;
    }
}