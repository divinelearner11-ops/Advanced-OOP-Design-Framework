#include <iostream>
#include "Bike.h"
using namespace std;

Bike::Bike() {
    currentSpeed = 0;
    fuelLevel = 100;
}

void Bike::accelerate() {
    if (fuelLevel > 0) {
        currentSpeed += 10;
        fuelLevel -= 5;
    }
}

void Bike::decelerate() {
    if (currentSpeed > 0)
        currentSpeed -= 10;
}

void Bike::display() const {
    cout << "Speed: " << currentSpeed << " Fuel: " << fuelLevel << endl;
}
