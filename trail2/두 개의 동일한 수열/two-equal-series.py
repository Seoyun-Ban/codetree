n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# Please write your code here.
A = set(A)
B = set(B)

if A == B:
    print("Yes")
else:
    print("No")