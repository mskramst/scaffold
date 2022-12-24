import unittest

from funcs import arrays

class TestArrays(unittest.TestCase):

    def test_getTotals(self):
        self.assertEqual(arrays.getTotals([1,2,3,4,1,2,1], 1), 3, "Should contain 3 1s")

        self.assertEqual(arrays.getTotals([4,4,4,4],4), 4, "Should contain 4 4s")

        self.assertEqual(arrays.getTotals([4,4,4,4], 1), 0, "Should contain 0 1s")

#    def test_make_abba():
#        self.assertEqual(strings.makeAbba("Hi", "Bye"), "HiByeByeHi", "")
#        self.assertEqual(strings.makeAbba("Yo", "Alice"), "YoAliceAliceYo", "")
#        self.assertEqual(strings.makeAbba("Hi", "Bye"), "WhatUpUpWhat", "")
#
#    def test_make_tags():
#        self.assertEqual(strings.makeTags("i", "Yay"), "<i>Yay</i>", "")
#        self.assertEqual(strings.makeTags("cite", "Hey"), "<cite>Hey</cite>", "")

if __name__ == '__main__':
    unittest.main()
