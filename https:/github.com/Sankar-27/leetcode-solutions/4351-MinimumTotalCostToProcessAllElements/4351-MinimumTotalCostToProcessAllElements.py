# Last updated: 15/07/2026, 08:46:55
class Solution:
    def minimumCost(self, nums: list[int], k: int) -> int:
        res=k
        op=0
        t=0
        for i in nums:
            if res>=i:
                res=res-i
            else:
                n=(i-res+k-1)//k
                e=op+n
                t+=(e*(e+1)//2)-(op*(op+1)//2)

                res=res+(n*k)-i
                op+=n

        return t%(10**9+7)
                