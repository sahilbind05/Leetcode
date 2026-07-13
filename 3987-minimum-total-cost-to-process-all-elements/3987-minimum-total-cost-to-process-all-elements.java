class Solution {
    public int minimumCost(int[] nums, int k) {
        final long MOD = 1_000_000_007L;
        final long INV2 = 500000004L; // Modular inverse of 2

        long ans = 0;
        long opr = 0;
        long energy = k;

        for (int x : nums) {
            if (x > energy) {
                long need = x - energy;
                long t = (need + k - 1L) / k;

                // Sum = t * (2*opr + t + 1) / 2  (mod MOD)
                long a = t % MOD;
                long b = (2L * (opr % MOD) + a + 1) % MOD;
                long add = a;
                add = (add * b) % MOD;
                add = (add * INV2) % MOD;

                ans = (ans + add) % MOD;

                opr += t;
                energy += t * (long) k;
            }

            energy -= x;
        }

        return (int) ans;
    }
}