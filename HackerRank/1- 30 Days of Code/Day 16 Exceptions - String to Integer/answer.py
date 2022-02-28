#!/bin/python3

import math
import os
import random
import re
import sys


string = input().strip()

# start of my solution

try:
    integer_value = int(string)
    print(integer_value)
except ValueError:
    print("Bad String")

# end of my solution
