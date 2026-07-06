#include <iostream>
#include "Account.h"
using namespace std;

int main() {
    Account acc;
    acc.setBalance(5000);
    acc.setBalance(-200);
    cout << "Balance: " << acc.getBalance() << endl;
    return 0;
}
