#include <bits/stdc++.h>
using namespace std;

// The following function follows recursive solution which needs theta(n) time and space complexity. So, the iterative solution is considered more efficient
int factorial(int x)
{
    if (x < 2)
        return 1;
    return x * factorial(x - 1);
}
int main(int argc, char const *argv[])
{

    int x;
    cin >> x;
    int temp = 1;
    cout << factorial(x) << endl;
    while (x)
    {
        temp *= x;
        x--;
    }
    cout << temp << endl;
    return 0;
}
