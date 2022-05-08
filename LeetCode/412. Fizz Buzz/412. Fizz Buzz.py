class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        finalArray = []

        for i in range(1, n+1):
            if i % 3 == 0 and i % 5 == 0:
                finalArray.append("FizzBuzz")

            elif i % 3 == 0:
                finalArray.append("Fizz")

            elif i % 5 == 0:
                finalArray.append("Buzz")

            else:
                finalArray.append(str(i))

        return finalArray
