the_list = ["a", 2, 3, 1, False, [1, 2, 3]]
print(the_list)

the_list.insert(0,the_list.pop(3))
print(the_list)

the_list.insert(3, the_list.pop(0))
print(the_list)