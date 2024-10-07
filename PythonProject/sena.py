with open("data_male.txt", mode = "r", encoding = "utf-8") as f:
    data = list()
    i = 0
    for line in f:
        parts = line.strip().split()
        if len(parts) == 2:
            height = float(parts[0])  # 身長を数値に変換して取り出す
            data.append(height)

sum = 0
i = 1
results = list()

for height in data:
    sum = sum + height
    average = sum / i
    i = i + 1
    print(sum)
    print(average)
    results.append((sum, average))
    
with open("data_sum_average.txt", mode = "w", encoding = "utf-8") as g:
    for sum, average in results:
        g.write(f"Sum: {sum:.2f}, Average: {average}\n")