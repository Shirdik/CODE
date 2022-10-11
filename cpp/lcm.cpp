#include <bits/stdc++.h>
using namespace std;

int gcd3(int x, int y)
{
    if (y == 0)
        return x;
    else
        return gcd3(y, x % y);
}

int lcm1(int x, int y)
{
    int i = max(x, y);
    while (true)
    {
        if (i % x == 0 && i % y == 0)
            return i;
        i++;
    }
}

int lcm2(int x, int y)
{
    return (x * y) / gcd3(x, y);
}
int main()
{
    int x, y;
    cin >> x >> y;
    cout << lcm1(x, y) << endl;
    cout << lcm2(x, y) << endl;

    return 0;
}
