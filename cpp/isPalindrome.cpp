#include <bits/stdc++.h>
using namespace std;

int main()
{
    string x;
    cin >> x;

    for (int i = 0; i < x.length() / 2; i++)
    {
        if (x[i] != x[x.length() - i - 1])
        {
            x = "0";
            break;
        }
    }
    x != "0" ? cout << "Palindrome" : cout << "Not a Palindrome";
    return 0;
}
