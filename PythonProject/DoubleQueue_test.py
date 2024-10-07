from DoubleQueue import DoubleQueue

 # テスト用のDoubleQueueインスタンスを作成
dq = DoubleQueue(5)

 # キューが空であることを確認
dq.isEmpty()
 # キューに要素を追加
dq.enqueue(10)
dq.enqueue(20)
dq.enqueue(30)

# キューが満杯でないことを確認
dq.isFull() 

# キューのサイズが3であることを確認
dq.size()

# キューの要素を表示
dq.show()

# キューから要素を取り出し、値が正しいことを確認
dq.dequeue() 
dq.dequeue()
dq.dequeue() 
dq.dequeue() 

# キューが空であることを確認
dq.isEmpty() 

# キューに要素を追加
dq.enqueue(40)
dq.enqueue(50)
dq.enqueue(60)
dq.enqueue(70)
dq.enqueue(80)
dq.enqueue(90)

# キューの要素を表示
dq.show()

dq.clear()

dq.show()