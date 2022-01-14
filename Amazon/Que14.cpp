#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;

    Node(int val)
    {
        data = val;
        left = right = NULL;
    }
};

Node *buildTree(string str)
{

    if (str.length() == 0 || str[0] == 'N')
        return NULL;

    vector<string> ip;

    istringstream iss(str);
    for (string str; iss >> str;)
        ip.push_back(str);

    Node *root = new Node(stoi(ip[0]));

    queue<Node *> queue;
    queue.push(root);

    int i = 1;
    while (!queue.empty() && i < ip.size())
    {

        Node *currNode = queue.front();
        queue.pop();

        string currVal = ip[i];

        if (currVal != "N")
        {

            currNode->left = new Node(stoi(currVal));

            queue.push(currNode->left);
        }

        i++;
        if (i >= ip.size())
            break;
        currVal = ip[i];

        if (currVal != "N")
        {

            currNode->right = new Node(stoi(currVal));

            queue.push(currNode->right);
        }
        i++;
    }

    return root;
}

class Solution
{
public:
    int minTime(Node *root, int target)
    {

        queue<Node *> q;
        q.push(root);
        unordered_map<Node *, Node *> parent;
        Node *main = NULL;
        while (!q.empty())
        {
            Node *temp = q.front();
            q.pop();
            if (temp->left != NULL)
            {
                parent[temp->left] = temp;
                q.push(temp->left);
            }
            if (temp->right != NULL)
            {
                parent[temp->right] = temp;
                q.push(temp->right);
            }
            if (temp->data == target)
                main = temp;
        }
        queue<pair<Node *, int>> q1;
        unordered_map<Node *, int> vis;
        q1.push(make_pair(main, 0));
        parent[root] == NULL;
        int ans = 0;
        while (!q1.empty())
        {
            Node *temp = q1.front().first;
            int t = q1.front().second;
            ans = max(t, ans);
            q1.pop();
            if (temp->left != NULL && vis[temp->left] == 0)
            {
                vis[temp->left]++;
                q1.push(make_pair(temp->left, t + 1));
            }
            if (temp->right != NULL && vis[temp->right] == 0)
            {
                vis[temp->right]++;
                q1.push(make_pair(temp->right, t + 1));
            }
            if (parent[temp] != NULL && vis[parent[temp]] == 0)
            {
                q1.push(make_pair(parent[temp], t + 1));
                vis[parent[temp]]++;
            }
        }
        return ans;
    }
};

int main()
{
    int tc;
    scanf("%d ", &tc);
    while (tc--)
    {
        string treeString;
        getline(cin, treeString);

        int target;
        cin >> target;

        Node *root = buildTree(treeString);
        Solution obj;
        cout << obj.minTime(root, target) << "\n";

        cin.ignore();
    }

    return 0;
}
