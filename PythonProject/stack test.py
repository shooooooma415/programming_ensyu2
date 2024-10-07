import stack

stack1 = stack.stack(5)
stack2 = stack.stack(10)

print(stack1.isEmpty())
print(stack2.isEmpty())

for num in range(5):
    stack1.push(num*num)
    stack2.push(num*num*num)

stack1.show()
stack2.show()

print(stack1.pop())
print(stack2.pop())

stack1.push(10)

stack1.show()
stack2.show()

print(stack2.pop())
print(stack2.pop())
print(stack2.pop())

print(stack2.isEmpty())

print(stack2.pop())

print(stack2.isEmpty())

print(stack2.pop())