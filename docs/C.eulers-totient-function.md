# Euler's totient function

In number theory, **Euler's totient function** counts the positive integers up to a given integer `n` that are relatively prime to `n`. It is written using the Greek letter phi as `φ(n)` or `ϕ(n)`, and may also be called **Euler's phi function**. In other words, it is the number of integers `k` in the range `1 ≤ k ≤ n` for which the greatest common divisor `gcd(n, k)` is equal to `1`. The integers `k` of this form are sometimes referred to as **totatives** of `n`.

For example, the totatives of `n = 9` are the six numbers `1, 2, 4, 5, 7` and `8`. They are all relatively prime to 9, but the other three numbers in this range, `3, 6`, and `9` are not, because `gcd(9, 3) = gcd(9, 6) = 3` and `gcd(9, 9) = 9`. Therefore, `φ(9) = 6`. As another example, `φ(1) = 1` since for `n = 1` the only integer in the range from `1` to `n` is `1` itself, and `gcd(1, 1) = 1`.

**Euler's totient function** is a **multiplicative function**, meaning that if two numbers `m` and `n` are relatively prime, then `φ(mn) = φ(m)φ(n)`. It is also used for defining the RSA encryption system.
