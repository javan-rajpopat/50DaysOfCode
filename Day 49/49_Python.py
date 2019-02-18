class Trie(object):
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.val = None
        self.left = None
        self.right = None
        
    def insert(self, word):
        """
        Inserts a word into the trie.
        :type word: str
        :rtype: void
        """
        if self.val == None:
            self.val = word
        if word<=self.val:
            if self.left!=None:
                self.left.insert(word)
            else:
                self.left = Trie()
                self.left.val = word
        elif word>self.val:
            if self.right!=None:
                self.right.insert(word)
            else:
                self.right = Trie()
                self.right.val = word
                
    def search(self, word):
        """
        Returns if the word is in the trie.
        :type word: str
        :rtype: bool
        """
        #print(self.val,"  " ,word)
        if self.val == word:
            return True
        if word<self.val:
            if self.left!=None:
                return self.left.search(word)
            else:
                return False
        elif word>self.val:
            if self.right!=None:
                return self.right.search(word)
            else:
                return False
            
    def startsWith(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        :type prefix: str
        :rtype: bool
        """
        if self.val == None:
            return False
        if self.val[:len(prefix)] == prefix:
            return True
        if prefix<self.val[:len(prefix)]:
            if self.left!=None:
                return self.left.startsWith(prefix)
            else:
                return False
        elif prefix>self.val[:len(prefix)]:
            if self.right!=None:
                return self.right.startsWith(prefix)
            else:
                return False
# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)