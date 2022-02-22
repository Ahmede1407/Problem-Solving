#!/bin/python3

import math
import os
import random
import re
import sys


if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    reversed_arr = []

    for i in range(n):
        reversed_arr.append(arr[n-i-1])

    output_string = ''
    for i in range(len(reversed_arr)):
        output_string += str(reversed_arr[i]) + ' '

    print(output_string)
