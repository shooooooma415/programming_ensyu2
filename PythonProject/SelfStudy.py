def MethodList(method):
  if method == "リスト":
    print("[リストの概要]")
    print("添字でのアクセス")
    print("スライス表記が可能.作成後に要素の追加，削除が可能")
    print("[] の中に , で区切ったデータ列を並べることでリストを生成")
    print("(ex)")
    print("　　lis1 = [] # 空のリスト")
    print("　　lis2 = [1, 'two',-3]")
    print("　　lis1.append(123) #要素の追加")
    print("　　print(lis1)")
    print("　　print(lis2, lis2[1])")
    a = input("リストに対するメソッドについて調べますか？（はい・いいえ）：")
    if a == "はい":
      print("[リストに対するメソッドの例]")
      print("L.append(e)：オブジェクトeをKの末尾に追加")
      print("L.count(e)：Lの中に存在するeの個数を返す")
      print("L.insert(i, e)：Lの添字iの位置にeを挿入")
      print("L.extend(L1)：Lの末尾にリストL1を追加")
      print("L.remove(e)：Lの中の最初のeを削除")
      print("L.index(e)：Lの中の最初のeの添字を返す")
      print("L.pop(i)：添字iの位置の要素を返し，Lから取り除く")
      print("L.sort()：Lの要素を昇順に並べ替える")
      print("L.reverse()：Lの要素を逆順にする")
  elif method == "辞書":
    print("[辞書の概要]")
    print("キー（key）で値（value）にアクセス")
    print("タプル，リスト，文字列は数値（添字）でアクセス")
    print("キーと値をコロンで区切って記述")
    print("ハッシュやマップなどとも言われる")
    print("(ex)")
    print("　　month_dict = {'Jan':1, 'Feb':2, 'Mar':3} # 辞書")
    print("　　print(month_dict) # すべての要素を確認")
    print("　　print(month_dict['Jan']) # キーでアクセス")
    print("　　# print(month_dict[1]) ← 添字アクセスはエラー")
    a =input("辞書に対するメソッドについて調べますか？（はい・いいえ）：")
    if a == "はい":
      print("[辞書に対するメソッド・操作の例]")
      print("len(D)：辞書Dの項目数を返す")
      print("D.keys()：Dに含まれるキーのビューを返す")
      print("D.values()：Dに含まれる値のビューを返す")
      print("D.items()：Dに含まれる(key, value)のペアを返す")
      print("D.update(d1)：d1に含まれる(key, value)でDを書き換え")
      print("k in D：Dにキーkが含まれる場合はTrue")
      print("D.get(k, v)：kがDの中にあればD[k]、なければvを返す")
      print("D[k] = v：Dに値vをキーkで登録する すでにある場合は書き換える")
      print("del D[k]：Dからキーkを削除する")
  elif method == "範囲":
    print("[範囲の概要]")
    print("添字でのアクセス，スライス表記などタプルと同様")
    print("作成時に要素が決定，後で変更できない（不変：immutable）")
    print("==演算子で比較した場合，内部の要素を比較する")
    print("(ex)")
    print(" r1 = range(10)")
    print(" r2 = range(0,5,2)")
    print(" r3 = range(0,6,2)")
    print(" print(r1, type(r1))")
    print(" print(r2 == r3) # -> True")
    print("forループでよく使われるが，rangeオブジェクトとしても生成可能!")
  elif method == "集合":
    print("[集合の特徴]")
    print("数学の集合概念に似ており，要素間に順序はない")
    print("作成後に要素の追加，削除が可能（可変：mutable）")
    print("集合に関するメソッドが便利")
    print("(ex)")
    print(" set1 = set() # 空の集合")
    print(" set2 = {1,2,-3}")
    print(" set2.add(123) # 要素の追加")
    print(" print(set2)")
    print("{} の中に , で区切ったデータ列を並べることで集合を生成 かっこの記号 {} は辞書と一緒")
    print("set1.add() で要素を追加 ただし，追加される位置（順序）は不明")
    a = input("集合に対する演算について知りたいですか？（はい・いいえ）：")
    if a == "はい":
      print("[集合に対する演算]")
      print("和集合，差集合，積集合の計算が可能")
      import matplotlib.pyplot as plt
      import matplotlib.patches as patches

      def draw_common_area(set1, set2):
        fig, ax = plt.subplots()

    # 集合1の円を描画
        set1_circle = patches.Circle((0.3, 0.5), 0.25, edgecolor='black', facecolor='none')
        ax.add_patch(set1_circle)
        plt.text(0.3, 0.5, ', '.join(set1-set2), horizontalalignment='center', verticalalignment='center', fontsize=10)

    # 集合2の円を描画
        set2_circle = patches.Circle((0.7, 0.5), 0.25, edgecolor='black', facecolor='none')
        ax.add_patch(set2_circle)
        plt.text(0.7, 0.5, ', '.join(set2-set1), horizontalalignment='center', verticalalignment='center', fontsize=10)

    # 重なる部分（共通部分）を描画
        common_elements = set1.intersection(set2)
        plt.text(0.5, 0.5, ', '.join(common_elements), horizontalalignment='center', verticalalignment='center', color='black', fontsize=10)

    # グラフの設定
        ax.set_xlim(0, 1)
        ax.set_ylim(0, 1)
        ax.set_aspect('equal', 'box')
        ax.axis('off')  # 軸を非表示にする

        plt.show()
        set1 = {'A', 'B', 'C', 'D'}
        set2 = {'C', 'D', 'E', 'F'}

