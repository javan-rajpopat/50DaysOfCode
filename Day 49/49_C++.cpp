const int MAX_LETTERS = 26;
class Trie
{
private:
	struct Node
	{
		Node *next[MAX_LETTERS];
		bool endOfString;
	};
	Node *root; //points to an empty node.
public:
	Trie()
	{
		root = new Node();
		root->endOfString = false;
	}

	void insert(string word)
	{
		Node *p = root;
		for (int i = 0; i < word.size(); ++i)
		{
			int j = word[i] - 'a';
			if (p->next[j] == NULL)
			{
				p->next[j] = new Node();
			}
			p = p->next[j];
		}
		p->endOfString = true;
	}

	bool search(string word)
	{
		Node* p = root;
		for (int i = 0; i < word.size(); ++i)
		{
			int j = word[i] - 'a';
			if (p->next[j] == NULL)
				return false;
			else
				p = p->next[j];
		}
		return p->endOfString;
	}

	bool startsWith(string prefix)
	{
		Node *p = root;
		for (int i = 0; i < prefix.size(); ++i)
		{
			int j = prefix[i] - 'a';
			if (p->next[j] == NULL)
				return false;
			p = p->next[j];
		}
		return true;
	}
};