class Solution:
    def fizzBuzz(self, n: 'int') -> 'List[str]':
        ans = []
        for x in range(1,n+1):
            if (x>=5 and x%5==0) or (x>=3 and x%3==0):
                if x%5==0 and x%3==0:
                    ans.append("FizzBuzz")
                elif x%5==0:
                    ans.append("Buzz")
                else:
                    ans.append("Fizz")
            else:
                ans.append(str(x))
        return ans
                    