/* Decryption.cpp
  Author:Daksha chava
  Created on:DEC 2nd,2022
  A C++ program to decrypt the encrypted values
*/

#include <iostream>
using namespace std;
/*int main()
It returns some integer value at the end of execution
*/
#define AE 0xE000 // bits 15:13 end up as 11:9 AE is 1110 0000 0000 0000
#define BE 0x1F00 // bits 12:8 end up as 4:0   BE is 0001 1111 0000 0000
#define CE 0x00F0 // bits 7:4 end up as 15:12  CE is 0000 0000 1111 0000
#define DE 0x000F // bits 3:0 end up as 8:5    DE is 0000 0000 0000 1111

#define AD 0xF000 // bits 15:12 end up as 8:5  AD is 1111 0000 0000 0000
#define BD 0x0A00 // bits 11:9 end up as 15:12 BD is 0000 1110 0000 0000
#define CD 0x01E0 // bits 8:5 end up as 4:0    CD is 0000 0001 1110 0000
#define DD 0x001F // bits 4:0 end up as 11:9   DD is 0000 0000 0001 1111

unsigned short encrypt(unsigned short n)
{
    unsigned short a, b, c, d; // for the four parts of n
    a = (n & AE) >> 4;         // Isolate bits 15:13, shift to positions 11:9.
    b = (n & BE) >> 8;         // Isolate bits 12:8, shift to positions 4:0.
    c = (n & CE) << 8;         // Isolate bits 7:4, shift to positions 15:12.
    d = (n & DE) << 5;         // Isolate bits 3:0, shift to positions 8:5.
    return c | a | d | b;      // Pack the four parts back together.
}
unsigned short decrypt(unsigned short n)
{
    unsigned short a, b, c, d; // for the four parts of n
    a = (n & AD) >> 8;         // Isolate bits 15:12, shift to positions 8:5.
    b = (n & BD) << 4;         // Isolate bits 11:9, shift to positions 15:12.
    c = (n & CD) >> 5;         // Isolate bits 8:5, shift to positions 4:0.
    d = (n & DD) << 8;         // Isolate bits 4:0, shift to positions 11:9.
    return a | b | c | d;      // Pack the four parts back together.
}

int main(void)
{
    short in;
    unsigned short encryption, y;
    unsigned short decryption;
    cout << "Welcome to the C++ program by Daksha" << endl;
    cout << "Enter a short number to encrypt: ";
    cin >> in;
    // Cast the int to unsigned before calling encrypt and decrypt.
    encryption = encrypt((unsigned short)in);
    decryption = decrypt((unsigned short)encryption);
    cout << "\nThe input number in base 10 (decimal) is:" << in << " \n"
         << "The input number in base 16 (hexadecimal) is: " << hex << in << " \n\n"
         << "The encrypted number in base 10 is:" << dec << encryption << "\n"
         << "The encrypted number in base 16 is:" << hex << encryption << "\n\n"
         << "The decrypted number in base 10 is:" << dec << decryption << "\n"
         << "The decrypted number in base 16 is:" << hex << decryption << "\n\n"
         << "Thank you BYE!!";
}
