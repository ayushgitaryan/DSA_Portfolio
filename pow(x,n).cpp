class Solution {
public:
    double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            if (n == INT_MIN) { // Handle INT_MIN separately
                return 1 / (x * myPow(x, INT_MAX)); 
            }
            return 1 / myPow(x, -n);
        }
        if (n % 2 == 0) {
            double a = myPow(x, n / 2);
            return a * a;
        }
        return x * myPow(x, n - 1);
    }
};
