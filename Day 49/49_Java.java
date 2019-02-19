class TrieNode {
   private TrieNode[] children = new TrieNode[26];
   boolean valueNode = false;
   public void insert(char[] chars, int index) {
		int i = chars[index] - 'a';
		if (children[i] == null) {
			children[i] = new TrieNode();
		}
		if (index == chars.length-1){
		    children[i].valueNode = true;
		    return;
		}
		children[i].insert(chars, index + 1);
	}
	
	public boolean search(char[] chars){
	    return search(chars, 0, true);
	}

	public boolean startsWith(char[] chars){
		return search(chars, 0, false);
	}
	
	private boolean search(char[] chars, int index, boolean exact){
	    if (index == chars.length) {
			if(!exact || (exact && valueNode)){
				return true;
			}
			return false;
		}
		int i = chars[index] - 'a';
		if (children[i] == null) {
			return false;
		}
		return children[i].search(chars, index+1, exact);
	}
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
		root.insert(word.toCharArray(), 0);
	}

	public boolean search(String word) {
		return root.search(word.toCharArray());
	}

	public boolean startsWith(String prefix) {
		return root.startsWith(prefix.toCharArray());
	}
}