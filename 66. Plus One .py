class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s = ""
        for i in digits:
            s += str(i)
        a = int(s) +1
        c = []
        for i in str(a):
            c.append(int(i))

        return c

