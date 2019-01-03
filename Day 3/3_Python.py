class Solution(object):
    def uniqueMorseRepresentations(self, words):
        lst = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        alpha=['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
        d = dict(zip(alpha,lst))
        my_set = set()
        for i in words:
            code=""
            for a in i:
                code+=d[a]
            my_set.add(code)
        return len(my_set)