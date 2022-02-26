class Difference:
    def __init__(self, a):
        self.__elements = a
        self.maximumDifference = 0

    def computeDifference(self):
        min_number = 101
        max_number = 0

        for e in self.__elements:
            if e < min_number:
                min_number = e
            if e > max_number:
                max_number = e

        self.maximumDifference = max_number - min_number


_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
