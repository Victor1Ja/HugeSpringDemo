## Task 1 Requirements & Constraints:

The input is an integer (x).
The output should be a boolean indicating whether the integer is a palindrome or not.
Palindrome: A number that reads the same backward as forward (e.g., 121, 1221).

### Task 1 Solution Approach:
Read the integer as a string and check if it reads the same backward.

### Task 1 Estimation:
Considering a simple approach where we convert the integer to a string and check if it reads the same backward.

### Requirements:
As Developer I want an endpoint that receives an integer and returns a boolean indicating whether the integer is a palindrome or not.
Framework: Spring Boot
Language: Java

### Corner Cases:
- If the input is negative, it should return false.
- If the input is not a number, it should return false.

### Code Estimation:
The time spent on this task is estimated to be 2 hour, considering the developer has no prior experience with the framework and language.

### Task 1 Actual Time Spent:
Was spent 2:30 hours to implement the endpoint and test it.

## Task 2 Requirements & Constraints:
The input is a string (s) containing only the characters '(', ')', '{', '}', '[', and ']'.
The output should be a boolean indicating whether the input string has valid brackets.
Valid brackets: Open brackets must be closed by the same type of brackets, in the correct order, and every close bracket has a corresponding open bracket of the same type.

### Requirements:
As Developer I want an endpoint that receives a string and returns a boolean indicating whether the input string has valid brackets.
Framework: Spring Boot
Language: Java


### Corner Cases:
- If the input is empty, it should return true.
- If the input contains characters other than '(', ')', '{', '}', '[', and ']', it should return false.

### Task 2 Solution Approach:
Using a stack-based approach to track open and close brackets.

### Time Complexity:
Assuming a straightforward implementation, the time complexity is O(n) where n is the length of the input string.

### Code Estimation:
The time spent on this task is estimated to be 2 hour, considering the developer has no prior experience with the framework and language.


### Task 2 Actual Time Spent:
Was spent 2:30 hours to implement the endpoint and test it.
