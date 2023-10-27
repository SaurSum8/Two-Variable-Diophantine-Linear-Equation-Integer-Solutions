# Two-Variable-Diophantine-Linear-Equation-Integer-Solutions

Program finds a general formula, which gives all integer solutions to a two variable diophantine linear equation.

> **How to call function:**

To find all integer solutions to y and x of an equation:

ay = bx + c (a,b,c are constants of type int)

Call:

DLEITVS(a, b, c)

> **Returns the solution equation in form:**

x = pn + q

y = rn + s

(where n can be any integer)

The program returns a 2D int array in form: {{p,q}, {r,s}}, i.e. if t is the returned array:

p = t[0][0]

q = t[0][1]

r = t[1][0]

s = t[1][1]

> ***If a solution does not exist, it returns an arithmetic exception**

> **Proof/Intution behind my algorithm:**

![Screenshot 2023-10-27 at 23-34-25 Notes - 26-10-23 Math Formulas and Proofs pdf](https://github.com/SaurSum8/Two-Variable-Diophantine-Linear-Equation-Integer-Solutions/assets/78038123/b1da0f88-0f79-4457-9d96-caf79797861c)
![Screenshot 2023-10-27 at 23-35-09 Notes - 26-10-23 Math Formulas and Proofs pdf](https://github.com/SaurSum8/Two-Variable-Diophantine-Linear-Equation-Integer-Solutions/assets/78038123/f252214f-2538-4635-bed9-2926c3e71c44)
![Screenshot 2023-10-27 at 23-35-20 Notes - 26-10-23 Math Formulas and Proofs pdf](https://github.com/SaurSum8/Two-Variable-Diophantine-Linear-Equation-Integer-Solutions/assets/78038123/e8d594d5-774d-4767-8b2b-21900b4a93c6)
![Screenshot 2023-10-27 at 23-35-38 Notes - 26-10-23 Math Formulas and Proofs pdf](https://github.com/SaurSum8/Two-Variable-Diophantine-Linear-Equation-Integer-Solutions/assets/78038123/70a04998-c791-47a5-b99c-52c1b2cfd50a)
