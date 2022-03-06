#!/bin/python3

import math
import os
import random
import re
import sys


if __name__ == '__main__':
    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    # Write your code here
    total_number_of_swaps = 0

    for i in range(n):
        number_of_swaps = 0

        for j in range(n-1):
            if a[j] > a[j+1]:
                temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
                number_of_swaps += 1

        total_number_of_swaps += number_of_swaps

        if number_of_swaps == 0:
            break

    print('Array is sorted in ' + str(total_number_of_swaps) + ' swaps.')
    print('First Element: ' + str(a[0]))
    print('Last Element: ' + str(a[n-1]))