# 2つの円で共通部分を描画し、要素を表示
      draw_common_area(set1, set2)
      print(" set1 = {'A','B','C','D’}")
      print(" set2 = {'C','D','E','F’}")
      print(" print( set1.union(set2) )")
      print(" print( set2.union(set1) ) # こちらでも結果は一緒")
      print(" print( set1.difference(set2) ) # set1 から set2 を引く")
      print(" print( set2.difference(set1) ) # set2 から set1 を引く")
      print(" print( set1.intersection(set2) )")
      print(" print( set2.intersection(set1) ) # こちらでも結果は一緒")
      print("union は | 演算子，difference は – 演算子，intersection は & 演算子でも可")
  elif method == "タプル":
    print("[タプルの特徴]")
    print("添字でのアクセス，スライス表記が可能")
    print("作成時に要素が決定，後で変更できない（不変：immutable）")
    print(" t1 = () # 空のタプル")
    print(" t2 = (1, 'two', 3)")
    print(" t3 = (1) # タプルではなくint")
    print(" t4 = (1, ) # 要素 1個のタプル")
    print(" print(t1)")
    print(" print(t2, t2[1])")
    print(" print(t3, t4)")
    print("() の中に , で区切ったデータ列を並べることでタプルを生成")
    print("[] の中に番号（添字）を入れて内部の要素を参照できる※添字は 0 から始まることに注意")
    a = input("タプルの操作について詳しく知りたいですか？（はい・いいえ）：")
    if a == "はい":
      print("[タプルの操作]")
      print("スライシング")
      print(" tup[M:N] のように書く")
      print(" M 以上 N 未満の範囲で新しいタプルを作る")
      print(" Mを省略すると先頭の要素から，Nを省略すると末尾の要素までとなる")
      print(" (ex)")
      print("　　tup = (1,'abc',-10, True)")
      print("　　print(tup[0:3]) # (1, 'abc', -10)")
      print("　　print(tup[2:4]) # (-10, True)")
      print("　　print(tup[:2]) # (1, 'abc’)")
      print("　　print(tup[1:]) # ('abc', -10, True)")
      print("連結： +演算子でタプル同士を結合")
      print("繰り返し： *演算子で要素を繰り返して増やす")
      print(" タプルとスカラ型の演算ではないことに注意")
      print(" いずれも，新しいタプルを作り，元のタプルは変化しない")
      print("長さ： 関数len()で要素数を取得")
      print("(ex)")
      print(" tup = (1,'abc',-10, True)")
      print(" print(tup + (123,)) # (1, 'abc', -10, True, 123)")
      print(" print(tup * 2) # (1, 'abc', -10, True, 1, 'abc', -10, True)")
      print(" print(len(tup)) # 4")
      print("タプルとfor文，if文")
      print(" タプルの要素に対する反復処理はfor文で")
      print("　　tup = (1,'abc',-10, True)")
      print("　　for e in tup:")
      print("　　　　　print(e) # タプルの要素を順に出力")
      print("　if文とin演算子で要素が含まれているか判定")
      print("　　if -10 in tup:")
      print("　　　　print('it is in the tuple.')")

d = "いいえ"
while d == "いいえ":
    a = input("調べたいメソッドを入力して下さい：")
    MethodList(a)

    b = input("他に調べたいメソッドはありますか？（はい・いいえ）：")
    if b != "はい":
        break