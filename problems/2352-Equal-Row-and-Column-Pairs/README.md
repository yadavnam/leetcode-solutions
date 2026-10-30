<div align="center">

# 2352. Equal Row and Column Pairs

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Medium-ffa116?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-4-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--10--30-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/equal-row-and-column-pairs/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Array, Hash Table, Matrix, Simulation — best runtime 18 ms (Beats 87%), best memory 53.8 MB (Beats 57%)" src="panel-dark.svg">
</picture>

</div>

> **New personal best** — Runtime improved on this submission.

### HOW IT WENT

| | |
|:--|:--|
| **Attempts** | 6 before accepted |
| **Time to solve** | 22 h 38 min |
| **Verdicts** | ✅ Accepted → 💥 Runtime Error → ✅ Accepted → ❌ Wrong Answer → ✅ Accepted → ✅ Accepted |

---

### NOTES

_No notes yet._

---

### SOLUTIONS (4)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-10-30 |
| 2 | [sol2.java](./sol2.java) | `Java` | 2026-10-30 |
| 3 | [sol3.java](./sol3.java) | `Java` | 2026-10-30 |
| 4 | [sol4.java](./sol4.java) | `Java` | 2026-10-30 ← **latest** |

---

### PROBLEM DESCRIPTION

Given a **0-indexed** `n x n` integer matrix `grid`, *return the number of pairs *`(r_i, c_j)`* such that row *`r_i`* and column *`c_j`* are equal*.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

 

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/06/01/ex1.jpg)
```

**Input:** grid = [[3,2,1],[1,7,6],[2,7,7]]
**Output:** 1
**Explanation:** There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]

```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/06/01/ex2.jpg)
```

**Input:** grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
**Output:** 3
**Explanation:** There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]

```

 

**Constraints:**

	- `n == grid.length == grid[i].length`

	- `1 <= n <= 200`

	- `1 <= grid[i][j] <= 10^5`

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
