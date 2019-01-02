class Solution:
    def lengthOfLongestSubstring(self, s):
        if not s:
            return 0
        my_dict = {}
        lon=1
        j=0
        i=0
        while j < len(s) and i < len(s):   
            if s[j] not in my_dict:
                my_dict[s[j]] = j
                j+=1
                if(lon<len(my_dict)):
                    lon=len(my_dict)
            elif s[j] in my_dict:
                i = my_dict[s[j]]
                i+=1
                j=i
                if(lon<len(my_dict)):
                    lon=len(my_dict)
                my_dict.clear()
        return lon
