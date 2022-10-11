#include <bits/stdc++.h>
using namespace std;

int main()
{
    string input[10] = {"Shirdi", "Daksha", "Prasad", "Vyshnavi", "Mithali", "Sanjana", "Namrata", "Uttej", "Kishore", "Goutham"};
    // string input[10];
    // cout << "Enter 10 Strings:" << endl;
    // for (int i = 0; i < 10; i++)
    // {
    //     cout << "ENTER HERE: " << i << " : " << endl;
    //     getline(cin, input[i]);
    // }
    char c;
    cout << "\nPlease choose a vowel:" << endl
         << "ENTER HERE: ";
    cin >> c;
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        cout << "It's a Vowel!" << endl;
    else
        cout << "Invalid Input!" << endl;
    cout << "Character :" << c << endl;
    for (int i = 0; i < 10; i++)
    {
        int lastIndex = -1;
        for (int j = 0; j < input[i].length(); j++)
        {
            if (input[i][j] == c)
                lastIndex = j;
        }
        cout << "String: " << input[i] << " Index: " << lastIndex << endl;
    }

    cout << "Enter a word to match the strings in the input given:" << endl
         << "ENTER HERE: ";
    string word;
    cin.ignore();
    getline(cin, word);
    cout << "Word: " << word << endl;
    for (int i = 0; i < 10; i++)
    {
        string isMatched = word.compare(input[i]) == 0 ? "TRUE" : "FALSE";
        cout << "String: " << input[i] << " Matching: " << isMatched << endl;
    }

    char oldChar, newChar;
    cout << "Enter the letter to be Replaced: " << ends;
    cin >> oldChar;
    cout << "\nEnter the new letter: " << ends;
    cin >> newChar;

    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < input[i].length(); j++)
            if (input[i][j] == oldChar)
                input[i][j] = newChar;
    }

    cout << "THE STRINGS AFTER THE CHANGES:" << endl;
    for (int i = 0; i < 10; i++)
    {
        cout << input[i] << endl;
    }

    return 0;
}
