class Solution {
public:
    int minimizeMax(vector<int>& nums, int p) {

        if (p == 0) return 0;
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int l = 0, r = nums[n - 1] - nums[0];

        while (l < r) {
            int mid = l + (r - l) / 2, pair = 0;

            for (int i = 1; i < n; i++) {
                if (mid >= nums[i] - nums[i - 1]) {
                    ++pair;
                    ++i; // skip the next one to avoid reuse
                }
            }

            if (pair >= p) r = mid;
            else l = mid + 1;
        }

        return l;
    }
};
