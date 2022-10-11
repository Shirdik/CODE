#include <bits/stdc++.h>
using namespace std;

void divisors1(int x)
{
    for (int i = 1; i <= x; i++)
    {
        if (x % i == 0)
            cout << i << " ";
    }
    cout << endl;
    return;
}

void divisors2(int x)
{
    int i;
    for (i = 1; i * i < x; i++)
    {
        if (x % i == 0)
            cout << i << " ";
    }
    for (; i >= 1; i--)
    {
        if (x % i == 0)
            cout << x / i << "  ";
    }
    cout << endl;
    return;
}

int main()
{
    int x;
    cin >> x;
    divisors1(x);
    divisors2(x);
    return 0;
}
