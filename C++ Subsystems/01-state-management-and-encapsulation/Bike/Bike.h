#ifndef BIKE_H
#define BIKE_H

class Bike {
private:
    int currentSpeed;
    int fuelLevel;

public:
    Bike(); // default constructor
    void accelerate();
    void decelerate();
    void display() const;
};

#endif
