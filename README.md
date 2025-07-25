## INHERITANCE & POLYMORPHISM
# Assignment 3 
# By Laiza Arriesgado - 2025
## Instructions:
1.	Write an employee payroll program that uses polymorphism to calculate and print the weekly payroll for your company. 
2.	There are three types of employees ─ hourly, salaried, and salaried plus commission. Each type of employee gets paid using a different formula. But for all employee types, if the calculated paycheck exceeds $1000, the actual paycheck must be decreased to $1000.
```
Employee class:
 Instance variables:
name
social security number
birthday month
birthday week.
load method :
Prompts the user for instance-variable values and loads the entries.
```
3.	Returns a string that shows the employee’s name, social security number, and paycheck..  Use the String.format method (See Java API documentation to help you format the string as shown in the sample session’s paycheck report.) Here’s an example from the sample session:
```
employee: Biff Sanchez
social security number: 111-11-1111
paycheck: $800.00
getBonus method:
```
4.	Generates a $100 employee birthday bonus. Compare the employee’s birthday with the current date found on your computer system. Use the Calendar class to generate the current date. (See the Java API documentation.) If the employee’s birthday month and birthday week match your computer system’s current month and current week, then increment the employee’s paycheck by $100. The birthdayMonth holds the month (1─12) in which the employee was born. The birthdayWeek holds the week (1─4) that the employee chooses to get paid his/her bonus.
```
Hourly class:
Instance variables:
hourly pay
hours worked during the past week
load method:
Prompts the user for instance-variable values and loads the entries. 
```
5.	Include a getEarnings method that calculates earnings for an hourly employee. Hourly employees are paid by the hour. If they work more than 40 hours in a week, then they receive overtime pay for their overtime work. Overtime pay equals one and a half times their normal hourly pay.
```
Salaried class:
Instance variables:
weekly salary
 
load method:
Prompts the user for instance-variable values and loads the entries.
```
6.	Include a getEarnings method that calculates earnings for a salaried employee. Salaried employees are paid their fixed weekly salary regardless of the number of hours they work.
``` 
SalariedPlusCommission class:
 
Instance variables:
sales during the past week
commission rate
 
load method:
Prompts the user for instance-variable values and loads the entries.
``` 
7.	Include a getEarnings method that calculates earnings for a SalariedPlusCommission employee. SalariedPlusCommission employees are paid a base salary plus a percentage of their sales. “Percentage of their sales” equates to the product of their sales times their commission rate.
8.	Use initially declared named constants instead of hardcoded “magic numbers” embedded in the program. In the Employee class, include a getEarnings method that is abstract.
9.	Use the public access modifier for the toString method in the Employee class and the load method in the Employee, Hourly, Salaried, and SalariedPlusCommission classes.
10.	Provide a driver that generates the following queries and outputs.

## Sample Session (Current Date: July 19, 2025):
```Number of employees: 3
 
PROFILE FOR EMPLOYEE #1:
type Hourly(1), Salaried(2), Salaried plus Commission(3)
Enter 1, 2, or 3 ==> 1
Name ==> Biff Sanchez
Social security number ==> 111-11-1111
Birthday month (1-12) ==> 2
Birthday bonus week (1-4) ==> 3
Hourly pay ==> 20
Hours worked this past week ==> 30
 
PROFILE FOR EMPLOYEE #2:
type Hourly(1), Salaried(2), Salaried plus Commission(3)
Enter 1, 2, or 3 ==> 2
Name ==> Dirk Jones
Social security number ==> 222-22-2222
Birthday month (1-12) ==> 10
Birthday bonus week (1-4) ==> 2
Salary ==> 700
 
PROFILE FOR EMPLOYEE #3:
type Hourly(1), Salaried(2), Salaried plus Commission(3)
Enter 1, 2, or 3 ==> 3
Name ==> Suzie Que
Social security number ==> 333-33-3333
Birthday month (1-12) ==> 7
Birthday bonus week (1-4) ==> 3
Salary ==> 400
Sales for this past week ==> 2000
Sales commission rate (fraction paid to employee) ==> .25
 
PAYCHECK REPORT:
 
employee: Biff Sanchez
social security number: 111-11-1111
paycheck: $600.00
 
employee: Dirk Jones
social security number: 222-22-2222
paycheck: $700.00
 
employee: Suzie Que
social security number: 333-33-3333
paycheck: $900.00
```

## Reference:
Dean, J. Dean, R. (2021).  Introduction to programming with java:  a problem solving approach (3rd edition). McGraw-Hill Education.