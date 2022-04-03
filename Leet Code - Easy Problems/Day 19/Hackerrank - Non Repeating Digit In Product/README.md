# Non Repeating Digit In Product

Given a number `x`,and a range of `y` to `z`, please find the count of all the numbers `n` in that
range, such that the product of the number `n` and `x` does not contain any digit from the number `n`.

**General Constraints:** All the inputs will be integers and below 10^5.

**Example:**
```
If x=2, y=10 and z=15, then,

2 x 10 = 20 //Invalid, since the product contains 0 from 10.
2 x 11 = 22 //Valid
2 x 12 = 24 //Invalid, since the product contains 2 from 12.
2 x 13 = 26 //Valid
2 x 14 = 28 //Valid
2 x 15 = 30 //Valid

Hence, the final count is 4.
```