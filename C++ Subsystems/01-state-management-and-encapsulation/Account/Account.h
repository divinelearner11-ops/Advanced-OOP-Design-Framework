#ifndef ACCOUNT_H
#define ACCOUNT_H

class Account {
private:
    double balance;

public:
    Account(); // default constructor
    void setBalance(double b);
    double getBalance() const;
};

#endif
