#    make run_q1   -> compile and run Question 1
#    make run_q2   -> compile and run Question 2
#    make run_q3   -> compile and run Question 3
#    make run_q4   -> compile and run Question 4
#    make clean    -> remove all compiled .class files

JC = javac
JR = java

# Question 1: Employee with Static Members
compile_q1:
	$(JC) -d q1/ q1/Employee.java q1/Main.java

run_q1: compile_q1
	cd q1 && $(JR) Main

# Question 2: Inheritance - Bank Accounts
compile_q2:
	$(JC) -d q2/ q2/Account.java q2/SavingsAccount.java q2/CurrentAccount.java q2/Main.java

run_q2: compile_q2
	cd q2 && $(JR) Main

# Question 3: Interface and Polymorphism (banking package)
compile_q3:
	$(JC) -d q3/ q3/banking/InterestBearing.java q3/banking/Account.java \
		q3/banking/FixedDepositAccount.java q3/banking/RecurringDepositAccount.java \
		q3/Main.java

run_q3: compile_q3
	cd q3 && $(JR) Main

# Question 4: StudentDatabase with Exception Handling
compile_q4:
	$(JC) -d q4/ q4/DuplicateRollNoException.java q4/InvalidMarksException.java \
		q4/DatabaseFullException.java q4/InvalidRollNoException.java \
		q4/Student.java q4/StudentDatabase.java q4/Main.java

run_q4: compile_q4
	cd q4 && $(JR) Main

# Clean all compiled class files
clean:
	find q1 q2 q3 q4 -name "*.class" -delete
	@echo "All .class files removed."

.PHONY: compile_q1 run_q1 compile_q2 run_q2 compile_q3 run_q3 compile_q4 run_q4 clean
