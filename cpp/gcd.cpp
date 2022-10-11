#include <bits/stdc++.h>
using namespace std;

int gcd1(int x, int y)
{
    int gcd = 1;
    for (int i = 2; i <= min(x, y); i++)
    {
        if (x % i == 0 && y % i == 0)
            gcd = i;
    }
    return gcd;
}
int gcd2(int x, int y)
{
    int gcd = min(x, y);
    while (gcd > 0)
    {
        if (x % gcd == 0 && y % gcd == 0)
            break;
        gcd--;
    }
    return gcd;
}

int gcd3(int x, int y)
{
    if (y == 0)
        return x;
    else
        return gcd3(y, x % y);
}
int main()
{
    int x, y;
    cin >> x >> y;
    cout << gcd1(x, y) << endl;
    cout << gcd2(x, y) << endl;
    cout << gcd3(x, y) << endl;
    return 0;
}
