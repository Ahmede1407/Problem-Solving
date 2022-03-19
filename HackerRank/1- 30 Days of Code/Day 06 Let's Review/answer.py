# answer
num_test_cases = int(input())

for i in range(num_test_cases):
    test_string = input()
    even_index_chars = ""
    odd_index_chars = ""

    for j in range(len(test_string)):
        if j % 2 == 0:
            even_index_chars += test_string[j]
        else:
            odd_index_chars += test_string[j]

    print("{} {}".format(even_index_chars, odd_index_chars))
