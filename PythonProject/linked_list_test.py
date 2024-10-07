import linked_list
class Data:
    __name = " "
    __mail = " "
    
    def __str__(self):
        return f"Nama: {self.__name}\nMail: {self.__mail}"

    
    def __init__(self, name, mail):
        self.__name = name
        self.__mail = mail
        
    def print(self):
        return f"Nama: {self.__name}\nMail: {self.__mail}"
        
    def get_name(self):
        return self.__name
    
    def get_mail(self):
        return self.__mail
    
    def set_name(self, name):
        self.__name = name
        
    def set_mail(self, mail):
        self.__mail = mail
        
llist = linked_list.LinkedList()

data = Data("柴田", "fshibata@is")
llist.insert_first(data)
llist.insert_first(Data("Foo", "foo@"))
llist.insert_first(Data("Bar", "bar@"))
llist.display_list()

print("-----------------")
print("delete_first")
llist.delete_first() 

print("-----------------")

for i in range(5):
    data = Data(i, i*2)
    llist.insert(2, data)

llist.display_list()
print("-----------------")
llist.delete(5) 
print("-----------------")
llist.delete(5) 
print("-----------------")
llist.display_list()
