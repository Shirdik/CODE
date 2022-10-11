int gcd3(int x, int y)
{
    if (y == 0)
        return x;
    else
        return gcd3(y, x % y);
}