class Cell: #連結リストの個々の要素を格納するクラス
    def __init__(self, data=None):
        self.data = data
        self.next = None
        
    def set_data(self, data): #データを格納する
        self.data = data
    
    def set_next(self,next_cell): #次の要素を指し示すものを格納する
        self.next = next_cell
    
    def get_data(self): #格納されたデータを返す
        return self.data
    
    def get_next(self): #次の要素を返す
        return self.next
    
class LinkedList: #連結リストとしての機能を提供するクラス.Cell クラスを繋げていくことで連結リストを構成する.
    def __init__(self):
        self.header = None #先頭のデータ
        self.size = 0

    def insert_first(self, data): #連結リストの先頭に引数で指定されたデータを挿入する
        new_cell = Cell(data)
        new_cell.set_next(self.header)
        self.header = new_cell
        self.size = self.size + 1
    
    def delete_first(self): #連結リストの先頭からデータを削除し，それを返す
        if self.header == None:
            print("データがありません")
            return None
        else:
            delete_data = self.header.get_data()
            self.header = self.header.get_next()
            self.size = self.size - 1
            print(delete_data)
    
    def display_list(self): #連結リストの内容を表示する.
        current = self.header
        while current is not None:
            print(current.get_data().print())
            current = current.get_next()
    
    def get_data(self, position): #引数で指定された位置(1~データ数)のデータを返す.
        if position < 1 or position > self.size:
            print("その位置には要素はありません")
            return None
        current = self.header
        for i in range(1, position - 1):
            current = current.get_next()
        return current.get_next()
        
    def insert(self, position, data): #連結リストの引数で指定された位置(1~データ数)に引数で指定されたデータを挿入する.
        if position < 1 or position > self.size + 1:
            print("その位置には要素を挿入することができません")
            return
        
        new_cell = Cell(data)
        
        if position == 1:
            self.delete_first()
        else:
            current = self.header
            for i in range(1, position - 1):
                current = current.get_next()
            new_cell.set_next(current.get_next())
            current.set_next(new_cell)
            
        self.size = self.size + 1
        return
    
    def delete(self, position): #連結リストの引数で指定された位置(1~データ数)のデータを削除し，それを返す.
        if position < 1 or position > self.size:
            print("その位置には要素がありません")
            return
        if position == 1:
            return self.delete_first()
        current = self.header
        for i in range(1, position - 1):
            current = current.get_next()
        delete_data = current.get_next().get_data()
        current.set_next(current.get_next().get_next())
        self.size = self.size - 1
        print(delete_data)
        return
    
    def get_size(self): #連結リストに挿入されたデータ数を返す.
        return self.size

            
            