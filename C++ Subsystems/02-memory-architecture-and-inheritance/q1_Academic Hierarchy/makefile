# Compiler
CXX = g++
# Compiler flags
CXXFLAGS = -Wall

# Output executable
TARGET = q1

# Source files
SRC = main.cpp

# Default target
all: $(TARGET)

$(TARGET): $(SRC)
	$(CXX) $(CXXFLAGS) $(SRC) -o $(TARGET)

# Clean generated files
clean:
	rm -f $(TARGET)

