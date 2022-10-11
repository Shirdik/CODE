#include <bits/stdc++.h>
using namespace std;

void sieve(int x)
{
    bool a[x] = {true};
    for (int i = 0; i < x; i++)
    {
        cout << a[i] << endl;
    }
    return;
}
int main()
{
    int x;
    cin >> x;
    sieve(x);
    return 0;
}
