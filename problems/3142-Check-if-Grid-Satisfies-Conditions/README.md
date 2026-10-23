<div align="center">

# 3142. Check if Grid Satisfies Conditions

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Easy-00b8a3?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--10--23-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/check-if-grid-satisfies-conditions/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Array, Matrix — best runtime 1 ms (Beats 98%), best memory 46.1 MB (Beats 86%)" src="panel-dark.svg">
</picture>

</div>

> **New personal best** — Runtime improved on this submission.

### HOW IT WENT

| | |
|:--|:--|
| **Attempts** | 5 before accepted |
| **Time to solve** | 15 min |
| **Verdicts** | ❌ Wrong Answer → ❌ Wrong Answer → ✅ Accepted → ✅ Accepted → ✅ Accepted |

---

### NOTES

_No notes yet._

---

### SOLUTIONS (1)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-10-23 ← **latest** |

---

### PROBLEM DESCRIPTION

You are given a 2D matrix `grid` of size `m x n`. You need to check if each cell `grid[i][j]` is:

	- Equal to the cell below it, i.e. `grid[i][j] == grid[i + 1][j]` (if it exists).

	- Different from the cell to its right, i.e. `grid[i][j] != grid[i][j + 1]` (if it exists).

Return `true` if **all** the cells satisfy these conditions, otherwise, return `false`.

 

**Example 1:**

**Input:** grid = [[1,0,2],[1,0,2]]

**Output:** true

**Explanation:**

**![](https://assets.leetcode.com/uploads/2024/04/15/examplechanged.png)**

All the cells in the grid satisfy the conditions.

**Example 2:**

**Input:** grid = [[1,1,1],[0,0,0]]

**Output:** false

**Explanation:**

**![](https://assets.leetcode.com/uploads/2024/03/27/example21.png)**

All cells in the first row are equal.

**Example 3:**

**Input:** grid = [[1],[2],[3]]

**Output:** false

**Explanation:**

![](https://assets.leetcode.com/uploads/2024/03/31/changed.png)

Cells in the first column have different values.

 

**Constraints:**

	- `1 <= n, m <= 10`

	- `0 <= grid[i][j] <= 9`

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
