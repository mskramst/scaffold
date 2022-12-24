import unittest
from funcs import mymath

class TestSomething(unittest.TestCase):

    def test_sum(self):
        self.assertEqual(mymath.multiply(3,4), 12, "Should be 12")

if __name__ == '__main__':
    unittest.main()



