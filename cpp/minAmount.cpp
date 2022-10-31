#include <bits/stdc++.h>
using namespace std;
bool check(int a[], int n, int mid)
{
    int start = a[0] + mid;
    // cout<<"mid:"<<mid<<" start "<<start<<endl;
    if (start <= 0)
    {
        return false;
    }
    for (int i = 1; i < n; i++)
    {
        if (start + a[i] > 0)
        {
            // cout<<start<<endl;
            start = start + a[i];
        }
        else
        {
            return false;
        }
    }
    // cout<<"start "<<start<<endl;
    return start > 0 ? true : false;
}
int main()
{
    int T;
    cin >> T;
    while (T--)
    {
        int n;
        cin >> n;
        int a[n];
        int start = 0, end = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
            if (a[i] < 0)
            {
                end = end + abs(a[i]);
            }
        }
        end = abs(end) + 1;
        int ans = INT_MIN;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (check(a, n, mid))
            {
                ans = mid;
                end = mid - 1;
            }
            else
            {
                // cout<<ans;
                start = mid + 1;
            }
        }
        cout << ans << endl;
    }
}