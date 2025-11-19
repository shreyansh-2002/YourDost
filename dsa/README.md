
##  Problem
Given an array of integers, return the second largest unique number.  
If it doesn’t exist → return -1.

##  Approach
1. We Use a HashSet to remove duplicate integers.  
2. If unique elements < 2 → directly return -1.  
3. Loop once through the set to find:
    Largest number
   Second largest number  
4. Return second largest.


##  Time Complexity
O(n) — Single pass for inserting into set + single pass for finding answer.

##  Space Complexity
O(n) — Unique values stored in a HashSet.


