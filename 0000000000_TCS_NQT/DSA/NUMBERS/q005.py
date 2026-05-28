#check number is armstrong or not
num = 153
power = len(str(num))   # count digits
total = 0

for d in str(num):
    total += int(d) ** power

if total == num:
    print("Armstrong")
else:
    print("Not Armstrong")
