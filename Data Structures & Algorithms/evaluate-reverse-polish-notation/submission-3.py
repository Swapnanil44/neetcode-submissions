class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        while len(tokens) > 1:
            for i in range(len(tokens)):
                if tokens[i] in "+-*/":
                    left = int(tokens[i-2])
                    right = int(tokens[i-1])
                    res = 0
                    if tokens[i] == "+":
                        res = left + right
                    elif tokens[i] == "-":
                        res = left - right
                    elif tokens[i] == "*":
                        res = left*right
                    else:
                        res = int(left/right)
                    tokens = tokens[:i-2] + [str(res)] + tokens[i+1:]
                    break

        return int(tokens[0])
