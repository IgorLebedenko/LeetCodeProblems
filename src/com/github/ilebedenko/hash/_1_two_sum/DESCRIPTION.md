<h2>1. Two Sum</h2>

`Difficulty: EASY`

Given an array of integers `nums` and an integer `target`, 
return _indices of the two numbers such that they add up to_ `target`.

You may assume that each input would have **exactly one solution**, 
and you may not use the _same_ element twice.

You can return the answer in any order.

**Example 1:**

> **Input:** nums = [2,7,11,15], target = 9 <br/>
**Output:** [0,1] <br/>
**Explanation** Because nums[0] + nums[1] == 9, we return [0, 1].


**Example 2:**

> **Input:** nums = [3,2,4], target = 6 <br/>
**Output:** [1,2]


**Example 3:**

> **Input:** nums = [3,3], target = 6 <br/>
**Output:** [0,1]


**Constraints:**
- `2 <= nums.length <= 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`
- `-10⁹ <= target <= 10⁹`
- **Only one valid answer exists.**