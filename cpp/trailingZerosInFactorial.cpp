#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x;
    cin >> x;
    int count = 0;
    // Trailing zeros can be measured by calclating the power of 5 in the prime factors
    for (int i = 5; i <= x; i *= 5)
    {
        count += x / i;
    }
    cout << count << endl;
    return 0;
}
