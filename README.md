
# LeetCode Challenge D34
## Achievements
[![image.png](https://i.postimg.cc/FsPZZm7Y/image.png)](https://postimg.cc/9r7Zm6P2)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [[1287. Element Appearing More Than 25% In Sorted Array](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an integer array **sorted** in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

**Example**

> **Input:** arr = [1,2,2,6,6,6,6,7,10]
> 
>**Output:** 6

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview

The algorithm utilizes a sliding window approach by iterating through the array with a window size determined by the 25% threshold. It compares elements at the beginning and end of each window, checking if they are equal. If the equality condition is met, it indicates that this element occurs more than 25% of the time within that window, and the algorithm returns that element. The window slides through the array, checking for such occurrences. If no suitable element is found after the iteration, the function returns -1, indicating that there is no element meeting the specified criteria in the array.
