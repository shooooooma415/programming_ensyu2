class DoubleQueue:
    def __init__(self, maxSize):
        self.dataArray = [None] * (maxSize + 1)
        self.front = 0
        self.rear = 0
        self.maxSize = maxSize

    def isFull(self):
        return (self.rear + 1) % len(self.dataArray) == self.front

    def isEmpty(self):
        return self.front == self.rear

    def size(self):
        if self.rear >= self.front:
            return self.rear - self.front
        else:
            return len(self.dataArray) - self.front + self.rear

    def show(self):
        if self.isEmpty():
            print("キューは空です")
            return
        i = self.front
        while i != self.rear:
            print(f"Array[{i}]: {self.dataArray[i]}")
            i = (i + 1) % len(self.dataArray)

    def enqueue(self, x):
        if self.isFull():
            print("キューは一杯です")
            return
        self.dataArray[self.rear] = x
        self.rear = (self.rear + 1) % len(self.dataArray)

    def dequeue(self):
        if self.isEmpty():
            print("キューは空です")
            return None
        data = self.dataArray[self.front]
        self.front = (self.front + 1) % len(self.dataArray)
        return data

    def clear(self):
        self.front = 0
        self.rear = 0
