# P-Problem

A problem is assigned to the P (polynomial time) class if there exists at least one algorithm to solve that problem, such that the number of steps of the algorithm is bounded by a polynomial in `n`, where `n` is the length of the input.

P问题就是可以有一个确定型图灵机在多项式时间内解决的问题。即目前那些存在O(n), O(nk), O(nlogn)等多项式时间复杂度解法的问题。比如排序问题、最小生成树、单源最短路径。直观的讲，我们将P问题视为可以较快解决的问题。

NP问题是指那些可以在非确定型图灵机上在多项式时间内解决的问题。（在确定型图灵机上可以在多项式时间内验证解是否正确，但不能在多项式时间内找出最优解的问题）

NP是目前为止还未找到多项式解法的问题。对于这些问题，我们目前也不知道是否存在多项式的解法。所以叫非确定多项式问题。NP代表“Non-deterministic（非确定性）Polynomial（多项式）”而不是代表“Non-Polynomial（非多项式）。
