class stack:
    def __init__(self, maxSize):
        self.dataArray = [0] * maxSize # 空のリストを作っておく(指定した要素数の分しか上書きできない)
        self.sp = 0
    
    def isFull(self):
        if self.sp < len(self.dataArray):
            return False
        else:
            return True
        
    def isEmpty(self):
        if self.sp == 0:
            return True
        else:
            return False
    
    def size(self):
        return self.sp
    
    def show(self):
        if self.sp == 0:
            print("スタックは空です")
        else:
            for i in range(self.sp):
                print("[" + str(i) + "]" + ": " + str(self.dataArray[i]))
                
    def push(self,x):
        if self.isFull():
            print("スタックはいっぱいです")
        else:
            self.dataArray[self.sp] = x
            self.sp = self.sp + 1
            
    def pop(self):
        if self.isEmpty():
            print("スタックは空です")
        else:
            self.sp = self.sp - 1
            return str(self.dataArray[self.sp])
            
    def clear(self):
        self.sp = 0