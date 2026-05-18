class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        data = set()
        for n in nums:
            if n in data:
                return True
            data.add(n)
        return False