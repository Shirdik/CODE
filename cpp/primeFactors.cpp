#include <bits/stdc++.h>
using namespace std;

void primeFactors(int x)
{
    if (x <= 1)
        return;
    while (x % 2 == 0)
    {
        cout << "2 ";
        x /= 2;
    }
    while (x % 3 == 0)
    {
        cout << "3 ";
        x /= 3;
    }
    for (int i = 5; (i * i) <= x; i += 6)
    {
        while (x % i == 0)
        {
            cout << i << " ";
            x /= i;
        }
        while (x % (i + 2) == 0)
        {
            cout << i + 2 << " ";
            x /= (i + 2);
        }
    }
    if (x > 3)
        cout << x << endl;
    return;
}

int main()
{
    int x;
    cin >> x;
    primeFactors(x);
    return 0;
}
