### Loops6

Write a method investmentCalculator that checks how many years it would take for an initial investment to reach a target investment, given compound growth at an annual interest rate.
 
#### Input
- None of the parameters can be negative (to keep this problem realistic); if any  one is, throw an IllegalArgumentException
- There are again unusual cases which would give you an infinite loop, because the initial investment would never reach the target investment. Mathematically, you would say that the answer is undefined. If this occurs, throw an ArithmeticException

#### Output
- See the unit tests for expected output; you can also verify this mathematically.

#### Note
- The core of this calculation is simple, and can be written with a while loop. 
- There is one other edge case that you will need to be aware of!

See the unit tests for example output.