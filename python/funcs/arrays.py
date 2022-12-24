
# return total number of a value in arr
def getTotals(arr, value):
    sum = 0
    for val in arr:
        if (val == value):
            sum+=1
    return sum

