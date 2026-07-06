#include "Package.h"

// Default constructor
Package::Package() {
    length = width = height = 0;
}

// Parameterized constructor
Package::Package(int l, int w, int h) {
    length = l;
    width = w;
    height = h;
}

// Copy constructor
Package::Package(const Package& p) {
    length = p.length;
    width = p.width;
    height = p.height;
}

// Displays package dimensions
void Package::display() {
    cout << "Dimensions: "
         << length << " x " << width << " x " << height << endl;
}

int main() {
    Package p1;                 // Default constructor
    Package p2(10, 20, 30);     // Parameterized constructor
    Package p3 = p2;            // Copy constructor

    p1.display();
    p2.display();
    p3.display();

    return 0;
}
