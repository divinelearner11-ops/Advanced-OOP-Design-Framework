#include <iostream>
#include "Account.h"
using namespace std;

Account::Account() {
    balance = 0;
}

void Account::setBalance(double b) {
    if (b < 0)
        cout << "Error: Balance cannot be negative\n";
    else
        balance = b;
}

double Account::getBalance() const {
    return balance;
}
