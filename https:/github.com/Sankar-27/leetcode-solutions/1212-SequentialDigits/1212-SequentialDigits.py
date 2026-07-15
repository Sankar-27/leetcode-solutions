# Last updated: 15/07/2026, 08:47:56
class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        res=[]
        sample="123456789"
        min=len(str(low))
        max=len(str(high))
        for l in range(min,max+1):
            for i in range(10-l):
                num_str=sample[i:i+l]
                num=int(num_str)
                if low<=num<=high:
                    res.append(num)

        return res